package stepsDefinitions;

import static utils.Utils.*;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

	
	@Before
	public void setUp() {
		acessoSistema();
	}
	
	@After(order=1)
	public void screenshot(Scenario scenario) throws InterruptedException, IOException {
		capturarTela(scenario);
	}
	
	@After(order=0)
	public void finalizarTeste() throws InterruptedException{
		esperar(2000);
		driver.quit();
	}
}
