/**
 * @author migslow
 * @version 1.0
 * Clase Perro que va a representar las caracteristicas que tiene un perro.
 */
package Perro;

public class Perro {
	/**
	 * Atributos de la clase
	 */
	private String nombre;
	private String color;
	private int edad;

	/**
	 * Contructor con 3 parametros
	 * @param nombre nombre del perro
	 * @param color color del perro
	 * @param edad edad del perro
	 */

	public Perro(String name, String color, int edad) {
		super();
		this.nombre = name;
		this.color = color;
		this.edad = edad;
	}

	/**
	 * Devuelve el nombre del perro
	 * @return nombre del perro
	 */

	public String getName() {
		return nombre;
	}

	/**
	 * Define el nombre del perro
	 * @param nombre del perro
	 */

	public void setName(String name) {
		this.nombre = name;
	}

	/**
	 * Devuelve el color del perro
	 * @return color del perro
	 */

	public String getColor() {
		return color;
	}

	/**
	 * Define el color del perro
	 * @param color del perro
	 */

	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Devuelve la edad del perro
	 * @return edad del perro
	 */

	public int getEdad() {
		return edad;
	}

	/**
	 * Define la edad del perro
	 * @param edad del perro
	 */

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Perro [name=" + nombre + ", color=" + color + ", edad=" + edad + "]";
	}

}
