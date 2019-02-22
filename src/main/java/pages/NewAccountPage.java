package pages;

import org.openqa.selenium.WebDriver;

import commons.CommonFuntions;
import interfaces.AccountUI;

public class NewAccountPage extends CommonFuntions {

	public NewAccountPage(WebDriver driver) {
		super(driver);
	}

	public String getTextDeposit() {
		waitForControlVisible(AccountUI.CURRENTDEPOSIT_LBL);
		return getTextElement(AccountUI.CURRENTDEPOSIT_LBL);
	}

}
