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
 * Provides a wrapper for {@link AmfRegistrationLogLocalService}.
 *
 * @author liferay
 * @see AmfRegistrationLogLocalService
 * @generated
 */
@ProviderType
public class AmfRegistrationLogLocalServiceWrapper
	implements AmfRegistrationLogLocalService,
		ServiceWrapper<AmfRegistrationLogLocalService> {
	public AmfRegistrationLogLocalServiceWrapper(
		AmfRegistrationLogLocalService amfRegistrationLogLocalService) {
		_amfRegistrationLogLocalService = amfRegistrationLogLocalService;
	}

	/**
	* Adds the amf registration log to the database. Also notifies the appropriate model listeners.
	*
	* @param amfRegistrationLog the amf registration log
	* @return the amf registration log that was added
	*/
	@Override
	public com.liferay.docs.amf.registration.model.AmfRegistrationLog addAmfRegistrationLog(
		com.liferay.docs.amf.registration.model.AmfRegistrationLog amfRegistrationLog) {
		return _amfRegistrationLogLocalService.addAmfRegistrationLog(amfRegistrationLog);
	}

	@Override
	public void addLog(
		com.liferay.docs.amf.registration.dto.AmfRegistrationLogDTO log)
		throws com.liferay.portal.kernel.exception.PortalException {
		_amfRegistrationLogLocalService.addLog(log);
	}

	@Override
	public int countAllLogs() {
		return _amfRegistrationLogLocalService.countAllLogs();
	}

	@Override
	public int countLogsByEventType(java.lang.String eventType) {
		return _amfRegistrationLogLocalService.countLogsByEventType(eventType);
	}

	@Override
	public int countLogsByEventTypeAndUserId(java.lang.String eventType,
		long userId) {
		return _amfRegistrationLogLocalService.countLogsByEventTypeAndUserId(eventType,
			userId);
	}

	@Override
	public int countLogsByUserId(long userId) {
		return _amfRegistrationLogLocalService.countLogsByUserId(userId);
	}

	/**
	* Creates a new amf registration log with the primary key. Does not add the amf registration log to the database.
	*
	* @param logId the primary key for the new amf registration log
	* @return the new amf registration log
	*/
	@Override
	public com.liferay.docs.amf.registration.model.AmfRegistrationLog createAmfRegistrationLog(
		long logId) {
		return _amfRegistrationLogLocalService.createAmfRegistrationLog(logId);
	}

	/**
	* Deletes the amf registration log from the database. Also notifies the appropriate model listeners.
	*
	* @param amfRegistrationLog the amf registration log
	* @return the amf registration log that was removed
	*/
	@Override
	public com.liferay.docs.amf.registration.model.AmfRegistrationLog deleteAmfRegistrationLog(
		com.liferay.docs.amf.registration.model.AmfRegistrationLog amfRegistrationLog) {
		return _amfRegistrationLogLocalService.deleteAmfRegistrationLog(amfRegistrationLog);
	}

	/**
	* Deletes the amf registration log with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param logId the primary key of the amf registration log
	* @return the amf registration log that was removed
	* @throws PortalException if a amf registration log with the primary key could not be found
	*/
	@Override
	public com.liferay.docs.amf.registration.model.AmfRegistrationLog deleteAmfRegistrationLog(
		long logId) throws com.liferay.portal.kernel.exception.PortalException {
		return _amfRegistrationLogLocalService.deleteAmfRegistrationLog(logId);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _amfRegistrationLogLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _amfRegistrationLogLocalService.dynamicQuery();
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
		return _amfRegistrationLogLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.amf.registration.model.impl.AmfRegistrationLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _amfRegistrationLogLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.amf.registration.model.impl.AmfRegistrationLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _amfRegistrationLogLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
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
		return _amfRegistrationLogLocalService.dynamicQueryCount(dynamicQuery);
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
		return _amfRegistrationLogLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.liferay.docs.amf.registration.model.AmfRegistrationLog fetchAmfRegistrationLog(
		long logId) {
		return _amfRegistrationLogLocalService.fetchAmfRegistrationLog(logId);
	}

	@Override
	public java.util.List<com.liferay.docs.amf.registration.dto.AmfRegistrationLogDTO> findAllLogs(
		int start, int end) {
		return _amfRegistrationLogLocalService.findAllLogs(start, end);
	}

	@Override
	public java.util.List<com.liferay.docs.amf.registration.dto.AmfRegistrationLogDTO> findLogByEventType(
		java.lang.String eventType, int start, int end) {
		return _amfRegistrationLogLocalService.findLogByEventType(eventType,
			start, end);
	}

	@Override
	public java.util.List<com.liferay.docs.amf.registration.dto.AmfRegistrationLogDTO> findLogByEventTypeAndUserId(
		java.lang.String eventType, long userId, int start, int end) {
		return _amfRegistrationLogLocalService.findLogByEventTypeAndUserId(eventType,
			userId, start, end);
	}

	@Override
	public java.util.List<com.liferay.docs.amf.registration.dto.AmfRegistrationLogDTO> findLogByUserId(
		long userId, int start, int end) {
		return _amfRegistrationLogLocalService.findLogByUserId(userId, start,
			end);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _amfRegistrationLogLocalService.getActionableDynamicQuery();
	}

	/**
	* Returns the amf registration log with the primary key.
	*
	* @param logId the primary key of the amf registration log
	* @return the amf registration log
	* @throws PortalException if a amf registration log with the primary key could not be found
	*/
	@Override
	public com.liferay.docs.amf.registration.model.AmfRegistrationLog getAmfRegistrationLog(
		long logId) throws com.liferay.portal.kernel.exception.PortalException {
		return _amfRegistrationLogLocalService.getAmfRegistrationLog(logId);
	}

	/**
	* Returns a range of all the amf registration logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.amf.registration.model.impl.AmfRegistrationLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of amf registration logs
	* @param end the upper bound of the range of amf registration logs (not inclusive)
	* @return the range of amf registration logs
	*/
	@Override
	public java.util.List<com.liferay.docs.amf.registration.model.AmfRegistrationLog> getAmfRegistrationLogs(
		int start, int end) {
		return _amfRegistrationLogLocalService.getAmfRegistrationLogs(start, end);
	}

	/**
	* Returns the number of amf registration logs.
	*
	* @return the number of amf registration logs
	*/
	@Override
	public int getAmfRegistrationLogsCount() {
		return _amfRegistrationLogLocalService.getAmfRegistrationLogsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _amfRegistrationLogLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _amfRegistrationLogLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _amfRegistrationLogLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Updates the amf registration log in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param amfRegistrationLog the amf registration log
	* @return the amf registration log that was updated
	*/
	@Override
	public com.liferay.docs.amf.registration.model.AmfRegistrationLog updateAmfRegistrationLog(
		com.liferay.docs.amf.registration.model.AmfRegistrationLog amfRegistrationLog) {
		return _amfRegistrationLogLocalService.updateAmfRegistrationLog(amfRegistrationLog);
	}

	@Override
	public AmfRegistrationLogLocalService getWrappedService() {
		return _amfRegistrationLogLocalService;
	}

	@Override
	public void setWrappedService(
		AmfRegistrationLogLocalService amfRegistrationLogLocalService) {
		_amfRegistrationLogLocalService = amfRegistrationLogLocalService;
	}

	private AmfRegistrationLogLocalService _amfRegistrationLogLocalService;
}