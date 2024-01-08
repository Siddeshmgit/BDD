package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DDT {
	WebDriver driver;
@Given("User is present in orangeHrm login page {string}")
public void user_is_present_in_orange_hrm_login_page(String url) {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get(url);
}

@When("User enters username and password as {string} , {string}")
public void user_enters_username_and_password_as(String un, String pwd) {
	driver.findElement(By.name("username")).sendKeys(un);
	driver.findElement(By.name("password")).sendKeys(pwd);
}

@Given("User is present in Orange HRM Login page")
public void user_is_present_in_orange_hrm_login_page() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://opensource-demo.orangehrmlive.com/");
}

@When("he enters {string} and {string}")
public void he_enters_and(String un, String pwd) {
	driver.findElement(By.name("username")).sendKeys(un);
	driver.findElement(By.name("password")).sendKeys(pwd);
}

@And("he clicks on submit button")
public void he_clicks_on_submit_button() {
	driver.findElement(By.xpath("//button[@type='submit']")).click();
}

@Then("Login succesfully should be displayed")
public void login_succesfully_should_be_displayed() {
	System.out.println("Home page is displayed");
}

}
