package stepdefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {
	 WebDriver driver;
	@Given("user must be on homepage by clicking url {string}")
	public void user_must_be_on_homepage_by_clicking_url(String string) {
	 System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get(string);
	}

	@When("User click on signup button")
	public void user_click_on_signup_button() {
	   driver.findElement(By.id("signin2")).click();
	}

	@Then("Signup dialoge button should be displayed")
	public void signup_dialoge_button_should_be_displayed() {
	  boolean acutal = driver.findElement(By.cssSelector("#signInModal > div > div > div.modal-header")).isDisplayed();
	  Assert.assertEquals(true, acutal);
	}

}
