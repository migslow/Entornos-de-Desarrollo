package Peliculas;

import java.util.ArrayList;

public class Peliculas {
	ArrayList<String> taquilla = new ArrayList<String>();

	public Peliculas(ArrayList<String> taquilla) {
		super();
		this.taquilla = new ArrayList<String>();
	}

	public void anyadir(String Peli) {
		if (this.taquilla.contains(Peli)) {
			System.out.println("Se encuentra actualmente en taquilla");
		} else {
			taquilla.add(Peli);
			System.out.println("Se a añadido a la taquilla");
		}
	}

	public void borrar(String Peli) {
		if (this.taquilla.contains(Peli)) {
			this.taquilla.remove(Peli);
		} else {
			System.out.println("Se a borrado de la taquilla");
		}
	}

	public int numPeliculas() {
		return this.taquilla.size();
	}

	public boolean taquillaVacia() {
		return this.taquilla.isEmpty();
	}

}
