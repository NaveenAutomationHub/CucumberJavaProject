package com.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.qa.util.TestBase;
public class HomePage extends TestBase{
	
	///td[contains(text(),'User: naveen reddy')]
	@FindBy(xpath="html/body/table[1]/tbody/tr[1]/td/table/tbody/tr/td[1]")
	public WebElement nameLabel;
	
	
	@FindBy(xpath="(//*[contains(text(),'Tasks')])[1]")
	public WebElement tasksLink;
	
	@FindBy(xpath="//*[@id='navmenu']/ul/li[13]/a")
	public WebElement docButton;
	
	@FindBy(xpath="//*[@id='navmenu']/ul/li[13]/ul/li[1]/a")
	public WebElement newDocumentlink;
	
	@FindBy(xpath="//*[@id='navmenu']/ul/li[5]/a")
	public WebElement dealsLink;
	
	@FindBy(xpath="//*[@id='navmenu']/ul/li[5]/ul/li[1]/a")
	public WebElement newDealslink;
	
	@FindBy(xpath="//*[@id='navmenu']/ul/li[14]/a")
	public WebElement formslink;
	
	@FindBy(xpath="//*[@id='navmenu']/ul/li[14]/ul/li/a")
	public WebElement newFormLink;
	
	@FindBy(xpath="//*[@id='navmenu']/ul/li[8]/a")
	public WebElement CallLink;
	
	@FindBy(xpath="//*[@id='navmenu']/ul/li[8]/ul/li[1]/a")
	public WebElement NewCallLink;
	
	@FindBy(xpath="//*[@id='navmenu']/ul/li[15]/a")
	public WebElement reportLink;
	
	@FindBy(xpath="//*[contains(text(),'Contacts')]")
	public WebElement contactsLink1;
	
	@FindBy(xpath="//*[@id='navmenu']/ul/li[4]/ul/li[2]/a")
	public WebElement contactCombinedForm;
	
	@FindBy(xpath="//*[contains(text(),'Campaigns')]/ancestor::ul/li[1]/a[@title='Email Campaigns']")
	public WebElement campaignLink;
		
   public HomePage(){
		PageFactory.initElements(driver, this);
	}
   
   public String verifyHomePageTitle(){
	   return driver.getTitle(); 
   }
   public boolean verifyUserName(){
	   
	   driver.switchTo().frame("mainpanel");
	   
	   return nameLabel.isDisplayed();   
   }
   public ContactsCombinedForm gotoCombinedForm() throws InterruptedException {
	   
	   Actions actions = new Actions(driver);
		actions.moveToElement(contactsLink1).build().perform();
		Thread.sleep(5000);
		actions.moveToElement(contactCombinedForm).click().build().perform();
		return new ContactsCombinedForm();
   }
 
}
