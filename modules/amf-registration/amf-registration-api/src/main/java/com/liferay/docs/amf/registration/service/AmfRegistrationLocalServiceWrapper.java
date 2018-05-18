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

package com.liferay.docs.amf.registration.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AmfRegistrationLocalService}.
 *
 * @author liferay
 * @see AmfRegistrationLocalService
 * @generated
 */
@ProviderType
public class AmfRegistrationLocalServiceWrapper
	implements AmfRegistrationLocalService,
		ServiceWrapper<AmfRegistrationLocalService> {
	public AmfRegistrationLocalServiceWrapper(
		AmfRegistrationLocalService amfRegistrationLocalService) {
		_amfRegistrationLocalService = amfRegistrationLocalService;
	}

	/**
	* Adds the amf registration to the database. Also notifies the appropriate model listeners.
	*
	* @param amfRegistration the amf registration
	* @return the amf registration that was added
	*/
	@Override
	public com.liferay.docs.amf.registration.model.AmfRegistration addAmfRegistration(
		com.liferay.docs.amf.registration.model.AmfRegistration amfRegistration) {
		return _amfRegistrationLocalService.addAmfRegistration(amfRegistration);
	}

	/**
	* Gets the number of saved users with the informed zip code.
	*
	* @param zip code
	* @return number of saved users with the informed zip code.
	*/
	@Override
	public int countUserAddressByZip(java.lang.String zip) {
		return _amfRegistrationLocalService.countUserAddressByZip(zip);
	}

	/**
	* Creates a new amf registration with the primary key. Does not add the amf registration to the database.
	*
	* @param fakeAttribute the primary key for the new amf registration
	* @return the new amf registration
	*/
	@Override
	public com.liferay.docs.amf.registration.model.AmfRegistration createAmfRegistration(
		java.lang.String fakeAttribute) {
		return _amfRegistrationLocalService.createAmfRegistration(fakeAttribute);
	}

	/**
	* Deletes the amf registration from the database. Also notifies the appropriate model listeners.
	*
	* @param amfRegistration the amf registration
	* @return the amf registration that was removed
	*/
	@Override
	public com.liferay.docs.amf.registration.model.AmfRegistration deleteAmfRegistration(
		com.liferay.docs.amf.registration.model.AmfRegistration amfRegistration) {
		return _amfRegistrationLocalService.deleteAmfRegistration(amfRegistration);
	}

	/**
	* Deletes the amf registration with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param fakeAttribute the primary key of the amf registration
	* @return the amf registration that was removed
	* @throws PortalException if a amf registration with the primary key could not be found
	*/
	@Override
	public com.liferay.docs.amf.registration.model.AmfRegistration deleteAmfRegistration(
		java.lang.String fakeAttribute)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _amfRegistrationLocalService.deleteAmfRegistration(fakeAttribute);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _amfRegistrationLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _amfRegistrationLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _amfRegistrationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.amf.registration.model.impl.AmfRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _amfRegistrationLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.amf.registration.model.impl.AmfRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _amfRegistrationLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _amfRegistrationLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _amfRegistrationLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.liferay.docs.amf.registration.model.AmfRegistration fetchAmfRegistration(
		java.lang.String fakeAttribute) {
		return _amfRegistrationLocalService.fetchAmfRegistration(fakeAttribute);
	}

	/**
	* Gets data from users with the informed zip code.
	*
	* @param zip code
	* @param int - start position to find data in database
	* @param int - max number of register to be returned
	* @return list of users
	*/
	@Override
	public java.util.List<com.liferay.docs.amf.registration.dto.AmfRegistrationDTO> findUserByZip(
		java.lang.String zip, int start, int delta) {
		return _amfRegistrationLocalService.findUserByZip(zip, start, delta);
	}

	/**
	* Returns the amf registration with the primary key.
	*
	* @param fakeAttribute the primary key of the amf registration
	* @return the amf registration
	* @throws PortalException if a amf registration with the primary key could not be found
	*/
	@Override
	public com.liferay.docs.amf.registration.model.AmfRegistration getAmfRegistration(
		java.lang.String fakeAttribute)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _amfRegistrationLocalService.getAmfRegistration(fakeAttribute);
	}

	/**
	* Returns a range of all the amf registrations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.amf.registration.model.impl.AmfRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of amf registrations
	* @param end the upper bound of the range of amf registrations (not inclusive)
	* @return the range of amf registrations
	*/
	@Override
	public java.util.List<com.liferay.docs.amf.registration.model.AmfRegistration> getAmfRegistrations(
		int start, int end) {
		return _amfRegistrationLocalService.getAmfRegistrations(start, end);
	}

	/**
	* Returns the number of amf registrations.
	*
	* @return the number of amf registrations
	*/
	@Override
	public int getAmfRegistrationsCount() {
		return _amfRegistrationLocalService.getAmfRegistrationsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _amfRegistrationLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _amfRegistrationLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Validates and saves a new user account.
	*
	* @param AmfRegistrationDTO - data to be saved
	* @param ServiceContext
	* @throws PortalException - if validation errors occurs
	*/
	@Override
	public void saveUserRegister(
		com.liferay.docs.amf.registration.dto.AmfRegistrationDTO userData,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		_amfRegistrationLocalService.saveUserRegister(userData, serviceContext);
	}

	/**
	* Updates the amf registration in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param amfRegistration the amf registration
	* @return the amf registration that was updated
	*/
	@Override
	public com.liferay.docs.amf.registration.model.AmfRegistration updateAmfRegistration(
		com.liferay.docs.amf.registration.model.AmfRegistration amfRegistration) {
		return _amfRegistrationLocalService.updateAmfRegistration(amfRegistration);
	}

	@Override
	public AmfRegistrationLocalService getWrappedService() {
		return _amfRegistrationLocalService;
	}

	@Override
	public void setWrappedService(
		AmfRegistrationLocalService amfRegistrationLocalService) {
		_amfRegistrationLocalService = amfRegistrationLocalService;
	}

	private AmfRegistrationLocalService _amfRegistrationLocalService;
}