package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ContactsPageNew extends TestBase {

	public ContactsPageNew() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	


}
