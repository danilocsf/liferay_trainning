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

import com.liferay.docs.amf.registration.exception.NoSuchAmfRegistrationLogException;
import com.liferay.docs.amf.registration.model.AmfRegistrationLog;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the amf registration log service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author liferay
 * @see com.liferay.docs.amf.registration.service.persistence.impl.AmfRegistrationLogPersistenceImpl
 * @see AmfRegistrationLogUtil
 * @generated
 */
@ProviderType
public interface AmfRegistrationLogPersistence extends BasePersistence<AmfRegistrationLog> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AmfRegistrationLogUtil} to access the amf registration log persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the amf registration logs where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching amf registration logs
	*/
	public java.util.List<AmfRegistrationLog> findByUserId(long userId);

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
	public java.util.List<AmfRegistrationLog> findByUserId(long userId,
		int start, int end);

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
	public java.util.List<AmfRegistrationLog> findByUserId(long userId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AmfRegistrationLog> orderByComparator);

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
	public java.util.List<AmfRegistrationLog> findByUserId(long userId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AmfRegistrationLog> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first amf registration log in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching amf registration log
	* @throws NoSuchAmfRegistrationLogException if a matching amf registration log could not be found
	*/
	public AmfRegistrationLog findByUserId_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<AmfRegistrationLog> orderByComparator)
		throws NoSuchAmfRegistrationLogException;

	/**
	* Returns the first amf registration log in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching amf registration log, or <code>null</code> if a matching amf registration log could not be found
	*/
	public AmfRegistrationLog fetchByUserId_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<AmfRegistrationLog> orderByComparator);

	/**
	* Returns the last amf registration log in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching amf registration log
	* @throws NoSuchAmfRegistrationLogException if a matching amf registration log could not be found
	*/
	public AmfRegistrationLog findByUserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<AmfRegistrationLog> orderByComparator)
		throws NoSuchAmfRegistrationLogException;

	/**
	* Returns the last amf registration log in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching amf registration log, or <code>null</code> if a matching amf registration log could not be found
	*/
	public AmfRegistrationLog fetchByUserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<AmfRegistrationLog> orderByComparator);

	/**
	* Returns the amf registration logs before and after the current amf registration log in the ordered set where userId = &#63;.
	*
	* @param logId the primary key of the current amf registration log
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next amf registration log
	* @throws NoSuchAmfRegistrationLogException if a amf registration log with the primary key could not be found
	*/
	public AmfRegistrationLog[] findByUserId_PrevAndNext(long logId,
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<AmfRegistrationLog> orderByComparator)
		throws NoSuchAmfRegistrationLogException;

	/**
	* Removes all the amf registration logs where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public void removeByUserId(long userId);

	/**
	* Returns the number of amf registration logs where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching amf registration logs
	*/
	public int countByUserId(long userId);

	/**
	* Returns all the amf registration logs where eventType = &#63;.
	*
	* @param eventType the event type
	* @return the matching amf registration logs
	*/
	public java.util.List<AmfRegistrationLog> findByEventType(
		java.lang.String eventType);

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
	public java.util.List<AmfRegistrationLog> findByEventType(
		java.lang.String eventType, int start, int end);

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
	public java.util.List<AmfRegistrationLog> findByEventType(
		java.lang.String eventType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AmfRegistrationLog> orderByComparator);

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
	public java.util.List<AmfRegistrationLog> findByEventType(
		java.lang.String eventType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AmfRegistrationLog> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first amf registration log in the ordered set where eventType = &#63;.
	*
	* @param eventType the event type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching amf registration log
	* @throws NoSuchAmfRegistrationLogException if a matching amf registration log could not be found
	*/
	public AmfRegistrationLog findByEventType_First(
		java.lang.String eventType,
		com.liferay.portal.kernel.util.OrderByComparator<AmfRegistrationLog> orderByComparator)
		throws NoSuchAmfRegistrationLogException;

	/**
	* Returns the first amf registration log in the ordered set where eventType = &#63;.
	*
	* @param eventType the event type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching amf registration log, or <code>null</code> if a matching amf registration log could not be found
	*/
	public AmfRegistrationLog fetchByEventType_First(
		java.lang.String eventType,
		com.liferay.portal.kernel.util.OrderByComparator<AmfRegistrationLog> orderByComparator);

	/**
	* Returns the last amf registration log in the ordered set where eventType = &#63;.
	*
	* @param eventType the event type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching amf registration log
	* @throws NoSuchAmfRegistrationLogException if a matching amf registration log could not be found
	*/
	public AmfRegistrationLog findByEventType_Last(java.lang.String eventType,
		com.liferay.portal.kernel.util.OrderByComparator<AmfRegistrationLog> orderByComparator)
		throws NoSuchAmfRegistrationLogException;

	/**
	* Returns the last amf registration log in the ordered set where eventType = &#63;.
	*
	* @param eventType the event type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching amf registration log, or <code>null</code> if a matching amf registration log could not be found
	*/
	public AmfRegistrationLog fetchByEventType_Last(
		java.lang.String eventType,
		com.liferay.portal.kernel.util.OrderByComparator<AmfRegistrationLog> orderByComparator);

	/**
	* Returns the amf registration logs before and after the current amf registration log in the ordered set where eventType = &#63;.
	*
	* @param logId the primary key of the current amf registration log
	* @param eventType the event type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next amf registration log
	* @throws NoSuchAmfRegistrationLogException if a amf registration log with the primary key could not be found
	*/
	public AmfRegistrationLog[] findByEventType_PrevAndNext(long logId,
		java.lang.String eventType,
		com.liferay.portal.kernel.util.OrderByComparator<AmfRegistrationLog> orderByComparator)
		throws NoSuchAmfRegistrationLogException;

	/**
	* Removes all the amf registration logs where eventType = &#63; from the database.
	*
	* @param eventType the event type
	*/
	public void removeByEventType(java.lang.String eventType);

	/**
	* Returns the number of amf registration logs where eventType = &#63;.
	*
	* @param eventType the event type
	* @return the number of matching amf registration logs
	*/
	public int countByEventType(java.lang.String eventType);

	/**
	* Returns all the amf registration logs where eventType = &#63; and userId = &#63;.
	*
	* @param eventType the event type
	* @param userId the user ID
	* @return the matching amf registration logs
	*/
	public java.util.List<AmfRegistrationLog> findByEventTypeAndUserId(
		java.lang.String eventType, long userId);

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
	public java.util.List<AmfRegistrationLog> findByEventTypeAndUserId(
		java.lang.String eventType, long userId, int start, int end);

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
	public java.util.List<AmfRegistrationLog> findByEventTypeAndUserId(
		java.lang.String eventType, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AmfRegistrationLog> orderByComparator);

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
	public java.util.List<AmfRegistrationLog> findByEventTypeAndUserId(
		java.lang.String eventType, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AmfRegistrationLog> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first amf registration log in the ordered set where eventType = &#63; and userId = &#63;.
	*
	* @param eventType the event type
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching amf registration log
	* @throws NoSuchAmfRegistrationLogException if a matching amf registration log could not be found
	*/
	public AmfRegistrationLog findByEventTypeAndUserId_First(
		java.lang.String eventType, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<AmfRegistrationLog> orderByComparator)
		throws NoSuchAmfRegistrationLogException;

	/**
	* Returns the first amf registration log in the ordered set where eventType = &#63; and userId = &#63;.
	*
	* @param eventType the event type
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching amf registration log, or <code>null</code> if a matching amf registration log could not be found
	*/
	public AmfRegistrationLog fetchByEventTypeAndUserId_First(
		java.lang.String eventType, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<AmfRegistrationLog> orderByComparator);

	/**
	* Returns the last amf registration log in the ordered set where eventType = &#63; and userId = &#63;.
	*
	* @param eventType the event type
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching amf registration log
	* @throws NoSuchAmfRegistrationLogException if a matching amf registration log could not be found
	*/
	public AmfRegistrationLog findByEventTypeAndUserId_Last(
		java.lang.String eventType, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<AmfRegistrationLog> orderByComparator)
		throws NoSuchAmfRegistrationLogException;

	/**
	* Returns the last amf registration log in the ordered set where eventType = &#63; and userId = &#63;.
	*
	* @param eventType the event type
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching amf registration log, or <code>null</code> if a matching amf registration log could not be found
	*/
	public AmfRegistrationLog fetchByEventTypeAndUserId_Last(
		java.lang.String eventType, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<AmfRegistrationLog> orderByComparator);

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
	public AmfRegistrationLog[] findByEventTypeAndUserId_PrevAndNext(
		long logId, java.lang.String eventType, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<AmfRegistrationLog> orderByComparator)
		throws NoSuchAmfRegistrationLogException;

	/**
	* Removes all the amf registration logs where eventType = &#63; and userId = &#63; from the database.
	*
	* @param eventType the event type
	* @param userId the user ID
	*/
	public void removeByEventTypeAndUserId(java.lang.String eventType,
		long userId);

	/**
	* Returns the number of amf registration logs where eventType = &#63; and userId = &#63;.
	*
	* @param eventType the event type
	* @param userId the user ID
	* @return the number of matching amf registration logs
	*/
	public int countByEventTypeAndUserId(java.lang.String eventType, long userId);

	/**
	* Caches the amf registration log in the entity cache if it is enabled.
	*
	* @param amfRegistrationLog the amf registration log
	*/
	public void cacheResult(AmfRegistrationLog amfRegistrationLog);

	/**
	* Caches the amf registration logs in the entity cache if it is enabled.
	*
	* @param amfRegistrationLogs the amf registration logs
	*/
	public void cacheResult(
		java.util.List<AmfRegistrationLog> amfRegistrationLogs);

	/**
	* Creates a new amf registration log with the primary key. Does not add the amf registration log to the database.
	*
	* @param logId the primary key for the new amf registration log
	* @return the new amf registration log
	*/
	public AmfRegistrationLog create(long logId);

	/**
	* Removes the amf registration log with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param logId the primary key of the amf registration log
	* @return the amf registration log that was removed
	* @throws NoSuchAmfRegistrationLogException if a amf registration log with the primary key could not be found
	*/
	public AmfRegistrationLog remove(long logId)
		throws NoSuchAmfRegistrationLogException;

	public AmfRegistrationLog updateImpl(AmfRegistrationLog amfRegistrationLog);

	/**
	* Returns the amf registration log with the primary key or throws a {@link NoSuchAmfRegistrationLogException} if it could not be found.
	*
	* @param logId the primary key of the amf registration log
	* @return the amf registration log
	* @throws NoSuchAmfRegistrationLogException if a amf registration log with the primary key could not be found
	*/
	public AmfRegistrationLog findByPrimaryKey(long logId)
		throws NoSuchAmfRegistrationLogException;

	/**
	* Returns the amf registration log with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param logId the primary key of the amf registration log
	* @return the amf registration log, or <code>null</code> if a amf registration log with the primary key could not be found
	*/
	public AmfRegistrationLog fetchByPrimaryKey(long logId);

	@Override
	public java.util.Map<java.io.Serializable, AmfRegistrationLog> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the amf registration logs.
	*
	* @return the amf registration logs
	*/
	public java.util.List<AmfRegistrationLog> findAll();

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
	public java.util.List<AmfRegistrationLog> findAll(int start, int end);

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
	public java.util.List<AmfRegistrationLog> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AmfRegistrationLog> orderByComparator);

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
	public java.util.List<AmfRegistrationLog> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AmfRegistrationLog> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the amf registration logs from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of amf registration logs.
	*
	* @return the number of amf registration logs
	*/
	public int countAll();
}