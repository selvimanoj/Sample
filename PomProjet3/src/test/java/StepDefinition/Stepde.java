package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.pom.BaseClass;
import com.pom.HomePage;
import com.pom.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Stepde extends BaseClass  {

	
	WebDriver driver;
	HomePage h = new HomePage();
	LoginPage l = new LoginPage();
	@Given("user give logo present in homepage")
	public void user_give_logo_present_in_homepage() throws Throwable {
		 browserLaunch("chrome", "http://automationpractice.com/index.php");
		
		
	}

	@When("user check dress present in home page")
	public void user_check_dress_present_in_home_page() {
		h = new HomePage();
		elementisdisplay(h.getHomedress(), "dresses");
		  elementisdisplay(h.getHomeshirt(), "women");
		  Assert.assertTrue(true);
	}

	@When("User Click the signin button")
	public void user_Click_the_signin_button() {
		 l = new LoginPage();
		elementclicks(l.getSignbtn());
//		  
		}

	@Given("user enter the user name")
	public void user_enter_the_user_name() {
	sendkeyselement(l.getEmail(), "selvimanoj@gmail.com");
	}

	@When("User Enter the password")
	public void user_Enter_the_password() {
	sendkeyselement(l.getPasswd(), "selvi");

	}

	@When("user clik the login button")
	public void user_clik_the_login_button() {
		
		elementclicks(l.getSubmit());
	}
	
	
	
	@Given("womendress present in orderpage")
	public void womendress_present_in_orderpage() {
	}

	@When("User Enter the product")
	public void user_Enter_the_product() {
	}

	@When("user clik the search button")
	public void user_clik_the_search_button() {
	}



}