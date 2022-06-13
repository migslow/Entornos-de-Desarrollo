import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import banco.Cuenta;

public class TestCuenta {

	@Test
	void testExtraerDineroDeCuentaConSaldoInsuficiente() {
		try {
			Cuenta cu = new Cuenta("Juanito123", 199.99);
			cu.extraerDinero(200);
			fail("Error: Si hemos llegado hasta aquí es que no ha saltado la excepción");
		} catch (Exception e) {
			assertEquals(e.getMessage(), "En una extracción el importe no puede ser mayor al saldo.");
		}
	}

	@Test
	void testExtraerDineroDeCuentaConSaldoSuficiente() {
		try {
			Cuenta cu = new Cuenta("Juanito123", 199.99);
			cu.extraerDinero(250);
			fail("Error: Si hemos llegado hasta aquí es que no ha saltado la excepción");
		} catch (Exception e) {
			assertEquals(e.getMessage(), "En una extracción el importe que es mayor al saldo.");
		}
	}
	
	@Test
	void testIngresarDineroDeCuentaConSaldoSuficiente() {
		try {
			Cuenta cu = new Cuenta("Juanito123", 199.99);
			cu.extraerDinero(250);
			fail("Error: Si hemos llegado hasta aquí es que no ha saltado la excepción");
		} catch (Exception e) {
			assertEquals(e.getMessage(), "En una extracción el importe que es mayor al saldo.");
		}
	}
	
	@Test
	void testIngresarDineroDeCuentaConSaldoInsuficiente() {
		try {
			Cuenta cu = new Cuenta("Juanito123", 199.99);
			cu.extraerDinero(250);
			fail("Error: Si hemos llegado hasta aquí es que no ha saltado la excepción");
		} catch (Exception e) {
			assertEquals(e.getMessage(), "En una extracción el importe que es mayor al saldo.");
		}
	}
}
