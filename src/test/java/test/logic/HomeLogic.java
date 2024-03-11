package test.logic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.managers.FileReaderManager;
import test.page.HomePage;
import utils.Utils;

public class HomeLogic {
	
	WebDriver driver;
	private WebDriverWait wait;
	private HomePage homePage;
	private Utils utils;
	
	public HomeLogic(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		this.homePage = PageFactory.initElements(driver, HomePage.class);
	}
	
	public void paginaInicial() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
		wait.until(ExpectedConditions.visibilityOf(homePage.getLogo()));
	}

	public void acionaAOpcaoWomen() {
		homePage.getBtWomen().click();
	}

}
