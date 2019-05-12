package pages;

import org.openqa.selenium.WebDriver;

public class PageManagement {
	private static LoginPage loginPage;
	private static RegisterPage registerPage;
	private static HomePage homePage;
	private static NewAccountPage newAccountPage;
	private static DepositPage depositPage;
	private static CommonPage abtractPageObject;

	public static LoginPage getLoginPage(WebDriver driver) {
		return (loginPage == null) ? new LoginPage(driver) : loginPage;
	}

	public static RegisterPage getRegisterPage(WebDriver driver) {
		return (registerPage == null) ? new RegisterPage(driver) : registerPage;
	}

	public static HomePage getHomePage(WebDriver driver) {
		return (homePage == null) ? new HomePage(driver) : homePage;
	}

	public static NewAccountPage getNewAccountPage(WebDriver driver) {
		return (newAccountPage == null) ? new NewAccountPage(driver) : newAccountPage;
	}

	public static DepositPage getDepositPage(WebDriver driver) {
		return (depositPage == null) ? new DepositPage(driver) : depositPage;
	}

	public static CommonPage getAbtractPageObject(WebDriver driver) {
		return (abtractPageObject == null) ? new CommonPage(driver) : abtractPageObject;
	}

}
