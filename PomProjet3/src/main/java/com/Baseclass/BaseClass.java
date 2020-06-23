package com.Baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	public static WebDriver browserLaunch(String browsername, String url) throws Exception {
		
		if (browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\ProjectPage\\PomProjet2\\Driver\\chromedriver.exe");
//			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\Drivers\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		else if (browsername.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") +" \\Driver\\gekco.exe");
			driver= new FirefoxDriver();
			
		}
		else if (browsername.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.internetexplorer.driver", ("user.dir") +" \\Driver\\internetexplorer.exe");
			driver= new InternetExplorerDriver();
			
		}
		else
		{
			throw new Exception();
		}
			
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get(url);
		return driver;
		
		}

	//************************************display******************************************//
	
	
		public static boolean elementisdisplay(WebElement element, String text) {
			boolean displayed = element.isDisplayed();
			if (displayed==true) 
			{
				System.out.println(text + " is displayed");
			}
		else
		{
			System.out.println(text + " is not displayed");
		}
			return displayed;
			}


			//******************************enabled****************************************//
		public static boolean  elementisenabled(WebElement element, String text) {

				boolean enabled = element.isEnabled();
				if (enabled==true)
				{
					System.out.println(text + " is enabled");
				}
			else
			{
				System.out.println(text + " is not enabled");
			}
				return enabled;
				}
		
//****************************GETTEXT*******************************************************

	public static String getTextelement(WebElement element) throws Exception {
		String text = element.getText();
		return text;
	}
	//****************************GETATTRIBUTE*******************************************************

	public static String getattributelement(WebElement element) throws Exception {

		String attribute = element.getAttribute("value");
		return attribute;
	}
	
	//****************************SENDKEYS*******************************************************
	public static void sendkeyselement (WebElement element, String text)
		
	{
		
			element.clear();
			element.sendKeys(text);
		}
	
	
	//****************************CLEAR*******************************************************
	public static void clearelement (WebElement element, String text)
	{
		if (elementisdisplay(element, text)&& elementisenabled(element, text)) 
		{
			element.clear();
		}
	}
	//****************************dropdown*******************************************************

	public static void dropdownelelement(WebElement element, String Options, String type) 
	{
		Select sc= new Select(element);
		if (type.equalsIgnoreCase("value"))
		{
			sc.selectByValue(Options);
		}
		else if (type.equalsIgnoreCase("text"))
		{
			sc.selectByVisibleText(Options);
		}
		else if (type.equalsIgnoreCase("index"))
		{
			sc.selectByIndex(Integer.parseInt(Options));
		}}
		//****************************SCROL*******************************************************

	
			public static void scrolelement(WebElement element) {
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("arguments[0].scrollIntoView()", element);}

		//**********************************mousehover*******************************************************
	
		public static void  mousehover(WebElement element) throws Throwable {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).perform();
	
		Thread.sleep(3000);
		}
		
//****************************rightclick**************************************//
		public static void  elementrightclick(WebElement element) {
			Actions ac = new Actions(driver);
			ac.contextClick(element).build().perform();
			}
		
		//************************doubke click*******************************************//
		public static void  elemendoubleclick(WebElement element) {
			Actions ac = new Actions(driver);
			ac.doubleClick().build().perform();
		}
			
		//***********mousehoverclick**********************************
		
		public static void  mousehoverclick (WebElement element) throws Throwable {
			
			Actions ac = new Actions(driver);
			ac.moveToElement(element).click().build().perform();
			Thread.sleep(3000);
			}
			
	

	//***********same**********************************

		public static void equals(WebElement element, WebElement element1, String text) {
			
			
		{
			if (element.equals(element1)) {
				System.out.println("k same");
			}
			else if (element.equals(element1)) {
				System.out.println("not same");
			}
		}}
		
//***************************************click*********************************************
		public static void elementclicks (WebElement element) 
		{
			element.click();
		}
}	
	



