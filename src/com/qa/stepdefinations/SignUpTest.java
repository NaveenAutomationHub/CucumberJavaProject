package com.qa.stepdefinations;

import com.qa.pages.LoginPage;
import com.qa.pages.SignUpPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignUpTest extends TestBase{
	
	LoginPage loginpage;
	SignUpPage signUpPage;
	
	@Given("^User navigated to Free CRM Application$")
	public void User_navigated_to_Free_CRM_Application() {
		TestBase.initialization();    
	}

	@When("^Go to SignUp page$")
	public void Go_to_SignUp_page() {
		
	 loginpage = new LoginPage();
	 loginpage.gotoSignUpPage();
	    
	}

	@Then("^Enter all the mandatory details$")
	public void Enter_all_the_mandatory_details(){
		signUpPage = new SignUpPage();
		signUpPage.fillUpSignUpDetails();
	}


}
