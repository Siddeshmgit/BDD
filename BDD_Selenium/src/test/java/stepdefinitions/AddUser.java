package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;
import com.actitime.pom.UserListPage;

import hooks.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddUser {
	WebDriver driver=BaseClass.driver;
	LoginPage l=new LoginPage(driver);
	HomePage h=new HomePage(driver);
	UserListPage u=new UserListPage(driver);
	@Given("User enters {string} in the browser")
	public void user_enters_in_the_browser(String url) {
		driver.get(url);
	}

	@When("Login page is displayed he enters username as {string} and password as {string} and he clicks on login btn")
	public void login_page_is_displayed_he_enters_username_as_and_password_as_and_he_clicks_on_login_btn(String un, String pwd) {
		l.setLogin(un, pwd);
	}


	@Then("home page should be displayed")
	public void home_page_should_be_displayed() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertEquals( driver.getTitle(),"actiTIME - Enter Time-Track");
	}

	@And("the user clicks on User tab")
	public void the_user_clicks_on_user_tab() {
	
		h.setUserListTab();
	}

	@Then("User tab page should be displayed")
	public void user_tab_page_should_be_displayed() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertEquals("actiTIME - User List", driver.getTitle());
	}

	@And("he clicks on add user button")
	public void he_clicks_on_add_user_button() {
		u.getAddUserBtn().click();
	}

	@And("He enters {string},{string},{string},{string}, {string},{string}")
	public void he_enters(String firstName, String lastName, String email, String un, String pwd, String retypePwd) {
		u.getFirstNameTbx().sendKeys(firstName);
		u.getLastNameTbx().sendKeys(lastName);
		u.getEmailTbx().sendKeys(email);
		u.getUsernameTbx().sendKeys(un);
		u.getPasswordTbx().sendKeys(pwd);
		u.getRetypePwdTbx().sendKeys(retypePwd);
	}

	@And("clicks on create user button")
	public void clicks_on_create_user_button() {
		u.getCreateBtn().click();
	}

	@Then("user should be created")
	public void user_should_be_created() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertEquals(u.getCreatedUser().getText(), "Dingi, Dinga");
	}

	@And("click on created user")
	public void click_on_created_user() {
		u.getCreatedUser().click();
	}

	@And("click on delete button")
	public void click_on_delete_button() throws InterruptedException {
		Thread.sleep(2000);
		u.getDeleteBtn().click();
	}

	@Then("alert popup should be displayed and click on ok button in the popup")
	public void alert_popup_should_be_displayed_and_click_on_ok_button_in_the_popup() {
		driver.switchTo().alert().accept();
	}
	@And("click on logout button and close the browser")
	public void click_on_logout_button_and_close_the_browser() {
		h.setLogout();
	}


}
