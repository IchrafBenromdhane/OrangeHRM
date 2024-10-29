package TestSuites;

import Helper.Config;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTestSuite {
	
	LoginPage loginPage;
	
	@Given("admin is on the login page")
	public void admin_is_on_the_login_page() {
		Config.confEdge();
		Config.maximWindow();
		String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		Config.driver.get(url);
		
	
	}

	@When("admin enters the correct username {string} and correct password {string}")
	public void admin_enters_the_correct_username_and_correct_password(String nom, String mdp) {
		loginPage = new LoginPage();
		loginPage.connect(nom, mdp);
	
	}

	@Then("admin is directed to the homepage with the title {string}")
	public void admin_is_directed_to_the_homepage_with_the_message(String msgValid) {
		loginPage = new LoginPage();
		loginPage.Verifier(msgValid);
	
	}

	@When("admin enters an incorrect username {string} and correct password {string}")
	public void admin_enters_an_incorrect_username_and_correct_password(String nom, String mdp) {
		loginPage = new LoginPage();
		loginPage.connect(nom, mdp);
	}

	@Then("admin remains on the login page with the error message {string}")
	public void admin_remains_on_the_login_page_with_the_error_message(String msgInvalid) {
		loginPage = new LoginPage();
		loginPage.VerifierInvalid(msgInvalid);
	
	}




}
