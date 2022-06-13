package Coches;

public class coche {

	private String matricula;
	private String marca;
	private String modelo;
	private String color;
	private double longitud;

	public coche(String matricula, String marca, String modelo, String color, double longitud) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.longitud = longitud;
	}

	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the longitud
	 */
	public double getLongitud() {
		return longitud;
	}

	/**
	 * @param longitud the longitud to set
	 */
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	@Override
	public String toString() {
		return "coche [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color
				+ ", longitud=" + longitud + "]";
	}

	public void colorCoche(String color) throws Exception {
		if (this.color.contains(color)) {
			throw new Exception("En una excepción, el color del coche debe corresponder con el que tiene el coche");
		} else {
			this.color = null;
			throw new Exception("En una excepción, el coche debe tener un color");
		}
	}

	public void marcaCoche(String marca) throws Exception {
		if (this.color.contains(marca)) {
			throw new Exception("En una excepción, la marca debe corresponder con el que tiene el coche");
		} else {
			this.color = null;
			throw new Exception("En una excepción, el coche debe tener una marca");
		}
	}

	public void modeloCoche(String modelo) throws Exception {
		if (this.color.contains(modelo)) {
			throw new Exception("En una excepción, el modelo debe corresponder con el que tiene el coche");
		} else {
			this.color = null;
			throw new Exception("En una excepción, el coche debe tener un modelo");
		}
	}

	public void longitudCoche(double longitud) throws Exception {

		if (longitud < 2000) {
			throw new Exception(
					"En una busqueda en el registro del concesiorio, un coche no puede tener una longitud minima a 2000");
		} else {
			throw new Exception(
					"En una busqueda en el registro del concesiorio, la longitud del coche debe ser positiva");
		}
	}

}
