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

package com.liferay.docs.amf.registration.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.docs.amf.registration.service.http.AmfRegistrationLogServiceSoap}.
 *
 * @author liferay
 * @see com.liferay.docs.amf.registration.service.http.AmfRegistrationLogServiceSoap
 * @generated
 */
@ProviderType
public class AmfRegistrationLogSoap implements Serializable {
	public static AmfRegistrationLogSoap toSoapModel(AmfRegistrationLog model) {
		AmfRegistrationLogSoap soapModel = new AmfRegistrationLogSoap();

		soapModel.setLogId(model.getLogId());
		soapModel.setDateTime(model.getDateTime());
		soapModel.setScreenName(model.getScreenName());
		soapModel.setUserId(model.getUserId());
		soapModel.setIpAddress(model.getIpAddress());
		soapModel.setEventType(model.getEventType());
		soapModel.setAdditionalInfo(model.getAdditionalInfo());

		return soapModel;
	}

	public static AmfRegistrationLogSoap[] toSoapModels(
		AmfRegistrationLog[] models) {
		AmfRegistrationLogSoap[] soapModels = new AmfRegistrationLogSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AmfRegistrationLogSoap[][] toSoapModels(
		AmfRegistrationLog[][] models) {
		AmfRegistrationLogSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AmfRegistrationLogSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AmfRegistrationLogSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AmfRegistrationLogSoap[] toSoapModels(
		List<AmfRegistrationLog> models) {
		List<AmfRegistrationLogSoap> soapModels = new ArrayList<AmfRegistrationLogSoap>(models.size());

		for (AmfRegistrationLog model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AmfRegistrationLogSoap[soapModels.size()]);
	}

	public AmfRegistrationLogSoap() {
	}

	public long getPrimaryKey() {
		return _logId;
	}

	public void setPrimaryKey(long pk) {
		setLogId(pk);
	}

	public long getLogId() {
		return _logId;
	}

	public void setLogId(long logId) {
		_logId = logId;
	}

	public Date getDateTime() {
		return _dateTime;
	}

	public void setDateTime(Date dateTime) {
		_dateTime = dateTime;
	}

	public String getScreenName() {
		return _screenName;
	}

	public void setScreenName(String screenName) {
		_screenName = screenName;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getIpAddress() {
		return _ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		_ipAddress = ipAddress;
	}

	public String getEventType() {
		return _eventType;
	}

	public void setEventType(String eventType) {
		_eventType = eventType;
	}

	public String getAdditionalInfo() {
		return _additionalInfo;
	}

	public void setAdditionalInfo(String additionalInfo) {
		_additionalInfo = additionalInfo;
	}

	private long _logId;
	private Date _dateTime;
	private String _screenName;
	private long _userId;
	private String _ipAddress;
	private String _eventType;
	private String _additionalInfo;
}