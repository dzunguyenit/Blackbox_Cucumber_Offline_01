package cucumberOption;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;

public class WebDriverManager {

	public static WebDriver driver;

	public static WebDriver openBrowser() {
//		String browser = System.getProperty("BROWSER");
//		String version = System.getProperty("VERSION");
//		String url = System.getProperty("URL");
		String browser = "chrome";
		String version = "2.46";
		String url = "http://demo.guru99.com/v4/";
		if (driver == null) {
			try {
				switch (browser) {
				case "chrome":
					ChromeDriverManager.getInstance().version(version).setup();
					driver = new ChromeDriver();
					break;
				case "firefox":
					FirefoxDriverManager.getInstance().version(version).setup();
					driver = new FirefoxDriver();
					break;
				case "ie":
					InternetExplorerDriverManager.getInstance().version(version).setup();
					driver = new InternetExplorerDriver();
					break;
				default:
					ChromeDriverManager.getInstance().version(version).setup();
					driver = new ChromeDriver();
				}

			} catch (WebDriverException e) {
				ChromeDriverManager.getInstance().version(version).setup();
				driver = new ChromeDriver();
			} finally {
				Runtime.getRuntime().addShutdownHook(new Thread() {
					public void run() {
						driver.quit();
					}
				});
			}
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}

		return driver;
	}

}