<liferay-ui:section>
	
	<liferay-ui:search-container delta="20" emptyResultsMessage="no-events-were-found" 
		total="<%= AmfRegistrationLogLocalServiceUtil.countAllLogs() %>">
			    
	    <liferay-ui:search-container-results
	    	results="<%= AmfRegistrationLogLocalServiceUtil.findAllLogs(searchContainer.getStart(), searchContainer.getEnd())%>"/>

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
		total="<%= AmfRegistrationLogLocalServiceUtil.countLogsByEventType(AmfRegistrationLogConstants.REGISTRATION_EVENT) %>">
			    
	    <liferay-ui:search-container-results
	    	results="<%= AmfRegistrationLogLocalServiceUtil.findLogByEventType(AmfRegistrationLogConstants.REGISTRATION_EVENT,searchContainer.getStart(), searchContainer.getEnd())%>"/>

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
		total="<%= AmfRegistrationLogLocalServiceUtil.countLogsByEventType(AmfRegistrationLogConstants.LOGIN_EVENT) %>">
			    
	    <liferay-ui:search-container-results
	    	results="<%= AmfRegistrationLogLocalServiceUtil.findLogByEventType(AmfRegistrationLogConstants.LOGIN_EVENT,searchContainer.getStart(), searchContainer.getEnd())%>"/>

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