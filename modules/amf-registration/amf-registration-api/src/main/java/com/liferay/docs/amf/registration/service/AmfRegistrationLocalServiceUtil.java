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

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for AmfRegistration. This utility wraps
 * {@link com.liferay.docs.amf.registration.service.impl.AmfRegistrationLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author liferay
 * @see AmfRegistrationLocalService
 * @see com.liferay.docs.amf.registration.service.base.AmfRegistrationLocalServiceBaseImpl
 * @see com.liferay.docs.amf.registration.service.impl.AmfRegistrationLocalServiceImpl
 * @generated
 */
@ProviderType
public class AmfRegistrationLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.docs.amf.registration.service.impl.AmfRegistrationLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Gets the number of saved users with the informed zip code.
	*
	* @param zip code
	* @return number of saved users with the informed zip code.
	*/
	public static int countUserAddressByZip(java.lang.String zip) {
		return getService().countUserAddressByZip(zip);
	}

	/**
	* Gets data from users with the informed zip code.
	*
	* @param zip code
	* @param int - start position to find data in database
	* @param int - max number of register to be returned
	* @return list of users
	*/
	public static java.util.List<com.liferay.docs.amf.registration.dto.AmfRegistrationDTO> findUserByZip(
		java.lang.String zip, int start, int delta) {
		return getService().findUserByZip(zip, start, delta);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Validates and saves a new user account.
	*
	* @param AmfRegistrationDTO - data to be saved
	* @param ServiceContext
	* @throws PortalException - if validation errors occurs
	*/
	public static void saveUserRegister(
		com.liferay.docs.amf.registration.dto.AmfRegistrationDTO userData,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		getService().saveUserRegister(userData, serviceContext);
	}

	public static AmfRegistrationLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AmfRegistrationLocalService, AmfRegistrationLocalService> _serviceTracker =
		ServiceTrackerFactory.open(AmfRegistrationLocalService.class);
}