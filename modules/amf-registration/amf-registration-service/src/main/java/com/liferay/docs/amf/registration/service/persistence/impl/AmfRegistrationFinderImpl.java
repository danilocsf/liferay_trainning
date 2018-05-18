package com.liferay.docs.amf.registration.service.persistence.impl;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import com.liferay.docs.amf.registration.dto.AmfRegistrationDTO;
import com.liferay.docs.amf.registration.model.impl.AmfRegistrationImpl;
import com.liferay.docs.amf.registration.service.persistence.AmfRegistrationFinder;
import com.liferay.portal.dao.orm.custom.sql.CustomSQLUtil;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;

public class AmfRegistrationFinderImpl extends AmfRegistrationFinderBaseImpl  implements AmfRegistrationFinder {

	public static final String COUNT_USER_ADDRESS_BY_ZIP = AmfRegistrationFinder.class.getName()
			+ ".countUserAddressByZip";
	public static final String FIND_USERS_BY_ZIP = AmfRegistrationFinder.class.getName()
			+ ".findUserByZip";
	
	 /**
     * Gets the number of saved users with the informed zip code.
     * @param zip code
     * @return number of saved users with the informed zip code. 
     */
    public int countUserAddressByZip(String zip){
    	Session session = null;
    	int result  = 0;
    	try{
    		session = openSession();    		
    		String sql = CustomSQLUtil.get(getClass(), COUNT_USER_ADDRESS_BY_ZIP);
    		SQLQuery q = session.createSQLQuery(sql);    		
    		q.setCacheable(false);
    		QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(zip);			
			result = ((BigInteger)q.uniqueResult()).intValue();	   
    		
    	} catch (Exception e) {			
    		throw new SystemException(e);			
		} finally {
			closeSession(session);
		}
        return result;
    }
    
    public List<AmfRegistrationDTO> findUserByZip(String zip, int start, int delta){

        Session session = null;
        List<AmfRegistrationDTO> returnList = new ArrayList<>(); 
        try {
            session = amfRegistrationPersistence.openSession();
            String sql = CustomSQLUtil.get(getClass(), FIND_USERS_BY_ZIP);

            SQLQuery queryObject = session.createSQLQuery(sql);
            queryObject.setCacheable(false);

            QueryPos qPos = QueryPos.getInstance(queryObject);
            qPos.add(zip);
            qPos.add(start);
            qPos.add(delta);
            returnList = buildAmfRegistrationDTOList((List<Object[]>) queryObject.list(), zip);           
            
            return returnList;
            
        } catch (Exception e) {
            throw e;
        } finally {
            amfRegistrationPersistence.closeSession(session);
        }
	}
	
    private List<AmfRegistrationDTO> buildAmfRegistrationDTOList(List<Object[]> list, String zip){
    	List<AmfRegistrationDTO> resultList = new ArrayList<AmfRegistrationDTO>();
  		
    	if(list != null){
  			for(Object[] objs : list){
  				AmfRegistrationDTO dto = new AmfRegistrationDTO();
  				dto.setFirstName((String)objs[0]);
  				dto.setLastName((String)objs[1]);
  				dto.setUserName((String)objs[2]);
  				dto.setEmail((String)objs[3]);
  				dto.setZipCode(zip);
  				resultList.add(dto);  				
  			}
  		}
    	return resultList;
    }
  
}
