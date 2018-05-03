package com.liferay.docs.amf.registration.portlet;

import com.liferay.docs.amf.registration.constants.AmfRegistrationPortletKeys;

import com.liferay.docs.amf.registration.dto.AmfRegistrationDTO;
import com.liferay.docs.amf.registration.exception.AmfRegistrationException;
import com.liferay.docs.amf.registration.service.AmfRegistrationLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.*;

import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import org.osgi.service.component.annotations.Component;

import java.io.IOException;

/**
 * @author danilo-ferreira
 */
@Component(
        immediate = true,
        property = {
                "com.liferay.portlet.display-category=category.sample",
                "com.liferay.portlet.instanceable=true",
                "javax.portlet.display-name=amf-registration",
                "javax.portlet.init-param.template-path=/",
                "javax.portlet.init-param.view-template=/view.jsp",
                "javax.portlet.name=" + AmfRegistrationPortletKeys.AMF_REGISTRATION,
                "javax.portlet.resource-bundle=content.Language",
                "javax.portlet.security-role-ref=power-user,user"
        },
        service = Portlet.class
)
public class AmfRegistrationPortlet extends MVCPortlet {


    public void saveUserRegister(ActionRequest request, ActionResponse response) throws PortalException {

        ServiceContext serviceContext = ServiceContextFactory.getInstance(
                User.class.getName(), request);


        AmfRegistrationDTO userData = getUserRegisterData(request);
        try {
            AmfRegistrationLocalServiceUtil.saveUserRegister(userData, serviceContext);
            SessionMessages.add(request, "userAdded");
        }catch(AmfRegistrationException e){
            SessionErrors.clear(request);
            for(String code : e.getMsgCodes()){
                SessionErrors.add(request, code);
            }
        }
    }

    @Override
    public void render(RenderRequest request, RenderResponse response)
            throws PortletException, IOException {

        ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
        if (themeDisplay.isSignedIn()) {
            PortletSession session = request.getPortletSession();
            session.setAttribute("signIn", true, PortletSession.APPLICATION_SCOPE);
        }
        super.render(request, response);
    }

    private AmfRegistrationDTO getUserRegisterData(ActionRequest request) {
        ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
        AmfRegistrationDTO user = new AmfRegistrationDTO();
        user.setFirstName(ParamUtil.getString(request, "first_name"));
        user.setLastName(ParamUtil.getString(request, "last_name"));
        user.setEmail(ParamUtil.getString(request, "email_address"));
        user.setUserName(ParamUtil.getString(request, "username"));
        user.setGender(ParamUtil.getString(request, "gender"));
        user.setBirthdayDay(ParamUtil.getInteger(request, "b_day"));
        user.setBirthdayMonth(ParamUtil.getInteger(request, "b_month"));
        user.setBirthdayYear(ParamUtil.getInteger(request, "b_year"));
        user.setPassword(ParamUtil.getString(request, "password1"));
        user.setPasswordToConfirm(ParamUtil.getString(request, "password2"));
        user.setHomePhone(ParamUtil.getString(request, "home_phone"));
        user.setMobilePhone(ParamUtil.getString(request, "mobile_phone"));
        user.setAddress1(ParamUtil.getString(request, "address"));
        user.setAddress2(ParamUtil.getString(request, "address2"));
        user.setCity(ParamUtil.getString(request, "city"));
        user.setState(ParamUtil.getLong(request, "state"));
        user.setZipCode(ParamUtil.getString(request, "zip"));
        user.setSecurityQuestion(ParamUtil.getString(request, "security_question"));
        user.setAnswer(ParamUtil.getString(request, "security_answer"));
        user.setCompanyId(themeDisplay.getCompanyId());
        user.setLocale(themeDisplay.getLocale());
        String accepted = ParamUtil.getString(request, "accepted_tou");
        user.setAcceptedTOU("true".equals(accepted));
        return user;
    }
}


