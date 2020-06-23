package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class OrderPage extends BaseClass {
	@FindBy(name="search_query")
	private WebElement search;

	public WebElement getSearch() {
		return search;
	}

	
	@FindBy(name="submit_search")
	private WebElement searchclick;
	

	public WebElement getSearchclick() {
		return searchclick;
	}


	@FindBy(xpath="//a[@title=\"Women\"]")
	private WebElement womendress;
	
	@FindBy(xpath="//a[@title=\"Evening Dresses\"]")
	private WebElement eveningdress;

	public WebElement getWomendress() {
		return womendress;
	}

	public WebElement getEveningdress() {
		return eveningdress;
	}
	
	
	public OrderPage() {
	PageFactory.initElements(driver, this);
	}
		
		
}
