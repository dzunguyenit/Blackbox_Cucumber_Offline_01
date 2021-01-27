package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import commons.CommonTestCase;
import cucumber.api.java.en.When;
import model.State;
import pages.LoginPage;

public class LogInSteps extends CommonTestCase {
	LoginPage loginPage;

	private State state;

	WebDriver driver;

	public LogInSteps(State state) {
		this.state = state;
		driver = CommonTestCase.getDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);

	}

	@When("^I navigate to Log In page \"(.*?)\"$")
	public void clearAndInputDynamicTextbox(String url) {
		loginPage.openLogInPage(url);
	}

	@When("^I log in system$")
	public void clearAndInputDynamicTextbox() {
		loginPage.inputEmailLogIn(state.getAccount().getUsername());
		loginPage.inputPasswordLogIn(state.getAccount().getPassword());
		loginPage.clickLogIn();
	}

}