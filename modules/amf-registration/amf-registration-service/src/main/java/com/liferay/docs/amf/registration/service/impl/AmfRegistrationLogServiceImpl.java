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

import java.util.ArrayList;
import java.util.List;

import com.liferay.docs.amf.registration.constants.AmfRegistrationLogConstants;
import com.liferay.docs.amf.registration.dto.AmfRegistrationLogDTO;
import com.liferay.docs.amf.registration.model.AmfRegistrationLog;
import com.liferay.docs.amf.registration.service.base.AmfRegistrationLogServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.auth.PrincipalException;
import com.liferay.portal.kernel.service.ServiceContext;

/**
 * The implementation of the amf registration log remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.docs.amf.registration.service.AmfRegistrationLogService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author liferay
 * @see AmfRegistrationLogServiceBaseImpl
 * @see com.liferay.docs.amf.registration.service.AmfRegistrationLogServiceUtil
 */
public class AmfRegistrationLogServiceImpl
	extends AmfRegistrationLogServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.liferay.docs.amf.registration.service.AmfRegistrationLogServiceUtil} to access the amf registration log remote service.
	 */
	
	/**
	 * Saves log informations
	 * @param AmfRegistrationLogDTO - log data 
	 */
    public void addLog(AmfRegistrationLogDTO log) throws PortalException {
    	
        AmfRegistrationLog newLog = amfRegistrationLogPersistence.create(0);
        newLog.setAdditionalInfo(log.getAdditionalInfo());
        newLog.setDateTime(log.getDateTime());
        newLog.setEventType(log.getEventType());
        newLog.setIpAddress(log.getIpAddress());
        newLog.setUserId(log.getUserId());
        newLog.setScreenName(log.getScreenName());

        amfRegistrationLogPersistence.update(newLog);
    }
	
	private static final long CLASS_PK = 0; 
	
	/**
     * Gets the quantity of logs of the logged user if the user does not have permission to view logs from all users.
     * Otherwise, gets the quantity of logs of all users.     
     * @param ServiceContext 
     * @return quantity of logs of the current user or of all users, according the user permission.
	 * @throws PortalException 
     */
	public int countAllLogs(ServiceContext serviceContext) throws PortalException {
		boolean hasPermission = checkUserHasPermissionToViewAllUsersLogs(serviceContext);
		int result = hasPermission ? amfRegistrationLogPersistence.countAll()
				: amfRegistrationLogPersistence.countByUserId(serviceContext.getGuestOrUserId());
		return result;
	}
	
	/**
     * Gets the quantity of logs of the logged user and a specific event type if the user does not have permission to view logs from all users.
     * Otherwise, gets the quantity of logs of all users and specific event type.
     * @param ServiceContext
     * @param event type       
     * @return quantity of logs of the current user or of all users, according the user permission.
     * @throws PortalException 
     */
	public int countLogsByEventType(ServiceContext serviceContext, String eventType) throws PortalException {
		boolean hasPermission = checkUserHasPermissionToViewAllUsersLogs(serviceContext);
		return hasPermission ? amfRegistrationLogPersistence.countByEventType(eventType)
				: amfRegistrationLogPersistence.countByEventTypeAndUserId(eventType, serviceContext.getGuestOrUserId());
	}
	
	 /**
     * Searches all logs of the logged user if the user does not have permission to view logs from all users.
     * Otherwise, searches all logs of all users.  
     * @param ServiceContext
     * @param start log position in database 
     * @param end log position in database
     * @return list with founded logs
	 * @throws PortalException 
     */
    public List<AmfRegistrationLogDTO> findAllLogs(ServiceContext serviceContext, int start, int end) throws PortalException {
    	boolean hasPermission = checkUserHasPermissionToViewAllUsersLogs(serviceContext);
    	List<AmfRegistrationLog> list = null;
    	if(hasPermission)    	
    		list = amfRegistrationLogPersistence.findAll(start, end);
    	else
    		list = amfRegistrationLogPersistence.findByUserId(serviceContext.getGuestOrUserId(), start, end);
    		
        return buildDTOCollection(list);
    }
    
    /**
     * Searches all logs of the logged user and informed event type if the user does not have permission to view logs from all users.
     * Otherwise, searches all logs of all users and informed event type.  
     * @param ServiceContext
     * @param eventType
     * @param start log position in database 
     * @param end log position in database
     * @return list with founded logs
     * @throws PortalException 
     */
    public List<AmfRegistrationLogDTO> findLogByEventType(ServiceContext serviceContext, String eventType, int start, int end) throws PortalException {
    	boolean hasPermission = checkUserHasPermissionToViewAllUsersLogs(serviceContext);
    	List<AmfRegistrationLog> list = null;
    	if(hasPermission)
    		list = amfRegistrationLogPersistence.findByEventType(eventType, start, end);
    	else
    		list = amfRegistrationLogPersistence.findByEventTypeAndUserId(eventType, serviceContext.getGuestOrUserId(), start, end);
        
    	return buildDTOCollection(list);
    }
             
    private boolean checkUserHasPermissionToViewAllUsersLogs(ServiceContext serviceContext) throws PrincipalException{
    	return getPermissionChecker().hasPermission(serviceContext.getScopeGroupId(), serviceContext.getRootPortletId(),
				CLASS_PK, AmfRegistrationLogConstants.VIEW_ALL_USER_PERMISSION);
    }
    
    private List<AmfRegistrationLogDTO> buildDTOCollection(List<AmfRegistrationLog> list) {
    	List<AmfRegistrationLogDTO> returnList = new ArrayList<AmfRegistrationLogDTO>();
        if (list != null) {
            for (AmfRegistrationLog log : list) {
                AmfRegistrationLogDTO dto = new AmfRegistrationLogDTO();
                dto.setUserId(log.getUserId());
                dto.setScreenName(log.getScreenName());
                dto.setIpAddress(log.getIpAddress());
                dto.setEventType(log.getEventType());
                dto.setDateTime(log.getDateTime());
                dto.setAdditionalInfo(log.getAdditionalInfo());
                returnList.add(dto);
            }
        }
        return returnList;
    }
    
}