package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import static utils.Utils.*;

public class DirectoryPage {

	
	@FindBy(xpath = "//h5[contains(., 'Directory')]")
	private WebElement txtDirectory;
	
	public void clicarBotaoDireitoTextoDirectory() {
		Actions acao = new Actions(driver);
		acao.contextClick(txtDirectory).build().perform();
	}
}
