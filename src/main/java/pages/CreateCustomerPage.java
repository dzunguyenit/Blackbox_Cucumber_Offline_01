package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commons.CommonFuntions;

public class CreateCustomerPage extends CommonFuntions {

	public CreateCustomerPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[contains(text(),'Edit Customer')]")
	WebElement EDIT_CUSTOMER_LINK;

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

	@FindBy(css = "input[name='pinno']")
	WebElement PIN_TXT;

	@FindBy(css = "input[name='telephoneno']")
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

	public void inputCustomerName(String value) {
		waitVisible(CUSTOMERNAME_TXT);
		input(CUSTOMERNAME_TXT, value);
	}

	public void inputKeysCustomerName(Keys key) {
		waitVisible(CUSTOMERNAME_TXT);
		inputKeys(CUSTOMERNAME_TXT, key);
	}

	public void inputKeysAddress(Keys key) {
		waitVisible(ADDRESS_TXTAREA);
		inputKeys(ADDRESS_TXTAREA, key);
	}

	public void inputKeysCity(Keys key) {
		waitVisible(CITY_TXT);
		inputKeys(CITY_TXT, key);
	}

	public void inputKeysState(Keys key) {
		waitVisible(STATE_TXT);
		inputKeys(STATE_TXT, key);
	}

	public void inputKeysPin(Keys key) {
		waitVisible(PIN_TXT);
		inputKeys(PIN_TXT, key);
	}

	public void inputKeysPhone(Keys key) {
		waitVisible(MOBILENUMBER_TXT);
		inputKeys(MOBILENUMBER_TXT, key);
	}

	public void inputKeysEmail(Keys key) {
		waitVisible(EMAIL_TXT);
		inputKeys(EMAIL_TXT, key);
	}

	public void inputDateOfBirth(String value) {
		waitVisible(DATEOFBIRTH_TXT);
		input(DATEOFBIRTH_TXT, value);
	}

	public void inputAddress(String value) {
		waitVisible(ADDRESS_TXTAREA);
		input(ADDRESS_TXTAREA, value);
	}

	public void inputCity(String value) {
		waitVisible(CITY_TXT);
		input(CITY_TXT, value);
	}

	public void inputState(String value) {
		waitVisible(STATE_TXT);
		input(STATE_TXT, value);
	}

	public void inputPin(String value) {
		waitVisible(PIN_TXT);
		input(PIN_TXT, value);
	}

	public void inputPhone(String value) {
		waitVisible(MOBILENUMBER_TXT);
		input(MOBILENUMBER_TXT, value);
	}

	public void inputEmail(String value) {
		waitVisible(EMAIL_TXT);
		input(EMAIL_TXT, value);
	}

	public void inputPassword(String value) {
		waitVisible(PASSWORD_TXT);
		input(PASSWORD_TXT, value);
	}

	public void clickSubmitButton() {
		waitVisible(SUBMIT_BTN);
		click(SUBMIT_BTN);
	}
}
