package com.qa.pages;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;
public class HomePage extends TestBase{
	
	///td[contains(text(),'User: naveen reddy')]
	@FindBy(xpath="html/body/table[1]/tbody/tr[1]/td/table/tbody/tr/td[1]")
	public WebElement nameLabel;
	
	@FindBy(xpath="(//*[contains(text(),'Contacts')])[1]")
	public WebElement contactsLink;
	
	
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
	
	@FindBy(xpath="//*[@id='navmenu']/ul/li[3]/a")
	public WebElement comapnieslink;
	
	@FindBy(xpath="//*[@id='navmenu']/ul/li[3]/ul/li[2]/a")
	public WebElement combinedForm;
	
	@FindBy(xpath="//*[@id='navmenu']/ul/li[3]/ul/li[3]/a")
	public WebElement fullForm;
	
	
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
   
 
}
