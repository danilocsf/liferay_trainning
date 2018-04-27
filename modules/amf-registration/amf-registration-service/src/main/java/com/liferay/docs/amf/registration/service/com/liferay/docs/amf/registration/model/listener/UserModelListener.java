package com.liferay.docs.amf.registration.service.com.liferay.docs.amf.registration.model.listener;

import com.liferay.docs.amf.registration.constants.AmfRegistrationLogConstants;
import com.liferay.docs.amf.registration.dto.AmfRegistrationLogDTO;
import com.liferay.docs.amf.registration.service.AmfRegistrationLogLocalServiceUtil;
import com.liferay.docs.amf.registration.service.persistence.AmfRegistrationLogUtil;
import com.liferay.portal.kernel.exception.ModelListenerException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.BaseModelListener;
import com.liferay.portal.kernel.model.ModelListener;
import com.liferay.portal.kernel.model.User;
import org.osgi.service.component.annotations.Component;

import java.util.Date;

@Component(
        immediate = true,
        service = ModelListener.class
)
public class UserModelListener extends BaseModelListener<User> {


    public void onAfterCreate(User user) throws ModelListenerException {
        AmfRegistrationLogDTO log = new AmfRegistrationLogDTO();
        log.setDateTime(new Date());
        log.setEventType(AmfRegistrationLogConstants.REGISTRATION_EVENT);
        log.setIpAddress(AmfRegistrationLogConstants.REGISTRATION_IP);
        log.setScreenName(user.getScreenName());
        log.setUserId(user.getUserId());

        try {
            AmfRegistrationLogLocalServiceUtil.addLog(log);
        } catch (PortalException e) {
            e.printStackTrace();
        }
    }
}