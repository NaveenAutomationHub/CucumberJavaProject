//package stepDefination;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.testng.Assert;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class ContactsTest {
//	
//	WebDriver driver;
//	@Given("^Login to Free CRM$")
//	public void Login_to_Free_CRM()  {
//		 
//		driver = new FirefoxDriver();
//		driver.get("https://www.freecrm.com/index.html?e=2");
//		driver.manage().window().maximize();
//	}
//
//	@When("^Providing valid \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void Providing_valid_and(String uname, String pwd)  {
//		driver.findElement(By.xpath("//*[@id='loginForm']/div/input[1]")).sendKeys(uname);
//		driver.findElement(By.xpath("//*[@id='loginForm']/div/input[2]")).sendKeys(pwd);
//		driver.findElement(By.xpath("//*[@id='loginForm']/div/div/input")).click();
//	}
//
//
//	@Then("^Go to contacts page , create new contact by entering \"([^\"]*)\" , \"([^\"]*)\", and \"([^\"]*)\"$")
//	public void Go_to_contacts_page_create_new_contact_by_entering_and(String fName, String lName, String position) throws InterruptedException  {
//		driver.switchTo().frame("mainpanel");
//		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		 Thread.sleep(3000);
//         Actions actions = new Actions(driver);
//         //actions.moveToElement(driver.findElement(By.xpath("//*[@id='navmenu']/ul/li[4]/a"))).click();
//         Thread.sleep(3000);
//        actions.moveToElement(driver.findElement(By.xpath("//*[@id='navmenu']/ul/li[4]/a"))).perform();
//         
//         actions.moveToElement(driver.findElement(By.xpath("//*[@id='navmenu']/ul/li[4]/ul/li[1]/a"))).click().build().perform();
//         driver.findElement(By.xpath("//*[@id='first_name']")).sendKeys(fName);
// 		driver.findElement(By.xpath("//*[@id='surname']")).sendKeys(lName);
// 		driver.findElement(By.xpath("//*[@id='company_position']")).sendKeys(position);
//	}
//
//
//}
