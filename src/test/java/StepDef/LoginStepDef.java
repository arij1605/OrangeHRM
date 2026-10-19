package StepDef;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
	@Given("Admin is on loginPage")
	public void admin_is_on_login_page() {
		Config.driver= new ChromeDriver();
		Config.maximizeWindow();
		String URL="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		Config.driver.get(URL);
	    
	}
	@When("Admin enter correct userName {string} and Password {string}")
	public void admin_enter_correct_user_name_and_password(String name, String mdp) {
		 LoginPage login = new LoginPage();
		    login.connect(name, mdp); 
	}
	@Then("Admin is directed to HomePage {string}")
	public void admin_is_directed_to_home_page_that_contains(String x) {
		LoginPage login = new LoginPage();
	    login.verifValid(x);
	    Config.driver.close();
	}
	

	@When("Admin enter incorrect userName {string} and Password {string}")
	public void admin_enter_incorrect_user_name_and_password(String name, String mdp) {
	 LoginPage login = new LoginPage();
	    login.connect(name, mdp);
}
	@Then("Admin still on login page that contains message {string}")
	public void admin_still_on_login_page_that_contains_message(String x) {
	LoginPage login = new LoginPage();
    login.verifInvalid(x);
    Config.driver.close();
}




}