package test.steps;

import org.openqa.selenium.WebDriver;

import core.cucumber.TestContext;
import core.support.Context;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	TestContext testContext;
	Context context;
	WebDriver driver;

	public Hooks(TestContext context) {
		testContext = context; 
	}
	
	@Before
	public void BeforeSteps() {
		Context.initialize(driver);
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
		Context.tearDown();
		System.out.println("Encerrando browser");
	}

}
