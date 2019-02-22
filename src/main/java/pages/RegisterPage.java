package pages;

import org.openqa.selenium.WebDriver;

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

	public LoginPage openLoginPage(String url) {
		openUrl(url);
		return PageManagement.getLoginPage(driver);
	}
}
