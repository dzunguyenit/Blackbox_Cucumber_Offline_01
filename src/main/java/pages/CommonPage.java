package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import commons.CommonFuntions;
import interfaces.CommonPageUI;

public class CommonPage extends CommonFuntions {
	public CommonPage(WebDriver driver) {
		super(driver);
	}

	public String getTextDynamic(String massage) {
		waitVisible(CommonPageUI.DYNAMIC_MSG, massage);
		return getTextDynamicElement(CommonPageUI.DYNAMIC_MSG, massage);
	}

	public void removeDateProperty(String attribute) {
		waitVisible(CommonPageUI.DYNAMIC_MSG);
		removeAttributeInDOM(CommonPageUI.DYNAMIC_MSG, attribute);
	}

	public boolean isDynamicElementDisplayed(String massage) {
		waitVisible(CommonPageUI.DYNAMIC_MSG, massage);
		return isDisplayed(CommonPageUI.DYNAMIC_MSG, massage);
	}

	public boolean isDynamicLabelDisplayed(String massage) {
		waitVisible(CommonPageUI.DYNAMIC_MSG, massage);
		return isDisplayed(CommonPageUI.DYNAMIC_MSG, massage);
	}

	public void clickDynamicButton(String button) {
		waitVisible(CommonPageUI.DYNAMIC_MSG, button);
		click(CommonPageUI.DYNAMIC_MSG, button);
	}

	public void clearAndInputDataWithDynamicTextbox(String dataValue, String textboxName) {
		waitVisible(CommonPageUI.DYNAMIC_MSG, textboxName);
		clearAndInputDynamicTextbox(CommonPageUI.DYNAMIC_MSG, dataValue, textboxName);
	}

	public void clearAndInputKeyWithDynamicTextbox(Keys key, String textboxName) {
		waitVisible(CommonPageUI.DYNAMIC_MSG, textboxName);
		clearAndInputPressToElementDynamicTextbox(CommonPageUI.DYNAMIC_MSG, key, textboxName);
	}

	public void inputDataWithDynamicTextbox(String dataValue, String textboxName) {
		waitVisible(CommonPageUI.DYNAMIC_MSG, textboxName);
		input(CommonPageUI.DYNAMIC_MSG, dataValue, textboxName);
	}

	public String getTextDynamicLabel(String labelName) {
		waitVisible(CommonPageUI.DYNAMIC_USERID_MSG, labelName);
		return getTextDynamicElement(CommonPageUI.DYNAMIC_USERID_MSG, labelName);
	}

	public void selectDynamicDropdown(String dataValue, String dropdownName) {
		waitVisible(CommonPageUI.DYNAMIC_MSG, dropdownName);
		selectComboboxDynamicDropdown(CommonPageUI.DYNAMIC_MSG, dataValue, dropdownName);
	}

	public void openNewCustomerPage(WebDriver driver) {
		waitVisible(CommonPageUI.DYNAMIC_PAGES, "New Customer");
		click(CommonPageUI.DYNAMIC_PAGES, "New Customer");
	}

	public void openEditCustomerPage(WebDriver driver) {
		waitVisible(CommonPageUI.DYNAMIC_PAGES, "Edit Customer");
		click(CommonPageUI.DYNAMIC_PAGES, "Edit Customer");
	}

	public HomePage openHomePage(WebDriver driver) {
		waitVisible(CommonPageUI.DYNAMIC_PAGES, "Manager");
		click(CommonPageUI.DYNAMIC_PAGES, "Manager");
		return PageFactory.initElements(driver, HomePage.class);
	}

	public NewAccountPage openNewAccountPage(WebDriver driver) {
		waitVisible(CommonPageUI.DYNAMIC_PAGES, "New Account");
		click(CommonPageUI.DYNAMIC_PAGES, "New Account");
		return PageFactory.initElements(driver, NewAccountPage.class);
	}

	public DepositPage openDepositPage(WebDriver driver) {
		waitVisible(CommonPageUI.DYNAMIC_PAGES, "Deposit");
		click(CommonPageUI.DYNAMIC_PAGES, "Deposit");
		return PageFactory.initElements(driver, DepositPage.class);
	}

	public void openWithDrawPage(WebDriver driver) {
		waitVisible(CommonPageUI.DYNAMIC_PAGES, "Withdrawal");
		click(CommonPageUI.DYNAMIC_PAGES, "Withdrawal");
	}

	public void openFundTransferPage(WebDriver driver) {
		waitVisible(CommonPageUI.DYNAMIC_PAGES, "Fund Transfer");
		click(CommonPageUI.DYNAMIC_PAGES, "Fund Transfer");
	}

	public void openBalanceEnquiryPage(WebDriver driver) {
		waitVisible(CommonPageUI.DYNAMIC_PAGES, "Balance Enquiry");
		click(CommonPageUI.DYNAMIC_PAGES, "Balance Enquiry");
	}
}
