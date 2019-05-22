package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import commons.CommonTestCase;
import cucumber.api.java.en.Then;
import pages.DepositPage;

public class AddDepositSteps extends CommonTestCase {
	DepositPage depositPage;
	WebDriver driver;
	public static final String depositAdd = "5000";
	public static int depositInit;
	public static int sumDeposit;

	public AddDepositSteps() {
		driver = CommonTestCase.driver;
		depositPage = PageFactory.initElements(driver, DepositPage.class);
	}

	@Then("^Verify Current balance is \"(.*?)\"$")
	public void verifyCurrentBalance(String depositMoney) {
		sumDeposit = CreateAccountSteps.depositInit + Integer.parseInt(depositAdd);
		verifyTrue(depositPage.checkCurrentBalance(depositMoney));
	}
}
