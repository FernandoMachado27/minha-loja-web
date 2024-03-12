package test.logic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import test.page.TopsPage;
import utils.Utils;

public class TopsLogic {
	
	WebDriver driver;
	private WebDriverWait wait;
	private TopsPage topsPage;
	private Utils utils;
	
	public TopsLogic(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		this.topsPage = PageFactory.initElements(driver, TopsPage.class);
	}

	public void validarTelaTops() {
		assertEquals("Choose from t-shirts, tops, blouses, short sleeves, long sleeves, tank tops, 3/4 sleeves and more.", topsPage.getTxtTops().getText());
	}

}
