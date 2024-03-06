package test.steps;

import core.cucumber.TestContext;
import io.cucumber.java.pt.Dado;
import test.logic.HomeLogic;

public class HomeSteps {
	
	private TestContext testContext;
	private HomeLogic homeLogic;
	
	public HomeSteps(TestContext context) {
		this.testContext = context;
		this.homeLogic = testContext.getPageObjectManager().getHomeLogic();
	}
	
	@Dado("que o usuario acessa o site")
	public void queOUsuarioAcessaOSite() {
		this.homeLogic.paginaInicial();
	}

}
