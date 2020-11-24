package cap5.bloque7;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class ejercicio1 {

	/**
	 * Escribe un programa editor de textos. Debes utilizar la consola de Java. El objetivo es que se pueda editar 
	 * el contenido de un archivo ficticio. Para hacer esto utilizarás una lista de elementos de tipo String. Cada 
	 * línea del texto será representada como un String. Debes mostrar un menú en pantalla, que contenga todas las 
	 * opciones siguientes, y que funcionen adecuadamente:
      a) "Agregar una línea al texto". Pediras al usuario un String y lo agregarás al final de la lista que representa 
      	tu fichero ficticio.
      b) "Insertar una línea en cualquier posición del texto". Pedirás al usuario un String y un número. Insertarás el 
      	String en la línea pedida.
      c) "Editar una línea (reescribir su contenido)". Pedirás al usuario un número de línea para sobrescribir, 
      	mostrarás al usuario la línea actual que desea sobrescribir. Pedirás un nuevo String. Eliminarás el String 
      	actual y cambiarás con el nuevo
      d) "Borrar una línea". Pedirás un número de línea y la eliminarás de la lista.
      e) "Cortar un conjunto de líneas", (marcadas por su posición inicial y final). Pedirás un número de línea inicial 
      	y uno final. "Transportarás todas las líneas del intervalo a una nueva lista y las borrarás de la lista original.
      f) "Pegar un conjunto de líneas cortadas en una determinada posición". Pedirás un número de línea en la que insertar 
      	lo que tienes cortado con la opción anterior.
      g) "Imprimir el fichero". Mostrarás cada línea del fichero ficticio, aparecerá numerada en la consola.
	 * @param args
	 */
	public static void main(String[] args) {
		// Declaro variables necesarias
		int opcion;
		List<String> fichero = new ArrayList<String>();
		
		// Inicializo algo de contenido en la lista. Esto debe eliminarse cuando el programa esté finalizado
		fichero.add("Primera línea"); fichero.add("Segunda línea"); fichero.add("Tercera línea");
		
		// Bucle principal de la aplicación
		do {
			// Llamo a mostrar el menú y pedir una opción al usuario.
			opcion = menu();
		
			// Cada caso en función de la opción elegida por el usuario
			switch (opcion) {
			case (0): // Ha elegido abandonar la aplicación
				System.out.println("Adios!");
				break;
			case 1:
				addLine(fichero);
				break;
			case 2:
				addLineOnPosition(fichero);
				break;
			case 3:
				editLine(fichero);
				break;
			case 4:
				removeLine(fichero);
				break;
			case 5: 
				List<String> ficheroaux = cutLines(fichero);
			case 6:
				if (ficheroaux != null) {
					pasteLines(fichero,ficheroaux);
				}
				else System.out.println("No hay ningunas lineas cortadas para pegar.");
				break;
			case 7: // Ha elegido visualizar el fichero
				visualizaLista(fichero);
				break;
			default:
				System.out.println("Opción no válida");
			}
			
			
		} while (opcion != 0);

	}

	/**
	 * Muestra un menú en pantalla y pide una opción al usuario
	 * @return
	 */
	public static int menu () {
		String strMenu = "\n\nMenú"
				+ "\n0.- Salir"
				+ "\n1.- Agregar una línea"
				+ "\n2.- Insertar una línea en una posición"
				+ "\n3.- Editar una línea"
				+ "\n4.- Eliminar una línea"
				+ "\n5.- Cortar un conjunto de líneas"
				+ "\n6.- Pegar un conjunto de líneas"
				+ "\n7.- Visualizar el fichero"
				+ "\n\nIntroduzca su opción: ";
		// Muestro el menú y pido una opción al usuario
		int opcionUsuario = Integer.parseInt(JOptionPane.showInputDialog(strMenu));
		// Devuelvo la opción seleccionada
		return opcionUsuario;
	}
	
	/**
	 * Recorre la lista que simboliza el fichero, exponiendo las líneas en pantalla y cada una con su número de línea
	 * @param lista
	 */
	public static void visualizaLista (List<String> lista) {
		System.out.println("\n\nContenido del fichero");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println("\t" + i + " - " + lista.get(i));
		}
	}
	
	public static void addLine (List<String> lista) {
		String linea = JOptionPane.showInputDialog("Introduce una linea: ");
		lista.add(linea);
	}
	
	public static void addLineOnPosition (List<String> lista) {
		String linea = JOptionPane.showInputDialog("Introduce una linea: ");
		int posicion = Integer.parseInt(JOptionPane.showInputDialog("Introduce una posicion: "));
		lista.add(posicion,linea);
	}
	
	public static void editLine (List<String> lista) {
		int posicion = Integer.parseInt(JOptionPane.showInputDialog("Introduce una posicion: "));
		while (lista.size() < posicion | 0 > posicion) {
			int posicion2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce una posicion: "));
			posicion = posicion2;
		}
		lista.remove(posicion);
		String linea = JOptionPane.showInputDialog("Introduce una linea: ");
		lista.add(posicion,linea);
	}
	public static void removeLine (List<String> lista) {
		int posicion = Integer.parseInt(JOptionPane.showInputDialog("Introduce una posicion: "));
		while (lista.size() < posicion | 0 > posicion) {
			int posicion2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce una posicion: "));
			posicion = posicion2;
		}
		lista.remove(posicion);
	}
	public static List<String> cutLines (List<String> lista) {
		List<String> ficheroaux = new ArrayList<String>();
		int posicionmenor = Integer.parseInt(JOptionPane.showInputDialog("Introduce una posicion: "));
		while (lista.size() < posicionmenor | 0 > posicionmenor) {
			int posicion2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce una posicion: "));
			posicionmenor = posicion2;
		}
		int posicionmayor = Integer.parseInt(JOptionPane.showInputDialog("Introduce una posicion: "));
		while (lista.size() < posicionmayor | 0 > posicionmayor) {
			int posicion2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce una posicion: "));
			posicionmayor = posicion2;
		}
		for (int i = 0; i < (posicionmayor-posicionmenor)+1; i++) {
			ficheroaux.add(i,lista.get(posicionmenor+i));
			System.out.println(ficheroaux.get(i));
		}
		return ficheroaux;
	}
	
	public static void pasteLines (List<String> lista, List<String> listaux) {
		int posicion = Integer.parseInt(JOptionPane.showInputDialog("Introduce una posicion: "));
		while (lista.size() < posicion | 0 > posicion) {
			int posicion2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce una posicion: "));
			posicion = posicion2;
		}
		for (int i = 0; i < lista.size()-posicion; i++) {
			lista.add(posicion,listaux.get(i));
		}
	}
}
