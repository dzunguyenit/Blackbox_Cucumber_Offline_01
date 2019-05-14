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
		waitVisible(RegisterPageUI.USER_ID_TEXT);
		return getText(RegisterPageUI.USER_ID_TEXT);
	}

	public String getPasswordIDInfo() {
		waitVisible(RegisterPageUI.PASSWORD_ID_TEXT);
		return getText(RegisterPageUI.PASSWORD_ID_TEXT);
	}

	public void inputEmail(String value) {
		waitVisible(RegisterPageUI.EMAIL_REGISTER_TXT);
		input(RegisterPageUI.EMAIL_REGISTER_TXT, value);
	}

	public void clickSubmitAccount() {
		waitVisible(RegisterPageUI.SUBMIT_BTN);
		click(RegisterPageUI.SUBMIT_BTN);
	}

	public LoginPage openLoginPage(String url) {
		openUrl(url);
		return PageFactory.initElements(driver, LoginPage.class);
	}
}
