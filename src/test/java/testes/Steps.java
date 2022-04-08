package testes;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;

public class Steps {

	Metodos metodos = new Metodos();

	@Given("que eu esteja no site {string}")
	public void que_eu_esteja_no_site(String string) {
		metodos.abrirWebSite(string, string);
	}

	@When("clico cookies")
	public void clico_cookies() {
		metodos.clicar_cookies("onetrust-accept-btn-handler");

	}

	@Then("preencho dados validos")
	public void preencho_dados_validos() throws InterruptedException, IOException {
		metodos.clicar_login("//*[@id=\"header-nav-bar\"]/ul/li[3]/a/button");
		metodos.valido("teste@teste.com.br", "//*[@id=\"email\"]");
		metodos.valido("teste", "//*[@id=\"password\"]");
		metodos.clicar_login("//*[@id=\"content\"]/div/div/div/div/form//button");
		Thread.sleep(3000);
		metodos.salvascreenShot("usuário invalido");
		metodos.fecharWebSite();

	}

	@When("clico login cadastro")
	public void clico_login_cadastro() {
		metodos.clicar_cookies("onetrust-accept-btn-handler");
		metodos.clicar_login("//*[@id=\"header-nav-bar\"]/ul/li[3]/a/button");
	}

	@When("clico em cadastro")
	public void clico_em_cadastro() {
		metodos.clico_em_cadastro("//*[text()=\"Cadastre-se\"]");

	}

	@Then("valido cadastro com sucesso")
	public void valido_cadastro_com_sucesso() {
		metodos.fecharWebSite();

	}

	@When("clicar login")
	public void clicar_login() {
		metodos.clicar_cookies("onetrust-accept-btn-handler");
		metodos.clicar_login("//*[@id=\"header-nav-bar\"]/ul/li[3]/a/button");
	}

	@When("preencher dados")
	public void preencher_dados() throws IOException, InterruptedException {
		metodos.valido("cheroxmiller@hotmail.com", "//*[@id=\"email\"]");
		metodos.valido("T3rgui@s", "//*[@id=\"password\"]");
		metodos.clicar_login("//*[@id=\"content\"]/div/div/div/div/form//button");
		Thread.sleep(3000);
		metodos.salvascreenShot("Sucesso");
		metodos.fecharWebSite();
	}

}