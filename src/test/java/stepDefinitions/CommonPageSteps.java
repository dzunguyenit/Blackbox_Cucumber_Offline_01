package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import commons.AbstractTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOption.WebDriverManager;
import pages.CommonPage;

public class CommonPageSteps extends AbstractTest {
	WebDriver driver;
	public static String accountID;
	public static String userID;
	public static final String monneyWithDraw = "15000";
	CommonPage commonPage;

	public CommonPageSteps() {
		driver = WebDriverManager.driver;
		commonPage = PageFactory.initElements(driver, CommonPage.class);
	}

	@When("^I click to \"(.*?)\" button$")
	public void i_click_to_dynamic_button_and_navigate_to_homepage(String button) {
		commonPage.clickDynamicButton(button);
	}

	@When("^I get text UserID \"(.*?)\"$")
	public void getTextUserID(String locator) {
		userID = commonPage.getTextDynamicLabel(locator);
	}

	@When("^I get text dynamic label \"(.*?)\"$")
	public void getTextDynamicLabel(String locator) {
		accountID = commonPage.getTextDynamicLabel(locator);
		System.out.println(accountID);
	}

	@Then("^Verify successfully with message \"(.*?)\"$")
	public void verifyCustomerCreatedSuccessfullyWithMessage(String message) {
		verifyTrue(commonPage.isDynamicElementDisplayed(message));
	}

	@Then("^Verify (?:money transfer|current balance|money after withdraw) is \"(.*?)\"$")
	public void verifyCurrentBalanceAfterTransferMoney(String money) {
		verifyTrue(commonPage.isDynamicLabelDisplayed(money));
	}

	@Given("^I open \"(.*?)\" page$")
	public void iOpenNewDynamicPage(String pageName) {
		switch (pageName) {
		case "New Customer":
			commonPage.openNewCustomerPage(driver);
			break;
		case "Edit Customer":
			commonPage.openEditCustomerPage(driver);
			break;
		case "New Account":
			commonPage.openNewAccountPage(driver);
			break;
		case "Deposit":
			commonPage.openDepositPage(driver);
			break;
		case "Withdrawal":
			commonPage.openWithDrawPage(driver);
			break;
		case "Fund Transfer":
			commonPage.openFundTransferPage(driver);
			break;
		case "Balance Enquiry":
			commonPage.openBalanceEnquiryPage(driver);
			break;
		}
	}
}
