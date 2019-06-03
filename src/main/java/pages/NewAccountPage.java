package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commons.CommonFuntions;

public class NewAccountPage extends CommonFuntions {

	public NewAccountPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//td[contains(text(),'Current Amount')]/following-sibling::td")
	WebElement CURRENTDEPOSIT_LBL;

	public String getTextDeposit() {
		waitVisible(CURRENTDEPOSIT_LBL);
		return getText(CURRENTDEPOSIT_LBL);
	}

}
