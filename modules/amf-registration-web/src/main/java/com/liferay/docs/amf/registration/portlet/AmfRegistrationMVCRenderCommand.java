package com.liferay.docs.amf.registration.portlet;

import com.liferay.docs.amf.registration.constants.AmfRegistrationPortletKeys;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import org.osgi.service.component.annotations.Component;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

@Component(
        immediate = true,
        property = {
                "javax.portlet.name=" + AmfRegistrationPortletKeys.AMF_REGISTRATION, "mvc.command.name=/",
                "mvc.command.name=/signup"
        },
        service = MVCRenderCommand.class
)
public class AmfRegistrationMVCRenderCommand  implements MVCRenderCommand {

    @Override
    public String render(
            RenderRequest renderRequest, RenderResponse renderResponse) {

        return "/view.jsp";
    }

}
