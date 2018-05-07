/**
 * Copyright 2000-present Liferay, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.liferay.docs.amf.registration.portlet.producer;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.ProcessAction;
import javax.xml.namespace.QName;

import com.liferay.docs.amf.registration.constants.AmfRegistrationPortletKeys;
import com.liferay.docs.amf.registration.dto.AmfRegistrationDTO;
import com.liferay.docs.amf.registration.exception.AmfRegistrationException;
import com.liferay.docs.amf.registration.service.AmfRegistrationLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;

import org.osgi.service.component.annotations.Component;

@Component(
	immediate = true,
	property = {
        "com.liferay.portlet.display-category=category.sample",
        "com.liferay.portlet.instanceable=true",
        "javax.portlet.display-name=amf-search",
        "javax.portlet.init-param.template-path=/",
        "javax.portlet.resource-bundle=content.Language",
        "javax.portlet.security-role-ref=power-user",
        "javax.portlet.init-param.view-template=/zip-code-searcher/zip-code-search.jsp",
  		"javax.portlet.name=" + AmfRegistrationPortletKeys.AMF_ZIP_CODE_SEARCH,
  		"javax.portlet.supported-publishing-event="+AmfRegistrationPortletKeys.AMF_ZIP_CODE_EVENT+";"+ AmfRegistrationPortletKeys.AMF_ZIP_CODE_NAMESPACE  		  		
    },			 
    service = Portlet.class
)
public class AmfZipCodeSearchProducerPortlet extends MVCPortlet {
	
	@ProcessAction(name="searchByZipCode")
	public void searchByZipCode(ActionRequest request, ActionResponse response) throws PortalException {
		String zipCode = ParamUtil.getString(request, "zip");
		QName qName = new QName(AmfRegistrationPortletKeys.AMF_ZIP_CODE_NAMESPACE, AmfRegistrationPortletKeys.AMF_ZIP_CODE_EVENT);
		response.setEvent(qName, zipCode);		
    }
}