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

package com.liferay.docs.amf.registration.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.docs.amf.registration.exception.NoSuchAmfRegistrationLogException;
import com.liferay.docs.amf.registration.model.AmfRegistrationLog;
import com.liferay.docs.amf.registration.model.impl.AmfRegistrationLogImpl;
import com.liferay.docs.amf.registration.model.impl.AmfRegistrationLogModelImpl;
import com.liferay.docs.amf.registration.service.persistence.AmfRegistrationLogPersistence;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the amf registration log service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author liferay
 * @see AmfRegistrationLogPersistence
 * @see com.liferay.docs.amf.registration.service.persistence.AmfRegistrationLogUtil
 * @generated
 */
@ProviderType
public class AmfRegistrationLogPersistenceImpl extends BasePersistenceImpl<AmfRegistrationLog>
	implements AmfRegistrationLogPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AmfRegistrationLogUtil} to access the amf registration log persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AmfRegistrationLogImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AmfRegistrationLogModelImpl.ENTITY_CACHE_ENABLED,
			AmfRegistrationLogModelImpl.FINDER_CACHE_ENABLED,
			AmfRegistrationLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AmfRegistrationLogModelImpl.ENTITY_CACHE_ENABLED,
			AmfRegistrationLogModelImpl.FINDER_CACHE_ENABLED,
			AmfRegistrationLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AmfRegistrationLogModelImpl.ENTITY_CACHE_ENABLED,
			AmfRegistrationLogModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public AmfRegistrationLogPersistenceImpl() {
		setModelClass(AmfRegistrationLog.class);
	}

	/**
	 * Caches the amf registration log in the entity cache if it is enabled.
	 *
	 * @param amfRegistrationLog the amf registration log
	 */
	@Override
	public void cacheResult(AmfRegistrationLog amfRegistrationLog) {
		entityCache.putResult(AmfRegistrationLogModelImpl.ENTITY_CACHE_ENABLED,
			AmfRegistrationLogImpl.class, amfRegistrationLog.getPrimaryKey(),
			amfRegistrationLog);

		amfRegistrationLog.resetOriginalValues();
	}

	/**
	 * Caches the amf registration logs in the entity cache if it is enabled.
	 *
	 * @param amfRegistrationLogs the amf registration logs
	 */
	@Override
	public void cacheResult(List<AmfRegistrationLog> amfRegistrationLogs) {
		for (AmfRegistrationLog amfRegistrationLog : amfRegistrationLogs) {
			if (entityCache.getResult(
						AmfRegistrationLogModelImpl.ENTITY_CACHE_ENABLED,
						AmfRegistrationLogImpl.class,
						amfRegistrationLog.getPrimaryKey()) == null) {
				cacheResult(amfRegistrationLog);
			}
			else {
				amfRegistrationLog.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all amf registration logs.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AmfRegistrationLogImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the amf registration log.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AmfRegistrationLog amfRegistrationLog) {
		entityCache.removeResult(AmfRegistrationLogModelImpl.ENTITY_CACHE_ENABLED,
			AmfRegistrationLogImpl.class, amfRegistrationLog.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<AmfRegistrationLog> amfRegistrationLogs) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AmfRegistrationLog amfRegistrationLog : amfRegistrationLogs) {
			entityCache.removeResult(AmfRegistrationLogModelImpl.ENTITY_CACHE_ENABLED,
				AmfRegistrationLogImpl.class, amfRegistrationLog.getPrimaryKey());
		}
	}

	/**
	 * Creates a new amf registration log with the primary key. Does not add the amf registration log to the database.
	 *
	 * @param logId the primary key for the new amf registration log
	 * @return the new amf registration log
	 */
	@Override
	public AmfRegistrationLog create(long logId) {
		AmfRegistrationLog amfRegistrationLog = new AmfRegistrationLogImpl();

		amfRegistrationLog.setNew(true);
		amfRegistrationLog.setPrimaryKey(logId);

		return amfRegistrationLog;
	}

	/**
	 * Removes the amf registration log with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param logId the primary key of the amf registration log
	 * @return the amf registration log that was removed
	 * @throws NoSuchAmfRegistrationLogException if a amf registration log with the primary key could not be found
	 */
	@Override
	public AmfRegistrationLog remove(long logId)
		throws NoSuchAmfRegistrationLogException {
		return remove((Serializable)logId);
	}

	/**
	 * Removes the amf registration log with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the amf registration log
	 * @return the amf registration log that was removed
	 * @throws NoSuchAmfRegistrationLogException if a amf registration log with the primary key could not be found
	 */
	@Override
	public AmfRegistrationLog remove(Serializable primaryKey)
		throws NoSuchAmfRegistrationLogException {
		Session session = null;

		try {
			session = openSession();

			AmfRegistrationLog amfRegistrationLog = (AmfRegistrationLog)session.get(AmfRegistrationLogImpl.class,
					primaryKey);

			if (amfRegistrationLog == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAmfRegistrationLogException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(amfRegistrationLog);
		}
		catch (NoSuchAmfRegistrationLogException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected AmfRegistrationLog removeImpl(
		AmfRegistrationLog amfRegistrationLog) {
		amfRegistrationLog = toUnwrappedModel(amfRegistrationLog);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(amfRegistrationLog)) {
				amfRegistrationLog = (AmfRegistrationLog)session.get(AmfRegistrationLogImpl.class,
						amfRegistrationLog.getPrimaryKeyObj());
			}

			if (amfRegistrationLog != null) {
				session.delete(amfRegistrationLog);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (amfRegistrationLog != null) {
			clearCache(amfRegistrationLog);
		}

		return amfRegistrationLog;
	}

	@Override
	public AmfRegistrationLog updateImpl(AmfRegistrationLog amfRegistrationLog) {
		amfRegistrationLog = toUnwrappedModel(amfRegistrationLog);

		boolean isNew = amfRegistrationLog.isNew();

		Session session = null;

		try {
			session = openSession();

			if (amfRegistrationLog.isNew()) {
				session.save(amfRegistrationLog);

				amfRegistrationLog.setNew(false);
			}
			else {
				amfRegistrationLog = (AmfRegistrationLog)session.merge(amfRegistrationLog);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		entityCache.putResult(AmfRegistrationLogModelImpl.ENTITY_CACHE_ENABLED,
			AmfRegistrationLogImpl.class, amfRegistrationLog.getPrimaryKey(),
			amfRegistrationLog, false);

		amfRegistrationLog.resetOriginalValues();

		return amfRegistrationLog;
	}

	protected AmfRegistrationLog toUnwrappedModel(
		AmfRegistrationLog amfRegistrationLog) {
		if (amfRegistrationLog instanceof AmfRegistrationLogImpl) {
			return amfRegistrationLog;
		}

		AmfRegistrationLogImpl amfRegistrationLogImpl = new AmfRegistrationLogImpl();

		amfRegistrationLogImpl.setNew(amfRegistrationLog.isNew());
		amfRegistrationLogImpl.setPrimaryKey(amfRegistrationLog.getPrimaryKey());

		amfRegistrationLogImpl.setLogId(amfRegistrationLog.getLogId());
		amfRegistrationLogImpl.setDateTime(amfRegistrationLog.getDateTime());
		amfRegistrationLogImpl.setScreenName(amfRegistrationLog.getScreenName());
		amfRegistrationLogImpl.setUserId(amfRegistrationLog.getUserId());
		amfRegistrationLogImpl.setIpAddress(amfRegistrationLog.getIpAddress());
		amfRegistrationLogImpl.setEventType(amfRegistrationLog.getEventType());
		amfRegistrationLogImpl.setAdditionalInfo(amfRegistrationLog.getAdditionalInfo());

		return amfRegistrationLogImpl;
	}

	/**
	 * Returns the amf registration log with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the amf registration log
	 * @return the amf registration log
	 * @throws NoSuchAmfRegistrationLogException if a amf registration log with the primary key could not be found
	 */
	@Override
	public AmfRegistrationLog findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAmfRegistrationLogException {
		AmfRegistrationLog amfRegistrationLog = fetchByPrimaryKey(primaryKey);

		if (amfRegistrationLog == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAmfRegistrationLogException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return amfRegistrationLog;
	}

	/**
	 * Returns the amf registration log with the primary key or throws a {@link NoSuchAmfRegistrationLogException} if it could not be found.
	 *
	 * @param logId the primary key of the amf registration log
	 * @return the amf registration log
	 * @throws NoSuchAmfRegistrationLogException if a amf registration log with the primary key could not be found
	 */
	@Override
	public AmfRegistrationLog findByPrimaryKey(long logId)
		throws NoSuchAmfRegistrationLogException {
		return findByPrimaryKey((Serializable)logId);
	}

	/**
	 * Returns the amf registration log with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the amf registration log
	 * @return the amf registration log, or <code>null</code> if a amf registration log with the primary key could not be found
	 */
	@Override
	public AmfRegistrationLog fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(AmfRegistrationLogModelImpl.ENTITY_CACHE_ENABLED,
				AmfRegistrationLogImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		AmfRegistrationLog amfRegistrationLog = (AmfRegistrationLog)serializable;

		if (amfRegistrationLog == null) {
			Session session = null;

			try {
				session = openSession();

				amfRegistrationLog = (AmfRegistrationLog)session.get(AmfRegistrationLogImpl.class,
						primaryKey);

				if (amfRegistrationLog != null) {
					cacheResult(amfRegistrationLog);
				}
				else {
					entityCache.putResult(AmfRegistrationLogModelImpl.ENTITY_CACHE_ENABLED,
						AmfRegistrationLogImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(AmfRegistrationLogModelImpl.ENTITY_CACHE_ENABLED,
					AmfRegistrationLogImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return amfRegistrationLog;
	}

	/**
	 * Returns the amf registration log with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param logId the primary key of the amf registration log
	 * @return the amf registration log, or <code>null</code> if a amf registration log with the primary key could not be found
	 */
	@Override
	public AmfRegistrationLog fetchByPrimaryKey(long logId) {
		return fetchByPrimaryKey((Serializable)logId);
	}

	@Override
	public Map<Serializable, AmfRegistrationLog> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, AmfRegistrationLog> map = new HashMap<Serializable, AmfRegistrationLog>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			AmfRegistrationLog amfRegistrationLog = fetchByPrimaryKey(primaryKey);

			if (amfRegistrationLog != null) {
				map.put(primaryKey, amfRegistrationLog);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(AmfRegistrationLogModelImpl.ENTITY_CACHE_ENABLED,
					AmfRegistrationLogImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (AmfRegistrationLog)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_AMFREGISTRATIONLOG_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append((long)primaryKey);

			query.append(",");
		}

		query.setIndex(query.index() - 1);

		query.append(")");

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (AmfRegistrationLog amfRegistrationLog : (List<AmfRegistrationLog>)q.list()) {
				map.put(amfRegistrationLog.getPrimaryKeyObj(),
					amfRegistrationLog);

				cacheResult(amfRegistrationLog);

				uncachedPrimaryKeys.remove(amfRegistrationLog.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(AmfRegistrationLogModelImpl.ENTITY_CACHE_ENABLED,
					AmfRegistrationLogImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the amf registration logs.
	 *
	 * @return the amf registration logs
	 */
	@Override
	public List<AmfRegistrationLog> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<AmfRegistrationLog> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<AmfRegistrationLog> findAll(int start, int end,
		OrderByComparator<AmfRegistrationLog> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<AmfRegistrationLog> findAll(int start, int end,
		OrderByComparator<AmfRegistrationLog> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<AmfRegistrationLog> list = null;

		if (retrieveFromCache) {
			list = (List<AmfRegistrationLog>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_AMFREGISTRATIONLOG);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_AMFREGISTRATIONLOG;

				if (pagination) {
					sql = sql.concat(AmfRegistrationLogModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<AmfRegistrationLog>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<AmfRegistrationLog>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the amf registration logs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AmfRegistrationLog amfRegistrationLog : findAll()) {
			remove(amfRegistrationLog);
		}
	}

	/**
	 * Returns the number of amf registration logs.
	 *
	 * @return the number of amf registration logs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_AMFREGISTRATIONLOG);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AmfRegistrationLogModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the amf registration log persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(AmfRegistrationLogImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_AMFREGISTRATIONLOG = "SELECT amfRegistrationLog FROM AmfRegistrationLog amfRegistrationLog";
	private static final String _SQL_SELECT_AMFREGISTRATIONLOG_WHERE_PKS_IN = "SELECT amfRegistrationLog FROM AmfRegistrationLog amfRegistrationLog WHERE logId IN (";
	private static final String _SQL_COUNT_AMFREGISTRATIONLOG = "SELECT COUNT(amfRegistrationLog) FROM AmfRegistrationLog amfRegistrationLog";
	private static final String _ORDER_BY_ENTITY_ALIAS = "amfRegistrationLog.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AmfRegistrationLog exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(AmfRegistrationLogPersistenceImpl.class);
}