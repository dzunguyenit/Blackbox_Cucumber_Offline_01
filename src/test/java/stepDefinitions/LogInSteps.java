package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.When;
import cucumberOption.WebDriverManager;
import pages.LoginPage;
import pages.PageManagement;

public class LogInSteps {
	private LoginPage loginPage;
	public static String usernameLogin;
	public static String passwordLogin;
	public static String loginURL;

	WebDriver driver;

	public LogInSteps() {
		driver = WebDriverManager.openBrowser();
		loginPage = PageManagement.getLoginPage(driver);

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