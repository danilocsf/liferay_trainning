/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.docs.amf.registration.service.impl;

import com.liferay.docs.amf.registration.dto.AmfRegistrationDTO;
import com.liferay.docs.amf.registration.exception.AmfRegistrationException;
import com.liferay.docs.amf.registration.service.base.AmfRegistrationLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.Region;
import com.liferay.portal.kernel.service.RegionServiceUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.Validator;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
	public void saveUserRegister(AmfRegistrationDTO userData, ServiceContext serviceContext)
			throws PortalException {

	    validateUserData(userData);
        List<Region> regions =  RegionServiceUtil.getRegions(19l);
        //regions.get(0).get

	}

    private void validateUserData(AmfRegistrationDTO userData) throws AmfRegistrationException {
        validateFieldContent(userData);
    }

    private void validateFieldContent(AmfRegistrationDTO userData) throws AmfRegistrationException{
        List<String> errors = new ArrayList<String>();
        validateBasicInfo(userData, errors);
        validatePhone(userData, errors);
        validateBillingAddress(userData, errors);
        validateMisc(userData, errors);
        if(!Boolean.TRUE.equals(userData.getAcceptedTOU())){
            errors.add("acceptTouRequired");
        }
        if(!errors.isEmpty()){
            throw new AmfRegistrationException(errors);
        }
    }

    private void validateBasicInfo(AmfRegistrationDTO userData, List<String> errors){
        validateFieldContent(userData.getFirstName(), errors, true, 50, "firstNameRequired", "firstNameMaxLength");
        validateFieldContent(userData.getLastName(), errors, true, 50, "lastNameRequired", "lastNameMaxLength");
        validateFieldContent(userData.getGender(), errors, true, 0, "genderRequired", "");
        if(validateFieldContent(userData.getEmail(), errors, true, 255, "emailRequired", "emailMaxLength")){
            if(!Validator.isEmailAddress(userData.getEmail())){
                errors.add("emailAddressInvalid");
            }
        }

        if(validateFieldContent(userData.getUserName(), errors, true, 16, "userNameRequired", "userNameLength")){
            if(userData.getUserName().length()< 5){
                errors.add("userNameLength");
            }
        }
        validateBirthday(userData.getBirthdayMonth(), userData.getBirthdayDay(), userData.getBirthdayYear(), errors);
        validatePassword(userData.getPassword(), userData.getPasswordToConfirm(), errors);
    }

    private void validatePhone(AmfRegistrationDTO userData, List<String> errors){
        validatePhone(userData.getHomePhone(), errors, "homePhoneInvalid");
        validatePhone(userData.getMobilePhone(), errors, "mobilePhoneInvalid");
    }

    private void validateBillingAddress(AmfRegistrationDTO userData, List<String> errors){
        validateFieldContent(userData.getAddress1(), errors, true, 255, "addressRequired", "addressMaxLength");
        validateFieldContent(userData.getAddress2(), errors, false, 255, "address2Required", "address2MaxLength");
        validateFieldContent(userData.getCity(), errors, true, 255, "cityRequired", "cityMaxLength");
        if(validateFieldContent(userData.getZipCode(), errors, true, 5, "zipCodeRequired", "zipCodeInvalid")){
            if(!Validator.isDigit(userData.getZipCode())){
                errors.add("zipCodeInvalid");
            }
        }
        if(userData.getState() == null){
            errors.add("stateRequired");
        }
    }

    private void validateMisc(AmfRegistrationDTO userData, List<String> errors) {
        validateFieldContent(userData.getAnswer(), errors, true, 75, "answerRequired", "answerMaxLength");
    }

    private void validatePhone(String phone, List<String> errors, String errorKey){
        if(!Validator.isBlank(phone) && Validator.isDigit(phone) && phone.length() == 10){
            errors.add(errorKey);
        }
    }

    private void validatePassword(String password, String password2, List<String> errors){
        if(Validator.isBlank(password)){
            errors.add("passwordRequired");
        }else {
            Pattern pattern = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%&*]).{6,20})");
            Matcher matcher = pattern.matcher("password");
            if(!matcher.matches()){
                errors.add("passwordInvalid");
            }else{
                if(!password.equals(password2)){
                    errors.add("passwordMustMatch");
                }
            }
        }
    }

    private void validateBirthday(int birthdayMonth, int birthdayDay, int birthdayYear, List<String> errors){
        if(birthdayDay == 0 || birthdayMonth == 0 || birthdayYear == 0){
            errors.add("birthdayRequired");
        } else if(!Validator.isDate(birthdayMonth, birthdayDay, birthdayYear)){
            errors.add("birthdayInvalid");
        } else {
            Calendar thirteenYearsAgo = Calendar.getInstance();
            thirteenYearsAgo.setTime(new Date());
            thirteenYearsAgo.add(Calendar.YEAR, -13);

            Calendar birthday = Calendar.getInstance();
            birthday.set(birthdayYear, birthdayMonth-1, birthdayDay);

            if(birthday.compareTo(thirteenYearsAgo) > 0){
                errors.add("ageInvalid");
            }
        }
    }

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