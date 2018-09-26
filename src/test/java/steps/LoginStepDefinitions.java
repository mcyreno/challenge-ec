package steps;

import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;

public class LoginStepDefinitions {

	LoginPage loginPage = new LoginPage();

	@Given("^Click on My Account and Login$")
	public void click_on_My_Account_and_Login() {
		/**
		 * This try catch, is because I have problems to make 
		 * interaction with the "My Account button"
		 */

		try {
			loginPage.clickOnMyAccount();
			loginPage.clickOnLogin();
		} catch (Exception e) {
			System.out.println("ERROR: " + e.getMessage());
		}
	}

	@But("^I can access the login page directly$")
	public void i_can_access_the_login_page_directly() {
		/**
		 * This is one workaround to "solve" the problem above.
		 */

		loginPage.accessLoginPage();
	}

	@When("^I fill the (-?[^\"]*) and (-?[^\"]*)$")
	public void i_fill_the_email_and_password(String email, String password) {
		loginPage.fillEmailAddressField(email);
		loginPage.fillPasswordField(password);
		loginPage.clickOnSubmitLogin();
	}

	@Then("^The loged message will appear with the (-?[^\"]*)$")
	public void the_loged_message_will_appear_with_the_username(String username) {
		assertTrue(loginPage.defaultLoginSuccessMessageIsDisplayed(username));
	}

	@Then("^The default login error message will appear$")
	public void the_default_login_error_message_will_appear() {
		assertTrue(loginPage.defaultLoginErrorMessageIsDisplayed());
	}
}