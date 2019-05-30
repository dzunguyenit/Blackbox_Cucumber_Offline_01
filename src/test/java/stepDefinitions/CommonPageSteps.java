package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import commons.CommonTestCase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CommonPage;

public class CommonPageSteps extends CommonTestCase {
	WebDriver driver;
	public static String accountID;
	public static String userID;
	public static final String monneyWithDraw = "15000";
	CommonPage commonPage;

	public CommonPageSteps() {
		driver = CommonTestCase.driver;
		commonPage = PageFactory.initElements(driver, CommonPage.class);
	}

	@When("^I click to \"(.*?)\" button$")
	public void i_click_to_dynamic_button_and_navigate_to_homepage(String button) {
		commonPage.click(button);
	}

	@When("^I get text UserID$")
	public void getTextUserID() {
		userID = commonPage.getUserID();
	}

	@When("^I get text dynamic label \"(.*?)\"$")
	public void getTextDynamicLabel(String locator) {
		accountID = commonPage.getTextDynamic(locator);
		System.out.println(accountID);
	}

	@Then("^Verify successfully with message \"(.*?)\"$")
	public void verifyCustomerCreatedSuccessfullyWithMessage(String message) {
		verifyTrue(commonPage.isDynamicElementDisplayed(message));
	}

	@Then("^Close browser$")
	public void closebrowser() {
		CommonTestCase.closeBrowser();
	}

//	@Then("^Verify (?:money transfer|current balance|money after withdraw) is \"(.*?)\"$")
//	public void verifyCurrentBalanceAfterTransferMoney(String money) {
//		verifyTrue(commonPage.isDynamicLabelDisplayed(money));
//	}

	@Given("^I open \"(.*?)\" page$")
	public void iOpenNewDynamicPage(String pageName) {
		switch (pageName) {
		case "New Customer":
			commonPage.openNewCustomerPage(pageName);
			break;
		case "Edit Customer":
			commonPage.openEditCustomerPage(pageName);
			break;
		}
	}
}
