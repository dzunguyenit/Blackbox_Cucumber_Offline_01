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
		waitVisible(EditCustomerPageUI.CUSTOMER_NAME_TXT);
		input(EditCustomerPageUI.CUSTOMER_NAME_TXT, value);
	}

	public void updateKeysCustomerName(Keys key) {
		waitVisible(EditCustomerPageUI.CUSTOMER_NAME_TXT);
		clearElement(EditCustomerPageUI.CUSTOMER_NAME_TXT);
		inputKeyPress(EditCustomerPageUI.CUSTOMER_NAME_TXT, key);
	}

	public void inputKeysCustomerId(Keys key) {
		waitVisible(EditCustomerPageUI.CUSTOMER_ID_TXT);
		clearElement(EditCustomerPageUI.CUSTOMER_ID_TXT);
		inputKeyPress(EditCustomerPageUI.CUSTOMER_ID_TXT, key);
	}

	public void inputDataCustomerId(String data) {
		waitVisible(EditCustomerPageUI.CUSTOMER_ID_TXT);
		input(EditCustomerPageUI.CUSTOMER_ID_TXT, data);
	}

	public void updateKeysAddress(Keys key) {
		waitVisible(EditCustomerPageUI.ADDRESS_TXT);
		clearElement(EditCustomerPageUI.ADDRESS_TXT);
		inputKeyPress(EditCustomerPageUI.ADDRESS_TXT, key);
	}

	public void updateKeysCity(Keys key) {
		waitVisible(EditCustomerPageUI.CITY_TXT);
		clearElement(EditCustomerPageUI.CITY_TXT);
		inputKeyPress(EditCustomerPageUI.CITY_TXT, key);
	}

	public void updateKeysState(Keys key) {
		waitVisible(EditCustomerPageUI.STATE_TXT);
		clearElement(EditCustomerPageUI.STATE_TXT);
		inputKeyPress(EditCustomerPageUI.STATE_TXT, key);
	}

	public void updateKeysPin(Keys key) {
		waitVisible(EditCustomerPageUI.PIN_TXT);
		clearElement(EditCustomerPageUI.PIN_TXT);
		inputKeyPress(EditCustomerPageUI.PIN_TXT, key);
	}

	public void updateKeysPhone(Keys key) {
		waitVisible(EditCustomerPageUI.PHONE_TXT);
		clearElement(EditCustomerPageUI.PHONE_TXT);
		inputKeyPress(EditCustomerPageUI.PHONE_TXT, key);
	}

	public void updateKeysEmail(Keys key) {
		waitVisible(EditCustomerPageUI.EMAIL_TXT);
		clearElement(EditCustomerPageUI.EMAIL_TXT);
		inputKeyPress(EditCustomerPageUI.EMAIL_TXT, key);
	}

	public void updateDateOfBirth(String value) {
		waitVisible(EditCustomerPageUI.DOB_DATEPICKER);
		input(EditCustomerPageUI.DOB_DATEPICKER, value);
	}

	public void updateAddress(String value) {
		waitVisible(EditCustomerPageUI.ADDRESS_TXT);
		input(EditCustomerPageUI.ADDRESS_TXT, value);
	}

	public void updateCity(String value) {
		waitVisible(EditCustomerPageUI.CITY_TXT);
		input(EditCustomerPageUI.CITY_TXT, value);
	}

	public void updateState(String value) {
		waitVisible(EditCustomerPageUI.STATE_TXT);
		input(EditCustomerPageUI.STATE_TXT, value);
	}

	public void updatePin(String value) {
		waitVisible(EditCustomerPageUI.PIN_TXT);
		input(EditCustomerPageUI.PIN_TXT, value);
	}

	public void updatePhone(String value) {
		waitVisible(EditCustomerPageUI.PHONE_TXT);
		input(EditCustomerPageUI.PHONE_TXT, value);
	}

	public void updateEmail(String value) {
		waitVisible(EditCustomerPageUI.EMAIL_TXT);
		input(EditCustomerPageUI.EMAIL_TXT, value);
	}

	public void updatePassword(String value) {
		waitVisible(EditCustomerPageUI.PASSWORD_TXT);
		input(EditCustomerPageUI.PASSWORD_TXT, value);
	}

	public void clickSubmitButton() {
		waitVisible(EditCustomerPageUI.SUBMIT_BTN);
		click(EditCustomerPageUI.SUBMIT_BTN);
	}
}
