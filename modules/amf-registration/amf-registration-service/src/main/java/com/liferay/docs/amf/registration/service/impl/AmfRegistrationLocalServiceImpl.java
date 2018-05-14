/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 * <p>
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 * <p>
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.docs.amf.registration.service.impl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.liferay.docs.amf.registration.dto.AmfRegistrationDTO;
import com.liferay.docs.amf.registration.exception.AmfRegistrationException;
import com.liferay.docs.amf.registration.service.base.AmfRegistrationLocalServiceBaseImpl;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.NoSuchUserException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.Address;
import com.liferay.portal.kernel.model.Contact;
import com.liferay.portal.kernel.model.Phone;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.Validator;

/**
 * The implementation of the amf registration local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.docs.amf.registration.service.AmfRegistrationLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author liferay
 * @see AmfRegistrationLocalServiceBaseImpl
 * @see com.liferay.docs.amf.registration.service.AmfRegistrationLocalServiceUtil
 */
public class AmfRegistrationLocalServiceImpl
        extends AmfRegistrationLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this class directly. Always use {@link com.liferay.docs.amf.registration.service.AmfRegistrationLocalServiceUtil} to access the amf registration local service.
     */
	
	/**
	 *  Validates and saves a new user account.
	 *  @param AmfRegistrationDTO - data to be saved
	 *  @param ServiceContext
	 *  @throws PortalException - if validation errors occurs
	 */
    public void saveUserRegister(AmfRegistrationDTO userData, ServiceContext serviceContext)
            throws PortalException {
    	
        validateUserData(userData);
        User user = createuser(userData, serviceContext);
        createAddress(user, userData, serviceContext);
        createPhones(user, userData, serviceContext);
    }
    
    /**
     * Gets the number of saved users with the informed zip code.
     * @param zip code
     * @return number of saved users with the informed zip code. 
     */
    public int countUserAddressByZip(String zip){
    	
  		String sql = "SELECT count(*) FROM User_ where userId in (SELECT userId FROM Address where zip = ? and primary_=1)";
  		Session session = userPersistence.openSession();
  		SQLQuery sqlQuery = session.createSQLQuery(sql);
  		QueryPos pos = QueryPos.getInstance(sqlQuery);
  		pos.add(zip);
  		BigInteger count = (BigInteger)sqlQuery.uniqueResult(); 
  		return count.intValue();    	
    }   
    
    
    /**
     * Gets data from users with the informed zip code.
     * @param zip code
     * @param int - start position to find data in database
     * @param int - max number of register to be returned 
     * @return list of users 
     */
    public List<AmfRegistrationDTO> findUserByZip(String zip, int start, int delta){
    	
  		String sql = "select u.firstName, u.lastName, u.screenName, u.emailAddress from User_ u "
  				+ "where u.userId in (SELECT a.userId FROM Address a where a.zip = ? and a.primary_=1) LIMIT ?, ?";
  		Session session = userPersistence.openSession();
  		SQLQuery sqlQuery = session.createSQLQuery(sql);
  		QueryPos pos = QueryPos.getInstance(sqlQuery);
  		pos.add(zip);
  		pos.add(start);
  		pos.add(delta);
  		List<Object[]> returnedList = (List<Object[]>)sqlQuery.list();  		
  		return buildAmfRegistrationDTOList(returnedList, zip);    	
    }   
    
    private List<AmfRegistrationDTO> buildAmfRegistrationDTOList(List<Object[]> list, String zip){
    	List<AmfRegistrationDTO> resultList = new ArrayList<AmfRegistrationDTO>();
  		
    	if(list != null){
  			for(Object[] objs : list){
  				AmfRegistrationDTO dto = new AmfRegistrationDTO();
  				dto.setFirstName((String)objs[0]);
  				dto.setLastName((String)objs[1]);
  				dto.setUserName((String)objs[2]);
  				dto.setEmail((String)objs[3]);
  				dto.setZipCode(zip);
  				resultList.add(dto);  				
  			}
  		}
    	return resultList;
    }
        
    /**
     * Creates a new user account. 
     * @param AmfRegistrationDTO - object containing the user data
     * @param serviceContext
     * @return User - created User object
     * @throws PortalException
     */
    private User createuser(AmfRegistrationDTO userData, ServiceContext serviceContext) throws PortalException {

        User user = userLocalService.addUser(0, userData.getCompanyId(), false, userData.getPassword(),
                userData.getPasswordToConfirm(),false, userData.getUserName(), userData.getEmail(), 0,
                null, userData.getLocale(), userData.getFirstName(), null,userData.getLastName(),
                0, 0, "Male".equals(userData.getGender()), userData.getBirthdayMonth(),
                userData.getBirthdayDay(), userData.getBirthdayYear(),null, null, null,
                null, null, false, serviceContext);

        userLocalService.updateReminderQuery(user.getUserId(), userData.getSecurityQuestion(), userData.getAnswer());
        userLocalService.updateAgreedToTermsOfUse(user.getUserId(), userData.getAcceptedTOU());
        return user;
    }
    /**
     * Creates an address for the user. 
     * @param User - user to have the address associated
     * @param AmfRegistrationDTO - object containing the address data
     * @param serviceContext
     * @return Address - created address object
     * @throws PortalException
     */
    private Address createAddress(User user, AmfRegistrationDTO userData, ServiceContext serviceContext) throws PortalException {
        Address address = addressLocalService.addAddress(user.getUserId(), Contact.class.getName(), user.getContactId(),
                userData.getAddress1(), userData.getAddress2(),
                null, userData.getCity(), userData.getZipCode(),
                userData.getState(), 19, 11002, true,
                true, serviceContext);
        return address;
    }
    /**
     * Creates a phone for the user
     * @param  User - user to have the phone associated
     * @param AmfRegistrationDTO - object containing the phone data
     * @param serviceContext
     * @return List<Phone> - created Phones objects
     * @throws PortalException
     */
    private List<Phone> createPhones(User user, AmfRegistrationDTO userData, ServiceContext serviceContext) throws PortalException {
        List<Phone>phones = new ArrayList<Phone>();
        if(Validator.isNotNull(userData.getHomePhone())) {
            phones.add(createPhone(userData.getHomePhone(), 11011l, user.getUserId(), true, user.getContactId(), serviceContext));
        }

        if(Validator.isNotNull(userData.getMobilePhone())) {
            phones.add(createPhone(userData.getMobilePhone(), 11008l, user.getUserId(), false, user.getContactId(), serviceContext));
        }

        return phones;
    }

    private Phone createPhone(String number, Long typeId, Long userId, boolean primary, Long contactId,
                              ServiceContext serviceContext) throws PortalException {
        return phoneLocalService.addPhone(userId,
                Contact.class.getName(), contactId, number, null, typeId, primary, serviceContext);
    }
    /**
     * Validates all user data. 
     * @param content to be validated
     * @throws PortalException  
     */
    private void validateUserData(AmfRegistrationDTO userData) throws PortalException {
        validateFieldContent(userData);
        /*Screen name must be unique*/
        try {
            userLocalService.getUserByScreenName(userData.getCompanyId(), userData.getUserName());
            throw new AmfRegistrationException(Arrays.asList("userNameAlreadyExists"));
        } catch (NoSuchUserException e) {

        }
        /*Email must be unique*/
        try {
        	userLocalService.getUserByEmailAddress(userData.getCompanyId(), userData.getEmail());
            throw new AmfRegistrationException(Arrays.asList("userEmailAlreadyExists"));
        } catch (NoSuchUserException e) {

        }

    }

    private void validateFieldContent(AmfRegistrationDTO userData) throws AmfRegistrationException {
        List<String> errors = new ArrayList<String>();
        validateBasicInfo(userData, errors);
        validatePhone(userData, errors);
        validateBillingAddress(userData, errors);
        validateMisc(userData, errors);
        if (!Boolean.TRUE.equals(userData.getAcceptedTOU())) {
            errors.add("acceptTouRequired");
        }
        if (!errors.isEmpty()) {
            throw new AmfRegistrationException(errors);
        }
    }

    private void validateBasicInfo(AmfRegistrationDTO userData, List<String> errors) {
        validateFieldContent(userData.getFirstName(), errors, true, 50, "firstNameRequired", "firstNameMaxLength");
        validateFieldContent(userData.getLastName(), errors, true, 50, "lastNameRequired", "lastNameMaxLength");
        validateFieldContent(userData.getGender(), errors, true, 0, "genderRequired", "");
        if (validateFieldContent(userData.getEmail(), errors, true, 255, "emailRequired", "emailMaxLength")) {
            if (!Validator.isEmailAddress(userData.getEmail())) {
                errors.add("emailAddressInvalid");
            }
        }

        if (validateFieldContent(userData.getUserName(), errors, true, 16, "userNameRequired", "userNameLength")) {
            if (userData.getUserName().length() < 5) {
                errors.add("userNameLength");
            }
        }
        validateBirthday(userData.getBirthdayMonth(), userData.getBirthdayDay(), userData.getBirthdayYear(), errors);
        validatePassword(userData.getPassword(), userData.getPasswordToConfirm(), errors);
    }

    private void validatePhone(AmfRegistrationDTO userData, List<String> errors) {
        validatePhone(userData.getHomePhone(), errors, "homePhoneInvalid");
        validatePhone(userData.getMobilePhone(), errors, "mobilePhoneInvalid");
    }

    private void validateBillingAddress(AmfRegistrationDTO userData, List<String> errors) {
        validateFieldContent(userData.getAddress1(), errors, true, 255, "addressRequired", "addressMaxLength");
        validateFieldContent(userData.getAddress2(), errors, false, 255, "address2Required", "address2MaxLength");
        validateFieldContent(userData.getCity(), errors, true, 255, "cityRequired", "cityMaxLength");
        if (validateFieldContent(userData.getZipCode(), errors, true, 5, "zipCodeRequired", "zipCodeInvalid")) {
            if(userData.getZipCode().length() != 5){
            	errors.add("zipCodeInvalid");
            }
        	if (!Validator.isDigit(userData.getZipCode())) {
                errors.add("zipCodeInvalid");
            }
        }
        if (userData.getState() == null) {
            errors.add("stateRequired");
        }
    }

    private void validateMisc(AmfRegistrationDTO userData, List<String> errors) {
        validateFieldContent(userData.getAnswer(), errors, true, 75, "answerRequired", "answerMaxLength");
    }

    private void validatePhone(String phone, List<String> errors, String errorKey) {
        if (!Validator.isBlank(phone) && (!Validator.isDigit(phone) || phone.length() != 10)) {
            errors.add(errorKey);
        }
    }
    /**
     * Validates the informed password.
     * @param password
     * @param password2
     * @param  List - list to keep errors
     */
    private void validatePassword(String password, String password2, List<String> errors) {
        if (Validator.isBlank(password)) {
            errors.add("passwordRequired");
        } else {
            Pattern pattern = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%&*]).{6,20})");
            Matcher matcher = pattern.matcher(password);
            if (!matcher.matches()) {
                errors.add("passwordInvalid");
            } else {
                if (!password.equals(password2)) {
                    errors.add("passwordMustMatch");
                }
            }
        }
    }
    
    /**
     * Validates the informed birthday.
     * It must be more more than 13 years. 
     * @param birthday month
     * @param birthday day
     * @param birthday year
     * @param List - list to keep errors
     */
    private void validateBirthday(int birthdayMonth, int birthdayDay, int birthdayYear, List<String> errors) {
        if (birthdayDay == 0 || birthdayMonth == 0 || birthdayYear == 0) {
            errors.add("birthdayRequired");
        } else if (!Validator.isDate(birthdayMonth, birthdayDay, birthdayYear)) {
            errors.add("birthdayInvalid");
        } else {
            Calendar thirteenYearsAgo = Calendar.getInstance();
            thirteenYearsAgo.setTime(new Date());
            thirteenYearsAgo.add(Calendar.YEAR, -13);

            Calendar birthday = Calendar.getInstance();
            birthday.set(birthdayYear, birthdayMonth - 1, birthdayDay);

            if (birthday.compareTo(thirteenYearsAgo) > 0) {
                errors.add("ageInvalid");
            }
        }
    }
    
    /**
     * Validates data according parameters
     * @param String - content to be validated
     * @param List - list to keep errors
     * @param boolean - whether content is required 
     * @param int - the max length of the content
     * @param String - key that represents a message for required validation
     * @param String - key that represents a message for length validation
     * @return boolean - true if the content is valid and false otherwise
     */
    private boolean validateFieldContent(String data, List<String> errors, boolean isRequired, int maxLength, String mandatoryKey, String lengthKey) {
        boolean ok = true;
        if (Validator.isBlank(data)) {
            if (isRequired) {
                errors.add(mandatoryKey);
                ok = false;
            }
        } else if (maxLength > 0 && data.length() > maxLength) {
            errors.add(lengthKey);
            ok = false;
        }
        return ok;
    }

}
