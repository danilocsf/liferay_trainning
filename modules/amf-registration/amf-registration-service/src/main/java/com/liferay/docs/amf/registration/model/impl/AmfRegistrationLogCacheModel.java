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

package com.liferay.docs.amf.registration.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.docs.amf.registration.model.AmfRegistrationLog;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AmfRegistrationLog in entity cache.
 *
 * @author liferay
 * @see AmfRegistrationLog
 * @generated
 */
@ProviderType
public class AmfRegistrationLogCacheModel implements CacheModel<AmfRegistrationLog>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AmfRegistrationLogCacheModel)) {
			return false;
		}

		AmfRegistrationLogCacheModel amfRegistrationLogCacheModel = (AmfRegistrationLogCacheModel)obj;

		if (logId == amfRegistrationLogCacheModel.logId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, logId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{logId=");
		sb.append(logId);
		sb.append(", dateTime=");
		sb.append(dateTime);
		sb.append(", screenName=");
		sb.append(screenName);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", ipAddress=");
		sb.append(ipAddress);
		sb.append(", eventType=");
		sb.append(eventType);
		sb.append(", additionalInfo=");
		sb.append(additionalInfo);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AmfRegistrationLog toEntityModel() {
		AmfRegistrationLogImpl amfRegistrationLogImpl = new AmfRegistrationLogImpl();

		amfRegistrationLogImpl.setLogId(logId);

		if (dateTime == Long.MIN_VALUE) {
			amfRegistrationLogImpl.setDateTime(null);
		}
		else {
			amfRegistrationLogImpl.setDateTime(new Date(dateTime));
		}

		if (screenName == null) {
			amfRegistrationLogImpl.setScreenName("");
		}
		else {
			amfRegistrationLogImpl.setScreenName(screenName);
		}

		amfRegistrationLogImpl.setUserId(userId);

		if (ipAddress == null) {
			amfRegistrationLogImpl.setIpAddress("");
		}
		else {
			amfRegistrationLogImpl.setIpAddress(ipAddress);
		}

		if (eventType == null) {
			amfRegistrationLogImpl.setEventType("");
		}
		else {
			amfRegistrationLogImpl.setEventType(eventType);
		}

		if (additionalInfo == null) {
			amfRegistrationLogImpl.setAdditionalInfo("");
		}
		else {
			amfRegistrationLogImpl.setAdditionalInfo(additionalInfo);
		}

		amfRegistrationLogImpl.resetOriginalValues();

		return amfRegistrationLogImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		logId = objectInput.readLong();
		dateTime = objectInput.readLong();
		screenName = objectInput.readUTF();

		userId = objectInput.readLong();
		ipAddress = objectInput.readUTF();
		eventType = objectInput.readUTF();
		additionalInfo = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(logId);
		objectOutput.writeLong(dateTime);

		if (screenName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(screenName);
		}

		objectOutput.writeLong(userId);

		if (ipAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ipAddress);
		}

		if (eventType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(eventType);
		}

		if (additionalInfo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(additionalInfo);
		}
	}

	public long logId;
	public long dateTime;
	public String screenName;
	public long userId;
	public String ipAddress;
	public String eventType;
	public String additionalInfo;
}