package test.logic;

import static core.support.Context.actions;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import test.page.WomenPage;

public class WomenLogic {
	
	WebDriver driver;
	private WomenPage womenPage;
	
	public WomenLogic(WebDriver driver) {
		this.driver = driver;
		this.womenPage = PageFactory.initElements(driver, WomenPage.class);
	}

	public void validarTelaWomen() {
		assertTrue("Não exibiu a mensagem Women", womenPage.getTxtWomen().isDisplayed());
	}

	public void acionaAOpcaoTops() {
		actions().click(womenPage.getBtnTops());
	}

}
