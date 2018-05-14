package com.liferay.docs.amf.registration.service.impl;

import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.liferay.docs.amf.registration.dto.AmfRegistrationDTO;
import com.liferay.docs.amf.registration.exception.AmfRegistrationException;
import com.liferay.portal.kernel.exception.NoSuchUserException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.UserLocalService;


@RunWith(MockitoJUnitRunner.class)
public class AmfRegistrationLocalServiceImplTest {
	
	@InjectMocks
	private AmfRegistrationLocalServiceImpl amfRegistrationLocalServiceImpl;
	
	@Mock
	private UserLocalService userLocalService;
			
	@Mock
    private User user;
	
	private AmfRegistrationDTO userData = null;
	
	@Before
	public void setup(){
		userData = new AmfRegistrationDTO();
		userData.setFirstName("First Name Test");
        userData.setLastName("Last Name Test");
        userData.setEmail("test@test.com");
        userData.setUserName("test1");
	    userData.setGender("Male");
        userData.setBirthdayDay(20);
        userData.setBirthdayMonth(8);
        userData.setBirthdayYear(1983);
        userData.setPassword("123Adm*4");
        userData.setPasswordToConfirm("123Adm*4");
        userData.setHomePhone("1234567890");
        userData.setMobilePhone("1234567890");

        userData.setAddress1("Test 1");
        userData.setAddress2("Test 2");
        userData.setCity("Test city");
        userData.setState(19033L);
        userData.setZipCode("11111");

        userData.setSecurityQuestion("What is your mothers maiden name?");
        userData.setAnswer("Maiden");
        userData.setAcceptedTOU(true);
        userData.setCompanyId(1234l);
	}
	
	  @Test
	  public void firstNameRequiredTest() {		  
		  userData.setFirstName("");
		  String errorKey = "firstNameRequired";
		  testSaveUserRegisterError(errorKey);
	  }
	  
	  @Test
	  public void firstNameMaxLengthTest() {		  
		  userData.setFirstName("Some text with more than 50 characters Some text with more than 50 characters Some text with more than 50 characters");
		  String errorKey = "firstNameMaxLength";
		  testSaveUserRegisterError(errorKey);
	  }
	  
	  @Test
	  public void lastNameRequiredTest() {		  
		  userData.setLastName("");
		  String errorKey = "lastNameRequired";
		  testSaveUserRegisterError(errorKey);
	  }
	  
	  @Test
	  public void lastNameMaxLengthTest() {		  
		  userData.setLastName("Some text with more than 50 characters Some text with more than 50 characters Some text with more than 50 characters");
		  String errorKey = "lastNameMaxLength";
		  testSaveUserRegisterError(errorKey);
	  }
	  
	  @Test
	  public void genderRequiredTest() {		  
		  userData.setGender("");
		  String errorKey = "genderRequired";
		  testSaveUserRegisterError(errorKey);
	  }
	  	  
	  @Test
	  public void emailRequiredTest() {		  
		  userData.setEmail("");
		  String errorKey = "emailRequired";
		  testSaveUserRegisterError(errorKey);
	  }
	  
	  @Test
	  public void emailMaxLengthTest() {		  
		  StringBuilder email = new StringBuilder();
		  for(int i = 0; i <= 255; i++){
			  email.append("a");
		  }
		  userData.setEmail(email.toString());
		  String errorKey = "emailMaxLength";
		  testSaveUserRegisterError(errorKey);
	  }
	  
	  @Test
	  public void emailAddressInvalidTest() {
		  userData.setEmail("myemail");
		  String errorKey = "emailAddressInvalid";
		  testSaveUserRegisterError(errorKey);
	  }
	  
	  @Test
	  public void userNameRequiredTest() {		  
		  userData.setUserName("");
		  String errorKey = "userNameRequired";
		  testSaveUserRegisterError(errorKey);
	  }
	  
	  @Test
	  public void userNameMaxLengthTest() {
		  userData.setUserName("userName_userName_");
		  String errorKey = "userNameLength";
		  testSaveUserRegisterError(errorKey);
	  }
	  
	  @Test
	  public void userNameMinLengthTest() {
		  userData.setUserName("user");
		  String errorKey = "userNameLength";
		  testSaveUserRegisterError(errorKey);
	  }
	  
	  @Test
	  public void birthdayRequiredTest() {		  
		  userData.setBirthdayDay(0);
		  String errorKey = "birthdayRequired";
		  testSaveUserRegisterError(errorKey);
	  }
	  	  
