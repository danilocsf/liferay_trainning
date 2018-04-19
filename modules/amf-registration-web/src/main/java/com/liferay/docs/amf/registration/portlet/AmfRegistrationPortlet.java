package com.liferay.docs.amf.registration.portlet;

import com.liferay.docs.amf.registration.constants.AmfRegistrationPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;

import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import org.osgi.service.component.annotations.Component;

/**
 * @author danilo-ferreira
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=amf-registration-web Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + AmfRegistrationPortletKeys.AmfRegistration,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class AmfRegistrationPortlet extends MVCPortlet {
	public void saveRegister(ActionRequest request, ActionResponse response) {
		//UserLocalServiceUtil.
	}
}