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
 * Provides a wrapper for {@link AmfRegistrationLogService}.
 *
 * @author liferay
 * @see AmfRegistrationLogService
 * @generated
 */
@ProviderType
public class AmfRegistrationLogServiceWrapper
	implements AmfRegistrationLogService,
		ServiceWrapper<AmfRegistrationLogService> {
	public AmfRegistrationLogServiceWrapper(
		AmfRegistrationLogService amfRegistrationLogService) {
		_amfRegistrationLogService = amfRegistrationLogService;
	}

	/**
	* Saves log informations
	*
	* @param AmfRegistrationLogDTO - log data
	*/
	@Override
	public void addLog(
		com.liferay.docs.amf.registration.dto.AmfRegistrationLogDTO log)
		throws com.liferay.portal.kernel.exception.PortalException {
		_amfRegistrationLogService.addLog(log);
	}

	/**
	* Gets the quantity of logs of the logged user if the user does not have permission to view logs from all users.
	* Otherwise, gets the quantity of logs of all users.
	*
	* @param ServiceContext
	* @return quantity of logs of the current user or of all users, according the user permission.
	* @throws PortalException
	*/
	@Override
	public int countAllLogs(
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _amfRegistrationLogService.countAllLogs(serviceContext);
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
	@Override
	public int countLogsByEventType(
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		java.lang.String eventType)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _amfRegistrationLogService.countLogsByEventType(serviceContext,
			eventType);
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
	@Override
	public java.util.List<com.liferay.docs.amf.registration.dto.AmfRegistrationLogDTO> findAllLogs(
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _amfRegistrationLogService.findAllLogs(serviceContext, start, end);
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
	@Override
	public java.util.List<com.liferay.docs.amf.registration.dto.AmfRegistrationLogDTO> findLogByEventType(
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		java.lang.String eventType, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _amfRegistrationLogService.findLogByEventType(serviceContext,
			eventType, start, end);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _amfRegistrationLogService.getOSGiServiceIdentifier();
	}

	@Override
	public AmfRegistrationLogService getWrappedService() {
		return _amfRegistrationLogService;
	}

	@Override
	public void setWrappedService(
		AmfRegistrationLogService amfRegistrationLogService) {
		_amfRegistrationLogService = amfRegistrationLogService;
	}

	private AmfRegistrationLogService _amfRegistrationLogService;
}