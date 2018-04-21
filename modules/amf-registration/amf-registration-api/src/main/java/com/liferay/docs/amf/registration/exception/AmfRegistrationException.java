package com.liferay.docs.amf.registration.exception;

import com.liferay.portal.kernel.exception.PortalException;

import java.util.ArrayList;
import java.util.List;

public class AmfRegistrationException extends PortalException {

    private List<String> msgCodes = new ArrayList<String>();

    public AmfRegistrationException() {
    }

    public AmfRegistrationException(List<String> msgCodes) {
        this.msgCodes = msgCodes == null ? new ArrayList<String>() : msgCodes;
    }

    public AmfRegistrationException(String msg) {
        super(msg);
    }

    public AmfRegistrationException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public AmfRegistrationException(Throwable cause) {
        super(cause);
    }

    public void addMsgCodes(String code){
        msgCodes.add(code);
    }

    public List<String> getMsgCodes(){
        return msgCodes;
    }

}
