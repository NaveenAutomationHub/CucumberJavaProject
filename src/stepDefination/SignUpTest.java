//package stepDefination;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.FindBy;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class SignUpTest {
//	WebDriver driver;
//	
//	@Given("^Launch firefox browser$")
//	public void Launch_firefox_browser()  {
//	   driver = new FirefoxDriver();
//	  
//	}
//
//	@When("^Navigate to Free CRM site$")
//	public void Navigate_to_Free_CRM_site() {
//		
//	driver.get("https://www.freecrm.com/index.html?e=2");
//		driver.manage().window().maximize();
//	}
//	
//	@Then("^Go to signup page$")
//	public void Go_to_signup_page() {
//		driver.findElement(By.xpath("//*[@id='navbar-collapse']/ul/li[2]/a")).click();
//	    
//	}
//
//	@Then("^Fillup all the mandatory details$")
//	public void Fillup_all_the_mandatory_details() {
//		driver.findElement(By.xpath("//*[@name='first_name']")).sendKeys("naveen");
//		
//		driver.findElement(By.xpath("//*[@name='surname']")).sendKeys("reddy");
//		
//		/*@FindBy(xpath="//*[@name='surname']")
//		public WebElement surname;
//		
//		@FindBy(xpath="//*[@name='email']")
//		public WebElement email;
//		
//		@FindBy(xpath="//*[@name='email_confirm']")
//		public WebElement confirmEmail;
//		
//		@FindBy(xpath="//*[@name='username']")
//		public WebElement userName;
//		
//		@FindBy(xpath="//*[@name='password']")
//		public WebElement passWord;
//		
//		@FindBy(xpath="//*[@name='passwordconfirm']")
//		public WebElement passWordConfirm;
//		
//		@FindBy(xpath="//*[@name='agreeTerms']")
//		public WebElement agree;
//		@FindBy(xpath="//*[@name='submitButton']")
//		public WebElement submit;
//		@FindBy(xpath="//*[@id='footer']/div/div/div[1]")
//		public WebElement element;*/
//	}
//
//}
