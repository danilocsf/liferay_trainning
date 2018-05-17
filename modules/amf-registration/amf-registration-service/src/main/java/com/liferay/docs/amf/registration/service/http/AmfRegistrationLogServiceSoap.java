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

package com.liferay.docs.amf.registration.service.http;

import aQute.bnd.annotation.ProviderType;

import com.liferay.docs.amf.registration.service.AmfRegistrationLogServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link AmfRegistrationLogServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.liferay.docs.amf.registration.model.AmfRegistrationLogSoap}.
 * If the method in the service utility returns a
 * {@link com.liferay.docs.amf.registration.model.AmfRegistrationLog}, that is translated to a
 * {@link com.liferay.docs.amf.registration.model.AmfRegistrationLogSoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author liferay
 * @see AmfRegistrationLogServiceHttp
 * @see com.liferay.docs.amf.registration.model.AmfRegistrationLogSoap
 * @see AmfRegistrationLogServiceUtil
 * @generated
 */
@ProviderType
public class AmfRegistrationLogServiceSoap {
	/**
	* Saves log informations
	*
	* @param AmfRegistrationLogDTO - log data
	*/
	public static void addLog(
		com.liferay.docs.amf.registration.dto.AmfRegistrationLogDTO log)
		throws RemoteException {
		try {
			AmfRegistrationLogServiceUtil.addLog(log);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
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
		throws RemoteException {
		try {
			int returnValue = AmfRegistrationLogServiceUtil.countAllLogs(serviceContext);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
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
		java.lang.String eventType) throws RemoteException {
		try {
			int returnValue = AmfRegistrationLogServiceUtil.countLogsByEventType(serviceContext,
					eventType);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
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
	public static com.liferay.docs.amf.registration.dto.AmfRegistrationLogDTOSoap[] findAllLogs(
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		int start, int end) throws RemoteException {
		try {
			java.util.List<com.liferay.docs.amf.registration.dto.AmfRegistrationLogDTO> returnValue =
				AmfRegistrationLogServiceUtil.findAllLogs(serviceContext,
					start, end);

			return com.liferay.docs.amf.registration.dto.AmfRegistrationLogDTOSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
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
	public static com.liferay.docs.amf.registration.dto.AmfRegistrationLogDTOSoap[] findLogByEventType(
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		java.lang.String eventType, int start, int end)
		throws RemoteException {
		try {
			java.util.List<com.liferay.docs.amf.registration.dto.AmfRegistrationLogDTO> returnValue =
				AmfRegistrationLogServiceUtil.findLogByEventType(serviceContext,
					eventType, start, end);

			return com.liferay.docs.amf.registration.dto.AmfRegistrationLogDTOSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(AmfRegistrationLogServiceSoap.class);
}