package com.liferay.docs.amf.registration.portlet.route;

import com.liferay.docs.amf.registration.constants.AmfRegistrationPortletKeys;
import com.liferay.portal.kernel.portlet.DefaultFriendlyURLMapper;
import com.liferay.portal.kernel.portlet.FriendlyURLMapper;
import org.osgi.service.component.annotations.Component;

@Component(
        property = {
                "com.liferay.portlet.friendly-url-routes=META-INF/resources/friendly-url-routes/routes.xml",
                "javax.portlet.name=" + AmfRegistrationPortletKeys.AMF_REGISTRATION
        },
        service = FriendlyURLMapper.class
)
public class AmfRegistrationFriendlyUrlMapper extends DefaultFriendlyURLMapper {

    @Override
    public String getMapping() {
        return _MAPPING;
    }

    private static final String _MAPPING = "signup";

}
