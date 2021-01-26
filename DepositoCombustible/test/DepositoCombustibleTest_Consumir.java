import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith (Parameterized.class)
public class DepositoCombustibleTest_Consumir {
	private double depMax;
	private double depNivel;
	private double consumir;
	private double esperado;
	
	public DepositoCombustibleTest_Consumir(double depMax, double depNivel, double consumir, double esperado) {
		this.depMax = depMax;
		this.depNivel = depNivel;
		this.consumir = consumir;
		this.esperado = esperado;
	}
	
	@Parameters
	public static Collection<Object[]> parametros(){
		return Arrays.asList(new Object[][] {
			{50, 40, 20, 20},
			{50, 40, 0, 40},
			{20, 10, -10, 20}
		});
	}
	@Test
	public void testConsumir() {
		DepositoCombustible dc = new DepositoCombustible(depMax, depNivel);
		double resultado = dc.consumir(consumir);
		assertEquals(esperado, resultado, 0);
	}

}
