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

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the AmfRegistration service. Represents a row in the &quot;AR_AmfRegistration&quot; database table, with each column mapped to a property of this class.
 *
 * @author liferay
 * @see AmfRegistrationModel
 * @see com.liferay.docs.amf.registration.model.impl.AmfRegistrationImpl
 * @see com.liferay.docs.amf.registration.model.impl.AmfRegistrationModelImpl
 * @generated
 */
@ImplementationClassName("com.liferay.docs.amf.registration.model.impl.AmfRegistrationImpl")
@ProviderType
public interface AmfRegistration extends AmfRegistrationModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.liferay.docs.amf.registration.model.impl.AmfRegistrationImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AmfRegistration, String> FAKE_ATTRIBUTE_ACCESSOR =
		new Accessor<AmfRegistration, String>() {
			@Override
			public String get(AmfRegistration amfRegistration) {
				return amfRegistration.getFakeAttribute();
			}

			@Override
			public Class<String> getAttributeClass() {
				return String.class;
			}

			@Override
			public Class<AmfRegistration> getTypeClass() {
				return AmfRegistration.class;
			}
		};
}