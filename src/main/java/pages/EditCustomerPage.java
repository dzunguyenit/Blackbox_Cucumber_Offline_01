package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import commons.CommonFuntions;
import interfaces.EditCustomerPageUI;

public class EditCustomerPage extends CommonFuntions {

	public EditCustomerPage(WebDriver driver) {
		super(driver);
	}

	public void updateCustomerName(String value) {
		waitForControlVisible(EditCustomerPageUI.CUSTOMER_NAME_TXT);
		sendKeyToElement(EditCustomerPageUI.CUSTOMER_NAME_TXT, value);
	}

	public void updateKeysCustomerName(Keys key) {
		waitForControlVisible(EditCustomerPageUI.CUSTOMER_NAME_TXT);
		clearElement(EditCustomerPageUI.CUSTOMER_NAME_TXT);
		sendKeyPress(EditCustomerPageUI.CUSTOMER_NAME_TXT, key);
	}

	public void inputKeysCustomerId(Keys key) {
		waitForControlVisible(EditCustomerPageUI.CUSTOMER_ID_TXT);
		clearElement(EditCustomerPageUI.CUSTOMER_ID_TXT);
		sendKeyPress(EditCustomerPageUI.CUSTOMER_ID_TXT, key);
	}

	public void inputDataCustomerId(String data) {
		waitForControlVisible(EditCustomerPageUI.CUSTOMER_ID_TXT);
		sendKeyToElement(EditCustomerPageUI.CUSTOMER_ID_TXT, data);
	}

	public void updateKeysAddress(Keys key) {
		waitForControlVisible(EditCustomerPageUI.ADDRESS_TXT);
		clearElement(EditCustomerPageUI.ADDRESS_TXT);
		sendKeyPress(EditCustomerPageUI.ADDRESS_TXT, key);
	}

	public void updateKeysCity(Keys key) {
		waitForControlVisible(EditCustomerPageUI.CITY_TXT);
		clearElement(EditCustomerPageUI.CITY_TXT);
		sendKeyPress(EditCustomerPageUI.CITY_TXT, key);
	}

	public void updateKeysState(Keys key) {
		waitForControlVisible(EditCustomerPageUI.STATE_TXT);
		clearElement(EditCustomerPageUI.STATE_TXT);
		sendKeyPress(EditCustomerPageUI.STATE_TXT, key);
	}

	public void updateKeysPin(Keys key) {
		waitForControlVisible(EditCustomerPageUI.PIN_TXT);
		clearElement(EditCustomerPageUI.PIN_TXT);
		sendKeyPress(EditCustomerPageUI.PIN_TXT, key);
	}

	public void updateKeysPhone(Keys key) {
		waitForControlVisible(EditCustomerPageUI.PHONE_TXT);
		clearElement(EditCustomerPageUI.PHONE_TXT);
		sendKeyPress(EditCustomerPageUI.PHONE_TXT, key);
	}

	public void updateKeysEmail(Keys key) {
		waitForControlVisible(EditCustomerPageUI.EMAIL_TXT);
		clearElement(EditCustomerPageUI.EMAIL_TXT);
		sendKeyPress(EditCustomerPageUI.EMAIL_TXT, key);
	}

	public void updateDateOfBirth(String value) {
		waitForControlVisible(EditCustomerPageUI.DOB_DATEPICKER);
		sendKeyToElement(EditCustomerPageUI.DOB_DATEPICKER, value);
	}

	public void updateAddress(String value) {
		waitForControlVisible(EditCustomerPageUI.ADDRESS_TXT);
		sendKeyToElement(EditCustomerPageUI.ADDRESS_TXT, value);
	}

	public void updateCity(String value) {
		waitForControlVisible(EditCustomerPageUI.CITY_TXT);
		sendKeyToElement(EditCustomerPageUI.CITY_TXT, value);
	}

	public void updateState(String value) {
		waitForControlVisible(EditCustomerPageUI.STATE_TXT);
		sendKeyToElement(EditCustomerPageUI.STATE_TXT, value);
	}

	public void updatePin(String value) {
		waitForControlVisible(EditCustomerPageUI.PIN_TXT);
		sendKeyToElement(EditCustomerPageUI.PIN_TXT, value);
	}

	public void updatePhone(String value) {
		waitForControlVisible(EditCustomerPageUI.PHONE_TXT);
		sendKeyToElement(EditCustomerPageUI.PHONE_TXT, value);
	}

	public void updateEmail(String value) {
		waitForControlVisible(EditCustomerPageUI.EMAIL_TXT);
		sendKeyToElement(EditCustomerPageUI.EMAIL_TXT, value);
	}

	public void updatePassword(String value) {
		waitForControlVisible(EditCustomerPageUI.PASSWORD_TXT);
		sendKeyToElement(EditCustomerPageUI.PASSWORD_TXT, value);
	}

	public void clickSubmitButton() {
		waitForControlVisible(EditCustomerPageUI.SUBMIT_BTN);
		clickToElement(EditCustomerPageUI.SUBMIT_BTN);
	}
}
