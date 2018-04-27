<%@ include file="/init.jsp" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.List" %>
<%@ page import="com.liferay.portal.kernel.model.Region" %>
<%@ page import="com.liferay.portal.kernel.service.RegionServiceUtil" %>


<liferay-ui:success key="userAdded" message="user-added" />
<liferay-ui:error key="firstNameRequired" message="first-name-required" />
<liferay-ui:error key="firstNameMaxLenght" message="first-name-max-length"/>
<liferay-ui:error key="lastNameRequired" message="last-name-required" />
<liferay-ui:error key="lastNameMaxLenght" message="last-name-max-length"/>
<liferay-ui:error key="emailRequired" message="email-required"/>
<liferay-ui:error key="emailMaxLenght" message="email-max-length"/>
<liferay-ui:error key="emailAddressInvalid" message="email-address-invalid"/>
<liferay-ui:error key="userNameRequired" message="user-name-required"/>
<liferay-ui:error key="userNameLength" message="user-name-length"/>
<liferay-ui:error key="userNameExists" message="user-name-exists"/>
<liferay-ui:error key="genderRequired" message="gender-required"/>
<liferay-ui:error key="birthdayRequired" message="birthday-required"/>
<liferay-ui:error key="birthdayInvalid" message="birthday-invalid"/>
<liferay-ui:error key="ageInvalid" message="age-invalid"/>
<liferay-ui:error key="passwordInvalid" message="password-invalid"/>
<liferay-ui:error key="passwordRequired" message="password-required"/>
<liferay-ui:error key="passwordMustMatch" message="password-must-match"/>
<liferay-ui:error key="mobilePhoneInvalid" message="mobile-phone-invalid"/>
<liferay-ui:error key="homePhoneInvalid" message="home-phone-invalid"/>
<liferay-ui:error key="addressRequired" message="address-required"/>
<liferay-ui:error key="addressMaxLength" message="address-maxLength"/>
<liferay-ui:error key="address2Required" message="address2-required"/>
<liferay-ui:error key="address2MaxLength" message="address2-maxLength"/>
<liferay-ui:error key="cityRequired" message="city-required"/>
<liferay-ui:error key="cityMaxLength" message="city-maxLength"/>
<liferay-ui:error key="zipCodeRequired" message="zip-code-required"/>
<liferay-ui:error key="zipCodeInvalid" message="zip-code-invalid"/>
<liferay-ui:error key="stateRequired" message="state-required"/>
<liferay-ui:error key="answerRequired" message="answer-required"/>
<liferay-ui:error key="answerMaxLength" message="answer-maxLength"/>
<liferay-ui:error key="acceptTouRequired" message="accept-tou-required"/>
<liferay-ui:error key="userNameAlreadyExists" message="user-name-already-exists"/>
<liferay-ui:error key="userEmailAlreadyExists" message="user.email.already.exists"/>

<portlet:renderURL var="signupURL">
    <portlet:param name="mvcRenderCommandName" value="/signup" />
</portlet:renderURL>

<%
    Date today = new Date();
    int day = today.getDate();
    int year = today.getYear()+1900;
    int month = today.getMonth();

    List<Region> regions =  RegionServiceUtil.getRegions(19l);
%>

<portlet:actionURL name="saveUserRegister" var="saveRegisterURL"></portlet:actionURL>

<aui:form action="<%= saveRegisterURL %>" name="<portlet:namespace />fm" >

<c:choose>
  <c:when test = "${sessionScope.signIn != null}">
    <liferay-ui:message key="user.already.logged.in" />
  </c:when>
  <c:otherwise>
    <aui:fieldset-group markupView="lexicon">
        <aui:fieldset label="Basic Info" >
            <aui:input label="First Name" name="first_name" ></aui:input>
            <aui:input label="Last Name" name="last_name" ></aui:input>
            <aui:input label="Email Address" name="email_address" type="email" ></aui:input>
            <aui:input label="Username" name="username" ></aui:input>
            <aui:select label="Gender" name="gender" >
                 <aui:option label="Male" selected="true"></aui:option>
                 <aui:option label="Female"></aui:option>
            </aui:select>
            <div class="form-group">
                <label class="control-label">Birthday<label/>
            </div>
            <div class="form-group">
                <liferay-ui:input-date formName="date" name="Birthday"
                     yearValue="<%=year%>" monthValue="<%=month%>" dayValue="<%=day%>"
                      dayParam="b_day" monthParam="b_month" yearParam="b_year" />
            </div>
            <aui:input label="Password" name="password1" type="password" ></aui:input>
            <aui:input label="Confirm Password" name="password2" type="password" ></aui:input>
        </aui:fieldset>
    </aui:fieldset-group>

    <aui:fieldset-group markupView="lexicon">
        <aui:fieldset label="Phone" >
            <aui:input label="Home Phone" name="home_phone"></aui:input>
            <aui:input label="Mobile Phone" name="mobile_phone"></aui:input>
        </aui:fieldset>
    </aui:fieldset-group>

    <aui:fieldset-group markupView="lexicon">
        <aui:fieldset label="Billing Address (US only)" >
            <aui:input label="Address 1" name="address" ></aui:input>
            <aui:input label="Address 2" name="adrress2"></aui:input>
            <aui:input label="City" name="city" ></aui:input>
            <aui:select label="State" name="state" >
                <%
                    for (Region region : regions ){
                        String regionLabel = region.getRegionCode() + " - " + region.getName();
                %>
                    <aui:option value="<%=region.getRegionId()%>" label="<%=regionLabel%>"></aui:option>
                <%
                    }
                %>
            </aui:select>
            <aui:input label="Zip Code" name="zip"></aui:input>
        </aui:fieldset>
    </aui:fieldset-group>

    <aui:fieldset-group markupView="lexicon">
        <aui:fieldset label="Misc." >
            <aui:select label="Security Question" name="security_question">
                <aui:option label="What is your mother's maiden name?" selected="true"></aui:option>
                <aui:option label="What is the make of your first car?"></aui:option>
                <aui:option label="What is your high school mascot?"></aui:option>
                <aui:option label="Who is your favorite actor?"></aui:option>
            </aui:select>
            <aui:input label="Answer" name="security_answer"></aui:input>
        </aui:fieldset>
    </aui:fieldset-group>

    <aui:input label="I have read, understand, and agree with the Terms of Use governing my access to and use of the Acme Movie Fanatics web site."
                name="accepted_tou" type="checkbox"></aui:input>

    <aui:button-row>
          <aui:button value="Save" type="submit"></aui:button>
    </aui:button-row>
  </c:otherwise>
</c:choose>

</aui:form>
