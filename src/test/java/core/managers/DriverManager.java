package core.managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import core.enums.DriverType;
import core.enums.EnvironmentType;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	private WebDriver driver;
	private static DriverType driverType;
	private static EnvironmentType environmentType;
	private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";

	public DriverManager() {
		driverType = FileReaderManager.getInstance().getConfigReader().getBrowser();
		environmentType = FileReaderManager.getInstance().getConfigReader().getEnvironment();
	}

	public WebDriver getDriver() {
		if (driver == null)
			driver = createDriver();
		return driver;
	}

	private WebDriver createDriver() {
		switch (environmentType) {
		case LOCAL:
			driver = createLocalDriver();
			break;
		case REMOTE:
			driver = createRemoteDriver();
			break;
		}
		return driver;
	}

	private WebDriver createRemoteDriver() {
		throw new RuntimeException("RemoteWebDriver is not yet implemented");
	}
	
	 private WebDriver createLocalDriver() {
		 switch (driverType) {	    
	        case FIREFOX : driver = new FirefoxDriver();
		    	break;
	        case CHROME : 
	        	 WebDriverManager.chromedriver().setup();
	        	driver = new ChromeDriver();
	    		break;
	        case EDGE : driver = new EdgeDriver();
	    		break;
	        }
		 
		 if(FileReaderManager.getInstance().getConfigReader().getBrowserWindowSize()) driver.manage().window().maximize();
			return driver;
		}	
	 
		public void closeDriver() {
			driver.close();
			driver.quit();
		}
	 
}
