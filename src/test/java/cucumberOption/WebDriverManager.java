package cucumberOption;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class WebDriverManager {

	public static WebDriver driver;

	public static WebDriver openBrowser() {
//		String browser = System.getProperty("BROWSER");
//		String version = System.getProperty("VERSION");
//		String url = System.getProperty("URL");
//		String browser = "chrome";
		String version = "2.46";
		String url = "http://demo.guru99.com/v4/";
		ChromeDriverManager.getInstance().version(version).setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}

	public static void closeBrowser() {
		driver.quit();
	}
}