import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith (Parameterized.class)
public class DepositoCombustibleTest_estaVacio {
	private double depMax;
	private double depNivel;
	private double fill;
	private double consume;
	private boolean esperado;

	public DepositoCombustibleTest_estaVacio(double depMax, double depNivel, double fill, double consume, boolean esperado) {
		this.depMax = depMax;
		this.depNivel = depNivel;
		this.fill = fill;
		this.consume = consume;
		this.esperado = esperado;
	}
	@Parameters
	public static Collection<Object[]> parametros(){
		return Arrays.asList(new Object[][] {
			{50, 40, 10, 20, false},
			{50, 50, 0, 50, true},
			{50, 40, 0, 50, true}
		});
	}
	@Test
	public void testEstaVacio() {
		DepositoCombustible dc = new DepositoCombustible(depMax, depNivel);
		depNivel = dc.fill(fill);
		depNivel = dc.consumir(consume);
		boolean resultado = dc.estaVacio();
		assertEquals(esperado, resultado);
	}

}
