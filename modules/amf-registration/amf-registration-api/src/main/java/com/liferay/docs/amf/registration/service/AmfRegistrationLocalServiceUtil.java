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

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for AmfRegistration. This utility wraps
 * {@link com.liferay.docs.amf.registration.service.impl.AmfRegistrationLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author liferay
 * @see AmfRegistrationLocalService
 * @see com.liferay.docs.amf.registration.service.base.AmfRegistrationLocalServiceBaseImpl
 * @see com.liferay.docs.amf.registration.service.impl.AmfRegistrationLocalServiceImpl
 * @generated
 */
@ProviderType
public class AmfRegistrationLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.docs.amf.registration.service.impl.AmfRegistrationLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the amf registration to the database. Also notifies the appropriate model listeners.
	*
	* @param amfRegistration the amf registration
	* @return the amf registration that was added
	*/
	public static com.liferay.docs.amf.registration.model.AmfRegistration addAmfRegistration(
		com.liferay.docs.amf.registration.model.AmfRegistration amfRegistration) {
		return getService().addAmfRegistration(amfRegistration);
	}

	/**
	* Gets the number of saved users with the informed zip code.
	*
	* @param zip code
	* @return number of saved users with the informed zip code.
	*/
	public static int countUserAddressByZip(java.lang.String zip) {
		return getService().countUserAddressByZip(zip);
	}

	/**
	* Creates a new amf registration with the primary key. Does not add the amf registration to the database.
	*
	* @param fakeAttribute the primary key for the new amf registration
	* @return the new amf registration
	*/
	public static com.liferay.docs.amf.registration.model.AmfRegistration createAmfRegistration(
		java.lang.String fakeAttribute) {
		return getService().createAmfRegistration(fakeAttribute);
	}

	/**
	* Deletes the amf registration from the database. Also notifies the appropriate model listeners.
	*
	* @param amfRegistration the amf registration
	* @return the amf registration that was removed
	*/
	public static com.liferay.docs.amf.registration.model.AmfRegistration deleteAmfRegistration(
		com.liferay.docs.amf.registration.model.AmfRegistration amfRegistration) {
		return getService().deleteAmfRegistration(amfRegistration);
	}

	/**
	* Deletes the amf registration with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param fakeAttribute the primary key of the amf registration
	* @return the amf registration that was removed
	* @throws PortalException if a amf registration with the primary key could not be found
	*/
	public static com.liferay.docs.amf.registration.model.AmfRegistration deleteAmfRegistration(
		java.lang.String fakeAttribute)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteAmfRegistration(fakeAttribute);
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.liferay.docs.amf.registration.model.AmfRegistration fetchAmfRegistration(
		java.lang.String fakeAttribute) {
		return getService().fetchAmfRegistration(fakeAttribute);
	}

	/**
	* Gets data from users with the informed zip code.
	*
	* @param zip code
	* @param int - start position to find data in database
	* @param int - max number of register to be returned
	* @return list of users
	*/
	public static java.util.List<com.liferay.docs.amf.registration.dto.AmfRegistrationDTO> findUserByZip(
		java.lang.String zip, int start, int delta) {
		return getService().findUserByZip(zip, start, delta);
	}

	/**
	* Returns the amf registration with the primary key.
	*
	* @param fakeAttribute the primary key of the amf registration
	* @return the amf registration
	* @throws PortalException if a amf registration with the primary key could not be found
	*/
	public static com.liferay.docs.amf.registration.model.AmfRegistration getAmfRegistration(
		java.lang.String fakeAttribute)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getAmfRegistration(fakeAttribute);
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
	public static java.util.List<com.liferay.docs.amf.registration.model.AmfRegistration> getAmfRegistrations(
		int start, int end) {
		return getService().getAmfRegistrations(start, end);
	}

	/**
	* Returns the number of amf registrations.
	*
	* @return the number of amf registrations
	*/
	public static int getAmfRegistrationsCount() {
		return getService().getAmfRegistrationsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Validates and saves a new user account.
	*
	* @param AmfRegistrationDTO - data to be saved
	* @param ServiceContext
	* @throws PortalException - if validation errors occurs
	*/
	public static void saveUserRegister(
		com.liferay.docs.amf.registration.dto.AmfRegistrationDTO userData,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		getService().saveUserRegister(userData, serviceContext);
	}

	/**
	* Updates the amf registration in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param amfRegistration the amf registration
	* @return the amf registration that was updated
	*/
	public static com.liferay.docs.amf.registration.model.AmfRegistration updateAmfRegistration(
		com.liferay.docs.amf.registration.model.AmfRegistration amfRegistration) {
		return getService().updateAmfRegistration(amfRegistration);
	}

	public static AmfRegistrationLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AmfRegistrationLocalService, AmfRegistrationLocalService> _serviceTracker =
		ServiceTrackerFactory.open(AmfRegistrationLocalService.class);
}