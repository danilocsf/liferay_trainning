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
}