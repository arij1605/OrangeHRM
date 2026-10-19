package StepDef;



import Helper.Config;
import Pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepDef {

	/* @Given(": utilisateur à la page d acceuil")
	public void utilisateur_à_la_page_d_acceuil() {
		Config.driver = new ChromeDriver();
		Config.maximizeWindow();
		String url= "https://opensource-demo.orangehrmlive.com/web/index.php/leave/viewLeaveList";
		Config.driver.get(url);
	} */
	@When("utilisateur clique sur le menu acceuil {string}")
	public void utilisateur_clique_sur_le_menu_acceuil(String menuTitle) {
	   HomePage page = new HomePage();
	   page.clickOnMenu(menuTitle);
	}
	@Then("la page de menu est affiché {string}")
	public void la_page_de_menu_est_affiché(String menuTitle) {
		 HomePage page = new HomePage();
		   page.verifmenu(menuTitle);
		   Config.driver.quit();
	}



}
