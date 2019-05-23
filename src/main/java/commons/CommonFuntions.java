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
	protected void click(String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		element.click();
	}

	protected void click(String locator, String... value) {
		String dynamicLocator = String.format(locator, (Object[]) value);
		WebElement element = driver.findElement(By.xpath(dynamicLocator));
		element.click();
	}

	// Clear and sendkey
	protected void input(String locator, String value) {
		WebElement element = driver.findElement(By.xpath(locator));
		element.clear();
		element.sendKeys(value);
	}

	protected void clearElement(String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		element.clear();
	}

	protected void clearAndInputDynamicTextbox(String locator, String text, String... value) {
		locator = String.format(locator, (Object[]) value);
		WebElement element = driver.findElement(By.xpath(locator));
		element.clear();
		element.sendKeys(text);
	}

	protected void clearAndInputPressToElementDynamicTextbox(String locator, Keys key, String... value) {
		locator = String.format(locator, (Object[]) value);
		WebElement element = driver.findElement(By.xpath(locator));
		element.clear();
		element.sendKeys(key);
	}

	protected void input(String locator, String text, String... value) {
		locator = String.format(locator, (Object[]) value);
		WebElement element = driver.findElement(By.xpath(locator));
		element.sendKeys(text);
	}

	protected void inputDonotClear(String locator, String value) {
		WebElement element = driver.findElement(By.xpath(locator));
		element.sendKeys(value);
	}

	protected void selectComboboxByVisibleText(String locator, String value) {
		Select element = new Select(driver.findElement(By.xpath(locator)));
		element.selectByVisibleText(value);
	}

	protected void selectComboboxDynamicDropdown(String locator, String valueDropdown, String... value) {
		locator = String.format(locator, (Object[]) value);
		Select element = new Select(driver.findElement(By.xpath(locator)));
		element.selectByVisibleText(valueDropdown);
	}

	protected void selectComboboxSpecial(String locatorDropdown, String locator, String value) {
		WebElement dropdown = driver.findElement(By.xpath(locatorDropdown));
		dropdown.click();
		List<WebElement> list = driver.findElements(By.xpath(locator));
		for (WebElement element : list) {
			if (element.getText().equalsIgnoreCase(value)) {
				element.click();
				break;
			}
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

	protected String getText(String locator) {
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

	protected boolean isDisplayed(String locator, String... value) {
		String dynamicLocator = String.format(locator, (Object[]) value);
		WebElement element = driver.findElement(By.xpath(dynamicLocator));
		return element.isDisplayed();
	}

	protected boolean isDisplayed(String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		return element.isDisplayed();
	}

	public boolean checkElementDisplayed(String locator) {
		Boolean isPresent = driver.findElements(By.xpath(locator)).size() > 0;
		return isPresent;
	}

	protected boolean isSelected(String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		return element.isSelected();
	}

	protected boolean isEnabled(String locator) {
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

	protected void inputAlert(String value) {
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

	protected String getWindow(WebDriver driver) {
		return driver.getWindowHandle();
	}

	// Iframe
	protected void switchIframe(String locator) {
		WebElement iframe = driver.findElement(By.xpath(locator));
		driver.switchTo().frame(iframe);
	}

	protected void switchDefaultContent(WebDriver driver) {
		driver.switchTo().defaultContent();
	}

	// Actions
	protected void doubleClick(String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		Actions action = new Actions(driver);
		action.doubleClick(element).perform();
	}

	protected void hoverMouse(String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
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
	protected void keyDown(String locator, Keys pressKeyDown) {
		WebElement element = driver.findElement(By.xpath(locator));
		Actions action = new Actions(driver);
		action.keyDown(element, pressKeyDown);
	}

	protected void keyUp(String locator, Keys pressKeyUp) {
		WebElement element = driver.findElement(By.xpath(locator));
		Actions action = new Actions(driver);
		action.keyUp(element, pressKeyUp);
	}

	protected void inputKeyPress(String locator, Keys key) {
		WebElement element = driver.findElement(By.xpath(locator));
		element.sendKeys(key);
	}

	protected void clearAndInputKeyPress(String locator, Keys key) {
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
	protected Object executeScriptToBrowser(String javaSript) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js.executeScript(javaSript);
	}

	protected void executeScriptToElement(String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}

	protected void executeScriptToElement(String locator, String... value) {
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
	protected void waitPresence(String locator) {
		WebDriverWait wait = new WebDriverWait(driver, timeouts);
		By by = By.xpath(locator);
		wait.until(ExpectedConditions.presenceOfElementLocated(by));
	}

	protected void waitVisible(String locator) {
		WebDriverWait wait = new WebDriverWait(driver, timeouts);
		By by = By.xpath(locator);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	protected void waitIframeVisible(String locator) {
		WebDriverWait wait = new WebDriverWait(driver, timeouts);
		By by = By.xpath(locator);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(by));
	}

	protected void waitVisible(String locator, String... value) {
		String dynamicLocator = String.format(locator, (Object[]) value);
		WebDriverWait wait = new WebDriverWait(driver, timeouts);
		By by = By.xpath(dynamicLocator);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	protected void waitClickable(String locator) {
		WebDriverWait wait = new WebDriverWait(driver, timeouts);
		By by = By.xpath(locator);
		wait.until(ExpectedConditions.elementToBeClickable(by));
	}

	protected void waitInvisible(String locator) {
		WebDriverWait wait = new WebDriverWait(driver, timeouts);
		By by = By.xpath(locator);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
	}

	protected void waitAlertPresence() {
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

}
