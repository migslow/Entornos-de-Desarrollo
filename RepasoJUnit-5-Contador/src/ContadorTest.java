
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContadorTest {

	@Test
	void testIncrementar() {
		Contador c = new Contador();
		c.incrementar();
		c.incrementar();
		c.incrementar();
		assertEquals(3, c.getNumero());

	}

	@Test
	void testDecrementar() {
		Contador c = new Contador();
		c.setNumero(10);
		c.decrementar();
		c.decrementar();
		assertEquals(8, c.getNumero());
	}

	@Test
	void testDuplicar() {
		Contador c = new Contador();
		c.setNumero(2);
		c.duplicar();
		assertEquals(4, c.getNumero());
	}

}
