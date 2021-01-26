import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith (Parameterized.class)
public class DepositoCombustibleTest_estaLleno {
	private double depMax;
	private double depNivel;
	private double fill;
	private double consume;
	private boolean esperado;
	
	public DepositoCombustibleTest_estaLleno(double depMax, double depNivel, double fill, double consume, boolean esperado) {
		this.depMax = depMax;
		this.depNivel = depNivel;
		this.fill = fill;
		this.consume = consume;
		this.esperado = esperado;
	}
	
	@Parameters
	public static Collection<Object[]> parametros(){
		return Arrays.asList(new Object[][] {
			{50, 50, 0, 0, true},
			{50, 40, 10, 0, true},
			{50, 40, 20, 5, true},
			{30, 20, 10, 5, false}
		});
	}
	@Test
	public void testEstaLleno() {
		DepositoCombustible dc = new DepositoCombustible(depMax, depNivel);
		depNivel = dc.fill(fill);
		depNivel = dc.consumir(consume);
		boolean resultado = dc.estaLleno();
		assertEquals(esperado, resultado);
	}

}