	  @Test
	  public void birthdayInvalidDateTest() {		  
		  userData.setBirthdayDay(40);		  
		  String errorKey = "birthdayInvalid";
		  testSaveUserRegisterError(errorKey);
	  }
	  
	  @Test
	  public void birthdayInvalidAgeTest() {		
		  Calendar twelveYearsAgo = Calendar.getInstance();
		  twelveYearsAgo.setTime(new Date());
		  twelveYearsAgo.add(Calendar.YEAR, -12);
		  userData.setBirthdayDay(twelveYearsAgo.get(Calendar.DAY_OF_MONTH));
		  userData.setBirthdayMonth(twelveYearsAgo.get(Calendar.MONTH) + 1);
		  userData.setBirthdayYear(twelveYearsAgo.get(Calendar.YEAR));
		  String errorKey = "ageInvalid";
		  testSaveUserRegisterError(errorKey);
	  }
	  
	  @Test
	  public void passwordRequiredTest() {		  
		  userData.setPassword("");
		  String errorKey = "passwordRequired";
		  testSaveUserRegisterError(errorKey);
	  }
	  
	  @Test
	  public void passwordInvalidMinLengthTest() {		  
		  userData.setPassword("1*MyP");		  
		  String errorKey = "passwordInvalid";
		  testSaveUserRegisterError(errorKey);
	  }
	  
	  @Test
	  public void passwordInvalidMaxLengthTest() {		  
		  userData.setPassword("1*MyPassword1*MyPassword");		  
		  String errorKey = "passwordInvalid";
		  testSaveUserRegisterError(errorKey);
	  }
	  
	  @Test
	  public void passwordNoSymbolTest() {		  
		  userData.setPassword("1MyPassword");		  
		  String errorKey = "passwordInvalid";
		  testSaveUserRegisterError(errorKey);
	  }
	  
	  @Test
	  public void passwordNoUpperCaseLetterTest() {		  
		  userData.setPassword("1*mypassword");		  
		  String errorKey = "passwordInvalid";
		  testSaveUserRegisterError(errorKey);
	  }
	  
	  @Test
	  public void passwordNoLowerCaseLetterTest() {		  
		  userData.setPassword("1*MYPASSWORD");		  
		  String errorKey = "passwordInvalid";
		  testSaveUserRegisterError(errorKey);
	  }
	  
	  @Test
	  public void passwordNoDigitTest() {		  
		  userData.setPassword("my*Password");		  
		  String errorKey = "passwordInvalid";
		  testSaveUserRegisterError(errorKey);
	  }
	  
	  @Test
	  public void passwordNoMatchTest() {		  
		  userData.setPassword("my*Password1");		  
		  userData.setPasswordToConfirm("my*Password2");
		  String errorKey = "passwordMustMatch";
		  testSaveUserRegisterError(errorKey);
	  }
	  
	  @Test
	  public void homePhoneInvalidWithLetterTest() {		  
		  userData.setHomePhone("012345678a");	  
		  
		  String errorKey = "homePhoneInvalid";
		  testSaveUserRegisterError(errorKey);
	  }
	  
	  @Test
	  public void homePhoneLessThan10DigitsTest() {		  
		  userData.setHomePhone("012345678");
		  String errorKey = "homePhoneInvalid";
		  testSaveUserRegisterError(errorKey);
	  }
	  
	  @Test
	  public void homePhoneMoreThan10DigitsTest() {		  
		  userData.setHomePhone("01234567890");
		  String errorKey = "homePhoneInvalid";
		  testSaveUserRegisterError(errorKey);
	  }
	  
	  
	  @Test
	  public void mobilePhoneInvalidWithLetterTest() {		  
		  userData.setMobilePhone("012345678a");	  
		  
		  String errorKey = "mobilePhoneInvalid";
		  testSaveUserRegisterError(errorKey);
	  }
	  
	  @Test
	  public void mobilePhoneLessThan10DigitsTest() {		  
		  userData.setMobilePhone("012345678");
		  String errorKey = "mobilePhoneInvalid";
		  testSaveUserRegisterError(errorKey);
	  }
	  
	  @Test
	  public void mobilePhoneMoreThan10DigitsTest() {		  
		  userData.setMobilePhone("01234567890");
		  String errorKey = "mobilePhoneInvalid";
		  testSaveUserRegisterError(errorKey);
	  }
	  
