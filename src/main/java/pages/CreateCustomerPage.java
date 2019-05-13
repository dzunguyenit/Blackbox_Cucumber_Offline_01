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
		waitForControlVisible(CreateCustomerPageUI.CUSTOMER_NAME_TXT);
		sendKeyToElement(CreateCustomerPageUI.CUSTOMER_NAME_TXT, value);
	}

	public void inputKeysCustomerName(Keys key) {
		waitForControlVisible(CreateCustomerPageUI.CUSTOMER_NAME_TXT);
		sendKeyPress(CreateCustomerPageUI.CUSTOMER_NAME_TXT, key);
	}

	public void inputDateOfBirth(String value) {
		waitForControlVisible(CreateCustomerPageUI.DOB_DATEPICKER);
		sendKeyToElement(CreateCustomerPageUI.DOB_DATEPICKER, value);
	}

	public void inputAddress(String value) {
		waitForControlVisible(CreateCustomerPageUI.ADDRESS_TXT);
		sendKeyToElement(CreateCustomerPageUI.ADDRESS_TXT, value);
	}

	public void inputCity(String value) {
		waitForControlVisible(CreateCustomerPageUI.CITY_TXT);
		sendKeyToElement(CreateCustomerPageUI.CITY_TXT, value);
	}

	public void inputState(String value) {
		waitForControlVisible(CreateCustomerPageUI.STATE_TXT);
		sendKeyToElement(CreateCustomerPageUI.STATE_TXT, value);
	}

	public void inputPin(String value) {
		waitForControlVisible(CreateCustomerPageUI.PIN_TXT);
		sendKeyToElement(CreateCustomerPageUI.PIN_TXT, value);
	}

	public void inputPhone(String value) {
		waitForControlVisible(CreateCustomerPageUI.PHONE_TXT);
		sendKeyToElement(CreateCustomerPageUI.PHONE_TXT, value);
	}

	public void inputEmail(String value) {
		waitForControlVisible(CreateCustomerPageUI.EMAIL_TXT);
		sendKeyToElement(CreateCustomerPageUI.EMAIL_TXT, value);
	}

	public void inputPassword(String value) {
		waitForControlVisible(CreateCustomerPageUI.PASSWORD_TXT);
		sendKeyToElement(CreateCustomerPageUI.PASSWORD_TXT, value);
	}

	public void clickSubmitButton() {
		waitForControlVisible(CreateCustomerPageUI.SUBMIT_BTN);
		clickToElement(CreateCustomerPageUI.SUBMIT_BTN);
	}
}
