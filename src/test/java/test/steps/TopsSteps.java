package test.steps;

import core.cucumber.TestContext;
import io.cucumber.java.pt.Então;
import test.logic.TopsLogic;
import test.logic.WomenLogic;

public class TopsSteps {
	
	private TestContext testContext;
	private TopsLogic topsLogic;
	
	public TopsSteps(TestContext context) {
		this.testContext = context; 
		this.topsLogic = testContext.getPageObjectManager().getTopsLogic();
	}
	
	@Então("retorna tela Tops")
	public void retorna_tela_Tops() {
		topsLogic.validarTelaTops();
	}

}
