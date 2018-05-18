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

import com.liferay.docs.amf.registration.model.AmfRegistration;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing AmfRegistration in entity cache.
 *
 * @author liferay
 * @see AmfRegistration
 * @generated
 */
@ProviderType
public class AmfRegistrationCacheModel implements CacheModel<AmfRegistration>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AmfRegistrationCacheModel)) {
			return false;
		}

		AmfRegistrationCacheModel amfRegistrationCacheModel = (AmfRegistrationCacheModel)obj;

		if (fakeAttribute.equals(amfRegistrationCacheModel.fakeAttribute)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, fakeAttribute);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(3);

		sb.append("{fakeAttribute=");
		sb.append(fakeAttribute);

		return sb.toString();
	}

	@Override
	public AmfRegistration toEntityModel() {
		AmfRegistrationImpl amfRegistrationImpl = new AmfRegistrationImpl();

		if (fakeAttribute == null) {
			amfRegistrationImpl.setFakeAttribute("");
		}
		else {
			amfRegistrationImpl.setFakeAttribute(fakeAttribute);
		}

		amfRegistrationImpl.resetOriginalValues();

		return amfRegistrationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		fakeAttribute = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (fakeAttribute == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(fakeAttribute);
		}
	}

	public String fakeAttribute;
}