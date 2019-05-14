package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import commons.CommonFuntions;
import interfaces.CreateCustomerPageUI;

public class CreateCustomerPage extends CommonFuntions {

	public CreateCustomerPage(WebDriver driver) {
		super(driver);
	}

	public void inputCustomerName(String value) {
		waitVisible(CreateCustomerPageUI.CUSTOMER_NAME_TXT);
		input(CreateCustomerPageUI.CUSTOMER_NAME_TXT, value);
	}

	public void inputKeysCustomerName(Keys key) {
		waitVisible(CreateCustomerPageUI.CUSTOMER_NAME_TXT);
		inputKeyPress(CreateCustomerPageUI.CUSTOMER_NAME_TXT, key);
	}

	public void inputKeysAddress(Keys key) {
		waitVisible(CreateCustomerPageUI.ADDRESS_TXT);
		inputKeyPress(CreateCustomerPageUI.ADDRESS_TXT, key);
	}

	public void inputKeysCity(Keys key) {
		waitVisible(CreateCustomerPageUI.CITY_TXT);
		inputKeyPress(CreateCustomerPageUI.CITY_TXT, key);
	}

	public void inputKeysState(Keys key) {
		waitVisible(CreateCustomerPageUI.STATE_TXT);
		inputKeyPress(CreateCustomerPageUI.STATE_TXT, key);
	}

	public void inputKeysPin(Keys key) {
		waitVisible(CreateCustomerPageUI.PIN_TXT);
		inputKeyPress(CreateCustomerPageUI.PIN_TXT, key);
	}

	public void inputKeysPhone(Keys key) {
		waitVisible(CreateCustomerPageUI.PHONE_TXT);
		inputKeyPress(CreateCustomerPageUI.PHONE_TXT, key);
	}

	public void inputKeysEmail(Keys key) {
		waitVisible(CreateCustomerPageUI.EMAIL_TXT);
		inputKeyPress(CreateCustomerPageUI.EMAIL_TXT, key);
	}

	public void inputDateOfBirth(String value) {
		waitVisible(CreateCustomerPageUI.DOB_DATEPICKER);
		input(CreateCustomerPageUI.DOB_DATEPICKER, value);
	}

	public void inputAddress(String value) {
		waitVisible(CreateCustomerPageUI.ADDRESS_TXT);
		input(CreateCustomerPageUI.ADDRESS_TXT, value);
	}

	public void inputCity(String value) {
		waitVisible(CreateCustomerPageUI.CITY_TXT);
		input(CreateCustomerPageUI.CITY_TXT, value);
	}

	public void inputState(String value) {
		waitVisible(CreateCustomerPageUI.STATE_TXT);
		input(CreateCustomerPageUI.STATE_TXT, value);
	}

	public void inputPin(String value) {
		waitVisible(CreateCustomerPageUI.PIN_TXT);
		input(CreateCustomerPageUI.PIN_TXT, value);
	}

	public void inputPhone(String value) {
		waitVisible(CreateCustomerPageUI.PHONE_TXT);
		input(CreateCustomerPageUI.PHONE_TXT, value);
	}

	public void inputEmail(String value) {
		waitVisible(CreateCustomerPageUI.EMAIL_TXT);
		input(CreateCustomerPageUI.EMAIL_TXT, value);
	}

	public void inputPassword(String value) {
		waitVisible(CreateCustomerPageUI.PASSWORD_TXT);
		input(CreateCustomerPageUI.PASSWORD_TXT, value);
	}

	public void clickSubmitButton() {
		waitVisible(CreateCustomerPageUI.SUBMIT_BTN);
		click(CreateCustomerPageUI.SUBMIT_BTN);
	}
}
