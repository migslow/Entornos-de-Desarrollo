package listacompratest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import listacompra.Articulos;

class TestArticulo {

	@Test
	void testArticulos() {
		// fail("Not yet implemented");
	}

	@Test
	void testGetPrecio() {
		Articulos art = new Articulos(12.23, "Manzanas", "Descripcion");
		assertEquals(12.23, art.getPrecio());
	}

	@Test
	void testGetPrecioNegativo() {
		Articulos art = new Articulos(-12.23, "Manzanas", "Descripcion");
		assertEquals(10.0, art.getPrecio());
	}

	@Test
	void testSetPrecioNegativo() {
		Exception e = assertThrows(Exception.class, () -> {
			Articulos art = new Articulos(12, "Manzana", "Descripcion");
			art.setPrecio(-2.5);
		}, "se esperaba una excepcion");
		assertEquals(e.getMessage(), "No se puede poner un precio nevativo");
	}

	@Test
	void testGetNombre() {
		fail("Not yet implemented");
	}

	@Test
	void testSetNombre() {
		fail("Not yet implemented");
	}

	@Test
	void testGetDescripcion() {
		fail("Not yet implemented");
	}

	@Test
	void testSetDescripcion() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

}
