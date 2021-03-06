package Builder;

public class Persona {

	private String nombre;
	private String dni;
	private int edad;

	public Persona() {
	}

	//

	Persona(PersonaBuilder builder) {
		this.nombre = builder.getNombre();
		if (builder.getDni() == null)
			throw new IllegalArgumentException("No se puede introducir una persona sin DNI"); // System.out.print("No se
																								// puede introducir una
																								// persona sin DNI");
		this.dni = builder.getDni();
		this.edad = builder.getEdad();
	}

	//

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + "]";
	}

}
