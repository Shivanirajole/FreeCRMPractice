package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.SignUpPage;

public class SignUpPageTest  extends TestBase {
	
	SignUpPage signuppage;
	HomePage homepage;
	LoginPage loginpage;

	public SignUpPageTest() throws IOException {
		super();
		
	}
	@BeforeMethod
	public void setup() throws IOException {
		System.out.print("*********");
		initilization();
	    loginpage = new LoginPage();
	    signuppage= loginpage.ClickOnLogin();
	}
	
	@Test
	public void loginTest() throws Exception, InterruptedException {
		
	    signuppage=new SignUpPage();
		homepage =	signuppage.loginwebsite(prop.getProperty("username"),prop.getProperty("password"));		
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	
}
