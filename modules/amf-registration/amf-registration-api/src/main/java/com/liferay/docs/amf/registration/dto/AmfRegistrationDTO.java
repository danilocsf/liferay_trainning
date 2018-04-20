package com.liferay.docs.amf.registration.dto;

public class AmfRegistrationDTO {

    private String firstName;
    private String lastName;
    private String email;
    private String userName;
    private String gender;
    private String password;
    private String passwordToConfirm;
    private int birthdayYear;
    private int birthdayMonth;
    private int birthdayDay;
    private String homePhone;
    private String mobilePhone;
    private String address1;
    private String address2;
    private String city;
    private String zipCode;
    private String state;
    private String securityQuestion;
    private String answer;

    public String getFirstName() { return firstName == null ? null : firstName.trim(); }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName == null ? null : lastName.trim();
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email == null ? null : email.trim();
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName == null ? null : userName.trim();
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getGender() {
        return gender == null ? null : gender.trim();
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordToConfirm() {
        return passwordToConfirm;
    }

    public void setPasswordToConfirm(String passwordToConfirm) {
        this.passwordToConfirm = passwordToConfirm;
    }

    public int getBirthdayYear() {
        return birthdayYear;
    }

    public void setBirthdayYear(int birthdayYear) {
        this.birthdayYear = birthdayYear;
    }

    public int getBirthdayMonth() {
        return birthdayMonth;
    }

    public void setBirthdayMonth(int birthdayMonth) {
        this.birthdayMonth = birthdayMonth;
    }

    public int getBirthdayDay() {
        return birthdayDay;
    }

    public void setBirthdayDay(int birthdayDay) {
        this.birthdayDay = birthdayDay;
    }

    public String getHomePhone() {
        return homePhone == null ? null : homePhone.trim();
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getMobilePhone() {
        return mobilePhone == null ? null : mobilePhone.trim();
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getAddress1() {
        return address1 == null ? null : address1.trim();
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() { return address2 == null ? null : address2.trim(); }

    public void setAddress2(String address2) { this.address2 = address2; }

    public String getCity() { return city == null ? null : city.trim(); }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() { return zipCode == null ? null : zipCode.trim(); }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getState() { return state == null ? null : state.trim(); }

    public void setState(String state) {
        this.state = state;
    }

    public String getSecurityQuestion() {
        return securityQuestion;
    }

    public void setSecurityQuestion(String securityQuestion) {
        this.securityQuestion = securityQuestion;
    }

    public String getAnswer() { return answer == null ? null : answer.trim();}

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
