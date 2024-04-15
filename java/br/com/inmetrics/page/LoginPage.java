package br.com.inmetrics.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import br.com.inmetrics.core.DriverFactory;

public class LoginPage {
	
	private WebElement Usuario = DriverFactory.getDriver().findElement(By.id("username"));
	private WebElement Senha =  DriverFactory.getDriver().findElement(By.id("password"));
	private WebElement btnEnter = DriverFactory.getDriver().findElement(By.id("submit"));
	private WebElement msgError;
	
	public void setUser(String value) {
		Usuario.sendKeys(value);
		
	}
	
	public void setPass(String value) {
		Senha.sendKeys(value);
	}
	
	public void click() {
		btnEnter.click();
	}
	
	public String getMsgError() {
		msgError = DriverFactory.getDriver().findElement(By.id("error"));
				
		return msgError.getText();
	}
}
