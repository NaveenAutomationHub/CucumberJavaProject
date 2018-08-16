package stepDefination;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TaggedHooksStepDefination {

	/*launch FF
	Enter URL for Free CRM APP
	before only first scenario
	1st step
	2nd step
	3rd step
	after only first sceanrio
	testing done
	close the browser*/
	
	// Global Hooks
	@Before(order=0)
	public void setUp(){
		
		System.out.println("launch FF");
		
	}
	
	@After(order=0)
    public void tearDown(){
		
		System.out.println("close the browser");
		
	}
	
	@Before(order=1)
	public void setUp1(){
		System.out.println("Enter URL for Free CRM APP");
	}
	
	@After(order=1)
    public void tearDown1(){
		System.out.println("testing done");	
	}
	
	//Local Hooks
	
	@Before("@First")
	public void beforeFirst(){
		System.out.println("before only first scenario");
	}
	
	@After("@First")
	public void afterFirst(){
		System.out.println("after only first sceanrio");	
	}
	
	@Before("@Second")
	public void beforeSecond(){
		System.out.println("before only second scenario");
	}
	
	@After("@Second")
	public void afterSecond(){
		System.out.println("after only second sceanrio");
		
		
	}
	
	@Before("@Third")
	public void beforeThird(){
		System.out.println("before only third scenario");
	}
	
	@After("@Third")
	public void afterThird(){
		System.out.println("after only third sceanrio");
		
		
	}
	
	@Given("^this is a first step$")
	public void this_is_a_first_step()  {
		
	    System.out.println("1st step");
	}

	@When("^this is a second step$")
	public void this_is_a_second_step() {
		System.out.println("2nd step");
	   
	}

	@Then("^this is a third step$")
	public void this_is_a_third_step() {
		
		System.out.println("3rd step");
	    
	}
}
