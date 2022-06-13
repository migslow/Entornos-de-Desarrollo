package banco;

// Ejercicio: Crea un javadoc que incluya TODAS LAS FUNCIONES. Debe también incluir el número de versión: 1.0, tu nombre como autor.
// Recuerda incluir todos los parámetros, los valores de retorno y el lanzamiento de excepciones.

/**
 * @author alumno
 * @version 1.0
 */

public class Cuenta {
	private String numero; // aunque se llame número, es un String xq es un número de cuenta
	private double saldo;
	
	/**
	 * Metodo que construye una nueva cuenta introduciendo los parametros num(String) y saldo(double)
	 * @param num String numero de la cuenta
	 * @param saldo double cantidad de dinero en la cuenta
	 */
	public Cuenta(String num, double saldo) {
		this.numero = num;
		this.saldo = saldo;
	}

	/**
	 * Devuelve el numero (String) de una cuenta. 
	 * @return String
	 */
	public String getNumero() {
		return numero;
	}
	
	/**
	 *metodo que permite cambiar el numero(String) de una cuenta. 
	 * @param numero String
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	/**
	 * Devuelve la cantidad de saldo(double) de una cuenta. 
	 * @return double
	 */
	public double getSaldo() {
		return saldo;
	}
	
	/**
	 * metodo que permite cambiar el saldo(double) de una cuenta.
	 * @param saldo double
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	/**
	 *  Forma el toString del objeto juntando numero y saldo paraq poder mostrarlo.
	 */
	@Override
	public String toString() {
		return "Cuenta [numero=" + numero + ", saldo=" + saldo + "]";
	}
	/**
	 * Añade un importe introducido por parametros de saldo. No permite números negativos o
	 * saltará un error. 
	 * 
	 * @param importe double no puede ser negativo
	 * @throws Exception
	 */
	public void ingresarDinero(double importe) throws Exception {
		if (importe > 0) {
			this.saldo += importe;
		} else {
			throw new Exception("En un ingreso, el importe tiene que ser positivo.");
		}
	}
	
	/**
	 * Quita un importe introducido por parametros de la cuenta, este saldo no puede ser mayor,
	 * cero o negativo, en caso de que no se cumpla lanzará un error.
	 * 
	 * @param importe double no puede ser negativo o mayor que el saldo en la cuenta.
	 * @throws Exception
	 */
	public void extraerDinero(double importe) throws Exception {
		if (importe > 0) {
			if(this.saldo < importe) {
				throw new Exception("En una extracción el importe no puede ser mayor al saldo.");
			}else {
				this.saldo-=importe;
			}
		} else {
			throw new Exception("En una extracción el importe a extraer debe ser positivo.");
		}
		
	}
}
