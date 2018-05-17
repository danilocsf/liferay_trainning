package com.liferay.docs.amf.registration.service.com.liferay.docs.amf.registration.model.listener;

import java.util.Date;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.docs.amf.registration.constants.AmfRegistrationLogConstants;
import com.liferay.docs.amf.registration.dto.AmfRegistrationLogDTO;
import com.liferay.docs.amf.registration.service.AmfRegistrationLogService;
import com.liferay.portal.kernel.exception.ModelListenerException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.BaseModelListener;
import com.liferay.portal.kernel.model.ModelListener;
import com.liferay.portal.kernel.model.User;

@Component(
        immediate = true,
        service = ModelListener.class
)
public class UserModelListener extends BaseModelListener<User> {

	private AmfRegistrationLogService amfRegistrationLogService;
	
	/**
	 * Creates a log for the user registration.
	 */
    public void onAfterCreate(User user) throws ModelListenerException {
        AmfRegistrationLogDTO log = new AmfRegistrationLogDTO();
        log.setDateTime(new Date());
        log.setEventType(AmfRegistrationLogConstants.REGISTRATION_EVENT);
        log.setIpAddress(AmfRegistrationLogConstants.REGISTRATION_IP);
        log.setScreenName(user.getScreenName());
        log.setUserId(user.getUserId());

        try {
        	amfRegistrationLogService.addLog(log);
        } catch (PortalException e) {
            e.printStackTrace();
        }
    }
    
    @Reference(unbind = "-")
    protected void setAmfRegistrationLogService(AmfRegistrationLogService amfRegistrationLogService) {
    	this.amfRegistrationLogService = amfRegistrationLogService;
    }

}