package com.liferay.docs.amf.registration.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AmfRegistrationLogDTO {

    private Long userId;
    private String screenName;
    private String eventType;
    private String additionalInfo;
    private Date dateTime;
    private String ipAddress;
    private String formattedDateTime;

    public Long getUserId() {
        return userId;
    }

    public String getFormattedUserId() {
        return "("+userId+")";
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
        this.formattedDateTime = null;
        if(dateTime != null){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            formattedDateTime = sdf.format(this.dateTime);
        }
    }

    public String getFormattedDateTime() {
        return formattedDateTime;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

}

