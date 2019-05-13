package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import commons.CommonFuntions;
import interfaces.CommonPageUI;

public class CommonPage extends CommonFuntions {
	public CommonPage(WebDriver driver) {
		super(driver);
	}

	public String getTextDynamicElement(String massage) {
		waitForControlVisible(CommonPageUI.DYNAMIC_MSG, massage);
		return getTextElement(CommonPageUI.DYNAMIC_MSG, massage);
	}

	public void removeDateProperty(String attribute) {
		waitForControlVisible(CommonPageUI.DYNAMIC_MSG);
		removeAttributeInDOM(CommonPageUI.DYNAMIC_MSG, attribute);
	}

	public boolean isDynamicElementDisplayed(String massage) {
		waitForControlVisible(CommonPageUI.DYNAMIC_MSG, massage);
		return isControlDisplayed(CommonPageUI.DYNAMIC_MSG, massage);
	}

	public boolean isDynamicLabelDisplayed(String massage) {
		waitForControlVisible(CommonPageUI.DYNAMIC_MSG, massage);
		return isControlDisplayed(CommonPageUI.DYNAMIC_MSG, massage);
	}

	public void clickDynamicButton(String button) {
		waitForControlVisible(CommonPageUI.DYNAMIC_MSG, button);
		clickToElement(CommonPageUI.DYNAMIC_MSG, button);
	}

	public void clearAndInputDataWithDynamicTextbox(String dataValue, String textboxName) {
		waitForControlVisible(CommonPageUI.DYNAMIC_MSG, textboxName);
		clearAndSendKeyToElementDynamicTextbox(CommonPageUI.DYNAMIC_MSG, dataValue, textboxName);
	}

	public void clearAndInputKeyWithDynamicTextbox(Keys key, String textboxName) {
		waitForControlVisible(CommonPageUI.DYNAMIC_MSG, textboxName);
		clearAndSendKeyPressToElementDynamicTextbox(CommonPageUI.DYNAMIC_MSG, key, textboxName);
	}

	public void inputDataWithDynamicTextbox(String dataValue, String textboxName) {
		waitForControlVisible(CommonPageUI.DYNAMIC_MSG, textboxName);
		sendKeyToElementDynamicTextbox(CommonPageUI.DYNAMIC_MSG, dataValue, textboxName);
	}

	public String getTextDynamicLabel(String labelName) {
		waitForControlVisible(CommonPageUI.DYNAMIC_USERID_MSG, labelName);
		return getTextDynamicElement(CommonPageUI.DYNAMIC_USERID_MSG, labelName);
	}

	public void selectDynamicDropdown(String dataValue, String dropdownName) {
		waitForControlVisible(CommonPageUI.DYNAMIC_MSG, dropdownName);
		selectItemInDynamicDropdown(CommonPageUI.DYNAMIC_MSG, dataValue, dropdownName);
	}

	public void openNewCustomerPage(WebDriver driver) {
		waitForControlVisible(CommonPageUI.DYNAMIC_PAGES, "New Customer");
		clickToElement(CommonPageUI.DYNAMIC_PAGES, "New Customer");
	}

	public void openEditCustomerPage(WebDriver driver) {
		waitForControlVisible(CommonPageUI.DYNAMIC_PAGES, "Edit Customer");
		clickToElement(CommonPageUI.DYNAMIC_PAGES, "Edit Customer");
	}

	public HomePage openHomePage(WebDriver driver) {
		waitForControlVisible(CommonPageUI.DYNAMIC_PAGES, "Manager");
		clickToElement(CommonPageUI.DYNAMIC_PAGES, "Manager");
		return PageManagement.getHomePage(driver);
	}

	public NewAccountPage openNewAccountPage(WebDriver driver) {
		waitForControlVisible(CommonPageUI.DYNAMIC_PAGES, "New Account");
		clickToElement(CommonPageUI.DYNAMIC_PAGES, "New Account");
		return PageManagement.getNewAccountPage(driver);
	}

	public DepositPage openDepositPage(WebDriver driver) {
		waitForControlVisible(CommonPageUI.DYNAMIC_PAGES, "Deposit");
		clickToElement(CommonPageUI.DYNAMIC_PAGES, "Deposit");
		return PageManagement.getDepositPage(driver);
	}

	public void openWithDrawPage(WebDriver driver) {
		waitForControlVisible(CommonPageUI.DYNAMIC_PAGES, "Withdrawal");
		clickToElement(CommonPageUI.DYNAMIC_PAGES, "Withdrawal");
	}

	public void openFundTransferPage(WebDriver driver) {
		waitForControlVisible(CommonPageUI.DYNAMIC_PAGES, "Fund Transfer");
		clickToElement(CommonPageUI.DYNAMIC_PAGES, "Fund Transfer");
	}

	public void openBalanceEnquiryPage(WebDriver driver) {
		waitForControlVisible(CommonPageUI.DYNAMIC_PAGES, "Balance Enquiry");
		clickToElement(CommonPageUI.DYNAMIC_PAGES, "Balance Enquiry");
	}
}
