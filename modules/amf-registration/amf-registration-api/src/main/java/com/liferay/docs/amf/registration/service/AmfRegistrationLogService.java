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

import com.liferay.docs.amf.registration.dto.AmfRegistrationLogDTO;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.security.access.control.AccessControlled;
import com.liferay.portal.kernel.service.BaseService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.spring.osgi.OSGiBeanProperties;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Transactional;

import java.util.List;

/**
 * Provides the remote service interface for AmfRegistrationLog. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author liferay
 * @see AmfRegistrationLogServiceUtil
 * @see com.liferay.docs.amf.registration.service.base.AmfRegistrationLogServiceBaseImpl
 * @see com.liferay.docs.amf.registration.service.impl.AmfRegistrationLogServiceImpl
 * @generated
 */
@AccessControlled
@JSONWebService
@OSGiBeanProperties(property =  {
	"json.web.service.context.name=ar", "json.web.service.context.path=AmfRegistrationLog"}, service = AmfRegistrationLogService.class)
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface AmfRegistrationLogService extends BaseService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AmfRegistrationLogServiceUtil} to access the amf registration log remote service. Add custom service methods to {@link com.liferay.docs.amf.registration.service.impl.AmfRegistrationLogServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Saves log informations
	*
	* @param AmfRegistrationLogDTO - log data
	*/
	public void addLog(AmfRegistrationLogDTO log) throws PortalException;

	/**
	* Gets the quantity of logs of the logged user if the user does not have permission to view logs from all users.
	* Otherwise, gets the quantity of logs of all users.
	*
	* @param ServiceContext
	* @return quantity of logs of the current user or of all users, according the user permission.
	* @throws PortalException
	*/
	public int countAllLogs(ServiceContext serviceContext)
		throws PortalException;

	/**
	* Gets the quantity of logs of the logged user and a specific event type if the user does not have permission to view logs from all users.
	* Otherwise, gets the quantity of logs of all users and specific event type.
	*
	* @param ServiceContext
	* @param event type
	* @return quantity of logs of the current user or of all users, according the user permission.
	* @throws PortalException
	*/
	public int countLogsByEventType(ServiceContext serviceContext,
		java.lang.String eventType) throws PortalException;

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
	public List<AmfRegistrationLogDTO> findAllLogs(
		ServiceContext serviceContext, int start, int end)
		throws PortalException;

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
	public List<AmfRegistrationLogDTO> findLogByEventType(
		ServiceContext serviceContext, java.lang.String eventType, int start,
		int end) throws PortalException;

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public java.lang.String getOSGiServiceIdentifier();
}