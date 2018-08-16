//package stepDefination;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.When;
//public class LoginTest {
//	
//	WebDriver driver;
//	@Given("^Login to Free CRM$")
//	public void Login_to_Free_CRM(){
//		driver = new FirefoxDriver();
//		driver.get("https://www.freecrm.com/index.html?e=2");
//		driver.manage().window().maximize();
//	}
//
//	@When("^Providing valid \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void Providing_valid_and(String uname, String pwd)  {
//		
//		driver.findElement(By.xpath("//*[@id='loginForm']/div/input[1]")).sendKeys(uname);
//		driver.findElement(By.xpath("//*[@id='loginForm']/div/input[2]")).sendKeys(pwd);
//		driver.findElement(By.xpath("//*[@id='loginForm']/div/div/input")).click();	
//	}
//
//}
