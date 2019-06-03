package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commons.CommonFuntions;

public class CommonPage extends CommonFuntions {
	public CommonPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//*[contains(text(),'Customer ID')]//following-sibling::td")
	WebElement CUSTOMER_ID_LBL;

	@FindBy(name = "name")
	WebElement CUSTOMERNAME_TXT;

	public String getDynamicMesage(String value) {
		waitVisibleDynamic(value);
		return getTextDynamic(value);
	}

	public void clickDynamic(String value) {
		waitVisibleDynamic(value);
		click(value);
	}

	public boolean isDynamicElementDisplay(String massage) {
		waitVisibleDynamic(massage);
		return isDynamicElementDisplayed(massage);
	}

	public void openNewCustomerPage(String value) {
		waitVisibleDynamic(value);
		click(value);
	}

	public void openEditCustomerPage(String value) {
		waitVisibleDynamic(value);
		click(value);
	}

	public String getUserID() {
		waitVisible(CUSTOMER_ID_LBL);
		return getText(CUSTOMER_ID_LBL);
	}
}
