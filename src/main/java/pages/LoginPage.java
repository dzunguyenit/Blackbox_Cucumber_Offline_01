package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import commons.CommonFuntions;
import interfaces.LoginPageUI;

public class LoginPage extends CommonFuntions {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public String getLoginPageUrl() {
		return getCurrentUrl(driver);
	}

	public void inputEmailLogIn(String value) {
		waitForControlVisible(LoginPageUI.EMAIL_LOGIN_TXT);
		sendKeyToElement(LoginPageUI.EMAIL_LOGIN_TXT, value);
	}

	public void openLogInPage(String value) {
		openUrl(value);
	}

	public void inputPasswordLogIn(String value) {
		waitForControlVisible(LoginPageUI.PASSWORD_LOGIN_TXT);
		sendKeyToElement(LoginPageUI.PASSWORD_LOGIN_TXT, value);
	}

	public HomePage clickLogIn() {
		waitForControlVisible(LoginPageUI.LOGIN_BTN);
		clickToElement(LoginPageUI.LOGIN_BTN);
		return PageFactory.initElements(driver, HomePage.class);
	}

	public RegisterPage clickHereLink() {
		// if (driver.toString().toLowerCase().contains("internetexplorer")) {
		// try {
		// Thread.sleep(3000);
		// } catch (InterruptedException e) {
		// e.printStackTrace();
		// }
		// }
		waitForControlVisible(LoginPageUI.HERE_LINK);
		clickToElement(LoginPageUI.HERE_LINK);
		return PageFactory.initElements(driver, RegisterPage.class);
	}

}
