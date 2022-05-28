package listacompra;

public class Main {

	public static void main(String[] args) {
		Lista lista = new Lista("Prueba");
		lista.anyadirArticulo(new Articulos(2.4, "Manzanas", "Manzana Golden"));
		lista.anyadirArticulo(new Articulos(2.3, "Tomates", "Tomates Raff"));
		lista.anyadirArticulo(new Articulos(3, "Naranjas", "Naranjas de zumo"));
		lista.anyadirArticulo(new Articulos(14, "Mango", "Mango verde"));
		System.out.println(lista);
		lista.anyadirArticuloUltimo();
		System.out.println(lista);
	}

}