	  @Test
	  public void address1RequiredTest() {		  
		  userData.setAddress1("");
		  String errorKey = "addressRequired";
		  testSaveUserRegisterError(errorKey);
	  }
	  
	  @Test
	  public void address1MaxLengthTest() {		  
		  StringBuilder address = new StringBuilder();
		  for(int i = 0; i <= 255; i++){
			  address.append("a");
		  }
		  userData.setAddress1(address.toString());
		  String errorKey = "addressMaxLength";
		  testSaveUserRegisterError(errorKey);
	  }
	  
	  @Test
	  public void address2MaxLengthTest() {		  
		  StringBuilder address = new StringBuilder();
		  for(int i = 0; i <= 255; i++){
			  address.append("a");
		  }
		  userData.setAddress2(address.toString());
		  String errorKey = "address2MaxLength";
		  testSaveUserRegisterError(errorKey);
	  }
	  
	  @Test
	  public void cityRequiredTest() {		  
		  userData.setCity("");
		  String errorKey = "cityRequired";
		  testSaveUserRegisterError(errorKey);
	  }
	  
	  @Test
	  public void cityMaxLengthTest() {		  
		  StringBuilder city = new StringBuilder();
		  for(int i = 0; i <= 255; i++){
			  city.append("a");
		  }
		  userData.setCity(city.toString());
		  String errorKey = "cityMaxLength";
		  testSaveUserRegisterError(errorKey);
	  }
	  
	  @Test
	  public void zipCodeRequiredTest() {		  
		  userData.setZipCode("");
		  String errorKey = "zipCodeRequired";
		  testSaveUserRegisterError(errorKey);
	  }
	  
	  @Test
	  public void zipCodeInvalidMaxLengthTest() {		  
		  userData.setZipCode("123456");
		  String errorKey = "zipCodeInvalid";
		  testSaveUserRegisterError(errorKey);
	  }
	  
	  @Test
	  public void zipCodeInvalidMinLengthTest() {		  
		  userData.setZipCode("1234");
		  String errorKey = "zipCodeInvalid";
		  testSaveUserRegisterError(errorKey);
	  }
	  
	  @Test
	  public void zipCodeInvalidWithLetterTest() {		  
		  userData.setZipCode("1234A");
		  String errorKey = "zipCodeInvalid";
		  testSaveUserRegisterError(errorKey);
	  }
	  
	  @Test
	  public void stateRequiredTest() {		  
		  userData.setState(null);
		  String errorKey = "stateRequired";
		  testSaveUserRegisterError(errorKey);
	  }
  
	  @Test
	  public void answerRequiredTest() {		  
		  userData.setAnswer("");
		  String errorKey = "answerRequired";
		  testSaveUserRegisterError(errorKey);
	  }
	  
	  @Test
	  public void answerMaxLengthTest() {		  
		  StringBuilder answer = new StringBuilder();
		  for(int i = 0; i <= 75; i++){
			  answer.append("a");
		  }
		  userData.setAnswer(answer.toString());
		  String errorKey = "answerMaxLength";
		  testSaveUserRegisterError(errorKey);		  
	  }
	  
	  @Test
	  public void userNameAlreadyExistsTest() throws PortalException {		  
		  Mockito.when(userLocalService.getUserByScreenName(userData.getCompanyId(), userData.getUserName())).thenReturn(user);
		  String errorKey = "userNameAlreadyExists";
		  testSaveUserRegisterError(errorKey);
	  }
	  
	  @Test
	  public void userEmailAlreadyExistsTest() throws PortalException {
		  Mockito.when(userLocalService.getUserByScreenName(userData.getCompanyId(), userData.getUserName())).thenThrow(new NoSuchUserException());
		  Mockito.when(userLocalService.getUserByEmailAddress(userData.getCompanyId(), userData.getEmail())).thenReturn(user);
		  String errorKey = "userEmailAlreadyExists";
		  testSaveUserRegisterError(errorKey);
	  }
		  
	  private void testSaveUserRegisterError(String errorKey){
		  try {
			amfRegistrationLocalServiceImpl.saveUserRegister(userData, null);
		} catch (PortalException e) {
			AmfRegistrationException e2 = (AmfRegistrationException)e;
			Assert.assertTrue(e2.getMsgCodes().contains(errorKey));
		} 
	  }

	
}
