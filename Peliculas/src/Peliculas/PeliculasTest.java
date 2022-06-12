package Peliculas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PeliculasTest {

	@Test
	void testPeliculas() {
		Peliculas p = new Peliculas(null);
		assertEquals(0, p.numPeliculas());
	}

	@Test
	void testAnyadir() {
		Peliculas p = new Peliculas(null);
		p.anyadir("Star Wars");
		assertEquals(1, p.numPeliculas());
	}

	@Test
	void testBorrar() {
		Peliculas p = new Peliculas(null);
		p.anyadir("Close Eyes");
		p.anyadir("Blue Sky");
		int num = p.numPeliculas();
		p.borrar("Close Eyes");
		assertEquals(num - 1, p.numPeliculas());
	}

	@Test
	void testNumPeliculas() {
		Peliculas p = new Peliculas(null);
		p.anyadir("Gang");
		p.anyadir("Creed");
		p.anyadir("The search");
		assertEquals(3, p.numPeliculas());
	}

	@Test
	void testTaquillaVacia() {
		Peliculas p = new Peliculas(null);
		assertEquals(0, p.numPeliculas());
	}

	@Test
	void testApuntarRepetido() {
		Peliculas p = new Peliculas(null);
		p.anyadir("Gang");
		p.anyadir("Gang");
		assertEquals(1, p.numPeliculas());
	}

	@Test
	void testBorrarNoExistente() {
		Peliculas p = new Peliculas(null);
		p.anyadir("Gang");
		p.anyadir("Maestro");
		p.anyadir("Middle of the night");
		int num = p.numPeliculas();
		p.borrar("Pepito");
		assertEquals(num, p.numPeliculas());
	}

}
