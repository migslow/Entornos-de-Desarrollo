package Coches;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class cocheTest {

	@Test
	void testCoche() {
		// fail("Not yet implemented");
	}

	@Test
	void testGetMatricula() {
		coche c = new coche("4567 ABC", "Opel", "Astra", "Negro", 2500);
		assertEquals("4567 ABC", c.getMatricula());
	}

	@Test
	void testSetMatricula() {
		coche c = new coche("4567 ABC", "Opel", "Astra", "Negro", 2500);
		c.setMatricula("1234 QWE");
		assertEquals("1234 QWE", c.getMatricula());
	}

	@Test
	void testGetMarca() {
		coche c = new coche("4567 ABC", "Opel", "Astra", "Negro", 2500);
		assertEquals("Opel", c.getMatricula());
	}

	@Test
	void testSetMarca() {
		coche c = new coche("4567 ABC", "Opel", "Astra", "Negro", 2500);
		c.setMarca("Kia");
		assertEquals("Kia", c.getMatricula());
	}

	@Test
	void testGetModelo() {
		coche c = new coche("4567 ABC", "Opel", "Astra", "Negro", 2500);
		assertEquals("Astra", c.getMatricula());
	}

	@Test
	void testSetModelo() {
		coche c = new coche("4567 ABC", "Opel", "Astra", "Negro", 2500);
		c.setModelo("Clio");
		assertEquals("clio", c.getMatricula());
	}

	@Test
	void testGetColor() {
		coche c = new coche("4567 ABC", "Opel", "Astra", "Negro", 2500);
		assertEquals("Negro", c.getMatricula());
	}

	@Test
	void testSetColor() {
		coche c = new coche("4567 ABC", "Opel", "Astra", "Negro", 2500);
		c.setColor("Blanco");
		assertEquals("Blanco", c.getMatricula());
	}

	@Test
	void testGetLongitud() {
		coche c = new coche("4567 ABC", "Opel", "Astra", "Negro", 2500);
		assertEquals("4567 ABC", c.getMatricula());
	}

	@Test
	void testSetLongitud() {
		coche c = new coche("4567 ABC", "Opel", "Astra", "Negro", 2500);
		c.setLongitud(3000);
		assertEquals(3000, c.getMatricula());
	}

	@Test
	void testToString() {
		coche c = new coche("4567 ABC", "Opel", "Astra", "Negro", 2500);
		assertEquals("Coche [Matricula=4567 ABC, Marca=Opel, Modelo=Astra, Color=Negro, Longitud=2500]", c.toString());
	}

	@Test
	void testColorCoche() throws Exception {
		coche c = new coche("4567 ABC", "Opel", "Astra", "Negro", 2500);
		
	}

	@Test
	void testMarcaCoche() {
		fail("Not yet implemented");
	}

	@Test
	void testModeloCoche() {
		fail("Not yet implemented");
	}

	@Test
	void testLongitudCoche() {
		fail("Not yet implemented");
	}

}
