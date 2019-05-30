package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commons.CommonFuntions;

public class HomePage extends CommonFuntions {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[contains(text(),'here')]")
	WebElement HERE_LINK;

	public RegisterPage clickHereLink() {
		waitVisible(HERE_LINK);
		click(HERE_LINK);
		return new RegisterPage(driver);
	}

}
