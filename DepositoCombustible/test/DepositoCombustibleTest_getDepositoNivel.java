import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith (Parameterized.class)
public class DepositoCombustibleTest_getDepositoNivel {
	private double depMax;
	private double depNivel;
	private double esperado;
	
	public DepositoCombustibleTest_getDepositoNivel(double depMax, double depNivel, double esperado) {
		this.depMax = depMax;
		this.depNivel = depNivel;
		this.esperado = esperado;
	}
	
	@Parameters
	public static Collection<Object[]> parametros(){
		return Arrays.asList(new Object[][] {
											{40, 10, 10}, 
											{40, -10, 0}, 
											{40, 50, 40}
		});
	}

	@Test
	public void testGetDepositoNivel() {
		DepositoCombustible dc = new DepositoCombustible(depMax, depNivel);
		double resultado = dc.getDepositoNivel();
		assertEquals(esperado, resultado, 0);
	}

	

}
