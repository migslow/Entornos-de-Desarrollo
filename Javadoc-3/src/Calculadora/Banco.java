/**
 * @author migslow
 * @version 1.0
 * @since 2022
 * @see youtube
 * Clase
 */
package Calculadora;

public class Banco {
	
	/**
	 * Atributos privados de la clase
	 */

	private double saldo;
	/**
	 *  Atributo double que establece el saldo de una cuenta
	 */
	private int numeroCuenta;
	
	/**
	 * atributo que establece el numero de una cuenta
	 */
	private int usuario;
	
	/**
	 * Atributo cadena que establece el nif de un usuario
	 */
	private int edadUsuario;
	/**
	 * Atributo int que establece la edad de un usuario
	 */
	

	/**
	 * Constructor con 4 parametros
	 * @param saldo saldo que se encuetra actualemetne en la cuenta de un usuario
	 * @param numeroCuenta numero de cuenta que tiene cuenta dentro del banco
	 * @param usuario nombre del usuario dentro del banco
	 * @param edadUsuario edad de tiene un usuario
	 */
	public Banco(double saldo, int numeroCuenta, int usuario, int edadUsuario) {
		super();
		this.saldo = saldo;
		this.numeroCuenta = numeroCuenta;
		this.usuario = usuario;
		this.edadUsuario = edadUsuario;
	}

	/**
	 * Devuelve el saldo que tiene una cuenta de un usuario 
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * @return the numeroCuenta
	 */
	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	/**
	 * @param numeroCuenta the numeroCuenta to set
	 */
	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	/**
	 * @return the usuario
	 */
	public int getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(int usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the edadUsuario
	 */
	public int getEdadUsuario() {
		return edadUsuario;
	}

	/**
	 * @param edadUsuario the edadUsuario to set
	 */
	public void setEdadUsuario(int edadUsuario) {
		this.edadUsuario = edadUsuario;
	}

	@Override
	public String toString() {
		return "Calculadora [saldo=" + saldo + ", numeroCuenta=" + numeroCuenta + ", usuario=" + usuario
				+ ", edadUsuario=" + edadUsuario + "]";
	}

	public int sumaSaldo(int num1, int num2) {
		return num1 + num2;
	}

	public int restaSaldo(int num1, int num2) {
		return num1 - num2;
	}
}
