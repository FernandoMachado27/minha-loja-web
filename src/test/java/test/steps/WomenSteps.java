package test.steps;

import core.cucumber.TestContext;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import test.logic.WomenLogic;

public class WomenSteps {
	
	private TestContext testContext;
	private WomenLogic womenLogic;
	
	public WomenSteps(TestContext context) {
		this.testContext = context;
		this.womenLogic = testContext.getPageObjectManager().getWomenLogic();
	}
	
	@Então("retorna tela Women")
	public void retorna_tela_Women() {
		womenLogic.validarTelaWomen();
	}
	
	@Quando("aciona a opção Tops")
	public void aciona_a_opção_Tops() {
		womenLogic.acionaAOpcaoTops();
	}

}
