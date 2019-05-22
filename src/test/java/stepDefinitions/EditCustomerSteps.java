package stepDefinitions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import commons.CommonTestCase;
import cucumber.api.java.en.When;
import pages.EditCustomerPage;

public class EditCustomerSteps extends CommonTestCase {
	EditCustomerPage editCustomerPage;

	WebDriver driver;

	public EditCustomerSteps() {
		driver = CommonTestCase.driver;
		editCustomerPage = PageFactory.initElements(driver, EditCustomerPage.class);

	}

	@When("^I update with data \"(.*?)\" to customer name$")
	public void updateDynamicTextbox(String value) {
		editCustomerPage.updateCustomerName(value);
	}

	@When("^I update with data \"(.*?)\" to date of birth$")
	public void updateDateOfbirth(String value) {
		editCustomerPage.updateDateOfBirth(value);
	}

	@When("^I update with data \"(.*?)\" to address$")
	public void updateAddress(String value) {
		editCustomerPage.updateAddress(value);
	}

	@When("^I update with data \"(.*?)\" to city$")
	public void updateCity(String value) {
		editCustomerPage.updateCity(value);
	}

	@When("^I update with data \"(.*?)\" to state$")
	public void updateState(String value) {
		editCustomerPage.updateState(value);
	}

	@When("^I update with data \"(.*?)\" to pin$")
	public void updatePin(String value) {
		editCustomerPage.updatePin(value);
	}

	@When("^I update with data \"(.*?)\" to phone$")
	public void updatePhone(String value) {
		editCustomerPage.updatePhone(value);
	}

	@When("^I update with data \"(.*?)\" to email$")
	public void updateEmail(String value) {
		editCustomerPage.updateEmail(value + randomEmail() + "@gmail.com");
	}

	@When("^I update with data \"(.*?)\" to password$")
	public void updatePassword(String value) {
		editCustomerPage.updatePassword(value);
	}

	@When("^I update key tab to customer name$")
	public void updateKeyTabCustomerName() {
		editCustomerPage.updateKeysCustomerName(Keys.TAB);
	}

	@When("^I input key tab to customer id$")
	public void updateKeyTabCustomerId() {
		editCustomerPage.inputKeysCustomerId(Keys.TAB);
	}

	@When("^I input customer id$")
	public void inputKeyTabCustomerId() {
		editCustomerPage.inputDataCustomerId(CommonPageSteps.userID);
	}

	@When("^I update key space to customer name$")
	public void updateKeySpaceCustomerName() {
		editCustomerPage.updateKeysCustomerName(Keys.SPACE);
	}

	@When("^I update key tab to address$")
	public void updateKeyTabAddress() {
		editCustomerPage.updateKeysAddress(Keys.TAB);
	}

	@When("^I update key space to address$")
	public void updateKeySpaceAddress() {
		editCustomerPage.updateKeysAddress(Keys.SPACE);
	}

	@When("^I update key space to city$")
	public void updateKeySpacecity() {
		editCustomerPage.updateKeysCity(Keys.SPACE);
	}

	@When("^I update key tab to city$")
	public void updateKeyTabCity() {
		editCustomerPage.updateKeysCity(Keys.TAB);
	}

	@When("^I update key tab to state$")
	public void updateKeyTabState() {
		editCustomerPage.updateKeysState(Keys.TAB);
	}

	@When("^I update key space to pin$")
	public void updateKeySpacePin() {
		editCustomerPage.updateKeysPin(Keys.SPACE);
	}

	@When("^I update key space to state$")
	public void updateKeySpaceState() {
		editCustomerPage.updateKeysState(Keys.SPACE);
	}

	@When("^I update key tab to pin$")
	public void updateKeyTabPin() {
		editCustomerPage.updateKeysPin(Keys.TAB);
	}

	@When("^I update key tab to email$")
	public void updateKeyTabEmail() {
		editCustomerPage.updateKeysEmail(Keys.TAB);
	}

	@When("^I update key space to email$")
	public void updateKeySpaceEmail() {
		editCustomerPage.updateKeysEmail(Keys.SPACE);
	}

	@When("^I update key tab to phone$")
	public void updateKeyTabPhone() {
		editCustomerPage.updateKeysPhone(Keys.TAB);
	}

	@When("^I update key space to phone$")
	public void updateKeySpacePhone() {
		editCustomerPage.updateKeysPhone(Keys.SPACE);
	}

	@When("^I update data \"(.*?)\" to customer name$")
	public void updateDataToCustomerName(String value) {
		editCustomerPage.updateCustomerName(value);
	}

	@When("^I input data \"(.*?)\" to customer id$")
	public void inputDataToCustomerName(String value) {
		editCustomerPage.inputDataCustomerId(value);
	}

	@When("^I update data \"(.*?)\" to city$")
	public void updateDataToCity(String value) {
		editCustomerPage.updateCity(value);
	}

	@When("^I update data \"(.*?)\" to state$")
	public void updateDataToState(String value) {
		editCustomerPage.updateState(value);
	}

	@When("^I update data \"(.*?)\" to phone$")
	public void updateDataToPhone(String value) {
		editCustomerPage.updatePhone(value);
	}

	@When("^I update data \"(.*?)\" to email$")
	public void updateDataToEmail(String value) {
		editCustomerPage.updateEmail(value);
	}

	@When("^I update data \"(.*?)\" to pin$")
	public void updateDataPin(String value) {
		editCustomerPage.updatePin(value);
	}

	@When("^I click to submit button$")
	public void clickSubmitbutton() throws Exception {
		editCustomerPage.clickSubmitButton();
	}

}