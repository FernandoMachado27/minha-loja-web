package core.managers;

import org.openqa.selenium.WebDriver;

import test.logic.HomeLogic;
import test.logic.WomenLogic;

public class PageObjectManager {
	
	private WebDriver driver;
	private HomeLogic homeLogic;
	private WomenLogic womenLogic;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public HomeLogic getHomeLogic() {
		return (homeLogic == null) ? homeLogic = new HomeLogic(driver) : homeLogic;
	}
	
	public WomenLogic getWomenLogic() {
		return (womenLogic == null) ? womenLogic = new WomenLogic(driver) : womenLogic;
	}

}
