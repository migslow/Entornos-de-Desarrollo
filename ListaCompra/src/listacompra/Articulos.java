package listacompra;

public class Articulos {
	double precio;
	String nombre;
	String descripcion;

	public Articulos(double precio, String nombre, String descripcion) {
		super();
		if (precio <= 0) {
			this.precio = 10;
		} else {
			this.precio = precio;
		}
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) throws Exception {
		if (precio < 0) {
			Exception e = new Exception("No se puede poner un precio nevativo");
			throw e;
		} else {
			this.precio = precio;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Lista [precio=" + precio + ", nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}

}
