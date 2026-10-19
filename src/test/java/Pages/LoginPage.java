package Pages;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Helper.Config;

public class LoginPage {
@FindBy(xpath ="/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
WebElement userName;

@FindBy(xpath="/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
WebElement pwd;

@FindBy(xpath="/html/body/div/div[1]/div[1]/header/div[1]/div[1]/span/h6")
WebElement verifOK;

@FindBy (xpath="/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")
WebElement verifKO;

public LoginPage() {
	PageFactory.initElements(Config.driver, this);
}
public void connect(String mail, String mdp) {
	Config.attente(10);
	userName.sendKeys(mail);
	pwd.sendKeys(mdp+Keys.ENTER);
}

public void verifValid(String verif) {
Assert.assertEquals(verifOK.getText(),verif );

}

public void verifInvalid(String verif) {
Assert.assertEquals(verifKO.getText(),verif);
}

}