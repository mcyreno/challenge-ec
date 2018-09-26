package pages;

import static utils.selenium.SeleniumKeys.DRIVER;

import org.openqa.selenium.By;

import utils.CommonMethods;

public class MyAccountPage {

	CommonMethods commonMethods = new CommonMethods();
	
	/**
	 * This page dont loaded, then when it be implemented
	 * put a xpath of each element here
	 */

	private final By EmailLocator = By.xpath("");
	private final By PasswordLocator = By.xpath("");
	private final By HotelNameLocator = By.xpath("");
	private final By InvoiceDateLocator = By.xpath("");
	private final By DueDateLocator = By.xpath("");
	private final By InvoiceNumberLocator = By.xpath("");
	private final By BookingCodeLocator = By.xpath("");
	private final By CustomerDetailsLocator = By.xpath("");
	private final By RoomLocator = By.xpath("");
	private final By CheckInLocator = By.xpath("");
	private final By CheckOutLocator = By.xpath("");
	private final By TotalStayLocator = By.xpath("");
	private final By DepositNowLocator = By.xpath("");
	private final By TaxVATLocator = By.xpath("");
	private final By TotalAmountLocator = By.xpath("");
	private final By InvoiceButtonLocator = By.xpath("");

	public void clickOnInvoiceButton() {
		commonMethods.waitElementBeVisibleAndClickable(InvoiceButtonLocator);
		DRIVER.findElement(InvoiceButtonLocator).click();
	}

	public String getEmail() {
		return commonMethods.getTextOnElement(EmailLocator);
	}

	public String getPassword() {
		return commonMethods.getTextOnElement(PasswordLocator);
	}

	public String getHotelName() {
		return commonMethods.getTextOnElement(HotelNameLocator);
	}

	public String getInvoiceDate() {
		return commonMethods.getTextOnElement(InvoiceDateLocator);
	}

	public String getDueDate() {
		return commonMethods.getTextOnElement(DueDateLocator);
	}

	public String getInvoiceNumber() {
		return commonMethods.getTextOnElement(InvoiceNumberLocator);
	}

	public String getBookingCode() {
		return commonMethods.getTextOnElement(BookingCodeLocator);
	}

	public String getCustomerDetails() {
		return commonMethods.getTextOnElement(CustomerDetailsLocator);
	}

	public String getRoom() {
		return commonMethods.getTextOnElement(RoomLocator);
	}

	public String getCheckIn() {
		return commonMethods.getTextOnElement(CheckInLocator);
	}

	public String getCheckOut() {
		return commonMethods.getTextOnElement(CheckOutLocator);
	}

	public String getTotalStay() {
		return commonMethods.getTextOnElement(TotalStayLocator);
	}

	public String getDepositNow() {
		return commonMethods.getTextOnElement(DepositNowLocator);
	}

	public String getTaxVAT() {
		return commonMethods.getTextOnElement(TaxVATLocator);
	}

	public String getTotalAmount() {
		return commonMethods.getTextOnElement(TotalAmountLocator);
	}
}