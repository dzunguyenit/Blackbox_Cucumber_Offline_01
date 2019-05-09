package stepDefinitions;

import org.openqa.selenium.WebDriver;

import commons.AbstractTest;
import cucumber.api.java.en.Then;
import cucumberOption.WebDriverManager;
import pages.DepositPage;
import pages.PageManagement;

public class AddDepositSteps extends AbstractTest {
	private DepositPage depositPage;
	WebDriver driver;
	public static final String depositAdd = "5000";
	public static int depositInit;
	public static int sumDeposit;

	public AddDepositSteps() {
		driver = WebDriverManager.openBrowser();
		depositPage = PageManagement.getDepositPage(driver);
	}

	@Then("^Verify Current balance is \"(.*?)\"$")
	public void verifyCurrentBalance(String depositMoney) {
		sumDeposit = CreateAccountSteps.depositInit + Integer.parseInt(depositAdd);
		verifyTrue(depositPage.checkCurrentBalance(depositMoney));
	}
}
