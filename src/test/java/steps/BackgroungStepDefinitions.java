package steps;

import static utils.selenium.SeleniumKeys.DRIVER;

import cucumber.api.java.en.Given;

public class BackgroungStepDefinitions {

	@Given("^I am on main page$")
	public void i_am_on_main_page() {
		DRIVER.get("https://www.phptravels.net/");
	}
	
}
