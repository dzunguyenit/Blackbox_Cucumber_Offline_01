package stepDefinitions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import commons.CommonTestCase;
import cucumber.api.java.en.When;
import pages.CreateCustomerPage;

public class CreateCustomerSteps extends CommonTestCase {
	CreateCustomerPage createCustomerPage;

	WebDriver driver;

	public CreateCustomerSteps() {
		driver = CommonTestCase.driver;
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

	@When("^I input key tab to customer name$")
	public void inputKeyTabCustomerName() {
		createCustomerPage.inputKeysCustomerName(Keys.TAB);
	}

	@When("^I input key space to customer name$")
	public void inputKeySpaceCustomerName() {
		createCustomerPage.inputKeysCustomerName(Keys.SPACE);
	}

	@When("^I input key tab to address$")
	public void inputKeyTabAddress() {
		createCustomerPage.inputKeysAddress(Keys.TAB);
	}

	@When("^I input key space to address$")
	public void inputKeySpaceAddress() {
		createCustomerPage.inputKeysAddress(Keys.SPACE);
	}

	@When("^I input key space to city$")
	public void inputKeySpacecity() {
		createCustomerPage.inputKeysCity(Keys.SPACE);
	}

	@When("^I input key tab to city$")
	public void inputKeyTabCity() {
		createCustomerPage.inputKeysCity(Keys.TAB);
	}

	@When("^I input key tab to state$")
	public void inputKeyTabState() {
		createCustomerPage.inputKeysState(Keys.TAB);
	}

	@When("^I input key space to pin$")
	public void inputKeySpacePin() {
		createCustomerPage.inputKeysPin(Keys.SPACE);
	}

	@When("^I input key space to state$")
	public void inputKeySpaceState() {
		createCustomerPage.inputKeysState(Keys.SPACE);
	}

	@When("^I input key tab to pin$")
	public void inputKeyTabPin() {
		createCustomerPage.inputKeysPin(Keys.TAB);
	}

	@When("^I input key tab to email$")
	public void inputKeyTabEmail() {
		createCustomerPage.inputKeysEmail(Keys.TAB);
	}

	@When("^I input key space to email$")
	public void inputKeySpaceEmail() {
		createCustomerPage.inputKeysEmail(Keys.SPACE);
	}

	@When("^I input key tab to phone$")
	public void inputKeyTabPhone() {
		createCustomerPage.inputKeysPhone(Keys.TAB);
	}

	@When("^I input key space to phone$")
	public void inputKeySpacePhone() {
		createCustomerPage.inputKeysPhone(Keys.SPACE);
	}

	@When("^I input data \"(.*?)\" to customer name$")
	public void inputDataToCustomerName(String value) {
		createCustomerPage.inputCustomerName(value);
	}

	@When("^I input data \"(.*?)\" to city$")
	public void inputDataToCity(String value) {
		createCustomerPage.inputCity(value);
	}

	@When("^I input data \"(.*?)\" to state$")
	public void inputDataToState(String value) {
		createCustomerPage.inputState(value);
	}

	@When("^I input data \"(.*?)\" to phone$")
	public void inputDataToPhone(String value) {
		createCustomerPage.inputPhone(value);
	}

	@When("^I input data \"(.*?)\" to email$")
	public void inputDataToEmail(String value) {
		createCustomerPage.inputEmail(value);
	}

	@When("^I input data \"(.*?)\" to pin$")
	public void inputDataPin(String value) {
		createCustomerPage.inputPin(value);
	}

	@When("^I click submit button$")
	public void clickSubmit() throws Exception {
		createCustomerPage.clickSubmitButton();
	}

}