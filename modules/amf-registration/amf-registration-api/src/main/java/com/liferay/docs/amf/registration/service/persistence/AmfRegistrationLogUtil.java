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

package com.liferay.docs.amf.registration.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.docs.amf.registration.model.AmfRegistrationLog;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the amf registration log service. This utility wraps {@link com.liferay.docs.amf.registration.service.persistence.impl.AmfRegistrationLogPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author liferay
 * @see AmfRegistrationLogPersistence
 * @see com.liferay.docs.amf.registration.service.persistence.impl.AmfRegistrationLogPersistenceImpl
 * @generated
 */
@ProviderType
public class AmfRegistrationLogUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(AmfRegistrationLog amfRegistrationLog) {
		getPersistence().clearCache(amfRegistrationLog);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AmfRegistrationLog> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AmfRegistrationLog> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AmfRegistrationLog> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AmfRegistrationLog> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AmfRegistrationLog update(
		AmfRegistrationLog amfRegistrationLog) {
		return getPersistence().update(amfRegistrationLog);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AmfRegistrationLog update(
		AmfRegistrationLog amfRegistrationLog, ServiceContext serviceContext) {
		return getPersistence().update(amfRegistrationLog, serviceContext);
	}

	/**
	* Returns all the amf registration logs where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching amf registration logs
	*/
	public static List<AmfRegistrationLog> findByUserId(long userId) {
		return getPersistence().findByUserId(userId);
	}

	/**
	* Returns a range of all the amf registration logs where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AmfRegistrationLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of amf registration logs
	* @param end the upper bound of the range of amf registration logs (not inclusive)
	* @return the range of matching amf registration logs
	*/
	public static List<AmfRegistrationLog> findByUserId(long userId, int start,
		int end) {
		return getPersistence().findByUserId(userId, start, end);
	}

	/**
	* Returns an ordered range of all the amf registration logs where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AmfRegistrationLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of amf registration logs
	* @param end the upper bound of the range of amf registration logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching amf registration logs
	*/
	public static List<AmfRegistrationLog> findByUserId(long userId, int start,
		int end, OrderByComparator<AmfRegistrationLog> orderByComparator) {
		return getPersistence()
				   .findByUserId(userId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the amf registration logs where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AmfRegistrationLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of amf registration logs
	* @param end the upper bound of the range of amf registration logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching amf registration logs
	*/
	public static List<AmfRegistrationLog> findByUserId(long userId, int start,
		int end, OrderByComparator<AmfRegistrationLog> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUserId(userId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first amf registration log in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching amf registration log
	* @throws NoSuchAmfRegistrationLogException if a matching amf registration log could not be found
	*/
	public static AmfRegistrationLog findByUserId_First(long userId,
		OrderByComparator<AmfRegistrationLog> orderByComparator)
		throws com.liferay.docs.amf.registration.exception.NoSuchAmfRegistrationLogException {
		return getPersistence().findByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the first amf registration log in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching amf registration log, or <code>null</code> if a matching amf registration log could not be found
	*/
	public static AmfRegistrationLog fetchByUserId_First(long userId,
		OrderByComparator<AmfRegistrationLog> orderByComparator) {
		return getPersistence().fetchByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the last amf registration log in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching amf registration log
	* @throws NoSuchAmfRegistrationLogException if a matching amf registration log could not be found
	*/
	public static AmfRegistrationLog findByUserId_Last(long userId,
		OrderByComparator<AmfRegistrationLog> orderByComparator)
		throws com.liferay.docs.amf.registration.exception.NoSuchAmfRegistrationLogException {
		return getPersistence().findByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the last amf registration log in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching amf registration log, or <code>null</code> if a matching amf registration log could not be found
	*/
	public static AmfRegistrationLog fetchByUserId_Last(long userId,
		OrderByComparator<AmfRegistrationLog> orderByComparator) {
		return getPersistence().fetchByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the amf registration logs before and after the current amf registration log in the ordered set where userId = &#63;.
	*
	* @param logId the primary key of the current amf registration log
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next amf registration log
	* @throws NoSuchAmfRegistrationLogException if a amf registration log with the primary key could not be found
	*/
	public static AmfRegistrationLog[] findByUserId_PrevAndNext(long logId,
		long userId, OrderByComparator<AmfRegistrationLog> orderByComparator)
		throws com.liferay.docs.amf.registration.exception.NoSuchAmfRegistrationLogException {
		return getPersistence()
				   .findByUserId_PrevAndNext(logId, userId, orderByComparator);
	}

	/**
	* Removes all the amf registration logs where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public static void removeByUserId(long userId) {
		getPersistence().removeByUserId(userId);
	}

	/**
	* Returns the number of amf registration logs where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching amf registration logs
	*/
	public static int countByUserId(long userId) {
		return getPersistence().countByUserId(userId);
	}

	/**
	* Returns all the amf registration logs where eventType = &#63;.
	*
	* @param eventType the event type
	* @return the matching amf registration logs
	*/
	public static List<AmfRegistrationLog> findByEventType(
		java.lang.String eventType) {
		return getPersistence().findByEventType(eventType);
	}

	/**
	* Returns a range of all the amf registration logs where eventType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AmfRegistrationLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param eventType the event type
	* @param start the lower bound of the range of amf registration logs
	* @param end the upper bound of the range of amf registration logs (not inclusive)
	* @return the range of matching amf registration logs
	*/
	public static List<AmfRegistrationLog> findByEventType(
		java.lang.String eventType, int start, int end) {
		return getPersistence().findByEventType(eventType, start, end);
	}

	/**
	* Returns an ordered range of all the amf registration logs where eventType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AmfRegistrationLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param eventType the event type
	* @param start the lower bound of the range of amf registration logs
	* @param end the upper bound of the range of amf registration logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching amf registration logs
	*/
	public static List<AmfRegistrationLog> findByEventType(
		java.lang.String eventType, int start, int end,
		OrderByComparator<AmfRegistrationLog> orderByComparator) {
		return getPersistence()
				   .findByEventType(eventType, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the amf registration logs where eventType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AmfRegistrationLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param eventType the event type
	* @param start the lower bound of the range of amf registration logs
	* @param end the upper bound of the range of amf registration logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching amf registration logs
	*/
	public static List<AmfRegistrationLog> findByEventType(
		java.lang.String eventType, int start, int end,
		OrderByComparator<AmfRegistrationLog> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByEventType(eventType, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first amf registration log in the ordered set where eventType = &#63;.
	*
	* @param eventType the event type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching amf registration log
	* @throws NoSuchAmfRegistrationLogException if a matching amf registration log could not be found
	*/
	public static AmfRegistrationLog findByEventType_First(
		java.lang.String eventType,
		OrderByComparator<AmfRegistrationLog> orderByComparator)
		throws com.liferay.docs.amf.registration.exception.NoSuchAmfRegistrationLogException {
		return getPersistence()
				   .findByEventType_First(eventType, orderByComparator);
	}

	/**
	* Returns the first amf registration log in the ordered set where eventType = &#63;.
	*
	* @param eventType the event type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching amf registration log, or <code>null</code> if a matching amf registration log could not be found
	*/
	public static AmfRegistrationLog fetchByEventType_First(
		java.lang.String eventType,
		OrderByComparator<AmfRegistrationLog> orderByComparator) {
		return getPersistence()
				   .fetchByEventType_First(eventType, orderByComparator);
	}

	/**
	* Returns the last amf registration log in the ordered set where eventType = &#63;.
	*
	* @param eventType the event type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching amf registration log
	* @throws NoSuchAmfRegistrationLogException if a matching amf registration log could not be found
	*/
	public static AmfRegistrationLog findByEventType_Last(
		java.lang.String eventType,
		OrderByComparator<AmfRegistrationLog> orderByComparator)
		throws com.liferay.docs.amf.registration.exception.NoSuchAmfRegistrationLogException {
		return getPersistence()
				   .findByEventType_Last(eventType, orderByComparator);
	}

	/**
	* Returns the last amf registration log in the ordered set where eventType = &#63;.
	*
	* @param eventType the event type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching amf registration log, or <code>null</code> if a matching amf registration log could not be found
	*/
	public static AmfRegistrationLog fetchByEventType_Last(
		java.lang.String eventType,
		OrderByComparator<AmfRegistrationLog> orderByComparator) {
		return getPersistence()
				   .fetchByEventType_Last(eventType, orderByComparator);
	}

	/**
	* Returns the amf registration logs before and after the current amf registration log in the ordered set where eventType = &#63;.
	*
	* @param logId the primary key of the current amf registration log
	* @param eventType the event type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next amf registration log
	* @throws NoSuchAmfRegistrationLogException if a amf registration log with the primary key could not be found
	*/
	public static AmfRegistrationLog[] findByEventType_PrevAndNext(long logId,
		java.lang.String eventType,
		OrderByComparator<AmfRegistrationLog> orderByComparator)
		throws com.liferay.docs.amf.registration.exception.NoSuchAmfRegistrationLogException {
		return getPersistence()
				   .findByEventType_PrevAndNext(logId, eventType,
			orderByComparator);
	}

	/**
	* Removes all the amf registration logs where eventType = &#63; from the database.
	*
	* @param eventType the event type
	*/
	public static void removeByEventType(java.lang.String eventType) {
		getPersistence().removeByEventType(eventType);
	}

	/**
	* Returns the number of amf registration logs where eventType = &#63;.
	*
	* @param eventType the event type
	* @return the number of matching amf registration logs
	*/
	public static int countByEventType(java.lang.String eventType) {
		return getPersistence().countByEventType(eventType);
	}

	/**
	* Returns all the amf registration logs where eventType = &#63; and userId = &#63;.
	*
	* @param eventType the event type
	* @param userId the user ID
	* @return the matching amf registration logs
	*/
	public static List<AmfRegistrationLog> findByEventTypeAndUserId(
		java.lang.String eventType, long userId) {
		return getPersistence().findByEventTypeAndUserId(eventType, userId);
	}

	/**
	* Returns a range of all the amf registration logs where eventType = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AmfRegistrationLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param eventType the event type
	* @param userId the user ID
	* @param start the lower bound of the range of amf registration logs
	* @param end the upper bound of the range of amf registration logs (not inclusive)
	* @return the range of matching amf registration logs
	*/
	public static List<AmfRegistrationLog> findByEventTypeAndUserId(
		java.lang.String eventType, long userId, int start, int end) {
		return getPersistence()
				   .findByEventTypeAndUserId(eventType, userId, start, end);
	}

	/**
	* Returns an ordered range of all the amf registration logs where eventType = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AmfRegistrationLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param eventType the event type
	* @param userId the user ID
	* @param start the lower bound of the range of amf registration logs
	* @param end the upper bound of the range of amf registration logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching amf registration logs
	*/
	public static List<AmfRegistrationLog> findByEventTypeAndUserId(
		java.lang.String eventType, long userId, int start, int end,
		OrderByComparator<AmfRegistrationLog> orderByComparator) {
		return getPersistence()
				   .findByEventTypeAndUserId(eventType, userId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the amf registration logs where eventType = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AmfRegistrationLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param eventType the event type
	* @param userId the user ID
	* @param start the lower bound of the range of amf registration logs
	* @param end the upper bound of the range of amf registration logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching amf registration logs
	*/
	public static List<AmfRegistrationLog> findByEventTypeAndUserId(
		java.lang.String eventType, long userId, int start, int end,
		OrderByComparator<AmfRegistrationLog> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByEventTypeAndUserId(eventType, userId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first amf registration log in the ordered set where eventType = &#63; and userId = &#63;.
	*
	* @param eventType the event type
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching amf registration log
	* @throws NoSuchAmfRegistrationLogException if a matching amf registration log could not be found
	*/
	public static AmfRegistrationLog findByEventTypeAndUserId_First(
		java.lang.String eventType, long userId,
		OrderByComparator<AmfRegistrationLog> orderByComparator)
		throws com.liferay.docs.amf.registration.exception.NoSuchAmfRegistrationLogException {
		return getPersistence()
				   .findByEventTypeAndUserId_First(eventType, userId,
			orderByComparator);
	}

	/**
	* Returns the first amf registration log in the ordered set where eventType = &#63; and userId = &#63;.
	*
	* @param eventType the event type
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching amf registration log, or <code>null</code> if a matching amf registration log could not be found
	*/
	public static AmfRegistrationLog fetchByEventTypeAndUserId_First(
		java.lang.String eventType, long userId,
		OrderByComparator<AmfRegistrationLog> orderByComparator) {
		return getPersistence()
				   .fetchByEventTypeAndUserId_First(eventType, userId,
			orderByComparator);
	}

	/**
	* Returns the last amf registration log in the ordered set where eventType = &#63; and userId = &#63;.
	*
	* @param eventType the event type
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching amf registration log
	* @throws NoSuchAmfRegistrationLogException if a matching amf registration log could not be found
	*/
	public static AmfRegistrationLog findByEventTypeAndUserId_Last(
		java.lang.String eventType, long userId,
		OrderByComparator<AmfRegistrationLog> orderByComparator)
		throws com.liferay.docs.amf.registration.exception.NoSuchAmfRegistrationLogException {
		return getPersistence()
				   .findByEventTypeAndUserId_Last(eventType, userId,
			orderByComparator);
	}

	/**
	* Returns the last amf registration log in the ordered set where eventType = &#63; and userId = &#63;.
	*
	* @param eventType the event type
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching amf registration log, or <code>null</code> if a matching amf registration log could not be found
	*/
	public static AmfRegistrationLog fetchByEventTypeAndUserId_Last(
		java.lang.String eventType, long userId,
		OrderByComparator<AmfRegistrationLog> orderByComparator) {
		return getPersistence()
				   .fetchByEventTypeAndUserId_Last(eventType, userId,
			orderByComparator);
	}

	/**
	* Returns the amf registration logs before and after the current amf registration log in the ordered set where eventType = &#63; and userId = &#63;.
	*
	* @param logId the primary key of the current amf registration log
	* @param eventType the event type
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next amf registration log
	* @throws NoSuchAmfRegistrationLogException if a amf registration log with the primary key could not be found
	*/
	public static AmfRegistrationLog[] findByEventTypeAndUserId_PrevAndNext(
		long logId, java.lang.String eventType, long userId,
		OrderByComparator<AmfRegistrationLog> orderByComparator)
		throws com.liferay.docs.amf.registration.exception.NoSuchAmfRegistrationLogException {
		return getPersistence()
				   .findByEventTypeAndUserId_PrevAndNext(logId, eventType,
			userId, orderByComparator);
	}

	/**
	* Removes all the amf registration logs where eventType = &#63; and userId = &#63; from the database.
	*
	* @param eventType the event type
	* @param userId the user ID
	*/
	public static void removeByEventTypeAndUserId(java.lang.String eventType,
		long userId) {
		getPersistence().removeByEventTypeAndUserId(eventType, userId);
	}

	/**
	* Returns the number of amf registration logs where eventType = &#63; and userId = &#63;.
	*
	* @param eventType the event type
	* @param userId the user ID
	* @return the number of matching amf registration logs
	*/
	public static int countByEventTypeAndUserId(java.lang.String eventType,
		long userId) {
		return getPersistence().countByEventTypeAndUserId(eventType, userId);
	}

	/**
	* Caches the amf registration log in the entity cache if it is enabled.
	*
	* @param amfRegistrationLog the amf registration log
	*/
	public static void cacheResult(AmfRegistrationLog amfRegistrationLog) {
		getPersistence().cacheResult(amfRegistrationLog);
	}

	/**
	* Caches the amf registration logs in the entity cache if it is enabled.
	*
	* @param amfRegistrationLogs the amf registration logs
	*/
	public static void cacheResult(List<AmfRegistrationLog> amfRegistrationLogs) {
		getPersistence().cacheResult(amfRegistrationLogs);
	}

	/**
	* Creates a new amf registration log with the primary key. Does not add the amf registration log to the database.
	*
	* @param logId the primary key for the new amf registration log
	* @return the new amf registration log
	*/
	public static AmfRegistrationLog create(long logId) {
		return getPersistence().create(logId);
	}

	/**
	* Removes the amf registration log with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param logId the primary key of the amf registration log
	* @return the amf registration log that was removed
	* @throws NoSuchAmfRegistrationLogException if a amf registration log with the primary key could not be found
	*/
	public static AmfRegistrationLog remove(long logId)
		throws com.liferay.docs.amf.registration.exception.NoSuchAmfRegistrationLogException {
		return getPersistence().remove(logId);
	}

	public static AmfRegistrationLog updateImpl(
		AmfRegistrationLog amfRegistrationLog) {
		return getPersistence().updateImpl(amfRegistrationLog);
	}

	/**
	* Returns the amf registration log with the primary key or throws a {@link NoSuchAmfRegistrationLogException} if it could not be found.
	*
	* @param logId the primary key of the amf registration log
	* @return the amf registration log
	* @throws NoSuchAmfRegistrationLogException if a amf registration log with the primary key could not be found
	*/
	public static AmfRegistrationLog findByPrimaryKey(long logId)
		throws com.liferay.docs.amf.registration.exception.NoSuchAmfRegistrationLogException {
		return getPersistence().findByPrimaryKey(logId);
	}

	/**
	* Returns the amf registration log with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param logId the primary key of the amf registration log
	* @return the amf registration log, or <code>null</code> if a amf registration log with the primary key could not be found
	*/
	public static AmfRegistrationLog fetchByPrimaryKey(long logId) {
		return getPersistence().fetchByPrimaryKey(logId);
	}

	public static java.util.Map<java.io.Serializable, AmfRegistrationLog> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the amf registration logs.
	*
	* @return the amf registration logs
	*/
	public static List<AmfRegistrationLog> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the amf registration logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AmfRegistrationLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of amf registration logs
	* @param end the upper bound of the range of amf registration logs (not inclusive)
	* @return the range of amf registration logs
	*/
	public static List<AmfRegistrationLog> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the amf registration logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AmfRegistrationLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of amf registration logs
	* @param end the upper bound of the range of amf registration logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of amf registration logs
	*/
	public static List<AmfRegistrationLog> findAll(int start, int end,
		OrderByComparator<AmfRegistrationLog> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the amf registration logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AmfRegistrationLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of amf registration logs
	* @param end the upper bound of the range of amf registration logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of amf registration logs
	*/
	public static List<AmfRegistrationLog> findAll(int start, int end,
		OrderByComparator<AmfRegistrationLog> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the amf registration logs from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of amf registration logs.
	*
	* @return the number of amf registration logs
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AmfRegistrationLogPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AmfRegistrationLogPersistence, AmfRegistrationLogPersistence> _serviceTracker =
		ServiceTrackerFactory.open(AmfRegistrationLogPersistence.class);
}