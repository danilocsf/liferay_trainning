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

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link AmfRegistration}.
 * </p>
 *
 * @author liferay
 * @see AmfRegistration
 * @generated
 */
@ProviderType
public class AmfRegistrationWrapper implements AmfRegistration,
	ModelWrapper<AmfRegistration> {
	public AmfRegistrationWrapper(AmfRegistration amfRegistration) {
		_amfRegistration = amfRegistration;
	}

	@Override
	public Class<?> getModelClass() {
		return AmfRegistration.class;
	}

	@Override
	public String getModelClassName() {
		return AmfRegistration.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("fakeAttribute", getFakeAttribute());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String fakeAttribute = (String)attributes.get("fakeAttribute");

		if (fakeAttribute != null) {
			setFakeAttribute(fakeAttribute);
		}
	}

	@Override
	public java.lang.Object clone() {
		return new AmfRegistrationWrapper((AmfRegistration)_amfRegistration.clone());
	}

	@Override
	public int compareTo(AmfRegistration amfRegistration) {
		return _amfRegistration.compareTo(amfRegistration);
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _amfRegistration.getExpandoBridge();
	}

	/**
	* Returns the fake attribute of this amf registration.
	*
	* @return the fake attribute of this amf registration
	*/
	@Override
	public java.lang.String getFakeAttribute() {
		return _amfRegistration.getFakeAttribute();
	}

	/**
	* Returns the primary key of this amf registration.
	*
	* @return the primary key of this amf registration
	*/
	@Override
	public java.lang.String getPrimaryKey() {
		return _amfRegistration.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _amfRegistration.getPrimaryKeyObj();
	}

	@Override
	public int hashCode() {
		return _amfRegistration.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _amfRegistration.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _amfRegistration.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _amfRegistration.isNew();
	}

	@Override
	public void persist() {
		_amfRegistration.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_amfRegistration.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_amfRegistration.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_amfRegistration.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_amfRegistration.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the fake attribute of this amf registration.
	*
	* @param fakeAttribute the fake attribute of this amf registration
	*/
	@Override
	public void setFakeAttribute(java.lang.String fakeAttribute) {
		_amfRegistration.setFakeAttribute(fakeAttribute);
	}

	@Override
	public void setNew(boolean n) {
		_amfRegistration.setNew(n);
	}

	/**
	* Sets the primary key of this amf registration.
	*
	* @param primaryKey the primary key of this amf registration
	*/
	@Override
	public void setPrimaryKey(java.lang.String primaryKey) {
		_amfRegistration.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_amfRegistration.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<AmfRegistration> toCacheModel() {
		return _amfRegistration.toCacheModel();
	}

	@Override
	public AmfRegistration toEscapedModel() {
		return new AmfRegistrationWrapper(_amfRegistration.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _amfRegistration.toString();
	}

	@Override
	public AmfRegistration toUnescapedModel() {
		return new AmfRegistrationWrapper(_amfRegistration.toUnescapedModel());
	}

	@Override
	public java.lang.String toXmlString() {
		return _amfRegistration.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AmfRegistrationWrapper)) {
			return false;
		}

		AmfRegistrationWrapper amfRegistrationWrapper = (AmfRegistrationWrapper)obj;

		if (Objects.equals(_amfRegistration,
					amfRegistrationWrapper._amfRegistration)) {
			return true;
		}

		return false;
	}

	@Override
	public AmfRegistration getWrappedModel() {
		return _amfRegistration;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _amfRegistration.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _amfRegistration.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_amfRegistration.resetOriginalValues();
	}

	private final AmfRegistration _amfRegistration;
}