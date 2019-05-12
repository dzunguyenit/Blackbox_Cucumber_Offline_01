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
		waitForControlVisible(CommonPageUI.DYNAMIC_XPATH, massage);
		return getTextElement(CommonPageUI.DYNAMIC_XPATH, massage);
	}

	public void removeDateProperty(String attribute) {
		waitForControlVisible(CommonPageUI.DYNAMIC_XPATH);
		removeAttributeInDOM(CommonPageUI.DYNAMIC_XPATH, attribute);
	}

	public boolean isDynamicElementDisplayed(String massage) {
		waitForControlVisible(CommonPageUI.DYNAMIC_XPATH, massage);
		return isControlDisplayed(CommonPageUI.DYNAMIC_XPATH, massage);
	}

	public boolean isDynamicLabelDisplayed(String massage) {
		waitForControlVisible(CommonPageUI.DYNAMIC_XPATH, massage);
		return isControlDisplayed(CommonPageUI.DYNAMIC_XPATH, massage);
	}

	public void clickDynamicButton(String button) {
		waitForControlVisible(CommonPageUI.DYNAMIC_XPATH, button);
		clickToElement(CommonPageUI.DYNAMIC_XPATH, button);
	}

	public void clearAndInputDataWithDynamicTextbox(String dataValue, String textboxName) {
		waitForControlVisible(CommonPageUI.DYNAMIC_XPATH, textboxName);
		clearAndSendKeyToElementDynamicTextbox(CommonPageUI.DYNAMIC_XPATH, dataValue, textboxName);
	}

	public void clearAndInputKeyWithDynamicTextbox(Keys key, String textboxName) {
		waitForControlVisible(CommonPageUI.DYNAMIC_XPATH, textboxName);
		clearAndSendKeyPressToElementDynamicTextbox(CommonPageUI.DYNAMIC_XPATH, key, textboxName);
	}

	public void inputDataWithDynamicTextbox(String dataValue, String textboxName) {
		waitForControlVisible(CommonPageUI.DYNAMIC_XPATH, textboxName);
		sendKeyToElementDynamicTextbox(CommonPageUI.DYNAMIC_XPATH, dataValue, textboxName);
	}

	public String getTextDynamicLabel(String labelName) {
		waitForControlVisible(CommonPageUI.DYNAMIC_XPATH, labelName);
		return getTextDynamicElement(CommonPageUI.DYNAMIC_XPATH, labelName);
	}

	public void selectDynamicDropdown(String dataValue, String dropdownName) {
		waitForControlVisible(CommonPageUI.DYNAMIC_XPATH, dropdownName);
		selectItemInDynamicDropdown(CommonPageUI.DYNAMIC_XPATH, dataValue, dropdownName);
	}

}
