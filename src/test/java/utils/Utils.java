package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {
	
	private WebDriverWait wait;
	
	public boolean validarElementoPresenteNaTelaComXpath(String xpath) {
		boolean elemento = wait
				.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(xpath)))
				.isDisplayed();
		return elemento;
	}
	
	public boolean validarElementoPresenteNaTelaComCss(String css) {
		boolean elemento = wait
				.until(ExpectedConditions
						.visibilityOfElementLocated(By.cssSelector(css)))
				.isDisplayed();
		return elemento;
	}
	
	public boolean validarElementoPresenteNaTelaComId(String id) {
		boolean elemento = wait
				.until(ExpectedConditions
						.visibilityOfElementLocated(By.id(id)))
				.isDisplayed();
		return elemento;
	}
	
}
