package test.logic;

import static core.support.Context.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import core.managers.FileReaderManager;
import test.page.HomePage;

public class HomeLogic {
	
	WebDriver driver;
	private HomePage homePage;
	
	
	public HomeLogic(WebDriver driver) {
		this.driver = driver;
		this.homePage = PageFactory.initElements(driver, HomePage.class);
	}
	
	public void paginaInicial() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
		actions().waitVisibilityOf(homePage.getLogo());
	}

	public void acionaAOpcaoWomen() {
		actions().click(homePage.getBtnWomen());
	}

}
