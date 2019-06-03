package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.CommonFuntions;

public class LoginPage extends CommonFuntions {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(name = "uid")
	WebElement EMAIL_LOGIN_TXT;

	@FindBy(css = "a[href='http://demo.guru99.com/']")
	WebElement HERE_LINK;

	@FindBy(name = "password")
	WebElement PASSWORD_TXT;

	@FindBy(name = "btnLogin")
	WebElement LOGIN_BTN;

	public void inputEmailLogIn(String value) {
		waitVisible(EMAIL_LOGIN_TXT);
		input(EMAIL_LOGIN_TXT, value);
	}

	public void openLogInPage(String value) {
		openUrl(value);
	}

	public void inputPasswordLogIn(String value) {
		waitVisible(PASSWORD_TXT);
		input(PASSWORD_TXT, value);
	}

	public HomePage clickLogIn() {
		waitVisible(LOGIN_BTN);
		click(LOGIN_BTN);
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
		waitVisible(HERE_LINK);
		click(HERE_LINK);
		return PageFactory.initElements(driver, RegisterPage.class);
	}

}
