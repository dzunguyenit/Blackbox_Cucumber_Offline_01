package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import commons.CommonTestCase;
import cucumber.api.java.en.When;
import pages.LoginPage;

public class LogInSteps extends CommonTestCase {
	LoginPage loginPage;
	public static String usernameLogin;
	public static String passwordLogin;
	public static String loginURL;

	WebDriver driver;

	public LogInSteps() {
		driver = CommonTestCase.driver;
		loginPage = PageFactory.initElements(driver, LoginPage.class);

	}

	@When("^I navigate to Log In page \"(.*?)\"$")
	public void clearAndInputDynamicTextbox(String url) {
		loginPage.openLogInPage(url);
	}

	@When("^I log in system$")
	public void clearAndInputDynamicTextbox() {
		loginPage.inputEmailLogIn(RegisterSteps.usernameLogin);
		loginPage.inputPasswordLogIn(RegisterSteps.passwordLogin);
		loginPage.clickLogIn();
	}

}