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

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link AmfRegistrationLog}.
 * </p>
 *
 * @author liferay
 * @see AmfRegistrationLog
 * @generated
 */
@ProviderType
public class AmfRegistrationLogWrapper implements AmfRegistrationLog,
	ModelWrapper<AmfRegistrationLog> {
	public AmfRegistrationLogWrapper(AmfRegistrationLog amfRegistrationLog) {
		_amfRegistrationLog = amfRegistrationLog;
	}

	@Override
	public Class<?> getModelClass() {
		return AmfRegistrationLog.class;
	}

	@Override
	public String getModelClassName() {
		return AmfRegistrationLog.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("logId", getLogId());
		attributes.put("dateTime", getDateTime());
		attributes.put("screenName", getScreenName());
		attributes.put("userId", getUserId());
		attributes.put("ipAddress", getIpAddress());
		attributes.put("eventType", getEventType());
		attributes.put("additionalInfo", getAdditionalInfo());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long logId = (Long)attributes.get("logId");

		if (logId != null) {
			setLogId(logId);
		}

		Date dateTime = (Date)attributes.get("dateTime");

		if (dateTime != null) {
			setDateTime(dateTime);
		}

		String screenName = (String)attributes.get("screenName");

		if (screenName != null) {
			setScreenName(screenName);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String ipAddress = (String)attributes.get("ipAddress");

		if (ipAddress != null) {
			setIpAddress(ipAddress);
		}

		String eventType = (String)attributes.get("eventType");

		if (eventType != null) {
			setEventType(eventType);
		}

		String additionalInfo = (String)attributes.get("additionalInfo");

		if (additionalInfo != null) {
			setAdditionalInfo(additionalInfo);
		}
	}

	@Override
	public java.lang.Object clone() {
		return new AmfRegistrationLogWrapper((AmfRegistrationLog)_amfRegistrationLog.clone());
	}

	@Override
	public int compareTo(AmfRegistrationLog amfRegistrationLog) {
		return _amfRegistrationLog.compareTo(amfRegistrationLog);
	}

	/**
	* Returns the additional info of this amf registration log.
	*
	* @return the additional info of this amf registration log
	*/
	@Override
	public java.lang.String getAdditionalInfo() {
		return _amfRegistrationLog.getAdditionalInfo();
	}

	/**
	* Returns the date time of this amf registration log.
	*
	* @return the date time of this amf registration log
	*/
	@Override
	public Date getDateTime() {
		return _amfRegistrationLog.getDateTime();
	}

	/**
	* Returns the event type of this amf registration log.
	*
	* @return the event type of this amf registration log
	*/
	@Override
	public java.lang.String getEventType() {
		return _amfRegistrationLog.getEventType();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _amfRegistrationLog.getExpandoBridge();
	}

	/**
	* Returns the ip address of this amf registration log.
	*
	* @return the ip address of this amf registration log
	*/
	@Override
	public java.lang.String getIpAddress() {
		return _amfRegistrationLog.getIpAddress();
	}

	/**
	* Returns the log ID of this amf registration log.
	*
	* @return the log ID of this amf registration log
	*/
	@Override
	public long getLogId() {
		return _amfRegistrationLog.getLogId();
	}

	/**
	* Returns the primary key of this amf registration log.
	*
	* @return the primary key of this amf registration log
	*/
	@Override
	public long getPrimaryKey() {
		return _amfRegistrationLog.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _amfRegistrationLog.getPrimaryKeyObj();
	}

	/**
	* Returns the screen name of this amf registration log.
	*
	* @return the screen name of this amf registration log
	*/
	@Override
	public java.lang.String getScreenName() {
		return _amfRegistrationLog.getScreenName();
	}

	/**
	* Returns the user ID of this amf registration log.
	*
	* @return the user ID of this amf registration log
	*/
	@Override
	public long getUserId() {
		return _amfRegistrationLog.getUserId();
	}

	/**
	* Returns the user uuid of this amf registration log.
	*
	* @return the user uuid of this amf registration log
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _amfRegistrationLog.getUserUuid();
	}

	@Override
	public int hashCode() {
		return _amfRegistrationLog.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _amfRegistrationLog.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _amfRegistrationLog.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _amfRegistrationLog.isNew();
	}

	@Override
	public void persist() {
		_amfRegistrationLog.persist();
	}

	/**
	* Sets the additional info of this amf registration log.
	*
	* @param additionalInfo the additional info of this amf registration log
	*/
	@Override
	public void setAdditionalInfo(java.lang.String additionalInfo) {
		_amfRegistrationLog.setAdditionalInfo(additionalInfo);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_amfRegistrationLog.setCachedModel(cachedModel);
	}

	/**
	* Sets the date time of this amf registration log.
	*
	* @param dateTime the date time of this amf registration log
	*/
	@Override
	public void setDateTime(Date dateTime) {
		_amfRegistrationLog.setDateTime(dateTime);
	}

	/**
	* Sets the event type of this amf registration log.
	*
	* @param eventType the event type of this amf registration log
	*/
	@Override
	public void setEventType(java.lang.String eventType) {
		_amfRegistrationLog.setEventType(eventType);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_amfRegistrationLog.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_amfRegistrationLog.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_amfRegistrationLog.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ip address of this amf registration log.
	*
	* @param ipAddress the ip address of this amf registration log
	*/
	@Override
	public void setIpAddress(java.lang.String ipAddress) {
		_amfRegistrationLog.setIpAddress(ipAddress);
	}

	/**
	* Sets the log ID of this amf registration log.
	*
	* @param logId the log ID of this amf registration log
	*/
	@Override
	public void setLogId(long logId) {
		_amfRegistrationLog.setLogId(logId);
	}

	@Override
	public void setNew(boolean n) {
		_amfRegistrationLog.setNew(n);
	}

	/**
	* Sets the primary key of this amf registration log.
	*
	* @param primaryKey the primary key of this amf registration log
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_amfRegistrationLog.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_amfRegistrationLog.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the screen name of this amf registration log.
	*
	* @param screenName the screen name of this amf registration log
	*/
	@Override
	public void setScreenName(java.lang.String screenName) {
		_amfRegistrationLog.setScreenName(screenName);
	}

	/**
	* Sets the user ID of this amf registration log.
	*
	* @param userId the user ID of this amf registration log
	*/
	@Override
	public void setUserId(long userId) {
		_amfRegistrationLog.setUserId(userId);
	}

	/**
	* Sets the user uuid of this amf registration log.
	*
	* @param userUuid the user uuid of this amf registration log
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_amfRegistrationLog.setUserUuid(userUuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<AmfRegistrationLog> toCacheModel() {
		return _amfRegistrationLog.toCacheModel();
	}

	@Override
	public AmfRegistrationLog toEscapedModel() {
		return new AmfRegistrationLogWrapper(_amfRegistrationLog.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _amfRegistrationLog.toString();
	}

	@Override
	public AmfRegistrationLog toUnescapedModel() {
		return new AmfRegistrationLogWrapper(_amfRegistrationLog.toUnescapedModel());
	}

	@Override
	public java.lang.String toXmlString() {
		return _amfRegistrationLog.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AmfRegistrationLogWrapper)) {
			return false;
		}

		AmfRegistrationLogWrapper amfRegistrationLogWrapper = (AmfRegistrationLogWrapper)obj;

		if (Objects.equals(_amfRegistrationLog,
					amfRegistrationLogWrapper._amfRegistrationLog)) {
			return true;
		}

		return false;
	}

	@Override
	public AmfRegistrationLog getWrappedModel() {
		return _amfRegistrationLog;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _amfRegistrationLog.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _amfRegistrationLog.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_amfRegistrationLog.resetOriginalValues();
	}

	private final AmfRegistrationLog _amfRegistrationLog;
}