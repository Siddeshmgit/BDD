package stepdefinitions;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseClass {
	
	@Before
	public void openBrowser() throws IOException {
	
		Reporter.log("openBrowser",true);
	}	
	@After
	public void closeBrowser() {
		Reporter.log("closeBrowser",true);
	}
}
