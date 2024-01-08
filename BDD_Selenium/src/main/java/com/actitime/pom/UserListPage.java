package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserListPage {
@FindBy(className = "buttonText")
private WebElement addUserBtn;
@FindBy(id = "userDataLightBox_firstNameField")
private WebElement firstNameTbx;
@FindBy(name = "lastName")
private WebElement lastNameTbx;
@FindBy(xpath = "//input[@placeholder='Email']")
private WebElement emailTbx;
@FindBy(name = "username")
private WebElement usernameTbx;				
@FindBy(name = "password")
private WebElement passwordTbx;
@FindBy(name="passwordCopy")
private WebElement retypePwdTbx;
@FindBy(id="userDataLightBox_commitBtn")
private WebElement createBtn;
@FindBy(id="userDataLightBox_deleteBtn")
private WebElement deleteBtn;
@FindBy(className = "userNameSpan")
private WebElement createdUser;
public WebElement getCreatedUser() {
	return createdUser;
}
public UserListPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public WebElement getAddUserBtn() {
	return addUserBtn;
}
public WebElement getFirstNameTbx() {
	return firstNameTbx;
}
public WebElement getLastNameTbx() {
	return lastNameTbx;
}
public WebElement getEmailTbx() {
	return emailTbx;
}
public WebElement getUsernameTbx() {
	return usernameTbx;
}
public WebElement getPasswordTbx() {
	return passwordTbx;
}
public WebElement getRetypePwdTbx() {
	return retypePwdTbx;
}
public WebElement getCreateBtn() {
	return createBtn;
}
public WebElement getDeleteBtn() {
	return deleteBtn;
}

}
