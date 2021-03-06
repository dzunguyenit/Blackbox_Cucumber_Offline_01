package commons;

import java.sql.Timestamp;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import config.Browser;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;

public class CommonTestCase {
	private static WebDriver driver;

	public static WebDriver openBrowser() {
//		String browser = System.getProperty("browser");
//		String version = System.getProperty("version");
//		String url = System.getProperty("url");
		String browser = Browser.CHROME.getBrowser();
		String version = "88.0.4324.96";
		String url = "http://demo.guru99.com/v4/";
		if (browser.equals("chrome")) {
			ChromeDriverManager.getInstance().version(version).setup();
			setDriver(new ChromeDriver());
		} else if (browser.equals("firefox")) {
			FirefoxDriverManager.getInstance().version(version).setup();
			setDriver(new FirefoxDriver());
		}
		getDriver().get(url);
		getDriver().manage().window().maximize();

		return getDriver();
	}

	public static void closeBrowser() {
		getDriver().quit();
	}

	public static String randomUniqueNumber() {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		Long ExtentEmail = timestamp.getTime();
		return ExtentEmail.toString();
	}

	public static String randomEmail() {
		Random rand = new Random();
		int n = rand.nextInt(9999999);
		return String.valueOf(n);
	}

	public void verifyEqual(String actual, String expected) {
		Assert.assertEquals(actual, expected);
	}

	public void verifyTrue(Boolean condition) {
		Assert.assertTrue(condition);
	}

	public void verifyFalse(Boolean condition) {
		Assert.assertFalse(condition);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		CommonTestCase.driver = driver;
	}

}