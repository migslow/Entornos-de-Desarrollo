package testsCuenta;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import banco.Cuenta;

class TestsCuenta {
	private static Cuenta c;
	
	@Test
	void testCuenta() {
		c = new Cuenta("001", 7);
		assertEquals("001", c.getNumero());
		assertEquals(7, c.getSaldo());
	}

	@Test
	void testGetNumero() {
		c = new Cuenta("001", 7);
		assertEquals("001", c.getNumero());
	}

	@Test
	void testSetNumero() {
		c = new Cuenta("001", 7);
		c.setNumero("002");
		assertEquals("002", c.getNumero());
	}

	@Test
	void testGetSaldo() {
		c = new Cuenta("001", 7);
		assertEquals(7, c.getSaldo());
	}

	@Test
	void testSetSaldo() {
		c = new Cuenta("001", 7);
		c.setSaldo(8);
		assertEquals(8, c.getSaldo());
	}

	@Test
	void testToString() {
		c = new Cuenta("001", 7);
		assertEquals("Cuenta [numero=001, saldo=7.0]", c.toString());
	}

	@Test
	void testIngresarDinero() {
		c = new Cuenta("001", 7);
		try {
			c.ingresarDinero(3);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(10, c.getSaldo());
	}
	
	@Test
	void testIngresarDineroNegativo() {
		Exception e = assertThrows(Exception.class,
				// pasas una lambda para que el parametro como tal sea un excepción
				()->{
						c = new Cuenta("001", 7);
						c.ingresarDinero(-2);
					}, "Se esperaba una excepción"
				);// fin metodo assertThrows
		assertEquals("En un ingreso, el importe tiene que ser positivo.",e.getMessage());
	}

	@Test
	void testExtraerDinero() {
		c = new Cuenta("001", 7);
		try {
			c.extraerDinero(2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(5, c.getSaldo());
	}
	
	@Test
	void testExtraerDineroNegativo() {
		Exception e = assertThrows(Exception.class,
				// pasas una lambda para que el parametro como tal sea un excepción
				()->{
					c = new Cuenta("001", 7);
					c.extraerDinero(-2);
					}, "Se esperaba una excepción"
				);// fin metodo assertThrows
		assertEquals("En una extracción el importe a extraer debe ser positivo.",e.getMessage());
	}
	
	@Test
	void testExtraerDineroDemas() {
		Exception e = assertThrows(Exception.class,
				// pasas una lambda para que el parametro como tal sea un excepción
				()->{
					c = new Cuenta("001", 7);
					c.extraerDinero(8);
					}, "Se esperaba una excepción"
				);// fin metodo assertThrows
		assertEquals("En una extracción el importe no puede ser mayor al saldo.",e.getMessage());
	}
}
