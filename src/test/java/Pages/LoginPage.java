package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class LoginPage {
	
	@FindBy(xpath ="/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
	WebElement username;
	
	@FindBy(xpath ="/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
	WebElement password;
	
	@FindBy(xpath ="/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	WebElement submit;
	
	@FindBy(xpath ="/html/body/div/div[1]/div[1]/header/div[1]/div[1]/span/h6")
	WebElement VerifValid;
	
	@FindBy(xpath ="/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")
	WebElement verifINvalid;
	
	
	public LoginPage() {
		PageFactory.initElements(Config.driver, this);
	}
	
	public void connect(String Nom, String MDP) {
		Config.attente(10);
		username.sendKeys(Nom);
		password.sendKeys(MDP);
		submit.click();
		
	}
	
	public void Verifier(String titre) {
		Config.attente(10);
		
		String verifText=VerifValid.getText();
		Assert.assertEquals(titre, verifText);
		
	}
	
public void VerifierInvalid(String titre2) {
	Config.attente(10);
		
		String verifText2=verifINvalid.getText();
		Assert.assertEquals(titre2, verifText2);	
		
	}

}
