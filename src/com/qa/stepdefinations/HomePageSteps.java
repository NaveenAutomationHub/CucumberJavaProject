package com.qa.stepdefinations;

import org.junit.Assert;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageSteps extends TestBase{
	
LoginPage loginpage;
	
	HomePage homepage;
	
	@Given("^User navigated to Free CRM Application$")
	public void User_navigated_to_Free_CRM_Application() {
		
		TestBase.initialization();    
	}

	@When("^entered valid username and password$")
	public void entered_valid_username_and_password()  {
		
		loginpage = new LoginPage();
		String loginpagetitle = loginpage.validateLoginPageTitle();
		Assert.assertEquals("Free CRM software in the cloud powers sales and customer service", loginpagetitle);
		
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	@Then("^validate Homepage$")
	public void validate_Homepage() throws InterruptedException  {	
		String homepagetitile = homepage.verifyHomePageTitle();		
		Assert.assertEquals("CRMPRO", homepagetitile);	 
		
		Thread.sleep(3000);
		
		boolean b = homepage.verifyUserName();
		
		Assert.assertTrue(b);
	}
	
	@After
	public void tearDown(){
		
		driver.quit();
	}

}
