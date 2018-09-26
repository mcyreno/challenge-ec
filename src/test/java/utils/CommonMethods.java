package utils;

import static utils.selenium.SeleniumKeys.DRIVER;
import static utils.selenium.SeleniumWaitMethods.getWaitDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CommonMethods {

	public void waitElementBeVisible(By locator) {
		getWaitDriver().until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public void waitElementBeVisibleAndClickable(By locator) {
		waitElementBeVisible(locator);
		getWaitDriver().until(ExpectedConditions.elementToBeClickable(locator));
	}

	public void input(By locator, String text) {
		waitElementBeVisibleAndClickable(locator);
		DRIVER.findElement(locator).clear();
		DRIVER.findElement(locator).sendKeys(text);
	}
	
	public String getTextOnElement(By locator) {
		waitElementBeVisible(locator);
		return DRIVER.findElement(locator).getText();
	}
}
