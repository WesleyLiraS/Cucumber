package br.com.inmetrics.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import br.com.inmetrics.core.DriverFactory;
import br.com.inmetrics.page.LoginPage;
import br.com.inmetrics.page.SucessLogin;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class LoginSteps {
	
	private LoginPage loginPage;
	private SucessLogin sucessLogin;
	
	@Given("que eu tenha acesso ao sistema")
	public void queEuTenhaAcessoAoSistema() {
		DriverFactory.getDriver().get(DriverFactory.url);
	}
	@When("informar meu usuario {string}")
	public void informarMeuUsuario(String string) {
		loginPage = new LoginPage();
		loginPage.setUser(string);
	}
	@And("informar minha senha {string}")
	public void informarMinhaSenha(String string) {
		loginPage.setPass(string);
	}
	@And("clicar no botao entre")
	public void clicarNoBotaoEntre() {
		loginPage.click();
	}
	@Then("deve abrir a pagina de sucesso de login")
	public void deveAbrirAPaginaDeSucessoDeLogin() {
		sucessLogin = new SucessLogin();
		
		Assert.assertTrue(sucessLogin.msgLoginSucess().contains("Logged In Successfully"));
	}
	@Then("o sistema retornara uma mensagem de error {string}")
	public void oSistemaRetornaraUmaMensagemDeError(String string) {
		assertEquals(string, loginPage.getMsgError());
	}
	@After
	public void end() {
		DriverFactory.quitDriver();
	}


}
