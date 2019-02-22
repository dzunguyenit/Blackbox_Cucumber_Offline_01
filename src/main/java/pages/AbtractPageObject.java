package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import commons.CommonFuntions;
import interfaces.AbstractPageUI;

public class AbtractPageObject extends CommonFuntions {
	public AbtractPageObject(WebDriver driver) {
		super(driver);
	}

	public String getTextDynamicElement(String massage) {
		waitForControlVisible(AbstractPageUI.DYNAMIC_XPATH, massage);
		return getTextElement(AbstractPageUI.DYNAMIC_XPATH, massage);
	}

	public void removeDateProperty(String attribute) {
		waitForControlVisible(AbstractPageUI.DYNAMIC_XPATH);
		removeAttributeInDOM(AbstractPageUI.DYNAMIC_XPATH, attribute);
	}

	public boolean isDynamicElementDisplayed(String massage) {
		waitForControlVisible(AbstractPageUI.DYNAMIC_XPATH, massage);
		return isControlDisplayed(AbstractPageUI.DYNAMIC_XPATH, massage);
	}

	public boolean isDynamicLabelDisplayed(String massage) {
		waitForControlVisible(AbstractPageUI.DYNAMIC_XPATH, massage);
		return isControlDisplayed(AbstractPageUI.DYNAMIC_XPATH, massage);
	}

	public void clickDynamicButton(String button) {
		waitForControlVisible(AbstractPageUI.DYNAMIC_XPATH, button);
		clickToElement(AbstractPageUI.DYNAMIC_XPATH, button);
	}

	public void clearAndInputDataWithDynamicTextbox(String dataValue, String textboxName) {
		waitForControlVisible(AbstractPageUI.DYNAMIC_XPATH, textboxName);
		clearAndSendKeyToElementDynamicTextbox(AbstractPageUI.DYNAMIC_XPATH, dataValue, textboxName);
	}

	public void clearAndInputKeyWithDynamicTextbox(Keys key, String textboxName) {
		waitForControlVisible(AbstractPageUI.DYNAMIC_XPATH, textboxName);
		clearAndSendKeyPressToElementDynamicTextbox(AbstractPageUI.DYNAMIC_XPATH, key, textboxName);
	}

	public void inputDataWithDynamicTextbox(String dataValue, String textboxName) {
		waitForControlVisible(AbstractPageUI.DYNAMIC_XPATH, textboxName);
		sendKeyToElementDynamicTextbox(AbstractPageUI.DYNAMIC_XPATH, dataValue, textboxName);
	}

	public String getTextDynamicLabel(String labelName) {
		waitForControlVisible(AbstractPageUI.DYNAMIC_XPATH, labelName);
		return getTextDynamicElement(AbstractPageUI.DYNAMIC_XPATH, labelName);
	}

	public void selectDynamicDropdown(String dataValue, String dropdownName) {
		waitForControlVisible(AbstractPageUI.DYNAMIC_XPATH, dropdownName);
		selectItemInDynamicDropdown(AbstractPageUI.DYNAMIC_XPATH, dataValue, dropdownName);
	}

}
