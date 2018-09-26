package steps;

import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.MyAccountPage;

public class InvoiceStepDefinitions {

	MyAccountPage myAccountPage = new MyAccountPage();

	@Given("^Click on Invoice button$")
	public void click_on_invoice_button() {
		myAccountPage.clickOnInvoiceButton();
	}

	@Then("^All data will appear (-?[^\"]*), (-?[^\"]*), (-?[^\"]*), (-?[^\"]*), (-?[^\"]*), (-?[^\"]*), (-?[^\"]*), (-?[^\"]*), (-?[^\"]*), (-?[^\"]*), (-?[^\"]*), (-?[^\"]*), (-?[^\"]*), (-?[^\"]*), (-?[^\"]*)$")
	public void allDataWillAppear(String Email, String Password, String HotelName, String InvoiceDate, String DueDate,
			String InvoiceNumber, String BookingCode, String CustomerDetails, String Room, String CheckIn,
			String CheckOut, String TotalStay, String DepositNow, String TaxVAT, String TotalAmount) {
		
		assertTrue(myAccountPage.getEmail().contains(Email));
		assertTrue(myAccountPage.getPassword().contains(Password));
		assertTrue(myAccountPage.getHotelName().contains(HotelName));
		assertTrue(myAccountPage.getInvoiceDate().contains(InvoiceDate));
		assertTrue(myAccountPage.getDueDate().contains(DueDate));
		assertTrue(myAccountPage.getInvoiceNumber().contains(InvoiceNumber));
		assertTrue(myAccountPage.getBookingCode().contains(BookingCode));
		assertTrue(myAccountPage.getCustomerDetails().contains(CustomerDetails));
		assertTrue(myAccountPage.getRoom().contains(Room));
		assertTrue(myAccountPage.getCheckOut().contains(CheckIn));
		assertTrue(myAccountPage.getCheckOut().contains(CheckOut));
		assertTrue(myAccountPage.getTotalStay().contains(TotalStay));
		assertTrue(myAccountPage.getDepositNow().contains(DepositNow));
		assertTrue(myAccountPage.getTaxVAT().contains(TaxVAT));
		assertTrue(myAccountPage.getTotalAmount().contains(TotalAmount));
	}
}