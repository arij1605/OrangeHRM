package StepDef;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Pages.LoginPage;
import io.cucumber.java.en.Given;

public class CommunStepDef {
	
	@Given(": utilisateur est connecte avec le bon username et bon password")
	public void utilisateur_est_connecte_avec_le_bon_username_et_bon_password() {
		Config.driver = new ChromeDriver();
		Config.maximizeWindow();
		String url= "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		Config.driver.get(url);
		 LoginPage login = new LoginPage();
		    login.connect("Admin", "admin123"); 
	}



}
