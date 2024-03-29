package test.steps;

import core.cucumber.TestContext;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import test.logic.HomeLogic;

public class HomeSteps {
	
	private TestContext testContext;
	private HomeLogic homeLogic;
	
	public HomeSteps(TestContext context) {
		this.testContext = context;
		this.homeLogic = testContext.getPageObjectManager().getHomeLogic();
	}
	
	@Dado("que o usuario acessa o site")
	public void que_o_usuario_acessa_o_site() {
		this.homeLogic.paginaInicial();
	}
	
	@Quando("aciona a opção Women")
	public void aciona_a_opção_Women() {
		homeLogic.acionaAOpcaoWomen();
	}

}
