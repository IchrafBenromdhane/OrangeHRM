package Pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class HomePage {
	
	@FindBy(xpath = "/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li/a/span")
	List<WebElement> sousmenus;
	
	@FindBy(tagName = "h6")
	WebElement VerifValid;
	
	
	
	public HomePage() {
		PageFactory.initElements(Config.driver, this);
	}
	
	public void Click(String titremenu) {
		
		try {
			
			for(WebElement sousmenu:sousmenus) {
				if(sousmenu.getText().contains(titremenu)) {
					sousmenu.click();
				}
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public void Verifier(String titre) {
		Config.attente(10);
		
		String verifText=VerifValid.getText();
		Assert.assertEquals(titre, verifText);
	}

}
