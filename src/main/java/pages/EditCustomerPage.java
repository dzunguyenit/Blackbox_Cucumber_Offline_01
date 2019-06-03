package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commons.CommonFuntions;

public class EditCustomerPage extends CommonFuntions {

	public EditCustomerPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(name = "name")
	WebElement CUSTOMERNAME_TXT;

	@FindBy(id = "dob")
	WebElement DATEOFBIRTH_TXT;

	@FindBy(name = "addr")
	WebElement ADDRESS_TXTAREA;

	@FindBy(name = "city")
	WebElement CITY_TXT;

	@FindBy(name = "state")
	WebElement STATE_TXT;

	@FindBy(name = "pinno")
	WebElement PIN_TXT;

	@FindBy(name = "telephoneno")
	WebElement MOBILENUMBER_TXT;

	@FindBy(name = "emailid")
	WebElement EMAIL_TXT;

	@FindBy(name = "password")
	WebElement PASSWORD_TXT;

	@FindBy(name = "sub")
	WebElement SUBMIT_BTN;

	@FindBy(xpath = "//p[contains(text(),'Customer Registered Successfully!!!')]")
	WebElement REGISTERSUCCESS_LBL;

	@FindBy(xpath = "//td[text()='Customer ID']/following-sibling::td")
	WebElement CUSTOMERID_LBL;

	@FindBy(name = "cusid")
	WebElement CUSTOMERID_TXT;

	@FindBy(name = "AccSubmit")
	WebElement SUBMITOEDIT_BTN;

	@FindBy(xpath = "//p[contains(text(),'Customer details updated Successfully!!!')]")
	WebElement UPDATESUCCESS_LBL;

	public void updateCustomerName(String value) {
		waitVisible(CUSTOMERNAME_TXT);
		input(CUSTOMERNAME_TXT, value);
	}

	public void updateKeysCustomerName(Keys key) {
		waitVisible(CUSTOMERNAME_TXT);
		inputKeys(CUSTOMERNAME_TXT, key);
	}

	public void inputKeysCustomerId(Keys key) {
		waitVisible(CUSTOMERID_TXT);
		inputKeys(CUSTOMERID_TXT, key);
	}

	public void inputDataCustomerId(String data) {
		waitVisible(CUSTOMERID_TXT);
		input(CUSTOMERID_TXT, data);
	}

	public void updateKeysAddress(Keys key) {
		waitVisible(ADDRESS_TXTAREA);
		inputKeys(ADDRESS_TXTAREA, key);
	}

	public void updateKeysCity(Keys key) {
		waitVisible(CITY_TXT);
		inputKeys(CITY_TXT, key);
	}

	public void updateKeysState(Keys key) {
		waitVisible(STATE_TXT);
		inputKeys(STATE_TXT, key);
	}

	public void updateKeysPin(Keys key) {
		waitVisible(PIN_TXT);
		inputKeys(PIN_TXT, key);
	}

	public void updateKeysPhone(Keys key) {
		waitVisible(MOBILENUMBER_TXT);
		inputKeys(MOBILENUMBER_TXT, key);
	}

	public void updateKeysEmail(Keys key) {
		waitVisible(EMAIL_TXT);
		inputKeys(EMAIL_TXT, key);
	}

	public void updateDateOfBirth(String value) {
		waitVisible(DATEOFBIRTH_TXT);
		input(DATEOFBIRTH_TXT, value);
	}

	public void updateAddress(String value) {
		waitVisible(ADDRESS_TXTAREA);
		input(ADDRESS_TXTAREA, value);
	}

	public void updateCity(String value) {
		waitVisible(CITY_TXT);
		input(CITY_TXT, value);
	}

	public void updateState(String value) {
		waitVisible(STATE_TXT);
		input(STATE_TXT, value);
	}

	public void updatePin(String value) {
		waitVisible(PIN_TXT);
		input(PIN_TXT, value);
	}

	public void updatePhone(String value) {
		waitVisible(MOBILENUMBER_TXT);
		input(MOBILENUMBER_TXT, value);
	}

	public void updateEmail(String value) {
		waitVisible(EMAIL_TXT);
		input(EMAIL_TXT, value);
	}

	public void updatePassword(String value) {
		waitVisible(PASSWORD_TXT);
		input(PASSWORD_TXT, value);
	}

	public void clickSubmitButton() {
		waitVisible(SUBMITOEDIT_BTN);
		click(SUBMITOEDIT_BTN);
	}
}
