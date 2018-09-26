package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static utils.selenium.SeleniumKeys.DRIVER;
import static utils.selenium.SeleniumKeys.getTimeOut;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class SettingsStartingEndingSteps {

	@Before
	public void beforeScenario() {
//		DRIVER.get(SeleniumReadPropertyKeys.getUrlToHome());
		DRIVER.manage().window().maximize();
		DRIVER.manage().timeouts().implicitlyWait(getTimeOut(), TimeUnit.SECONDS);
	}

	@After
	public void afterScenario(Scenario scenario) {
		if (scenario.isFailed()) {
			byte[] screenshot = ((TakesScreenshot) DRIVER).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png");
		}

		DRIVER.navigate().to("https://www.phptravels.net/account/logout/");
	}
}
