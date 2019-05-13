package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import commons.AbstractTest;
import cucumber.api.java.en.When;
import cucumberOption.WebDriverManager;
import pages.CreateCustomerPage;

public class CreateCustomerSteps extends AbstractTest {
	private CreateCustomerPage createCustomerPage;

	WebDriver driver;

	public CreateCustomerSteps() {
		driver = WebDriverManager.openBrowser();
		createCustomerPage = PageFactory.initElements(driver, CreateCustomerPage.class);

	}

	@When("^I input with data \"(.*?)\" to customer name$")
	public void inputDynamicTextbox(String value) {
		createCustomerPage.inputCustomerName(value);
	}

	@When("^I input with data \"(.*?)\" to date of birth$")
	public void inputDateOfbirth(String value) {
		createCustomerPage.inputDateOfBirth(value);
	}

	@When("^I input with data \"(.*?)\" to address$")
	public void inputAddress(String value) {
		createCustomerPage.inputAddress(value);
	}

	@When("^I input with data \"(.*?)\" to city$")
	public void inputCity(String value) {
		createCustomerPage.inputCity(value);
	}

	@When("^I input with data \"(.*?)\" to state$")
	public void inputState(String value) {
		createCustomerPage.inputState(value);
	}

	@When("^I input with data \"(.*?)\" to pin$")
	public void inputPin(String value) {
		createCustomerPage.inputPin(value);
	}

	@When("^I input with data \"(.*?)\" to phone$")
	public void inputPhone(String value) {
		createCustomerPage.inputPhone(value);
	}

	@When("^I input with data \"(.*?)\" to email$")
	public void inputEmail(String value) {
		createCustomerPage.inputEmail(value + randomEmail() + "@gmail.com");
	}

	@When("^I input with data \"(.*?)\" to password$")
	public void inputPassword(String value) {
		createCustomerPage.inputPassword(value);
	}

	@When("^I click submit button$")
	public void clickSubmit() throws Exception {
		createCustomerPage.clickSubmitButton();
	}

}