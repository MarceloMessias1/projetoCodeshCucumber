package pages;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {

	WebDriver driver;

	public void abrirWebSite(String appUrl, String descricao) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(appUrl);
		driver.manage().window().maximize();

	}

	public void clicar_cookies(String valor) {
		driver.findElement(By.id(valor)).click();
	}

	public void clicar_login(String valor) {
		driver.findElement(By.xpath(valor)).click();

	}

	public void valido(String dado, String caminho) {
		driver.findElement(By.xpath(caminho)).sendKeys(dado);

	}

	public void clico_em_cadastro(String valor) {
		driver.findElement(By.xpath(valor)).click();

	}

	public void preencho_campos_validos(String dado, String caminho) {
		driver.findElement(By.xpath(caminho)).sendKeys(dado);
	}

	public void clico_em_check(String valor) {
		driver.findElement(By.xpath(valor)).click();

	}

	public void fecharWebSite() {
		driver.quit();
	}

	public void salvascreenShot(String fileName) throws IOException {
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("./Evidencias/" + fileName + ".png"));

	}
}