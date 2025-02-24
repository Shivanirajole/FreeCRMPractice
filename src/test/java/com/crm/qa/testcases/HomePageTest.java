package com.crm.qa.testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.SignUpPage;

public class HomePageTest extends TestBase {
	SignUpPage signuppage;
	HomePage homepage;
	LoginPage loginpage;
	ContactsPage contactpage;


	public HomePageTest() throws IOException {
		super();	
	}
	
	@BeforeMethod
	public void setup() throws Exception {
		System.out.print("*********");
		initilization();
	    loginpage = new LoginPage();
	    contactpage=new ContactsPage();
	    signuppage= loginpage.ClickOnLogin();
		homepage =	signuppage.loginwebsite(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void verifyHomePageTitleTest() {
		String homepagetitle= homepage.verifyHomepageTitle();
		Assert.assertEquals(homepagetitle, "Cogmento CRM","HOME PAGE TITLE NOT MATCH");
	}
	
	@Test(priority=2)
	public void verifycorrectusernameTest() {
		Assert.assertTrue(homepage.verifycorrectusername());
	}

	@Test(priority=3)
	public void verifycontactlinkTest() throws IOException {
		contactpage =homepage.ClickOnContactLink();
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
