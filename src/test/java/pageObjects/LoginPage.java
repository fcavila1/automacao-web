package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import utils.Utils;
import static utils.Utils.*;
import pageObjects.MenuBasePage;

public class LoginPage extends MenuBasePage {
	
	Actions acao = new Actions(driver);

	@FindBy(name = "username")
	private WebElement campoUsuario;

	@FindBy(name = "password")
	private WebElement campoSenha;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement botaoLogin;

	@FindBy(xpath = "//h6[contains(.,'Dashboard')]")
	private WebElement textoDashboard;

	public void inserirUsuario(String user) {
		campoUsuario.sendKeys(user);
	}

	public void inserirSenha(String pass) {
		campoSenha.sendKeys(pass);
	}

	public void clicarLogin() {
		botaoLogin.click();
	}

	public boolean validarEntradaSistema() {
		return textoDashboard.isDisplayed();
	}

	public void realizarLogin() {
		campoUsuario.sendKeys("Admin");
		campoSenha.sendKeys("admin123");
	}

	public void moverMouseAbaPim() {
		acao.moveToElement(menuPim).build().perform();
	}

	public void moverMouseAbaDirectory() {
		acao.moveToElement(menuDirectory).build().perform();
	}
	
	public void acessarAbaDirectoryMouseAction() {
		acao.moveToElement(menuDirectory).click().build().perform();
	}
}
