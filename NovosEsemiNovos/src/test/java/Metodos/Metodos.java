package Metodos;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Elementos.Elementos;

public class Metodos {
	
	Elementos el = new Elementos();
	
	private static WebDriver driver;

	public static WebDriver navegador() {
		return driver;

	}

	public void abrirNavegador(String site) {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(site);
		driver.manage().window().maximize();

	}

	public void fecharNavegador() {

		driver.quit();
	}

	public void clicar(By elemento) {

		driver.findElement(elemento).click();
	

	}

	public void escrever(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);

	}

	public void printScr(String nome) throws IOException {

		TakesScreenshot scrShot = ((TakesScreenshot)navegador());
		File nomeArq = scrShot.getScreenshotAs(OutputType.FILE);
		File destArq = new File("./src/evidencias/"+nome+".png");
		FileUtils.copyFile(nomeArq, destArq);

	}
	
	public void preencherInformacoesNovos (String nome, String email, String tel, String cel) {
		
		driver.findElement(el.getCampoNome()).sendKeys(nome);
		driver.findElement(el.getCampoEmail()).sendKeys(email);
		driver.findElement(el.getCampoTel()).sendKeys(tel);
		driver.findElement(el.getCampoTel()).sendKeys(cel);
		
	}
	
	public void preencherInformacoesSemi (String nome, String email, String tel, String msg) {
		
		driver.findElement(el.getCampoNome()).sendKeys(nome);
		driver.findElement(el.getCampoEmail()).sendKeys(email);
		driver.findElement(el.getCampoTel()).sendKeys(tel);
		driver.findElement(el.getCampoMsg()).sendKeys(msg);
		
	}
	
	public void fecharAba() {
		
		driver.close();
	}
	
	public void voltarPagina() {
		
		driver.navigate().back();
	}

	public String pegarTexto(By elemento) {
		
		return driver.findElement(elemento).getText();
	}
	
	
	public String pegarTitulo() {
		
		return driver.getTitle();
	}



	
}
