package br.com.inmetrics.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import br.com.inmetrics.core.DriverFactory;

public class SucessLogin {
	
	private WebElement msgSucess = DriverFactory.getDriver().findElement(By.className("post-title"));
	
	public String msgLoginSucess(){
		return msgSucess.getText();
	}

}
