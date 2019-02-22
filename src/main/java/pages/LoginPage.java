package pages;

import org.openqa.selenium.WebDriver;

import commons.CommonFuntions;
import interfaces.LoginPageUI;

public class LoginPage extends CommonFuntions {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public String getLoginPageUrl() {
		return getCurrentUrl(driver);
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
		return PageManagement.getRegisterPage(driver);
	}

}
