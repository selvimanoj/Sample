package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends BaseClass{

	@FindBy (name ="search_query")
	private WebElement homesearch;
	
	@FindBy(xpath ="//img[@alt=\'My Store\']")
	private WebElement homelogo;
	
	@FindBy(xpath= "//a[text()='Women']")
	private WebElement homewomen;

	@FindBy(xpath= "(//a[text()='Dresses'])[2]")
	private WebElement homedress;

	@FindBy(xpath= "(//a[text()='T-shirts'])[2]")
	private WebElement homeshirt;
	
	@FindBy(xpath="//a[contains(text(),'Sign in')]")
	private WebElement signin;
	
	


	public WebElement getSignin() {
		return signin;
	}

	public WebElement getHomesearch() {
		return homesearch;
	}

	public WebElement getHomelogo() {
		return homelogo;
	}

	public WebElement getHomewomen() {
		return homewomen;
	}

	public WebElement getHomedress() {
		return homedress;
	}

	public WebElement getHomeshirt() {
		return homeshirt;
	}
	
	public HomePage() 
	{
		PageFactory.initElements(driver, this);
	}


			
	
	
}

