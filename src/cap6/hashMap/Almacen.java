package cap6.hashMap;

import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class Almacen {
	static HashMap hm = new HashMap();
	
	@SuppressWarnings({ "unused", "unchecked" })
	private static void anadirArticulo(Articulo articulo) {	
		hm.put(hm.size()+1,articulo);
	}
	
	@SuppressWarnings({ "unused", "unchecked" })
	private static void eliminarArticulo(int numeroAEliminar) {	
		hm.remove(numeroAEliminar);
	}
	
	@SuppressWarnings({ "unused", "unchecked" })
	private static void listaArticulos() {
		System.out.println("\nLista de Articulos:");
		Iterator<Articulo> articulos = hm.values().iterator();
		while (articulos.hasNext()) {
			System.out.println("Articulo: "  + articulos.next());
		}
	}
	
	@SuppressWarnings({ "unused", "unchecked" })
	private static void cambiarEstante(int numero) {
		Object articulos[] = hm.keySet().toArray();
		Object articulo = hm.get(articulos[numero]);
		int estanteNuevo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el nuevo estante (EJ: 2 ): "));
		System.out.println(articulo);
		hm.remove(numero);
		hm.put(hm.size()+1,articulo);
	}
	
	public static void main(String[] args) {
		int opcion;
		do {
			System.out.println("Aplicacion Almacen - Menu \n 1- Agregar articulo \n 2- Eliminar Articulo \n 3- Cambiar estante \n 4- Lista de articulos \n 0 - Salir\n\n");
		    opcion = Integer.parseInt(JOptionPane.showInputDialog("Elige una opción: "));
			if (opcion == 1) {
				int codigoBarras = Integer.parseInt(JOptionPane.showInputDialog("Introduce el codigo de barras (EJ: 3231232): "));
				int estante = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de estante (EJ: 3): "));
				String nombre = JOptionPane.showInputDialog("Introduce nombre de producto (EJ: Albondiga): ");
				int stock = Integer.parseInt(JOptionPane.showInputDialog("Introduce el stock (EJ: 5): "));
				Articulo articulo = new Articulo(codigoBarras,estante,nombre,stock);
				anadirArticulo(articulo);
			}
			else {
				if (opcion == 2) {
					listaArticulos();
					int borrar = Integer.parseInt(JOptionPane.showInputDialog("Introduce el producto que quieres eliminar (EJ: (Numero 2 de la lista) 2 ): "));
					eliminarArticulo(borrar);
				}
				else {
					if (opcion == 3) {
						listaArticulos();
						int borrar = Integer.parseInt(JOptionPane.showInputDialog("Introduce el producto que quieres cambiar de estante (EJ: (Numero 2 de la lista) 2 ): "));
						cambiarEstante(borrar);
					}
					else {
						if (opcion == 4) {
							listaArticulos();
						}
					}
				}
			}
	} while (opcion != 0);
}
}

