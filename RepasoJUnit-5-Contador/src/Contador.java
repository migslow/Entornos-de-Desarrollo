
public class Contador {
	int numero;

	public Contador() {
		this.numero = 0;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void incrementar() {
		numero++;
	}

	public void decrementar() {
		numero--;
	}

	public void duplicar() {
		numero = numero * 2;
	}

}
