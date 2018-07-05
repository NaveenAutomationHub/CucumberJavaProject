package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {
	
	WebDriver driver;
		@Given("^Open firefox and start application$")
		public void Open_firefox_and_start_application()  {
		    
			driver = new FirefoxDriver();
			driver.get("https://www.freecrm.com/index.html?e=2");
			driver.manage().window().maximize();
			
		}

		@When("^I enter valid \"([^\"]*)\" and \"([^\"]*)\"$")
		public void I_enter_valid_and(String uName, String pwd)  {
			
			driver.findElement(By.xpath("//*[@id='loginForm']/div/input[1]")).sendKeys(uName);
			driver.findElement(By.xpath("//*[@id='loginForm']/div/input[2]")).sendKeys(pwd);
			driver.findElement(By.xpath("//*[@id='loginForm']/div/div/input")).click();
			
		}

		@Then("^user should be able to login successfully$")
		public void user_should_be_able_to_login_successfully()  {
		    System.out.println("Successfully logged into FREE CRM");
			
		}
		
		@Then("^close the application$")
		public void close_the_application() throws Throwable {
		    
			driver.quit();
		}

}
