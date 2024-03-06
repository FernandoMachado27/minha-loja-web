package test.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import core.dataProviders.ConfigFileReader;

public class HomePage {
	
	WebDriver driver;
	ConfigFileReader configFileReader;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
