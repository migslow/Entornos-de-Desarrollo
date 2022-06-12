package CalculadoraTest;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Calculadora.Calculadora;

class CalculadoraTest {

	@Test
	void testCalculadora() {
		Calculadora c = new Calculadora(0, 0);
		equals(0);
	}

	@Test
	void testSuma() {
		Calculadora c = new Calculadora(10, 10);
		int result = c.suma();
		assertEquals(20, result);
	}

	@Test
	void testResta() {
		Calculadora c = new Calculadora(15, 5);
		int result = c.resta();
		assertEquals(10, result);
	}

	@Test
	void testMultiplicación() {
		Calculadora c = new Calculadora(5, 5);
		int result = c.multiplicación();
		assertEquals(25, result);
	}

	@Test
	void testDivision() {
		Calculadora c = new Calculadora(10, 2);
		int result = c.division();
		assertEquals(5, result);
	}

}
