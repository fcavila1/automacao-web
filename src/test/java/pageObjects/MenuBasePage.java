package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuBasePage {
	
	@FindBy(xpath = "//span[contains(., 'PIM')]")
	public WebElement menuPim;
	
	@FindBy(xpath = "//span[contains(., 'Directory')]")
	public WebElement menuDirectory;
	

}
