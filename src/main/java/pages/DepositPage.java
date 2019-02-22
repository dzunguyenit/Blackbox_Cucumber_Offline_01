package pages;

import org.openqa.selenium.WebDriver;

import commons.CommonFuntions;
import interfaces.DepositUI;

public class DepositPage extends CommonFuntions {

	public DepositPage(WebDriver driver) {
		super(driver);
	}

	public Boolean checkCurrentBalance(String currentBalance) {
		waitForControlVisible(DepositUI.CURRENTDEPOSIT_LBL, currentBalance);
		return isControlDisplayed(DepositUI.CURRENTDEPOSIT_LBL, currentBalance);
	}

}
