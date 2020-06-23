package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class FourPage extends BaseClass{

	@FindBy(xpath ="//img[@title='Printed Summer Dress'][1]")
	private WebElement smou;
	
	
	
	
	@FindBy(xpath= "//a[contains(text(),'out')][1]")
	private WebElement printdrs;
	
	public WebElement getPrintdrs() {
		return printdrs;
	}



	public WebElement getsmou() {
		return smou;
	}



	@FindBy(xpath="//span[contains(text(),'Add to cart')]")
	private WebElement card;
	
	@FindBy(xpath="//span[contains(text(),'checkout')]")
	private WebElement check;
	
	public WebElement getCard() {
		return card;
	}


	public WebElement getCheck() {
		return check;
	}


	public WebElement getCheck1() {
		return check1;
	}


	public WebElement getCheck2() {
		return check2;
	}


	public WebElement getCheck3() {
		return check3;
	}


	public WebElement getTick() {
		return tick;
	}



	@FindBy(xpath="//span[contains(text(),'checkout')]")
	private WebElement check1;
	
	
	@FindBy(xpath="//span[contains(text(),'checkout')]")
	private WebElement check2;
	
	@FindBy(xpath="//span[contains(text(),'checkout')]")
	private WebElement check3;
	
	@FindBy(id="uniform-cgv")
	private WebElement tick;
	
		
	@FindBy(xpath="(//*[@title='Printed Summer Dress'])[3]")
	private WebElement print;
	

	public WebElement getPrint() {
		return print;
	}

}
