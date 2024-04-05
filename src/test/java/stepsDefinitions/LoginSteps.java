package stepsDefinitions;

import static org.junit.Assert.assertTrue;
import static utils.Utils.*;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.DirectoryPage;
import pageObjects.LoginPage;

public class LoginSteps {

	

	@Dado("que estou acessando o sistema")
	public void queEstouAcessandoOSistema() {

	}

	@Quando("informar  o usuario {string} e a senha {string}")
	public void informarOUsuarioEASenha(String user, String pass) throws InterruptedException {
		Na(LoginPage.class).inserirUsuario(user);
		Na(LoginPage.class).inserirSenha(pass);
		Na(LoginPage.class).clicarLogin();
	}

	@Entao("o sistema apresentará o dashboard")
	public void oSistemaApresentaráODashboard() throws InterruptedException {
		assertTrue(Na(LoginPage.class).validarEntradaSistema());
		esperar(2000);
		Na(LoginPage.class).moverMouseAbaPim();
		esperar(2000);
		Na(LoginPage.class).moverMouseAbaDirectory();
		esperar(2000);
		Na(LoginPage.class).acessarAbaDirectoryMouseAction();
		Na(DirectoryPage.class).clicarBotaoDireitoTextoDirectory();
	}
}
