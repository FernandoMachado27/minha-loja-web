package core.managers;

import org.openqa.selenium.WebDriver;

import test.logic.HomeLogic;

public class PageObjectManager {
	
	private WebDriver driver;
	private HomeLogic homeLogic;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public HomeLogic getHomeLogic() {
		return (homeLogic == null) ? homeLogic = new HomeLogic(driver) : homeLogic;
	}

}
