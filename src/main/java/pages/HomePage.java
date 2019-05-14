package pages;

import org.openqa.selenium.WebDriver;

import commons.CommonFuntions;
import interfaces.LoginPageUI;

public class HomePage extends CommonFuntions {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public String getLoginPageUrl() {
		return getCurrentUrl(driver);
	}

	public RegisterPage clickHereLink() {
		waitVisible(LoginPageUI.HERE_LINK);
		click(LoginPageUI.HERE_LINK);
		return new RegisterPage(driver);
	}

}
