package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	WebDriver driver;
@Given("User is present in actitime login page")
public void user_is_present_in_actitime_login_page() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://opensource-demo.orangehrmlive.com/");
}

@When("User enters username and password")
public void user_enters_username_and_password() {
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
}

@And("clicks on login button")
public void clicks_on_login_button() {
	driver.findElement(By.xpath("//button[@type='submit']")).click();
}
@Then("Home page should be displayed")
public void home_page_should_be_displayed() {
	System.out.println(driver.getTitle());
}


//public static void main(String[] args) {
//	WebDriver driver=new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://localhost/login.do");
//	driver.findElement(By.id("username")).sendKeys("admin");
//	driver.findElement(By.name("pwd")).sendKeys("manager");
//	driver.findElement(By.partialLinkText("Login")).click();
//	System.out.println(driver.getTitle());
//}
}
