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
 * Provides the remote service utility for AmfRegistrationLog. This utility wraps
 * {@link com.liferay.docs.amf.registration.service.impl.AmfRegistrationLogServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author liferay
 * @see AmfRegistrationLogService
 * @see com.liferay.docs.amf.registration.service.base.AmfRegistrationLogServiceBaseImpl
 * @see com.liferay.docs.amf.registration.service.impl.AmfRegistrationLogServiceImpl
 * @generated
 */
@ProviderType
public class AmfRegistrationLogServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.docs.amf.registration.service.impl.AmfRegistrationLogServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Saves log informations
	*
	* @param AmfRegistrationLogDTO - log data
	*/
	public static void addLog(
		com.liferay.docs.amf.registration.dto.AmfRegistrationLogDTO log)
		throws com.liferay.portal.kernel.exception.PortalException {
		getService().addLog(log);
	}

	/**
	* Gets the quantity of logs of the logged user if the user does not have permission to view logs from all users.
	* Otherwise, gets the quantity of logs of all users.
	*
	* @param ServiceContext
	* @return quantity of logs of the current user or of all users, according the user permission.
	* @throws PortalException
	*/
	public static int countAllLogs(
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().countAllLogs(serviceContext);
	}

	/**
	* Gets the quantity of logs of the logged user and a specific event type if the user does not have permission to view logs from all users.
	* Otherwise, gets the quantity of logs of all users and specific event type.
	*
	* @param ServiceContext
	* @param event type
	* @return quantity of logs of the current user or of all users, according the user permission.
	* @throws PortalException
	*/
	public static int countLogsByEventType(
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		java.lang.String eventType)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().countLogsByEventType(serviceContext, eventType);
	}

	/**
	* Searches all logs of the logged user if the user does not have permission to view logs from all users.
	* Otherwise, searches all logs of all users.
	*
	* @param ServiceContext
	* @param start log position in database
	* @param end log position in database
	* @return list with founded logs
	* @throws PortalException
	*/
	public static java.util.List<com.liferay.docs.amf.registration.dto.AmfRegistrationLogDTO> findAllLogs(
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().findAllLogs(serviceContext, start, end);
	}

	/**
	* Searches all logs of the logged user and informed event type if the user does not have permission to view logs from all users.
	* Otherwise, searches all logs of all users and informed event type.
	*
	* @param ServiceContext
	* @param eventType
	* @param start log position in database
	* @param end log position in database
	* @return list with founded logs
	* @throws PortalException
	*/
	public static java.util.List<com.liferay.docs.amf.registration.dto.AmfRegistrationLogDTO> findLogByEventType(
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		java.lang.String eventType, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .findLogByEventType(serviceContext, eventType, start, end);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static AmfRegistrationLogService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AmfRegistrationLogService, AmfRegistrationLogService> _serviceTracker =
		ServiceTrackerFactory.open(AmfRegistrationLogService.class);
}