package com.liferay.docs.amf.registration.portlet;

import com.liferay.docs.amf.registration.constants.AmfRegistrationPortletKeys;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import org.osgi.service.component.annotations.Component;

import javax.portlet.Portlet;

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
                "javax.portlet.init-param.view-template=/event-monitor.jsp",
                "javax.portlet.name=" + AmfRegistrationPortletKeys.AmfEventMonitor,
                "javax.portlet.resource-bundle=content.Language",
                "javax.portlet.security-role-ref=power-user,user"
        },
        service = Portlet.class
)
public class AmfEventMonitorPortlet extends MVCPortlet {

}
