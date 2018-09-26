package utils.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaitMethods {

	private static WebDriverWait waitDriver = null;
	private static Wait<WebDriver> waitFluent = null;

	public static void wait3Seconds() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// Do nothing
		}
	}
	
	public static WebDriverWait getWaitDriver() {
		if (waitDriver == null) {
			waitDriver = new WebDriverWait(Selenium.getDriver(), SeleniumKeys.getTimeOut());
		}
		return waitDriver;
	}

	public static Wait<WebDriver> getFluentWait() {
		if (waitFluent == null) {
			waitFluent = new FluentWait<>(Selenium.getDriver()).withTimeout(SeleniumKeys.getTimeOut(), TimeUnit.SECONDS)
					.pollingEvery(1, TimeUnit.SECONDS).ignoring(NoSuchElementException.class)
					.ignoring(StaleElementReferenceException.class);
		}
		return waitFluent;
	}

}
