package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.events.EventFiringDecorator;

import com.crm.qa.utility.TestUtil;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
//	public static EventFiringWebDriver e_driver;
	
	public TestBase() throws IOException {
		
		prop =new Properties();
		
		FileInputStream ip =new FileInputStream("/Users/shivanirajole/eclipse-workspace/frameworkpractice/src/main/java/com/crm/qa/config/config.properties");
		prop.load(ip);
	}

	public static void initilization() {
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome")) {
		    driver=new ChromeDriver();
		}
		
		else if(browserName.equals("FF")) {
		    driver=new FirefoxDriver();
		}
		
		
//		e_driver=new EventFiringWebDriver(driver);
//		eventListener=new WebEventListener();
//		e_driver.register(eventListener);
//		driver=e_driver;
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT_,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	}
}
