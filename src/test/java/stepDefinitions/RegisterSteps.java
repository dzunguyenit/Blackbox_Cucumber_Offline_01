package stepDefinitions;

import org.openqa.selenium.WebDriver;

import commons.AbstractTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumberOption.WebDriverManager;
import pages.LoginPage;
import pages.PageManagement;
import pages.RegisterPage;

public class RegisterSteps extends AbstractTest {
	private LoginPage loginPage;
	private RegisterPage registerPage;
	public static String usernameLogin;
	public static String passwordLogin;
	public static String loginURL;

	WebDriver driver;

	public RegisterSteps() {
		driver = WebDriverManager.openBrowser();
		loginPage = PageManagement.getLoginPage(driver);

	}

	@Given("^I navigate to Guru bank and click Here link$")
	public void i_navigate_to_Guru_bank() {
		loginURL = loginPage.getLoginPageUrl();
		registerPage = loginPage.clickHereLink();
	}

	@When("^I input email \"(.*?)\"$")
	public void clearAndInputDynamicTextbox(String dataValue) {
		registerPage.inputEmail(dataValue + randomEmail() + "@gmail.com");
	}

	@When("^I click to submit button$")
	public void i_click_to_submit_button() {
		registerPage.clickSubmit();
	}

	@When("^I get email and password$")
	public void i_input_email_to_register() {
		usernameLogin = registerPage.getUserIDInfo();
		passwordLogin = registerPage.getPasswordIDInfo();
	}

//	@When("^I open login page$")
//	public void i_Open_Login_Page() {
//		loginPage = registerPage.openLoginPage(loginURL);
//	}

}