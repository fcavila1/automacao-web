package utils;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.Scenario;


public class Utils {
	
	public static WebDriver driver;
	
	public static WebDriver instanciaDriver(){
		driver = new ChromeDriver();
		return driver;
	}

	public static void acessoSistema() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\stefanini\\Documents\\Pessoal\\Cursos\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	public static <T> T Na(Class<T> classe){
		return PageFactory.initElements(driver, classe);
	}
	
	public static void esperar(int espera) throws InterruptedException {
		Thread.sleep(espera);
//		System.out.println("A espera de "+espera+" foi concluida");
	}
	
	
	public static void capturarTela(Scenario scenario) throws IOException, InterruptedException {
		esperar(2000);
//		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(file, new File("target/screenshots/"+scenario.getName()+".jpg"));
		final byte[] screenShot = (((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES));
		scenario.attach(screenShot, "image/png", scenario.getName());
		
	}
}
