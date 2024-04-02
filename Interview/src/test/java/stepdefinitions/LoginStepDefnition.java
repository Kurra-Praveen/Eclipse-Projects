package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Given.Givens;
import io.cucumber.java.en.Then;

public class LoginStepDefnition {

	@Given("I am on the Login page URL {string}")
	public void i_am_on_the_login_page_url(String string) {
	   System.out.println("Hello world");
	}

	@Then("I click on sign in button and wait for sign in page")
	public void i_click_on_sign_in_button_and_wait_for_sign_in_page() {
	   System.out.println("Hii");
	}

	@Then("I should see Sign In Page")
	public void i_should_see_sign_in_page() {
	    System.out.println("Bye");
	}
	
	@Given("^I enter \"([^\"]*)\"$")
	public void enterUsername(String username) {
		System.out.println(username);
	}
	
	@Given("^I enter a \"([^\"]*)\"$")
	public void enterpassword(String password) {
		System.out.println(password);
	}
	
	@Then("I click login")
	public void clickLogin() {
		System.out.println("clicked");
	}
}
