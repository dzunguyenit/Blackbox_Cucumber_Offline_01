package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import commons.CommonTestCase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.LoginPage;
import pages.RegisterPage;

public class RegisterSteps extends CommonTestCase {
	LoginPage loginPage;
	RegisterPage registerPage;
	public static String usernameLogin;
	public static String passwordLogin;
	public static String loginURL;

	WebDriver driver;

	public RegisterSteps() {
		driver = CommonTestCase.openBrowser();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
	}

	@Given("^I navigate to Guru bank and click Here link$")
	public void i_navigate_to_Guru_bank() {
		registerPage = loginPage.clickHereLink();
	}

	@When("^I input email \"(.*?)\"$")
	public void clearAndInputDynamicTextbox(String dataValue) {
		registerPage.inputEmail(dataValue + randomEmail() + "@gmail.com");
	}

	@When("^I click to submit account$")
	public void i_clicktosubmit_button() {
		registerPage.clickSubmitAccount();
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