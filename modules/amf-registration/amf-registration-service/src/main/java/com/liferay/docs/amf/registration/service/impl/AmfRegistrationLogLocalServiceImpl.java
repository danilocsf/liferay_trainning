/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 * <p>
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 * <p>
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.docs.amf.registration.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.liferay.docs.amf.registration.dto.AmfRegistrationLogDTO;
import com.liferay.docs.amf.registration.model.AmfRegistrationLog;
import com.liferay.docs.amf.registration.service.base.AmfRegistrationLogLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;

/**
 * The implementation of the amf registration log local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.docs.amf.registration.service.AmfRegistrationLogLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author liferay
 * @see AmfRegistrationLogLocalServiceBaseImpl
 * @see com.liferay.docs.amf.registration.service.AmfRegistrationLogLocalServiceUtil
 */
public class AmfRegistrationLogLocalServiceImpl
        extends AmfRegistrationLogLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this class directly. Always use {@link com.liferay.docs.amf.registration.service.AmfRegistrationLogLocalServiceUtil} to access the amf registration log local service.
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
    /**
     * Searches all logs for a specific user.
     * @param user Id
     * @param start log position in database 
     * @param end log position in database
     * @return list with founded logs
     */
    public List<AmfRegistrationLogDTO> findLogByUserId(long userId, int start, int end) {
    	List<AmfRegistrationLog> list = amfRegistrationLogPersistence.findByUserId(userId, start, end);
        return buildDTOCollection(list);
    }
    /**
     * Searches all logs for a specific event type.
     * @param event type
     * @param start log position in database 
     * @param end log position in database
     * @return list with founded logs
     */
    public List<AmfRegistrationLogDTO> findLogByEventType(String eventType, int start, int end) {
    	List<AmfRegistrationLog> list = amfRegistrationLogPersistence.findByEventType(eventType, start, end);
        return buildDTOCollection(list);
    }

    /**
     * Searches all logs for a specific event type and user id.
     * @param event type
     * @param user Id
     * @param start log position in database 
     * @param end log position in database
     * @return list with founded logs
     */
    public List<AmfRegistrationLogDTO> findLogByEventTypeAndUserId(String eventType, long userId, int start, int end) {
    	List<AmfRegistrationLog> list = amfRegistrationLogPersistence.findByEventTypeAndUserId(eventType, userId, start, end);
        return buildDTOCollection(list);
    }
    
    /**
     * Searches all logs.
     * @param start log position in database 
     * @param end log position in database
     * @return list with founded logs
     */
    public List<AmfRegistrationLogDTO> findAllLogs(int start, int end) {
    	List<AmfRegistrationLog> list = amfRegistrationLogPersistence.findAll(start, end);
        return buildDTOCollection(list);
    }
    /**
     * Gets the number of logs.
     * @param quantity of logs
     */
    public int countAllLogs(){
        return amfRegistrationLogPersistence.countAll();
    }

    /**
     * Gets the number of logs for a specific user id.
     * @param user id
     * @param quantity of logs
     */
    public int countLogsByUserId(long userId){
        return amfRegistrationLogPersistence.countByUserId(userId);
    }

    /**
     * Gets the number of logs for a specific event type.
     * @param event type
     * @param quantity of logs
     */
    public int countLogsByEventType(String eventType){
        return amfRegistrationLogPersistence.countByEventType(eventType);
    }

    /**
     * Gets the number of logs for a specific event type and user id.
     * @param event type
     * @param user id
     * @param quantity of logs
     */
    public int countLogsByEventTypeAndUserId(String eventType, long userId){
        return amfRegistrationLogPersistence.countByEventTypeAndUserId(eventType, userId);
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