package core.managers;

import org.openqa.selenium.WebDriver;

import test.logic.HomeLogic;
import test.logic.TopsLogic;
import test.logic.WomenLogic;

public class PageObjectManager {
	
	private WebDriver driver;
	private HomeLogic homeLogic;
	private WomenLogic womenLogic;
	private TopsLogic topsLogic;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public HomeLogic getHomeLogic() {
		return (homeLogic == null) ? homeLogic = new HomeLogic(driver) : homeLogic;
	}
	
	public WomenLogic getWomenLogic() {
		return (womenLogic == null) ? womenLogic = new WomenLogic(driver) : womenLogic;
	}
	
	public TopsLogic getTopsLogic() {
		return (topsLogic == null) ? topsLogic = new TopsLogic(driver) : topsLogic;
	}

}
