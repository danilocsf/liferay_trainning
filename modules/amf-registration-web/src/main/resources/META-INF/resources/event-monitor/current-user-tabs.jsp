<%
	long userId = PortalUtil.getUserId(request);
%>

<liferay-ui:section>
	
	<liferay-ui:search-container delta="20" emptyResultsMessage="no-events-were-found" 
		total="<%= AmfRegistrationLogLocalServiceUtil.countLogsByUserId(userId) %>">
			    
	    <liferay-ui:search-container-results
	    	results="<%= AmfRegistrationLogLocalServiceUtil.findLogByUserId(userId, searchContainer.getStart(), searchContainer.getEnd())%>"/>

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
		total="<%= AmfRegistrationLogLocalServiceUtil.countLogsByEventTypeAndUserId(AmfRegistrationLogConstants.REGISTRATION_EVENT, userId) %>">
			    
	    <liferay-ui:search-container-results
	    	results="<%= AmfRegistrationLogLocalServiceUtil.findLogByEventTypeAndUserId(AmfRegistrationLogConstants.REGISTRATION_EVENT, userId, searchContainer.getStart(), searchContainer.getEnd())%>"/>

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
		total="<%= AmfRegistrationLogLocalServiceUtil.countLogsByEventTypeAndUserId(AmfRegistrationLogConstants.LOGIN_EVENT, userId) %>">
			    
	    <liferay-ui:search-container-results
	    	results="<%= AmfRegistrationLogLocalServiceUtil.findLogByEventTypeAndUserId(AmfRegistrationLogConstants.LOGIN_EVENT, userId, searchContainer.getStart(), searchContainer.getEnd())%>"/>

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