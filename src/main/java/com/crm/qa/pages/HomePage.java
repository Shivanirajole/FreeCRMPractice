package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {

	public HomePage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//b[contains (text(),'Numpy')]")
	WebElement usernameLable;
	
	@FindBy(xpath="//div[@class='header item']")
	WebElement verifyhome;
	
	@FindBy(xpath="//i[@class='home icon']")
	WebElement Homeicon;
	
	@FindBy(xpath="//i[@class='users icon']")
	WebElement Contacticon;
	
	@FindBy(xpath="//i[@class='calendar icon']")
	WebElement Calendericon;
	
	@FindBy(xpath="//i[@class='money icon']")
	WebElement Dealsicon;


public String verifyHomepageTitle() {
	return driver.getTitle();
}

public boolean verifycorrectusername() {
	return usernameLable.isDisplayed();
}
public void ClickOnHomeLink() {
	Homeicon.click();
	
}
public ContactsPage ClickOnContactLink() throws IOException {
	Contacticon.click();
	return new ContactsPage();
}
}

