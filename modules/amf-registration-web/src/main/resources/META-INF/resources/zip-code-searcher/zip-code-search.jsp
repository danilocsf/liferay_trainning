<%@ include file="/init.jsp" %>


<portlet:actionURL name="searchByZipCode" var="searchByZipCodeURL"></portlet:actionURL>

<aui:form action="<%= searchByZipCodeURL %>" name="<portlet:namespace />fm" >
	 <aui:fieldset-group markupView="lexicon">
        <aui:fieldset label="">
            <aui:input label="Enter US Zip" name="zip" >
            	 <aui:validator name="required" errorMessage="Zip Code is required." />
            	 <aui:validator name="number" errorMessage="Zip Code must be a 5 digits long."/>
            	 <aui:validator name="maxLength" errorMessage="Zip Code must be a 5 digits long.">5</aui:validator>            	 
            	 <aui:validator name="minLength" errorMessage="Zip Code must be a 5 digits long.">5</aui:validator>
            </aui:input>            
            <aui:button-row>
          		<aui:button value="Search" type="submit"></aui:button>
    		</aui:button-row>            
        </aui:fieldset>
    </aui:fieldset-group>
</aui:form>
