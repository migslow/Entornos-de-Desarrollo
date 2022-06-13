package CocheTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import Coche.coche;

class cocheTest {

	@Test
	void testCocesionario() {
		coche c = new coche(null);
		assertEquals(0, c.numCochesConcesio());
	}

	@Test
	void testAnyadir() {
		coche c = new coche(null);
		c.anyadir("Toyota Prius");
		c.anyadir("Opel Corsa");
		assertEquals(2, c.numCochesConcesio());
	}

	@Test
	void testBorrar() {
		coche c = new coche(null);
		c.anyadir("Toyota Prius");
		c.anyadir("Opel Corsa");
		c.anyadir("Opel Astra");
		c.anyadir("Nissan Skyline");
		int numCoche = c.numCochesConcesio();
		c.borrar("Opel Astra");
		assertEquals(numCoche - 1, c.numCochesConcesio());
	}

	@Test
	void testNumCochesConcesio() {
		coche c = new coche(null);
		c.anyadir("Toyota Prius");
		c.anyadir("Opel Corsa");
		c.anyadir("Opel Astra");
		c.anyadir("Nissan Skyline");
		assertEquals(4, c.numCochesConcesio());
	}

	@Test
	void testNumCochesVacia() {
		coche c = new coche(null);
		assertEquals(0, c.numCochesConcesio());
	}

}
