package Coche;

import java.util.ArrayList;

public class coche {

	ArrayList<String> lista = new ArrayList<String>();

	public coche(ArrayList<String> lista) {
		super();
		this.lista = new ArrayList<String>();
	}

	public void anyadir(String coche) {
		if (this.lista.contains(coche)) {
			
			System.out.println("El coche se encuentra en el concesionario");
		} else {
			this.lista.add(coche);
			System.out.println("El coche se añadio al concesionario");
		}
	}

	public void borrar(String coche) {
		if (this.lista.contains(coche)) {
			this.lista.remove(coche);
		} else {
			System.out.println("El coche no esta en el concesionario");
		}
	}

	public int numCochesConcesio() {
		return this.lista.size();
	}

	public boolean numCochesConceVacia() {
		return this.lista.isEmpty();
	}

}
