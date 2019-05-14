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
		waitVisible(LoginPageUI.EMAIL_LOGIN_TXT);
		input(LoginPageUI.EMAIL_LOGIN_TXT, value);
	}

	public void openLogInPage(String value) {
		openUrl(value);
	}

	public void inputPasswordLogIn(String value) {
		waitVisible(LoginPageUI.PASSWORD_LOGIN_TXT);
		input(LoginPageUI.PASSWORD_LOGIN_TXT, value);
	}

	public HomePage clickLogIn() {
		waitVisible(LoginPageUI.LOGIN_BTN);
		click(LoginPageUI.LOGIN_BTN);
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
		waitVisible(LoginPageUI.HERE_LINK);
		click(LoginPageUI.HERE_LINK);
		return PageFactory.initElements(driver, RegisterPage.class);
	}

}
