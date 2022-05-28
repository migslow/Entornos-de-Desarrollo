package listacompra;

import java.util.ArrayList;

public class Lista {
	String nombre;
	ArrayList<Articulos> lista;

	public Lista(String nombre) {
		lista = new ArrayList<Articulos>();
		this.nombre = nombre;
	}

	public void anyadirArticulo(Articulos art) {
		lista.add(art);
	}

	public void borrarArticulo(Articulos art) {
		lista.remove(art);
	}

	public void anyadirArticuloUltimo() {
		lista.remove(lista.size() - 1);
	}

	@Override
	public String toString() {
		return "Lista [nombre=" + nombre + ", lista=" + lista + "]";
	}

}
