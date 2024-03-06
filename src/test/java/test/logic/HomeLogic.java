package test.logic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.managers.FileReaderManager;
import test.page.HomePage;

public class HomeLogic {
	
	WebDriver driver;
	private WebDriverWait wait;
	private HomePage homePage;
	
	public HomeLogic(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}
	
	public void paginaInicial() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
		wait.until(ExpectedConditions.visibilityOf(homePage.getLogo()));
	}

}
