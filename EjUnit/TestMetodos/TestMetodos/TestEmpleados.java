package TestMetodos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Empresa.Companyia;

public class TestEmpleados {

	@Test
	void testAnyadirEmpleado() {
		// creas una nueva compañia
		Companyia c = new Companyia("Juan");
		// añades un par de empleados
		c.anyadirEmpleado("Pedro");
		c.anyadirEmpleado("Carlos");
		// compruebas con assertEquals que el número historico es igual a 2.
		assertEquals(2, c.getNumEmpleadosHistorico());
	}

	@Test
	void testEliminarEmpleado() {
		// creas una nueva compañía
		Companyia c = new Companyia("Juan");
		// añades 3 empleados
		c.anyadirEmpleado("Pedro");
		c.anyadirEmpleado("Carlos");
		c.anyadirEmpleado("Maria");
		// quitas 1 empleado
		c.eliminarEmpleado("Carlos");
		// compruebas que el número de empleados histórico es = 3;
		assertEquals(3, c.getNumEmpleadosHistorico());

	}
}
