package com.liferay.docs.amf.registration.portlet;

import com.liferay.docs.amf.registration.constants.AmfRegistrationPortletKeys;

import com.liferay.docs.amf.registration.dto.AmfRegistrationDTO;
import com.liferay.docs.amf.registration.service.AmfRegistrationLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;

import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
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


    public void saveUserRegister(ActionRequest request, ActionResponse response) throws PortalException {

        ServiceContext serviceContext = ServiceContextFactory.getInstance(
                User.class.getName(), request);

        AmfRegistrationDTO userData = getUserRegisterData(request);
        AmfRegistrationLocalServiceUtil.saveUserRegister(userData, serviceContext);
        SessionMessages.add(request, "userAdded");

    }

    private AmfRegistrationDTO getUserRegisterData(ActionRequest request) {

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
        user.setState(ParamUtil.getString(request, "state"));
        user.setZipCode(ParamUtil.getString(request, "zip"));
        user.setSecurityQuestion(ParamUtil.getString(request, "security_question"));
        user.setAnswer(ParamUtil.getString(request, "security_answer"));

        return user;
    }
}


