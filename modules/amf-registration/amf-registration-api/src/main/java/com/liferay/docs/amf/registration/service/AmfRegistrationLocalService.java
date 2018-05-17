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

import com.liferay.docs.amf.registration.dto.AmfRegistrationDTO;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Transactional;

import java.util.List;

/**
 * Provides the local service interface for AmfRegistration. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author liferay
 * @see AmfRegistrationLocalServiceUtil
 * @see com.liferay.docs.amf.registration.service.base.AmfRegistrationLocalServiceBaseImpl
 * @see com.liferay.docs.amf.registration.service.impl.AmfRegistrationLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface AmfRegistrationLocalService extends BaseLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AmfRegistrationLocalServiceUtil} to access the amf registration local service. Add custom service methods to {@link com.liferay.docs.amf.registration.service.impl.AmfRegistrationLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Gets the number of saved users with the informed zip code.
	*
	* @param zip code
	* @return number of saved users with the informed zip code.
	*/
	public int countUserAddressByZip(java.lang.String zip);

	/**
	* Gets data from users with the informed zip code.
	*
	* @param zip code
	* @param int - start position to find data in database
	* @param int - max number of register to be returned
	* @return list of users
	*/
	public List<AmfRegistrationDTO> findUserByZip(java.lang.String zip,
		int start, int delta);

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public java.lang.String getOSGiServiceIdentifier();

	/**
	* Validates and saves a new user account.
	*
	* @param AmfRegistrationDTO - data to be saved
	* @param ServiceContext
	* @throws PortalException - if validation errors occurs
	*/
	public void saveUserRegister(AmfRegistrationDTO userData,
		ServiceContext serviceContext) throws PortalException;
}