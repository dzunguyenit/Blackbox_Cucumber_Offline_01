package stepDefinitions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import commons.AbstractTest;
import commons.Data;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOption.Hooks;
import pages.AbtractPageObject;
import pages.PageFactory;

public class AbtractPageSteps extends AbstractTest {
	WebDriver driver;
	public static String accountID;
	public static String userID;
	public static final String monneyWithDraw = "15000";
	private AbtractPageObject abtractPageObject;
	private AbstractPage abstractPage;

	public AbtractPageSteps() {
		driver = Hooks.openBrowser();
		abtractPageObject = PageFactory.getAbtractPageObject(driver);
		abstractPage = new AbstractPage();

	}

	@When("^I click to \"(.*?)\" button$")
	public void i_click_to_dynamic_button_and_navigate_to_homepage(String button) {
		abtractPageObject.clickDynamicButton(button);
	}

	@When("^Select with value \"(.*?)\" item in dynamic dropdow \"(.*?)\"$")
	public void selectAcountTypeAndInputDeposit(String dataValue, String locator) {
		abtractPageObject.selectDynamicDropdown(dataValue, locator);
	}

	@When("^I get text UserID \"(.*?)\"$")
	public void getTextUserID(String locator) {
		userID = abtractPageObject.getTextDynamicLabel(locator);
	}

	@When("^I get text dynamic label \"(.*?)\"$")
	public void getTextDynamicLabel(String locator) {
		accountID = abtractPageObject.getTextDynamicLabel(locator);
		System.out.println(accountID);
	}

	@When("^I input with variable data \"(.*?)\" to \"(.*?)\" textbox$")
	public void clearAndInputDataDynamicTextbox(Data data, String locator) {
		switch (data) {
		case USERNAMELOGIN:
			abtractPageObject.clearAndInputDataWithDynamicTextbox(RegisterSteps.usernameLogin, locator);
			break;
		case PASSWORDLOGIN:
			abtractPageObject.clearAndInputDataWithDynamicTextbox(RegisterSteps.passwordLogin, locator);
			break;
		case ACCOUNTID:
			abtractPageObject.clearAndInputDataWithDynamicTextbox(accountID, locator);
			break;
		case ACCOUNTIDPAYEE:
			abtractPageObject.clearAndInputDataWithDynamicTextbox(String.valueOf((Integer.parseInt(accountID) - 1)),
					locator);
			break;
		case USERID:
			abtractPageObject.clearAndInputDataWithDynamicTextbox(userID, locator);
			break;
		case DEPOSITADD:
			abtractPageObject.clearAndInputDataWithDynamicTextbox(AddDepositSteps.depositAdd, locator);
			break;
		case MONNEYWITHDRAW:
			abtractPageObject.clearAndInputDataWithDynamicTextbox(monneyWithDraw, locator);
			break;
		case TABKEYS:
			abtractPageObject.clearAndInputKeyWithDynamicTextbox(Keys.TAB, locator);
			break;
		case SPACEKEYS:
			abtractPageObject.clearAndInputKeyWithDynamicTextbox(Keys.SPACE, locator);
			break;
		default:
			break;
		}
	}

	@When("^I input with data \"(.*?)\" to \"(.*?)\" textbox$")
	public void clearAndInputDynamicTextbox(String dataValue, String locator) {
		if (dataValue.equals("randomEmail"))
			abtractPageObject.clearAndInputDataWithDynamicTextbox(dataValue + randomEmail() + "@gmail.com", locator);
		else
			abtractPageObject.clearAndInputDataWithDynamicTextbox(dataValue, locator);
	}

	@When("^I input date of birth with data \"(.*?)\" to \"(.*?)\"$")
	public void inputDynamicTextbox(String dataValue, String locator) {
//		abtractPageObject.removeDateProperty("type");
		abtractPageObject.inputDataWithDynamicTextbox(dataValue, locator);
	}

	@Then("^Verify successfully with message \"(.*?)\"$")
	public void verifyCustomerCreatedSuccessfullyWithMessage(String message) {
		verifyTrue(abtractPageObject.isDynamicElementDisplayed(message));
	}

	@Then("^Verify (?:money transfer|current balance|money after withdraw) is \"(.*?)\"$")
	public void verifyCurrentBalanceAfterTransferMoney(String money) {
		verifyTrue(abtractPageObject.isDynamicLabelDisplayed(money));
	}

	@Given("^I open \"(.*?)\" page$")
	public void iOpenNewDynamicPage(String pageName) {
		switch (pageName) {
		case "New Customer":
			abstractPage.openNewCustomerPage(driver);
			break;
		case "Edit Customer":
			abstractPage.openEditCustomerPage(driver);
			break;
		case "New Account":
			abstractPage.openNewAccountPage(driver);
			break;
		case "Deposit":
			abstractPage.openDepositPage(driver);
			break;
		case "Withdrawal":
			abstractPage.openWithDrawPage(driver);
			break;
		case "Fund Transfer":
			abstractPage.openFundTransferPage(driver);
			break;
		case "Balance Enquiry":
			abstractPage.openBalanceEnquiryPage(driver);
			break;
		}
	}
}
