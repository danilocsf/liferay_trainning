package com.liferay.docs.amf.registration.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import aQute.bnd.annotation.ProviderType;
@ProviderType
public class AmfRegistrationLogDTOSoap implements Serializable {

	private Long _userId;
	private String _screenName;
	private String _eventType;
	private String _additionalInfo;
	private Date _dateTime;
	private String _ipAddress;
	private String _formattedDateTime;
	private String _formattedUserId;
	
	public static AmfRegistrationLogDTOSoap toSoapModel(AmfRegistrationLogDTO model) {
		AmfRegistrationLogDTOSoap soapModel = new AmfRegistrationLogDTOSoap();

		soapModel.setAdditionalInfo(model.getAdditionalInfo());
		soapModel.setDateTime(model.getDateTime());
		soapModel.setEventType(model.getEventType());
		soapModel.setFormattedDateTime(model.getFormattedDateTime());
		soapModel.setIpAddress(model.getIpAddress());
		soapModel.setScreenName(model.getScreenName());
		soapModel.setUserId(model.getUserId());
		soapModel.setFormattedUserId(model.getFormattedUserId());
		
		return soapModel;
	}
	
	public static AmfRegistrationLogDTOSoap[] toSoapModels(AmfRegistrationLogDTO[] models) {
		AmfRegistrationLogDTOSoap[] soapModels = new AmfRegistrationLogDTOSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}	
	
	public static AmfRegistrationLogDTOSoap[][] toSoapModels(AmfRegistrationLogDTO[][] models) {
		AmfRegistrationLogDTOSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AmfRegistrationLogDTOSoap[models.length][models[0].length];
		} else {
			soapModels = new AmfRegistrationLogDTOSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}
	
	public static AmfRegistrationLogDTOSoap[] toSoapModels(List<AmfRegistrationLogDTO> models) {
		List<AmfRegistrationLogDTOSoap> soapModels = new ArrayList<AmfRegistrationLogDTOSoap>(models.size());

		for (AmfRegistrationLogDTO model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AmfRegistrationLogDTOSoap[soapModels.size()]);
	}

	public AmfRegistrationLogDTOSoap(){
		
	}
	
	public Long getUserId() {
		return _userId;
	}
	public void setUserId(Long _userId) {
		this._userId = _userId;
	}
	public String getScreenName() {
		return _screenName;
	}
	public void setScreenName(String _screenName) {
		this._screenName = _screenName;
	}
	public String getEventType() {
		return _eventType;
	}
	public void setEventType(String _eventType) {
		this._eventType = _eventType;
	}
	public String getAdditionalInfo() {
		return _additionalInfo;
	}
	public void setAdditionalInfo(String _additionalInfo) {
		this._additionalInfo = _additionalInfo;
	}
	public Date getDateTime() {
		return _dateTime;
	}
	public void setDateTime(Date _dateTime) {
		this._dateTime = _dateTime;
	}
	public String getIpAddress() {
		return _ipAddress;
	}
	public void setIpAddress(String _ipAddress) {
		this._ipAddress = _ipAddress;
	}
	public String getFormattedDateTime() {
		return _formattedDateTime;
	}
	public void setFormattedDateTime(String _formattedDateTime) {
		this._formattedDateTime = _formattedDateTime;
	}
	public String getFormattedUserId() {
		return _formattedUserId;
	}	public void setFormattedUserId(String _formattedUserId) {
		this._formattedUserId = _formattedUserId;
	}
		
}
