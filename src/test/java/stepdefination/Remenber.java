package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Remenber {
      WebDriver  driver1;
@Given("must be on homepage url {string}")
public void must_be_on_homepage_url(String string) {
	System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
    driver1 = new FirefoxDriver();
    driver1.get(string);
}

@When("User clicks on Remember me checkbox")
public void user_clicks_on_remember_me_checkbox() {
   driver1.findElement(By.className("form-check-input")).click();
}

@Then("Remember Me checkbox must get selected")
public void remember_me_checkbox_must_get_selected() {
	boolean a =driver1.findElement(By.className("form-check-input")).isSelected();
	System.out.println(a);
}


}
