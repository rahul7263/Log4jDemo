package utility;


import org.openqa.selenium.WebDriver;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import utility.Log;

import org.apache.log4j.xml.DOMConfigurator;

public class BaseClass extends Log {
   
	public WebDriver driver;
	 
	 @BeforeSuite
	 public void beforeSuite() {
	  DOMConfigurator.configure("log4j.xml");
	  Log.info("This is beforeSuite Method");
	 }
	 
	 @BeforeMethod
	 public void setup() {
	  System.setProperty("webdriver.chrome.driver",
	    "D:\\Software Testing Course\\Automation Manual Testing\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
	 }
	 
	 @AfterMethod
	 public void tearDown() {
	  driver.close();
	 }
	 
	 @AfterSuite
	 public void afterSuite() {
	  Log.info("This is afterSuite Method");
	 }
	}

