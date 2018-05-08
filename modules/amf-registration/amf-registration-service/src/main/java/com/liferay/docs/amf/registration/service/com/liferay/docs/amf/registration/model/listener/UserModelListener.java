package com.liferay.docs.amf.registration.service.com.liferay.docs.amf.registration.model.listener;

import com.liferay.docs.amf.registration.constants.AmfRegistrationLogConstants;
import com.liferay.docs.amf.registration.dto.AmfRegistrationLogDTO;
import com.liferay.docs.amf.registration.service.AmfRegistrationLogLocalService;
import com.liferay.docs.amf.registration.service.AmfRegistrationLogLocalServiceUtil;
import com.liferay.docs.amf.registration.service.persistence.AmfRegistrationLogUtil;
import com.liferay.portal.kernel.exception.ModelListenerException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.BaseModelListener;
import com.liferay.portal.kernel.model.ModelListener;
import com.liferay.portal.kernel.model.User;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.util.Date;

@Component(
        immediate = true,
        service = ModelListener.class
)
public class UserModelListener extends BaseModelListener<User> {

	private AmfRegistrationLogLocalService amfRegistrationLogLocalService;
	
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
        	amfRegistrationLogLocalService.addLog(log);
        } catch (PortalException e) {
            e.printStackTrace();
        }
    }
    
    @Reference(unbind = "-")
    protected void setAmfRegistrationLogService(AmfRegistrationLogLocalService amfRegistrationLogLocalService) {
    	this.amfRegistrationLogLocalService = amfRegistrationLogLocalService;
    }

}