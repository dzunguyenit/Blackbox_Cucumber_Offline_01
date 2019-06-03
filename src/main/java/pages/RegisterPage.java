package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.CommonFuntions;

public class RegisterPage extends CommonFuntions {

	public RegisterPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(name = "btnLogin")
	WebElement SUBMIT_BTN;

	@FindBy(name = "emailid")
	WebElement EMAIL_REGISTER_TXT;

	@FindBy(xpath = "//td[contains(text(),'User ID :')]/following-sibling::td")
	WebElement USER_ID_TEXT;

	@FindBy(xpath = "//td[contains(text(),'Password :')]/following-sibling::td")
	WebElement PASSWORD_ID_TEXT;

	public String getUserIDInfo() {
		waitVisible(USER_ID_TEXT);
		return getText(USER_ID_TEXT);
	}

	public String getPasswordIDInfo() {
		waitVisible(PASSWORD_ID_TEXT);
		return getText(PASSWORD_ID_TEXT);
	}

	public void inputEmail(String value) {
		waitVisible(EMAIL_REGISTER_TXT);
		input(EMAIL_REGISTER_TXT, value);
	}

	public void clickSubmitAccount() {
		waitVisible(SUBMIT_BTN);
		click(SUBMIT_BTN);
	}

	public LoginPage openLoginPage(String url) {
		openUrl(url);
		return PageFactory.initElements(driver, LoginPage.class);
	}
}
