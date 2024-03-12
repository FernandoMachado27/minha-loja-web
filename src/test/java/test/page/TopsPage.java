package test.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

@Getter
public class TopsPage {
	
	WebDriver driver;
	
	public TopsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Choose from t-shirts, tops, blouses, short sleeves, long sleeves, tank tops, 3/4 sleeves')]")
	private WebElement txtTops;

}
