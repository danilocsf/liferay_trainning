package com.liferay.docs.amf.registration.portlet.consumer;

import javax.portlet.Event;
import javax.portlet.EventRequest;
import javax.portlet.EventResponse;
import javax.portlet.Portlet;
import javax.portlet.ProcessEvent;

import org.osgi.service.component.annotations.Component;

import com.liferay.docs.amf.registration.constants.AmfRegistrationPortletKeys;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

@Component(
	immediate = true,
	property = {
        "com.liferay.portlet.display-category=category.sample",
        "com.liferay.portlet.instanceable=true",
        "javax.portlet.display-name=amf-search-results",
        "javax.portlet.init-param.template-path=/",
        "javax.portlet.resource-bundle=content.Language",
        "javax.portlet.security-role-ref=power-user,user",
        "javax.portlet.init-param.view-template=/zip-code-searcher/zip-code-search-result.jsp",
  		"javax.portlet.name=" + AmfRegistrationPortletKeys.AMF_ZIP_CODE_RESULT,
  		"javax.portlet.supported-processing-event="+AmfRegistrationPortletKeys.AMF_ZIP_CODE_EVENT+";"+ AmfRegistrationPortletKeys.AMF_ZIP_CODE_NAMESPACE
    },			 
    service = Portlet.class
)
public class AmfZipCodeSeachConsumerPortlet extends MVCPortlet {
	
	@ProcessEvent(name="{"+AmfRegistrationPortletKeys.AMF_ZIP_CODE_NAMESPACE+"}"+AmfRegistrationPortletKeys.AMF_ZIP_CODE_EVENT)
	public void searchByZipCode(EventRequest request, EventResponse response) throws PortalException {
		Event event = request.getEvent();
		String zipCode = (String)event.getValue();				
		request.setAttribute("AmfZipCodeSeachConsumerPortlet_zipCode", zipCode);			
	}
}

