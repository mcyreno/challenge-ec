package utils.selenium;

import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public final class Selenium {

	private static WebDriver driver = null;

	private static String ChromeDriver_Path = SeleniumKeys.getChromeDriverPath();
	private static String configurationErrorMessage = null;

	public static WebDriver getDriver() {
		if (driver == null) {
			initDriver();
		}
		return driver;

	}

	private static void initDriver() {
		switch (SeleniumKeys.getDefaultPlatformName()) {
		case "defaultGC":
			configureDefaultGC();
			break;

		case "defaultGCHeadless":
			configureDefaultGCHeadless();
			break;

		default:
			break;
		}
	}

	private static void configureDefaultGC() {
		if (chromeDriverWasConfigured() == true) {
			System.setProperty("webdriver.chrome.driver", ChromeDriver_Path);

			HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
			chromePrefs.put("profile.default_content_settings.popups", 0);
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", chromePrefs);
			DesiredCapabilities cap = DesiredCapabilities.chrome();
			cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			cap.setCapability(ChromeOptions.CAPABILITY, options);

			driver = new ChromeDriver(cap);
		} else {
			System.out.println(configurationErrorMessage);
		}
	}

	private static void configureDefaultGCHeadless() {
		if (chromeDriverWasConfigured() == true) {
			ChromeOptions chromeOptions = new ChromeOptions();
			System.setProperty("webdriver.chrome.driver", ChromeDriver_Path);
			chromeOptions.addArguments("--headless");
			driver = new ChromeDriver(chromeOptions);
		} else {
			System.out.println(configurationErrorMessage);
		}
	}

	public static void quit() {
		driver.quit();
		driver = null;
	}

	private static boolean chromeDriverWasConfigured() {
		File chromeDriverFile = new File(ChromeDriver_Path);
		if (chromeDriverFile.exists() == true && chromeDriverFile.canExecute() == true) {
			configurationErrorMessage = "The chromedriver was configured correctly";
			return true;
		} else {
			configurationErrorMessage = "The chromedriver should be configured in '" + ChromeDriver_Path;
			return false;
		}
	}

}