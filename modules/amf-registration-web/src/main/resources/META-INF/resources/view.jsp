<%@ include file="/init.jsp" %>
<%@ page import="java.util.Date" %>

<%
    Date today = new Date();
    int day = today.getDate();
    int year = today.getYear()+1900;
    int month = today.getMonth();
%>


<portlet:actionURL name="saveRegister" var="saveRegisterURL"></portlet:actionURL>

<aui:form action="<%= saveRegisterURL %>" name="<portlet:namespace />fm" >

    <aui:fieldset-group markupView="lexicon">
        <aui:fieldset label="Basic Info" >
            <aui:input label="First Name" name="first_name"></aui:input>
            <aui:input label="Last Name" name="last_name"></aui:input>
            <aui:input label="Email Address" name="email_address" type="email"></aui:input>
            <aui:input label="Username" name="username"></aui:input>
            <aui:select label="Gender" name="gender">
                 <aui:option label="Male" selected="true"></aui:option>
                 <aui:option label="Female"></aui:option>
            </aui:select>
            <div class="form-group">
                <label class="control-label">Birthday<label/>
            </div>
            <div class="form-group">
                <liferay-ui:input-date formName="date" name="Birthday" firstEnabledDate="<%=today%>"
                     yearValue="<%=year%>" monthValue="<%=month%>" dayValue="<%=day%>"
                      dayParam="b_day" monthParam="b_month" yearParam="b_year" />
            </div>
            <aui:input label="Password" name="password1" type="password1"></aui:input>
            <aui:input label="Confirm Password" name="password2" type="password2"></aui:input>
        </aui:fieldset>
    </aui:fieldset-group>

    <aui:fieldset-group markupView="lexicon">
        <aui:fieldset label="Phone" >
            <aui:input label="Home Phone" name="home_phone"></aui:input>
            <aui:input label="Mobile Phone" name="mobile_phone"></aui:input>
        </aui:fieldset>
    </aui:fieldset-group>

    <aui:fieldset-group markupView="lexicon">
        <aui:fieldset label="Billing Address" >
            <aui:input label="Address 1" name="address"></aui:input>
            <aui:input label="Address 2" name="adrress2"></aui:input>
            <aui:input label="City" name="city"></aui:input>
            <aui:input label="State" name="state"></aui:input>
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
                name="terms" type="checkbox"></aui:input>

    <aui:button-row>
          <aui:button value="Save" type="submit"></aui:button>
    </aui:button-row>
</aui:form>
