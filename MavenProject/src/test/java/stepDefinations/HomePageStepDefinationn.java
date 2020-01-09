package stepDefinations;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import Pages.Homepage;
import Pages.Loginpage;
import Tests.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePageStepDefinationn extends TestBase {

	Homepage hm=null;
	Loginpage lp=new Loginpage();
	
	@Given("the user is on the webload appllication")
	public void the_user_is_on_the_webload_appllication() throws IOException {	
		TestBase.initialize();
		hm = PageFactory.initElements(driver, Homepage.class);
		hm.clickOnDemolink();
	   
	}

	@Then("click on Login link")
	public void click_on_Login_link() {
		lp.Login();
	   
	}

	@Then("enter ther user {string} and password {string} details")
	public void enter_ther_user_and_password_details(String string, String string2) {
		lp.LOGIN();
		lp.PASSWORD();
		
		
	  
	}

	@Then("click on login button")
	public void click_on_login_button() {
		lp.SUBMIT();
	   
	}

	@Then("verify the title page of the webload application")
	public void verify_the_title_page_of_the_webload_application() {
	 
	}



}
