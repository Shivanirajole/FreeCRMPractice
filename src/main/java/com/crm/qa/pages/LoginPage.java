package com.crm.qa.pages;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(xpath="//a[contains (text(),'Login')]")
	WebElement Loginbtn;


	public LoginPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
		
	}

	
	//a[@href='https://ui.cogmento.com/?lang=en']
	//div[@class='MuiBox-root mui-19wnbjs']/a[2]
	
    
	//Actions
	
	public SignUpPage ClickOnLogin() throws IOException {
		
		String homePageHandle = driver.getWindowHandle(); // Get the original window handle
		
		Loginbtn.click();
		
		
		Set<String> allWindowHandles = driver.getWindowHandles();

		// Switch to the new window (tab)
		for (String handle : allWindowHandles) {
			driver.switchTo().window(handle);
	        String pageTitle = driver.getTitle();
	        if (pageTitle.contains("Cogmento CRM")) {  // Modify the condition as needed
	            break;
	        }
		}
		return new SignUpPage();
	}
}

