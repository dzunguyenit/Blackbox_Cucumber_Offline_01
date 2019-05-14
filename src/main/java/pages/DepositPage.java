package pages;

import org.openqa.selenium.WebDriver;

import commons.CommonFuntions;
import interfaces.DepositUI;

public class DepositPage extends CommonFuntions {

	public DepositPage(WebDriver driver) {
		super(driver);
	}

	public Boolean checkCurrentBalance(String currentBalance) {
		waitVisible(DepositUI.CURRENTDEPOSIT_LBL, currentBalance);
		return isDisplayed(DepositUI.CURRENTDEPOSIT_LBL, currentBalance);
	}

}
