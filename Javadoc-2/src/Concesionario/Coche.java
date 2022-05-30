/**
 * @author migslow
 * @version 1.0
 * Clase Coche que muestran las caracteristicas de un coche que esta en un concesionario.
 */
package Concesionario;

import java.util.Date;

public class Coche {
	/**
	 * Atributos privados de la clase
	 */
	private String color;
	private int cv;
	private Date anyoAdquisición;
	private String matricula;
	private String marca;

	/**
	 * Constructor con 5 parametros
	 * @param color color que lleva el coche desde que salio de la fabrica.
	 * @param cv caballos de fuerza que tiene el coche.
	 * @param anyoAdquisición año de adquisición que establece la fecha cuando compraron el coche.
	 * @param matricula matricula que lleva el coche.
	 * @param marca marca del coche.
	 */
	public Coche(String color, int cv, Date anyoAdquisición, String matricula, String marca) {
		super();
		this.color = color;
		this.cv = cv;
		this.anyoAdquisición = anyoAdquisición;
		this.matricula = matricula;
		this.marca = marca;
	}

	/** 
	 * Devuelve el color de serie que tiene el coche desde que salio de la fabrica
	 * @return color color del coche
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Define el color del coche
	 * @param color color del coche
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Devuelve los caballos de fuerza que tiene de serie el coche
	 * @return cv caballos de fuerza del coche
	 */
	public int getCv() {
		return cv;
	}

	/**
	 * Define los caballos de fuerza que tiene de serie el coche
	 * @param cv caballos de fuerza del coche
	 */
	public void setCv(int cv) {
		this.cv = cv;
	}

	/**
	 * Devuelve la fecha desde que el duelo del coche lo adquirio
	 * @return anyoAdquisición fecha de anyoAdquisición de cuando se compro el coche
	 */
	public Date getAnyoAdquisición() {
		return anyoAdquisición;
	}

	/**
	 * Define la fecha de la adquisición del coche
	 * @param anyoAdquisición fecha de anyoAdquisición del coche 
	 */
	public void setAnyoAdquisición(Date anyoAdquisición) {
		this.anyoAdquisición = anyoAdquisición;
	}

	/**
	 * Devuelve la matricula con la combinación de caracteres alfanumeticos que establece el concesionario a un coche 
	 * @return matricula matricula que tiene el coche cuando sale del concesionario
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * Define la matricula con una combinación de caracteres alfanumericos despues de salir del concesionario
	 * @param matricula matricula que tiene el coche
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	/**
	 * Devuelve la marca de un fabricante que se dedica al sector automovilistico
	 * @return marca marca del coche
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * Modifica la marca del coche
	 * @param marca marca del coche
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Coche [color=" + color + ", cv=" + cv + ", anyoAdquisición=" + anyoAdquisición + ", matricula="
				+ matricula + ", marca=" + marca + "]";
	}

}
