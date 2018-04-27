package com.liferay.docs.amf.registration.service.com.liferay.docs.amf.registration.model.listener;

import com.liferay.portal.kernel.exception.ModelListenerException;
import com.liferay.portal.kernel.model.BaseModelListener;
import com.liferay.portal.kernel.model.ModelListener;
import com.liferay.portal.kernel.model.User;
import org.osgi.service.component.annotations.Component;

@Component(
        immediate = true,
        service = ModelListener.class
)
public class UserModelListener extends BaseModelListener<User> {


    public void onBeforeCreate(User model) throws ModelListenerException {
        System.out.println(model.getFirstName());
    }
}