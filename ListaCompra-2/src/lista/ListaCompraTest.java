package lista;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class ListaCompraTest {

	@Test
	void testListaCompra() {
		ListaCompra l = new ListaCompra(null);
		assertEquals(0, l.numArticulos());
	}

	@Test
	void testAnyadir() {
		ListaCompra l = new ListaCompra(null);
		l.apuntar("Patatas");
		assertEquals(1, l.numArticulos());
	}

	@Test
	void testQuitar() {
		ListaCompra l = new ListaCompra(null);
		l.apuntar("Limones");
		l.apuntar("Naranjas");
		l.apuntar("Patatas");
		int numElem = l.numArticulos();
		l.borrar("Naranjas");
		assertEquals(numElem - 1, l.numArticulos());
	}

	@Test
	void testNumArticulos() {
		ListaCompra l = new ListaCompra(null);
		assertEquals(0, l.numArticulos());
		l.apuntar("Patatas");
		assertEquals(1, l.numArticulos());
	}

	@Test
	void testApuntarRepetido() {
		ListaCompra l = new ListaCompra(null);
		l.apuntar("Patatas");
		l.apuntar("Patatas");
		assertEquals(1, l.numArticulos());
	}

	@Test
	void testBorrarNoExistente() {
		ListaCompra l = new ListaCompra(null);
		l.apuntar("Limones");
		l.apuntar("Naranjas");
		l.apuntar("Patatas");
		int numElem = l.numArticulos();
		l.borrar("Fresas");
		assertEquals(numElem, l.numArticulos());
	}

}
