package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends BaseClass {

	@FindBy(id = "center_column")
	private WebElement authen;

	@FindBy(name = "email_create")
	private WebElement mailid;

	@FindBy(name = "SubmitCreate")
	private WebElement createacc;

	@FindBy(name = "email")
	private WebElement email;

	@FindBy(name = "passwd")
	private WebElement passwd;

	@FindBy(name = "SubmitLogin")
	private WebElement submit;

	
	
	


		@FindBy(xpath ="//a[contains(text(),'Sign in')]")
		private WebElement signbtn;;

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPasswd() {
		return passwd;
	}

	public WebElement getAuthen() {
		return authen;

	}

	public WebElement getMailid() {
		return mailid;
	}

	public WebElement getCreateacc() {
		return createacc;
	}

	public WebElement getSignbtn() {
		return signbtn;
	}

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

}
