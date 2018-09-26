package test;

import static utils.selenium.SeleniumKeys.DRIVER;
import static utils.selenium.SeleniumWaitMethods.wait3Seconds;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = {"steps"},
        plugin = {"pretty", "html:reports/cucumber"},
        tags = {})
public class RunTest {
	
	  @AfterClass
	  public static void afterClass() throws Exception {
	    isRunnedFromAllTestsSuite = false;
	    closeDriver();
	  }

	  @BeforeClass
	  public static void beforeClass() throws Exception {
	    isRunnedFromAllTestsSuite = true;
	  }

	  public static void closeDriver() {
	    if (isRunnedFromAllTestsSuite == false) {
	      DRIVER.close();
	      wait3Seconds();
	      DRIVER.quit();
	    }
	  }

	  public static Boolean isRunnedFromAllTestsSuite = false;
}