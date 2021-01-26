import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith (Parameterized.class)
public class DepositoCombustibleTest_getDepositoMax {
	private double depMax;
	private double depNivel;
	private double esperado;
	
	public DepositoCombustibleTest_getDepositoMax(double depMax, double depNivel, double esperado) {
		this.depMax = depMax;
		this.depNivel = depNivel;
		this.esperado = esperado;
	}
	
	@Parameters
	public static Collection<Object[]> parametros(){
		return Arrays.asList(new Object[][] {
			{50, 10, 50},
			{40, 10, 40},
			{10, 5, 10}
		});
	}

	@Test
	public void testGetDepositoMax() {
		DepositoCombustible dc = new DepositoCombustible(depMax, depNivel);
		double resultado = dc.getDepositoMax();
		assertEquals(esperado, resultado, 0);
	}

}
