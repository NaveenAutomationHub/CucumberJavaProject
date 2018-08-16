//package com.qa.stepdefinations;
//
//import com.qa.pages.HomePage;
//import com.qa.pages.LoginPage;
//import com.qa.util.TestBase;
//
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class CombinedFormTest extends TestBase{
//	
//	LoginPage loginpage;
//	HomePage homepage; 
//	@Given("^User should be Free CRM Application$")
//	public void User_should_be_Free_CRM_Application() throws InterruptedException  {
//		
//		initialization();
//		loginpage = new LoginPage();
//		
//		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
//		driver.switchTo().frame("mainpanel");
//		
//		homepage = new HomePage();
//
//		homepage.gotoCombinedForm();
//		
//	}
//
//	@When("^navigate to Combined Form$")
//	public void navigate_to_Combined_Form() throws InterruptedException  {
//		
//		
//	}
//
//	@Then("^Fill the mandatory details and save the form$")
//	public void Fill_the_mandatory_details_and_save_the_form()  {
//		
//		
//	   
//	}
//
//}
