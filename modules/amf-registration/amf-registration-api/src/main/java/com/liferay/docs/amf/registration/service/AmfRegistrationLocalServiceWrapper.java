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

package com.liferay.docs.amf.registration.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AmfRegistrationLocalService}.
 *
 * @author liferay
 * @see AmfRegistrationLocalService
 * @generated
 */
@ProviderType
public class AmfRegistrationLocalServiceWrapper
	implements AmfRegistrationLocalService,
		ServiceWrapper<AmfRegistrationLocalService> {
	public AmfRegistrationLocalServiceWrapper(
		AmfRegistrationLocalService amfRegistrationLocalService) {
		_amfRegistrationLocalService = amfRegistrationLocalService;
	}

	/**
	* Gets the number of saved users with the informed zip code.
	*
	* @param zip code
	* @return number of saved users with the informed zip code.
	*/
	@Override
	public int countUserAddressByZip(java.lang.String zip) {
		return _amfRegistrationLocalService.countUserAddressByZip(zip);
	}

	/**
	* Gets data from users with the informed zip code.
	*
	* @param zip code
	* @param int - start position to find data in database
	* @param int - max number of register to be returned
	* @return list of users
	*/
	@Override
	public java.util.List<com.liferay.docs.amf.registration.dto.AmfRegistrationDTO> findUserByZip(
		java.lang.String zip, int start, int delta) {
		return _amfRegistrationLocalService.findUserByZip(zip, start, delta);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _amfRegistrationLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Validates and saves a new user account.
	*
	* @param AmfRegistrationDTO - data to be saved
	* @param ServiceContext
	* @throws PortalException - if validation errors occurs
	*/
	@Override
	public void saveUserRegister(
		com.liferay.docs.amf.registration.dto.AmfRegistrationDTO userData,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		_amfRegistrationLocalService.saveUserRegister(userData, serviceContext);
	}

	@Override
	public AmfRegistrationLocalService getWrappedService() {
		return _amfRegistrationLocalService;
	}

	@Override
	public void setWrappedService(
		AmfRegistrationLocalService amfRegistrationLocalService) {
		_amfRegistrationLocalService = amfRegistrationLocalService;
	}

	private AmfRegistrationLocalService _amfRegistrationLocalService;
}