package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import commons.CommonFuntions;
import interfaces.RegisterPageUI;

public class RegisterPage extends CommonFuntions {

	public RegisterPage(WebDriver driver) {
		super(driver);
	}

	public String getUserIDInfo() {
		waitForControlVisible(RegisterPageUI.USER_ID_TEXT);
		return getTextElement(RegisterPageUI.USER_ID_TEXT);
	}

	public String getPasswordIDInfo() {
		waitForControlVisible(RegisterPageUI.PASSWORD_ID_TEXT);
		return getTextElement(RegisterPageUI.PASSWORD_ID_TEXT);
	}

	public void inputEmail(String value) {
		waitForControlVisible(RegisterPageUI.EMAIL_REGISTER_TXT);
		sendKeyToElement(RegisterPageUI.EMAIL_REGISTER_TXT, value);
	}

	public void clickSubmit() {
		waitForControlVisible(RegisterPageUI.SUBMIT_BTN);
		clickToElement(RegisterPageUI.SUBMIT_BTN);
	}

	public LoginPage openLoginPage(String url) {
		openUrl(url);
		return PageFactory.initElements(driver, LoginPage.class);
	}
}
