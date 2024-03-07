package test.steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import core.cucumber.TestContext;
import core.managers.DriverManager;
import core.managers.PageObjectManager;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks {
	
	TestContext testContext;
	private DriverManager driverManager;
	private PageObjectManager pageObjectManager;

	public Hooks(TestContext context) {
		testContext = context; 
	}

//	@AfterStep
//	public void addScreenshot(Scenario scenario){
//
//	      final byte[] screenshot = ((TakesScreenshot) testContext.getWebDriverManager().getDriver()).getScreenshotAs(OutputType.BYTES);
//	      scenario.attach(screenshot, "image/png", "image"); 
//		
//	}
	
	@After
	public void AfterSteps() {
		testContext.getWebDriverManager().closeDriver();
		System.out.println("Encerrando browser");
	}

}
