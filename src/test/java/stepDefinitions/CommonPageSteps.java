package stepDefinitions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import commons.AbstractTest;
import commons.Data;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOption.WebDriverManager;
import pages.CommonPage;
import pages.PageManagement;

public class CommonPageSteps extends AbstractTest {
	WebDriver driver;
	public static String accountID;
	public static String userID;
	public static final String monneyWithDraw = "15000";
	private CommonPage commonPage;

	public CommonPageSteps() {
		driver = WebDriverManager.driver;
		commonPage = PageManagement.getCommonPage(driver);

	}

	@When("^I click to \"(.*?)\" button$")
	public void i_click_to_dynamic_button_and_navigate_to_homepage(String button) {
		commonPage.clickDynamicButton(button);
	}

	@When("^Select with value \"(.*?)\" item in dynamic dropdow \"(.*?)\"$")
	public void selectAcountTypeAndInputDeposit(String dataValue, String locator) {
		commonPage.selectDynamicDropdown(dataValue, locator);
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

	@When("^I input with variable data \"(.*?)\" to \"(.*?)\" textbox$")
	public void clearAndInputDataDynamicTextbox(Data data, String locator) {
		switch (data) {
		case USERNAMELOGIN:
			commonPage.clearAndInputDataWithDynamicTextbox(RegisterSteps.usernameLogin, locator);
			break;
		case PASSWORDLOGIN:
			commonPage.clearAndInputDataWithDynamicTextbox(RegisterSteps.passwordLogin, locator);
			break;
		case ACCOUNTID:
			commonPage.clearAndInputDataWithDynamicTextbox(accountID, locator);
			break;
		case ACCOUNTIDPAYEE:
			commonPage.clearAndInputDataWithDynamicTextbox(String.valueOf((Integer.parseInt(accountID) - 1)), locator);
			break;
		case USERID:
			commonPage.clearAndInputDataWithDynamicTextbox(userID, locator);
			break;
		case DEPOSITADD:
			commonPage.clearAndInputDataWithDynamicTextbox(AddDepositSteps.depositAdd, locator);
			break;
		case MONNEYWITHDRAW:
			commonPage.clearAndInputDataWithDynamicTextbox(monneyWithDraw, locator);
			break;
		case TABKEYS:
			commonPage.clearAndInputKeyWithDynamicTextbox(Keys.TAB, locator);
			break;
		case SPACEKEYS:
			commonPage.clearAndInputKeyWithDynamicTextbox(Keys.SPACE, locator);
			break;
		default:
			break;
		}
	}

	@When("^I input with data \"(.*?)\" to \"(.*?)\" textbox$")
	public void clearAndInputDynamicTextbox(String dataValue, String locator) {
		if (dataValue.equals("randomEmail"))
			commonPage.clearAndInputDataWithDynamicTextbox(dataValue + randomEmail() + "@gmail.com", locator);
		else
			commonPage.clearAndInputDataWithDynamicTextbox(dataValue, locator);
	}

	@When("^I input date of birth with data \"(.*?)\" to \"(.*?)\"$")
	public void inputDynamicTextbox(String dataValue, String locator) {
//		commonPage.removeDateProperty("type");
		commonPage.inputDataWithDynamicTextbox(dataValue, locator);
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
