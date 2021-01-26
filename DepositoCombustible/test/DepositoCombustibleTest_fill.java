import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class DepositoCombustibleTest_fill {
	private double depMax;
	private double depNivel;
	private double fill;
	private double esperado;
	
	public DepositoCombustibleTest_fill(double depMax, double depNivel, double fill, double esperado) {
		this.depMax = depMax;
		this.depNivel = depNivel;
		this.fill = fill;
		this.esperado = esperado;
	}
	
	@Parameters
	public static Collection<Object[]> parametros(){
		return Arrays.asList(new Object[][] {
			{50, 20, 30, 50},
			{50, 10, 0, 10},
			{50, 30, -10, 20}
		});
	}
	@Test
	public void testFill() {
		DepositoCombustible dc = new DepositoCombustible(depMax, depNivel);
		double resultado = dc.fill(fill);
		assertEquals(esperado, resultado, 0);
	}

}
