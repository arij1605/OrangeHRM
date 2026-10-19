package Pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Helper.Config;

public class HomePage {
	
	@FindBy(xpath="/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li/a/span")
	List<WebElement> menus;
	
	@FindBy(xpath="/html/body/div/div[1]/div[1]/header/div[1]/div[1]/span/h6")
	WebElement verifm;

	public HomePage() {
		PageFactory.initElements(Config.driver, this);
	}
	
	public void clickOnMenu(String menuTitle) {
		try {
			for(WebElement menu: menus) {
				if(menu.getText().contains(menuTitle)) {
					menu.click();
				}
			}
			
		}catch (Exception e) {
			
		}
	}
	public void verifmenu(String menuTitle) {
		
		Assert.assertEquals(menuTitle, verifm.getText());
	}
}
