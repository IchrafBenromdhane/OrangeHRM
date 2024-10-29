package TestSuites;

import Helper.Config;
import Pages.LoginPage;
import io.cucumber.java.en.Given;

public class CommuneTestSuite {
	
	@Given("que je suis bien connecte avec login {string} et mdp {string} donc je sur la page Home")
	public void que_je_suis_bien_connecte_avec_login_et_mdp_donc_je_sur_la_page_home(String login, String mdp) {
		
		Config.confEdge();
		Config.maximWindow();
		String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		Config.driver.get(url);
		LoginPage loginpage = new LoginPage();
		loginpage.connect(login, mdp);
	
	}

}
