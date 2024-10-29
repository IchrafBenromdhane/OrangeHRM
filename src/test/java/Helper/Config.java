package Helper;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Config {
	
	public static WebDriver driver;


	
	
	
	public static void confEdge() {
		
		System.setProperty("webdriver.edge.driver", "c:/msedgedriver.exe");
		
		driver = new EdgeDriver() ;

		
		
	}
	
	public static void maximWindow() {
		
		driver.manage().window().maximize();
		
	}
	
	
		public static void attente(int s) {
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(s));
			
			
		}
		
		public static void closeBrowser() {
			driver.quit();
		}


}
