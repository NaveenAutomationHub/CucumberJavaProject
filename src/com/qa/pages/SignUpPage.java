package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class SignUpPage extends TestBase{
	
	@FindBy(xpath="//*[@name='first_name']")
	public WebElement fname;
	@FindBy(xpath="//*[@name='surname']")
	public WebElement lname;
	@FindBy(xpath="//*[@name='email']")
	public WebElement email;

	public SignUpPage(){
		
		PageFactory.initElements(driver, this);
	}
	
	public void fillUpSignUpDetails(){
		fname.sendKeys("Naveen");
		lname.sendKeys("Reddy");
		email.sendKeys("Naveen.Reddy@gmail.com");
	}

}
