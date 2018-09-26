package utils.selenium;

import java.io.File;

import org.openqa.selenium.WebDriver;

public class SeleniumKeys {

	public static final WebDriver DRIVER = Selenium.getDriver();

	private static int TIME_OUT;

	private static String PLATFORM_NAME = null;
	private static String CHROMEDRIVER_PATH = null;

	//Set the test time-out
	public static int getTimeOut() {
		TIME_OUT = 10;
		return TIME_OUT;
	}

	//set the defaultGCHeadless to user the Google Chrome Headless
	//set the defaultGC to user the Google Chrome
	public static String getDefaultPlatformName() {
		PLATFORM_NAME = "defaultGC";
		return PLATFORM_NAME;
	}

	public static String getChromeDriverPath() {
		String localPropertiesFile;
		if (System.getProperty("os.name").toLowerCase().contains("windows")) {
			localPropertiesFile = "/SeleniumDriver/chromedriver.exe";
		} else {
			localPropertiesFile = "/SeleniumDriver/chromedriver";
		}

		File localFile = new File(getProjectPath() + localPropertiesFile);

		if (localFile.exists()) {
			CHROMEDRIVER_PATH = getProjectPath() + localPropertiesFile;
		} else {
			System.out.println("Please download the Chrome Driver");
		}

		return CHROMEDRIVER_PATH;
	}

	private static String getProjectPath() {
		String projectPath = System.getProperty("user.dir");
		return projectPath;
	}
}
