package commons;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class CommonFuntions extends BasePage {
	public CommonFuntions(WebDriver driver) {
		super(driver);
	}

	private int timeouts = 20;

	// Web Browser
	protected void openUrl(String url) {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	protected String getTitle(WebDriver driver) {
		return driver.getTitle();
	}

	protected String getCurrentUrl(WebDriver driver) {
		return driver.getCurrentUrl();
	}

	protected String getPageSource(WebDriver driver) {
		return driver.getPageSource();
	}

	protected void backToPage(WebDriver driver) {
		driver.navigate().back();
	}

	protected void forwardToPage(WebDriver driver) {
		driver.navigate().forward();
	}

	protected void refreshPage(WebDriver driver) {
		driver.navigate().refresh();
	}

	protected void waitForIEBrowser(int Timeouts) {
		try {
			Thread.sleep(Timeouts);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// Web Element
	protected void clickToElement(String locator) {
		try {
			WebElement element = driver.findElement(By.xpath(locator));
			element.click();
		} catch (Exception e) {
		}

	}

	protected void clickToElement(String locator, String... value) {
		try {
			String dynamicLocator = String.format(locator, (Object[]) value);
			WebElement element = driver.findElement(By.xpath(dynamicLocator));
			element.click();
		} catch (Exception e) {
		}
	}

	protected String getTextElement(String locator, String... value) {
		String text = null;
		try {
			String dynamicLocator = String.format(locator, (Object[]) value);
			return getTextElement(dynamicLocator);
		} catch (Exception e) {
		}
		return text;
	}

	// Clear and sendkey
	protected void sendKeyToElement(String locator, String value) {
		try {
			WebElement element = driver.findElement(By.xpath(locator));
			element.clear();
			element.sendKeys(value);
		} catch (Exception e) {
		}
	}

	protected void clearElement(String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		element.clear();
	}

	protected void clearAndSendKeyToElementDynamicTextbox(String locator, String text, String... value) {
		try {
			locator = String.format(locator, (Object[]) value);
			WebElement element = driver.findElement(By.xpath(locator));
			element.clear();
			element.sendKeys(text);
		} catch (Exception e) {
		}
	}

	protected void clearAndSendKeyPressToElementDynamicTextbox(String locator, Keys key, String... value) {
		try {
			locator = String.format(locator, (Object[]) value);
			WebElement element = driver.findElement(By.xpath(locator));
			element.clear();
			element.sendKeys(key);
		} catch (Exception e) {
		}
	}

	protected void sendKeyToElementDynamicTextbox(String locator, String text, String... value) {
		try {
			locator = String.format(locator, (Object[]) value);
			WebElement element = driver.findElement(By.xpath(locator));
			element.sendKeys(text);
		} catch (Exception e) {
		}
	}

	protected void sendKeyToElementDonotClear(String locator, String value) {
		try {
			WebElement element = driver.findElement(By.xpath(locator));
			element.sendKeys(value);
		} catch (Exception e) {
		}
	}

	protected void selectItemInDropdown(String locator, String value) {
		try {
			Select element = new Select(driver.findElement(By.xpath(locator)));
			element.selectByVisibleText(value);
		} catch (Exception e) {
		}
	}

	protected void selectItemInDynamicDropdown(String locator, String valueDropdown, String... value) {
		try {
			locator = String.format(locator, (Object[]) value);
			Select element = new Select(driver.findElement(By.xpath(locator)));
			element.selectByVisibleText(valueDropdown);
		} catch (Exception e) {
		}
	}

	protected void selectItemInDropdownSpecial(String locatorDropdown, String locator, String value) {
		try {
			WebElement dropdown = driver.findElement(By.xpath(locatorDropdown));
			dropdown.click();
			List<WebElement> list = driver.findElements(By.xpath(locator));
			for (WebElement element : list) {
				if (element.getText().equalsIgnoreCase(value)) {
					element.click();
					break;
				}
			}
		} catch (Exception e) {
		}

	}

	protected String getFirstItemSelected(String locator) {
		Select element = new Select(driver.findElement(By.xpath(locator)));
		return element.getFirstSelectedOption().getText();
	}

	protected String getAtribute(String locator, String attribute) {
		WebElement element = driver.findElement(By.xpath(locator));
		return element.getAttribute(attribute);
	}

	protected String getTextElement(String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		return element.getText();
	}

	protected String getTextDynamicElement(String locator, String... value) {
		locator = String.format(locator, (Object[]) value);
		WebElement element = driver.findElement(By.xpath(locator));
		return element.getText();
	}

	protected int getSize(String locator) {
		List<WebElement> element = driver.findElements(By.xpath(locator));
		return element.size();
	}

	protected void uncheckTheCheckbox(String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		if (element.isSelected())
			element.click();
	}

	protected boolean isControlDisplayed(String locator, String... value) {
		String dynamicLocator = String.format(locator, (Object[]) value);
		WebElement element = driver.findElement(By.xpath(dynamicLocator));
		return element.isDisplayed();
	}

	protected boolean isControlDisplayed(String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		return element.isDisplayed();
	}

	protected boolean isControlSelected(String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		return element.isSelected();
	}

	protected boolean isControlEnabled(String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		return element.isEnabled();
	}
	// Alert

	protected void acceptAlert(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	protected void cancelAlert(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

	protected String getTextAlert(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		return alert.getText();
	}

	protected void sendKeyAlert(String value) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(value);
	}

	public void switchToWindowByTitle(String title) {
		Set<String> allWindows = driver.getWindowHandles();
		for (String childWindows : allWindows) {
			driver.switchTo().window(childWindows);
			String childTitle = driver.getTitle();
			if (childTitle.equals(title)) {
				break;
			}
		}
	}

	// Bonus
	public boolean closeAllWindowsWithoutParent(String parent) {
		Set<String> allWindows = driver.getWindowHandles();
		for (String childWindows : allWindows) {
			if (!childWindows.equals(parent)) {
				driver.switchTo().window(childWindows);
				driver.close();
			}
		}
		driver.switchTo().window(parent);

		if (driver.getWindowHandles().size() == 1)
			return true;
		else
			return false;
	}

	protected String getWindowParentID(WebDriver driver) {
		String text = null;
		try {
			return driver.getWindowHandle();
		} catch (Exception e) {
		}
		return text;
	}

	// Iframe
	protected void switchToIframe(String locator) {
		try {
			WebElement iframe = driver.findElement(By.xpath(locator));
			driver.switchTo().frame(iframe);
		} catch (Exception e) {
		}
	}

	protected void switchToDefaultContent(WebDriver driver) {
		try {
			driver.switchTo().defaultContent();
		} catch (Exception e) {
		}
	}

	// Actions
	protected void doubleClick(String locator) {
		try {
			WebElement element = driver.findElement(By.xpath(locator));
			Actions action = new Actions(driver);
			action.doubleClick(element).perform();
		} catch (Exception e) {
		}
	}

	protected void hoverMouse(String locator) {
		try {
			WebElement element = driver.findElement(By.xpath(locator));
			Actions action = new Actions(driver);
			action.moveToElement(element).perform();
		} catch (Exception e) {
		}
	}

	protected void hoverMouse(String locator, String... value) {
		String dynamicLocator = String.format(locator, (Object[]) value);
		WebElement element = driver.findElement(By.xpath(dynamicLocator));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}

	protected void rightClick(String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		Actions action = new Actions(driver);
		action.contextClick(element).perform();
	}

	protected void dragAndDrop(String locatorFrom, String locatorTarget) {
		WebElement dragFrom = driver.findElement(By.xpath(locatorFrom));
		WebElement target = driver.findElement(By.xpath(locatorTarget));
		Actions builder = new Actions(driver);
		Action dragAndDropAction = builder.clickAndHold(dragFrom).moveToElement(target).release(target).build();
		dragAndDropAction.perform();
	}

	// Bonus
	protected void clickAndHold(int itemFrom, int itemTarget, String locator) {
		List<WebElement> listItems = driver.findElements(By.xpath(locator));
		Actions action = new Actions(driver);
		action.clickAndHold(listItems.get(itemFrom)).clickAndHold(listItems.get(itemTarget)).click().perform();
		action.release();
	}

	// Key Press
	protected void keyDownElement(String locator, Keys pressKeyDown) {
		WebElement element = driver.findElement(By.xpath(locator));
		Actions action = new Actions(driver);
		action.keyDown(element, pressKeyDown);
	}

	protected void keyUpElement(String locator, Keys pressKeyUp) {
		WebElement element = driver.findElement(By.xpath(locator));
		Actions action = new Actions(driver);
		action.keyUp(element, pressKeyUp);
	}

	protected void sendKeyPress(String locator, Keys key) {
		WebElement element = driver.findElement(By.xpath(locator));
		element.sendKeys(key);
	}

	protected void clearAndSendKeyPress(String locator, Keys key) {
		WebElement element = driver.findElement(By.xpath(locator));
		element.clear();
		element.sendKeys(key);
	}

	// Upload
	protected void uploadFile(String locator, String firePath) {
		WebElement element = driver.findElement(By.xpath(locator));
		element.sendKeys(firePath);
	}

	// Javascript
	protected Object executeJavascriptToBrowser(String javaSript) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js.executeScript(javaSript);
	}

	protected void executeJavascriptToElement(String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}

	protected void executeJavascriptToElement(String locator, String... value) {
		String dynamicLocator = String.format(locator, (Object[]) value);
		WebElement element = driver.findElement(By.xpath(dynamicLocator));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}

	protected void scrollToBottomPage(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}

	protected void scrollToElement(String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	// Bonus
	protected void highlightElement(String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='6px groove red'", element);
	}

	// Bonus
	protected void removeAttributeInDOM(String locator, String attribute) {
		WebElement element = driver.findElement(By.xpath(locator));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].removeAttribute('" + attribute + "');", element);
	}

	// Wait
	protected void waitForControlPresence(String locator) {
		WebDriverWait wait = new WebDriverWait(driver, timeouts);
		By by = By.xpath(locator);
		wait.until(ExpectedConditions.presenceOfElementLocated(by));
	}

	protected void waitForControlVisible(String locator) {
		WebDriverWait wait = new WebDriverWait(driver, timeouts);
		By by = By.xpath(locator);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	protected void waitForIframeVisible(String locator) {
		WebDriverWait wait = new WebDriverWait(driver, timeouts);
		By by = By.xpath(locator);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(by));
	}

	protected void waitForControlVisible(String locator, String... value) {
		String dynamicLocator = String.format(locator, (Object[]) value);
		WebDriverWait wait = new WebDriverWait(driver, timeouts);
		By by = By.xpath(dynamicLocator);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	protected void waitForControlClickable(String locator) {
		WebDriverWait wait = new WebDriverWait(driver, timeouts);
		By by = By.xpath(locator);
		wait.until(ExpectedConditions.elementToBeClickable(by));
	}

	protected void waitForControlInvisible(String locator) {
		WebDriverWait wait = new WebDriverWait(driver, timeouts);
		By by = By.xpath(locator);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
	}

	protected void waitForAlertPresence() {
		WebDriverWait wait = new WebDriverWait(driver, timeouts);
		wait.until(ExpectedConditions.alertIsPresent());
	}

	protected boolean sortElementAcsending(String locator) {
		List<WebElement> list = driver.findElements(By.xpath(locator));
		int length = list.size();
		for (int i = 0; i < length; i++) {
			if (Integer.parseInt(list.get(i).getText()) <= Integer.parseInt(list.get(i + 1).getText())) {
				return true;
			}
		}
		return false;
	}

	protected boolean sortElementDescending(String locator) {
		List<WebElement> list = driver.findElements(By.xpath(locator));
		int length = list.size();
		for (int i = 0; i < length; i++) {
			if (Integer.parseInt(list.get(i).getText()) >= Integer.parseInt(list.get(i + 1).getText())) {
				return true;
			}
		}
		return false;
	}

	protected void swapElement(String locator) {
		List<WebElement> list = driver.findElements(By.xpath(locator));
		int temp;
		int position1 = Integer.parseInt(list.get(0).getText());
		int position2 = Integer.parseInt(list.get(1).getText());
		temp = position1;
		position1 = position2;
		position2 = temp;
	}

	protected boolean verifyEquals(Object actual, Object expected, boolean flag) {
		boolean pass = true;
		if (flag == false) {
			try {
				Assert.assertEquals(actual, expected);
			} catch (Throwable e) {
				pass = false;
				Reporter.getCurrentTestResult().setThrowable(e);
			}
		} else {
			Assert.assertEquals(actual, expected);
		}
		return pass;
	}

	protected boolean verifyEquals(Object actual, Object expected) {
		return verifyEquals(actual, expected, false);
	}

}
