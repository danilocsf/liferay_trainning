package com.liferay.docs.amf.registration.post.login.action;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.docs.amf.registration.constants.AmfRegistrationLogConstants;
import com.liferay.docs.amf.registration.dto.AmfRegistrationLogDTO;
import com.liferay.docs.amf.registration.service.AmfRegistrationLogService;
import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.events.LifecycleAction;
import com.liferay.portal.kernel.events.LifecycleEvent;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.util.PortalUtil;

@Component(
        immediate = true,
        property = { "key=login.events.post" },
        service = LifecycleAction.class
)
public class PostLoginAction  implements LifecycleAction {
	
	private AmfRegistrationLogService amfRegistrationLogService;
	/**
	 * Creates a log for the login action.
	 */
    @Override
    public void processLifecycleEvent(LifecycleEvent lifecycleEvent) throws ActionException {

        HttpServletRequest request = lifecycleEvent.getRequest();

        try {

            User user = PortalUtil.getUser(request);

            AmfRegistrationLogDTO log = new AmfRegistrationLogDTO();
            log.setDateTime(new Date());
            log.setEventType(AmfRegistrationLogConstants.LOGIN_EVENT);
            log.setIpAddress(request.getRemoteAddr());
            log.setScreenName(user.getScreenName());

            log.setUserId(user.getUserId());

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
