import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ DepositoCombustibleTest_Consumir.class, DepositoCombustibleTest_estaLleno.class,
		DepositoCombustibleTest_estaVacio.class, DepositoCombustibleTest_fill.class,
		DepositoCombustibleTest_getDepositoMax.class, DepositoCombustibleTest_getDepositoNivel.class })
public class AllTests {

}
