package pages;

import static utils.selenium.SeleniumKeys.DRIVER;
import static utils.selenium.SeleniumWaitMethods.wait3Seconds;

import org.openqa.selenium.By;

import utils.CommonMethods;

public class LoginPage {

	CommonMethods commonMethods = new CommonMethods();

	private final By emailAddressLocator = By.xpath(".//*[@id='loginfrm']//input[@name='username']");
	private final By passwordLocator = By.xpath(".//*[@id='loginfrm']//input[@name='password']");
	private final By myAccountLocator = By.xpath(".//*[@id='li_myaccount']/a");
	private final By loginLocator = By.xpath(".//*[@id='li_myaccount']//a[contains(Text(), 'Login')]");
	private final By submitLoginLocator = By.xpath(".//*[@id='loginfrm']/button");
	private final String defaultLoginErrorMessageLocator = "Invalid Email or Password";
	private By defaultLoginSuccessLocator = null;

	public void clickOnMyAccount() {
		commonMethods.waitElementBeVisibleAndClickable(myAccountLocator);
		DRIVER.findElement(myAccountLocator).click();
	}

	public void clickOnLogin() {
		commonMethods.waitElementBeVisibleAndClickable(loginLocator);
		DRIVER.findElement(loginLocator).click();
	}

	public void fillEmailAddressField(String userLogin) {
		commonMethods.input(emailAddressLocator, userLogin);
	}

	public void fillPasswordField(String userPassword) {
		commonMethods.input(passwordLocator, userPassword);
	}

	public void clickOnSubmitLogin() {
		commonMethods.waitElementBeVisibleAndClickable(submitLoginLocator);
		DRIVER.findElement(submitLoginLocator).click();
	}

	public void accessLoginPage() {
		DRIVER.get("https://www.phptravels.net/login");
	}

	public boolean defaultLoginErrorMessageIsDisplayed() {
		wait3Seconds();
		String sourcePage = DRIVER.getPageSource().toString();
		return sourcePage.contains(defaultLoginErrorMessageLocator);
	}

	public boolean defaultLoginSuccessMessageIsDisplayed(String username) {
		defaultLoginSuccessLocator = By.xpath(".//*[contains(Text(), 'Hi, " + username + "')]");

		commonMethods.waitElementBeVisible(defaultLoginSuccessLocator);
		return DRIVER.findElement(defaultLoginSuccessLocator).isDisplayed();
	}

}