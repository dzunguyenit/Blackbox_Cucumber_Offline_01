package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import interfaces.AbstractPageUI;

public class AbtractPageObject extends AbstractPage {
	WebDriver driver;

	public AbtractPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public String getTextDynamicElement(String massage) {
		waitForControlVisible(driver, AbstractPageUI.DYNAMIC_XPATH, massage);
		return getTextElement(driver, AbstractPageUI.DYNAMIC_XPATH, massage);
	}

	public void removeDateProperty(String attribute) {
		waitForControlVisible(driver, AbstractPageUI.DYNAMIC_XPATH);
		removeAttributeInDOM(driver, AbstractPageUI.DYNAMIC_XPATH, attribute);
	}

	public boolean isDynamicElementDisplayed(String massage) {
		waitForControlVisible(driver, AbstractPageUI.DYNAMIC_XPATH, massage);
		return isControlDisplayed(driver, AbstractPageUI.DYNAMIC_XPATH, massage);
	}

	public boolean isDynamicLabelDisplayed(String massage) {
		waitForControlVisible(driver, AbstractPageUI.DYNAMIC_XPATH, massage);
		return isControlDisplayed(driver, AbstractPageUI.DYNAMIC_XPATH, massage);
	}

	public void clickDynamicButton(String button) {
		waitForControlVisible(driver, AbstractPageUI.DYNAMIC_XPATH, button);
		clickToElement(driver, AbstractPageUI.DYNAMIC_XPATH, button);
	}

	public void clearAndInputDataWithDynamicTextbox(String dataValue, String textboxName) {
		waitForControlVisible(driver, AbstractPageUI.DYNAMIC_XPATH, textboxName);
		clearAndSendKeyToElementDynamicTextbox(driver, AbstractPageUI.DYNAMIC_XPATH, dataValue, textboxName);
	}

	public void clearAndInputKeyWithDynamicTextbox(Keys key, String textboxName) {
		waitForControlVisible(driver, AbstractPageUI.DYNAMIC_XPATH, textboxName);
		clearAndSendKeyPressToElementDynamicTextbox(driver, AbstractPageUI.DYNAMIC_XPATH, key, textboxName);
	}

	public void inputDataWithDynamicTextbox(String dataValue, String textboxName) {
		waitForControlVisible(driver, AbstractPageUI.DYNAMIC_XPATH, textboxName);
		sendKeyToElementDynamicTextbox(driver, AbstractPageUI.DYNAMIC_XPATH, dataValue, textboxName);
	}

	public String getTextDynamicLabel(String labelName) {
		waitForControlVisible(driver, AbstractPageUI.DYNAMIC_XPATH, labelName);
		return getTextDynamicElement(driver, AbstractPageUI.DYNAMIC_XPATH, labelName);
	}

	public void selectDynamicDropdown(String dataValue, String dropdownName) {
		waitForControlVisible(driver, AbstractPageUI.DYNAMIC_XPATH, dropdownName);
		selectItemInDynamicDropdown(driver, AbstractPageUI.DYNAMIC_XPATH, dataValue, dropdownName);
	}

}
