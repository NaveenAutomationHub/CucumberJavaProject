//package stepDefination;
//
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import cucumber.api.DataTable;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class DealsTest {
//
//	WebDriver driver;
//
//	@Given("^Login to Free CRM$")
//	public void Login_to_Free_CRM() {
//
//		driver = new FirefoxDriver();
//		driver.get("https://www.freecrm.com/index.html?e=2");
//		driver.manage().window().maximize();
//
//	}
//
//	@When("^Enter valid username and password$")
//	public void Enter_valid_username_and_password(DataTable credentials) {
//
//		List<List<String>> list = credentials.raw();
//
//		driver.findElement(By.xpath("//*[@id='loginForm']/div/input[1]")).sendKeys(list.get(0).get(0));
//		driver.findElement(By.xpath("//*[@id='loginForm']/div/input[2]")).sendKeys(list.get(0).get(1));
//		driver.findElement(By.xpath("//*[@id='loginForm']/div/div/input")).click();
//
//	}
//
//	@Then("^Go to deals page , enter datails title , company, and salary$")
//	public void Go_to_deals_page_enter_datails_title_company_and_salary(DataTable details) throws InterruptedException {
//		List<List<String>> list1 = details.raw();
//
//		driver.switchTo().frame("mainpanel");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		Thread.sleep(3000);
//		Actions actions = new Actions(driver);
//		actions.moveToElement(driver.findElement(By.xpath("//*[@id='navmenu']/ul/li[5]/a"))).build().perform();
//		Thread.sleep(3000);
//		actions.moveToElement(driver.findElement(By.xpath("//*[@id='navmenu']/ul/li[5]/ul/li[1]/a"))).click().build().perform();
//
//		driver.findElement(By.xpath("//*[@id='title']")).sendKeys(list1.get(0).get(0));
//		driver.findElement(By.xpath("//input[@name='client_lookup']")).sendKeys(list1.get(0).get(1));
//		driver.findElement(By.xpath("//*[@id='amount']")).sendKeys(list1.get(0).get(2));
//	}
//
//}
