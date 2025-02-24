package com.crm.qa.pages;

import java.io.IOException;

//import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import com.aventstack.extentreports.util.Assert;
import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase {

	public ContactsPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath="//span[@class='selectable ']")
	WebElement contactlabel;
	
	
	@FindBy(xpath="//a[@href='/contacts/new']")
	WebElement createcontact;

	@FindBy(xpath="//span[@class='selectable ']")
	WebElement Newcontactlabel;
	
	@FindBy(name="first_name")
	WebElement FirstName;
	
	@FindBy(name="last_name")
	WebElement LatName;
	
	@FindBy(xpath="//button[@class='ui linkedin button']")
	WebElement ClickSave;
	
	
	public Boolean VerifyContactLabel() {
		return contactlabel.isDisplayed();
	}
	
	public void CreateNewContact() {
		createcontact.click();
	}
	
	public Boolean VerifyNewContactLabel() {
		return contactlabel.isDisplayed();
	}
	
	public ContactsPageNew EnterCredentials() throws IOException {
		createcontact.click();
		FirstName.sendKeys("Akshay");
		LatName.sendKeys("shinde");
		ClickSave.click();
		
		return new ContactsPageNew();
	}
}
