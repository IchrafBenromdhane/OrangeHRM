package TestSuites;


import Helper.Config;
import Pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeTestSuite {
	
	
	

	@When("je sélectionne la list de sous-menu {string}")
	public void je_sélectionne_la_list_de_sous_menu(String titre) {
		
		HomePage homepage= new HomePage();
		homepage.Click(titre);
	
	}

	@Then("je vois les options suivantes dans le {string}")
	public void je_vois_les_options_suivantes_dans_le(String string) {
		HomePage homepage = new HomePage();
		homepage.Verifier(string);
		Config.closeBrowser();
	
	}




}
