<%@ include file="/init.jsp" %>
<%@ page import="com.liferay.docs.amf.registration.service.AmfRegistrationLogLocalServiceUtil" %>
<%@ page import="com.liferay.docs.amf.registration.dto.AmfRegistrationLogDTO" %>
<%@ page import="com.liferay.docs.amf.registration.constants.AmfRegistrationLogConstants" %>
<%@ page import="com.liferay.portal.kernel.model.User" %>
<%@ page import="com.liferay.portal.kernel.util.PortalUtil" %>
<%@ page import="java.util.List" %>


<liferay-ui:tabs names="All,Registration,Login" refresh="false">
  <c:choose>
    <c:when test = "${sessionScope.hasPermissionToViewAllUser eq true}">
		<%@ include file="all-users-tabs.jsp" %>  
    </c:when>
    <c:otherwise>
        <%@ include file="current-user-tabs.jsp" %>
    </c:otherwise>
  </c:choose>
</liferay-ui:tabs>