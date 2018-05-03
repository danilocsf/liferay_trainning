package com.liferay.docs.amf.registration.portlet;

import com.liferay.docs.amf.registration.constants.AmfRegistrationPortletKeys;
import com.liferay.docs.amf.registration.dto.AmfRegistrationLogDTO;
import com.liferay.docs.amf.registration.service.AmfRegistrationLogLocalServiceUtil;
import com.liferay.docs.amf.registration.service.persistence.AmfRegistrationLogUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.theme.PortletDisplay;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.WebKeys;
import org.osgi.service.component.annotations.Component;

import javax.portlet.*;
import java.io.IOException;

/**
 * @author danilo-ferreira
 */
@Component(
        immediate = true,
        property = {
                "com.liferay.portlet.display-category=category.sample",
                "com.liferay.portlet.instanceable=true",
                "javax.portlet.display-name=amf-event-monitor",
                "javax.portlet.init-param.template-path=/",
                "javax.portlet.init-param.view-template=/event-monitor/event-monitor.jsp",
                "javax.portlet.name=" + AmfRegistrationPortletKeys.AMF_EVENT_MONITOR,
                "javax.portlet.resource-bundle=content.Language",
                "javax.portlet.security-role-ref=power-user,user"
        },
        service = Portlet.class
)
public class AmfEventMonitorPortlet extends MVCPortlet {

    Boolean hasPermissionToViewAllUser = null;

    @Override
    public void render(RenderRequest request, RenderResponse response)
        throws PortletException, IOException {
    	    	
        if(this.hasPermissionToViewAllUser == null){
            this.hasPermissionToViewAllUser = checkViewAllUsersPermission(request);            
        }
        PortletSession session = request.getPortletSession();
        session.setAttribute("hasPermissionToViewAllUser", this.hasPermissionToViewAllUser, PortletSession.APPLICATION_SCOPE);
        super.render(request, response);       
       
    }

    private boolean checkViewAllUsersPermission(RenderRequest request) {

        ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
        PortletDisplay portletDisplay = themeDisplay.getPortletDisplay();
        PermissionChecker permissionChecker = themeDisplay.getPermissionChecker();
        return permissionChecker.hasPermission(themeDisplay.getScopeGroupId(), portletDisplay.getRootPortletId(), portletDisplay.getResourcePK(), AmfRegistrationPortletKeys.VIEW_ALL_USER_PERMISSION);
    }
}
