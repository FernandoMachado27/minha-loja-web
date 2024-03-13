package test.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

@Getter
public class WomenPage {
	
	WebDriver driver;
	
	public WomenPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//*[text()='You will find here all woman fashion collections.']")
	private WebElement txtWomen;

	@FindBy(how = How.XPATH, using = "(//a[normalize-space()='Tops'])[2]")
	private WebElement btnTops;

}
