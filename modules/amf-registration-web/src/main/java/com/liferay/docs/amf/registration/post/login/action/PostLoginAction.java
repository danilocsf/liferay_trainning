package com.liferay.docs.amf.registration.post.login.action;

import com.liferay.docs.amf.registration.constants.AmfRegistrationLogConstants;
import com.liferay.docs.amf.registration.dto.AmfRegistrationLogDTO;
import com.liferay.docs.amf.registration.service.AmfRegistrationLocalService;
import com.liferay.docs.amf.registration.service.AmfRegistrationLogLocalService;
import com.liferay.docs.amf.registration.service.AmfRegistrationLogLocalServiceUtil;
import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.events.LifecycleAction;
import com.liferay.portal.kernel.events.LifecycleEvent;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.util.PortalUtil;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;

@Component(
        immediate = true,
        property = { "key=login.events.post" },
        service = LifecycleAction.class
)
public class PostLoginAction  implements LifecycleAction {
	
	private AmfRegistrationLogLocalService amfRegistrationLogLocalService;
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
