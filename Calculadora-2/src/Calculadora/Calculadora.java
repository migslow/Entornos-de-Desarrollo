package Calculadora;

public class Calculadora {
	private int a;
	private int b;

	public Calculadora(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public int suma() {
		return a + b;
	}

	public int resta() {
		return a - b;
	}

	public int multiplicación() {
		return a * b;
	}

	public int division() {
		return a / b;
	}
}
