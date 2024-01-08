package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSuggestions {
WebDriver driver;
@Given("User should be present in google webpage")
public void user_should_be_present_in_google_webpage() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.google.com");
}

@When("He searchs for qspiders basavangudi")
public void he_searchs_for_qspiders_basavangudi() {
	driver.findElement(By.name("q")).sendKeys("Qspiders Basavangudi"+Keys.ENTER);
}

@Then("Qspiders basavangudi search page should be displayed")
public void qspiders_basavangudi_search_page_should_be_displayed() {
	JavascriptExecutor jse=(JavascriptExecutor) driver;
System.out.println(jse.executeScript("return document.title"));
}
}
