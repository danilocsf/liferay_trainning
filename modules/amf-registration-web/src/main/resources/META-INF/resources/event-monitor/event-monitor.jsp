<%@page import="com.liferay.docs.amf.registration.model.AmfRegistrationLog"%>
<%@ include file="/init.jsp" %>
<%@ page import="com.liferay.docs.amf.registration.service.AmfRegistrationLogServiceUtil" %>
<%@ page import="com.liferay.docs.amf.registration.dto.AmfRegistrationLogDTO" %>
<%@ page import="com.liferay.docs.amf.registration.constants.AmfRegistrationLogConstants" %>
<%@ page import="com.liferay.portal.kernel.model.User" %>
<%@ page import="com.liferay.portal.kernel.util.PortalUtil" %>
<%@ page import="java.util.List" %>
<%@ page import="com.liferay.portal.kernel.service.ServiceContext" %>
<%@ page import="com.liferay.portal.kernel.service.ServiceContextFactory" %>

<%
	ServiceContext serviceContext = ServiceContextFactory.getInstance(AmfRegistrationLog.class.getName(), request);
%>


<liferay-ui:tabs names="All,Registration,Login" refresh="false">
  
  <liferay-ui:section>
	
	<liferay-ui:search-container delta="20" emptyResultsMessage="no-events-were-found" 
		total="<%= AmfRegistrationLogServiceUtil.countAllLogs(serviceContext) %>">
			    
	    <liferay-ui:search-container-results
	    	results="<%= AmfRegistrationLogServiceUtil.findAllLogs(serviceContext, searchContainer.getStart(), searchContainer.getEnd())%>"/>

            <liferay-ui:search-container-row className="AmfRegistrationLogDTO" modelVar="log">              
                <liferay-ui:search-container-column-text name="Date" property="formattedDateTime" />
                <liferay-ui:search-container-column-text name="Screen Name" property="screenName" />
                <liferay-ui:search-container-column-text name="User Id" property="formattedUserId" />                
                <liferay-ui:search-container-column-text name="IP Address" property="ipAddress" />
                <liferay-ui:search-container-column-text name="Event type" property="eventType" />

            </liferay-ui:search-container-row>
       <liferay-ui:search-iterator />
	</liferay-ui:search-container>
    
  </liferay-ui:section>
    
  <liferay-ui:section>
	<liferay-ui:search-container delta="20" emptyResultsMessage="no-events-were-found" 
		total="<%= AmfRegistrationLogServiceUtil.countLogsByEventType(serviceContext, AmfRegistrationLogConstants.REGISTRATION_EVENT) %>">
			    
	    <liferay-ui:search-container-results
	    	results="<%= AmfRegistrationLogServiceUtil.findLogByEventType(serviceContext, AmfRegistrationLogConstants.REGISTRATION_EVENT,searchContainer.getStart(), searchContainer.getEnd())%>"/>

            <liferay-ui:search-container-row className="AmfRegistrationLogDTO" modelVar="log">              
                <liferay-ui:search-container-column-text name="Date" property="formattedDateTime" />
                <liferay-ui:search-container-column-text name="Screen Name" property="screenName" />
                <liferay-ui:search-container-column-text name="User Id" property="formattedUserId" />                
                <liferay-ui:search-container-column-text name="IP Address" property="ipAddress" />
                <liferay-ui:search-container-column-text name="Event type" property="eventType" />

            </liferay-ui:search-container-row>
       <liferay-ui:search-iterator />
	</liferay-ui:search-container>
  </liferay-ui:section>

    
  <liferay-ui:section>
	<liferay-ui:search-container delta="20" emptyResultsMessage="no-events-were-found" 
		total="<%= AmfRegistrationLogServiceUtil.countLogsByEventType(serviceContext, AmfRegistrationLogConstants.LOGIN_EVENT) %>">
			    
	    <liferay-ui:search-container-results
	    	results="<%= AmfRegistrationLogServiceUtil.findLogByEventType(serviceContext, AmfRegistrationLogConstants.LOGIN_EVENT,searchContainer.getStart(), searchContainer.getEnd())%>"/>

            <liferay-ui:search-container-row className="AmfRegistrationLogDTO" modelVar="log">              
                <liferay-ui:search-container-column-text name="Date" property="formattedDateTime" />
                <liferay-ui:search-container-column-text name="Screen Name" property="screenName" />
                <liferay-ui:search-container-column-text name="User Id" property="formattedUserId" />                
                <liferay-ui:search-container-column-text name="IP Address" property="ipAddress" />
                <liferay-ui:search-container-column-text name="Event type" property="eventType" />

            </liferay-ui:search-container-row>
       <liferay-ui:search-iterator />
	</liferay-ui:search-container>
  </liferay-ui:section>
  
</liferay-ui:tabs>