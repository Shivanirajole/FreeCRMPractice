package com.crm.qa.pages;

import java.io.IOException;
import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.qa.base.TestBase;
import com.crm.qa.utility.TestUtil;


public class SignUpPage extends TestBase {

	
	
//	Page Factory
	

	@FindBy(name="email")
	WebElement useremail;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
	WebElement login;

	
	public SignUpPage() throws IOException {
		super();
		PageFactory.initElements(driver, this); 
		//this=all the variable will initized with this driver(this means it is pointing to the current class object)
	}
	
	//Actions
	
	public HomePage loginwebsite(String mail,String pwd) throws Exception {
		// Wait for the email input to be visible before interacting
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);        
		useremail.sendKeys(mail);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		password.sendKeys(pwd);
		login.click();
	
       String homePageHandle = driver.getWindowHandle(); // Get the original window handle
		
	 
		Set<String> allWindowHandles = driver.getWindowHandles();

		// Switch to the new window (tab)
		for (String handle : allWindowHandles) {
			driver.switchTo().window(handle);
	        String pageTitle = driver.getTitle();
	        if (pageTitle.contains("COGMENTO")) {  // Modify the condition as needed
	            break;
	        }
		}
		
		return new HomePage();
	}}
	
	
	

