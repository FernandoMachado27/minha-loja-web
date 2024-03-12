package test.logic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.assertTrue;

import test.page.WomenPage;
import utils.Utils;

public class WomenLogic {
	
	WebDriver driver;
	private WebDriverWait wait;
	private WomenPage womenPage;
	private Utils utils;
	
	public WomenLogic(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		this.womenPage = PageFactory.initElements(driver, WomenPage.class);
	}

	public void validarTelaWomen() {
		assertTrue("Não exibiu a mensagem Women", womenPage.getTxtWomen().isDisplayed());
	}

	public void acionaAOpcaoTops() {
		womenPage.getBtTops().click();
	}

}
