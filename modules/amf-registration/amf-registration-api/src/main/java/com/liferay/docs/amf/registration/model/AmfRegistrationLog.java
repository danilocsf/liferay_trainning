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
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the AmfRegistrationLog service. Represents a row in the &quot;AMF_REGISTRATION_LOG&quot; database table, with each column mapped to a property of this class.
 *
 * @author liferay
 * @see AmfRegistrationLogModel
 * @see com.liferay.docs.amf.registration.model.impl.AmfRegistrationLogImpl
 * @see com.liferay.docs.amf.registration.model.impl.AmfRegistrationLogModelImpl
 * @generated
 */
@ImplementationClassName("com.liferay.docs.amf.registration.model.impl.AmfRegistrationLogImpl")
@ProviderType
public interface AmfRegistrationLog extends AmfRegistrationLogModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.liferay.docs.amf.registration.model.impl.AmfRegistrationLogImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AmfRegistrationLog, Long> LOG_ID_ACCESSOR = new Accessor<AmfRegistrationLog, Long>() {
			@Override
			public Long get(AmfRegistrationLog amfRegistrationLog) {
				return amfRegistrationLog.getLogId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<AmfRegistrationLog> getTypeClass() {
				return AmfRegistrationLog.class;
			}
		};
}