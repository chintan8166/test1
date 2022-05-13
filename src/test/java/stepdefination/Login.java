package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Login {
	WebDriver driver1;
	@Given("user must be on home page by clicking url {string}")
	public void user_must_be_on_home_page_by_clicking_url(String string) {
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
	    driver1 = new FirefoxDriver();
	    driver1.get(string);
	}

	@When("^Enter valid (.*) & (.*)$")
	public void enter_valid_usernmae_password(String username, String password) throws InterruptedException {
	   driver1.findElement(By.id("username")).sendKeys(username);
	   Thread.sleep(5000);
	   driver1.findElement(By.id("password")).sendKeys(password);
	}

	@When("click on Sigin button")
	public void click_on_sigin_button() {
	   driver1.findElement(By.id("log-in")).click();
	}

	@Then("user must be navigated to his or her account")
	public void user_must_be_navigated_to_his_or_her_account() {
	 String actualresult= driver1.getCurrentUrl();
	 Assert.assertEquals("https://demo.applitools.com/app.html",actualresult);
	 
	 
	}


}
