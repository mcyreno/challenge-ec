package steps;

import static utils.selenium.SeleniumKeys.DRIVER;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class BackgroungStepDefinitions {

	LoginStepDefinitions loginStepDefinitions = new LoginStepDefinitions();

	@Given("^I am on main page$")
	public void i_am_on_main_page() {
		DRIVER.get("https://www.phptravels.net/");
	}

	@And("^I will login with a default user \"([^\"]*)\", \"([^\"]*)\"$")
	public void i_will_login_with_a_default_user(String email, String password) {
		loginStepDefinitions.i_fill_the_email_and_password(email, password);
	}

	@And("^Access My Account Page$")
	public void access_my_account_page() {
		DRIVER.get("https://www.phptravels.net/");
	}

}
