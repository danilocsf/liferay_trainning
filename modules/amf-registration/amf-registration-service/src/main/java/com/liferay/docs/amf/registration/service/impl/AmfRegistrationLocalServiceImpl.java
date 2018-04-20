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
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.Validator;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

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


	}

    private void validateUserData(AmfRegistrationDTO userData) throws AmfRegistrationException {
        validateFieldContent(userData);
    }

    private void validateFieldContent(AmfRegistrationDTO userData) throws AmfRegistrationException{
        List<String> errors = new ArrayList<String>();
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
        validateBirthday(userData, errors);
        Validator.isPassword()

        if(!errors.isEmpty()){
            throw new AmfRegistrationException(errors);
        }
    }

    private void validateBirthday(AmfRegistrationDTO userData, List<String> errors){
        if(userData.getBirthdayDay() == 0 || userData.getBirthdayMonth() == 0 || userData.getBirthdayYear() == 0){
            errors.add("birthdayRequired");
        } else if(!Validator.isDate(userData.getBirthdayMonth(), userData.getBirthdayDay(), userData.getBirthdayYear())){
            errors.add("birthdayInvalid");
        } else {
            Calendar thirteenYearsAgo = Calendar.getInstance();
            thirteenYearsAgo.setTime(new Date());
            thirteenYearsAgo.add(Calendar.YEAR, -13);

            Calendar birthday = Calendar.getInstance();
            birthday.set(userData.getBirthdayYear(), userData.getBirthdayMonth()-1, userData.getBirthdayDay());

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