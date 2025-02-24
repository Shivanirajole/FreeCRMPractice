package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.SignUpPage;

public class LoginPageTest extends TestBase {
	LoginPage loginpage;
	SignUpPage signuppage;

	public LoginPageTest() throws IOException {
		super(); 
		//becoz in testbase class we initilize properties also so becoz of super keyword all the properties will initilize
		
	}
	
	@BeforeMethod
	public void setup() throws IOException {
		System.out.print("*********");
		
	 initilization();
	 loginpage = new LoginPage();
	
	}
	
	@Test
	public void clickloginbtn() throws IOException {
		
		signuppage=loginpage.ClickOnLogin();
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
