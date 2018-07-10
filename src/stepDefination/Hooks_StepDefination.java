//package stepDefination;
//
//import cucumber.api.java.After;
//import cucumber.api.java.Before;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class Hooks_StepDefination {
//	
//	@Before
//	public void setUp(){
//		
//		System.out.println("@Before-hook");
//		
//	}
//	
//	@After
//	public void tearDown(){
//		System.out.println("@After-hook");
//		
//		System.out.println("****************************************");
//		
//	}
//	
//	@Given("^user is on deal page$")
//	public void user_is_on_deal_page()  {
//		
//		System.out.println("User is on deal page");
//	  
//	}
//
//	@When("^user fills the deals form$")
//	public void user_fills_the_deals_form()  {
//		
//		System.out.println("User is able to fill the deal form");
//	}
//
//	@Then("^deals form is created$")
//	public void deals_form_is_created() {
//		
//		System.out.println("new deal is created");
//	}
//	
//	@Given("^user is on task page$")
//	public void user_is_on_task_page()  {
//
//		System.out.println("User is on task page");
//		
//	}
//
//	@When("^user fills the task form$")
//	public void user_fills_the_task_form()  {
//	   
//		System.out.println("User is able to fill the task form");
//	}
//
//	@Then("^task form is created$")
//	public void task_form_is_created()  {
//		System.out.println("new task is created");
//
//	}
//
//	@Given("^user is on contact page$")
//	public void user_is_on_contact_page() {
//		System.out.println("User is on contact page");
//
//	}
//
//	@When("^user fills the contacts form$")
//	public void user_fills_the_contacts_form()  {
//		System.out.println("User is able to fill the contact form");
//	}
//
//	@Then("^contacts form is created$")
//	public void contacts_form_is_created() {
//		System.out.println("new contact is created");
//
//	}
//
//}
