<%@ include file="/init.jsp" %>
<%@ page import="com.liferay.docs.amf.registration.service.AmfRegistrationLocalServiceUtil" %>
<%@ page import="com.liferay.docs.amf.registration.dto.AmfRegistrationDTO" %>
<%@ page import="java.util.List" %>

<%
   String zipCode = (String)request.getAttribute("AmfZipCodeSeachConsumerPortlet_zipCode");
%>


<h1>Search Results for ${requestScope.AmfZipCodeSeachConsumerPortlet_zipCode}</h1>
<liferay-ui:search-container delta="5" emptyResultsMessage="no-results-found" 
		total="<%= AmfRegistrationLocalServiceUtil.countUserAddressByZip( zipCode) %>">
			    
	    <liferay-ui:search-container-results
	    	results="<%= AmfRegistrationLocalServiceUtil.findUserByZip( zipCode , searchContainer.getStart(), searchContainer.getDelta())%>"/>

            <liferay-ui:search-container-row className="AmfRegistrationDTO" modelVar="dto">              
                <liferay-ui:search-container-column-text name="Name" property="firstName" />
                <liferay-ui:search-container-column-text name="Last Name Initial" property="lastNameInitial" />
                <liferay-ui:search-container-column-text name="Username" property="userName" />
                <liferay-ui:search-container-column-text name="E-mail" property="email" />
            </liferay-ui:search-container-row>
       <liferay-ui:search-iterator />
</liferay-ui:search-container>