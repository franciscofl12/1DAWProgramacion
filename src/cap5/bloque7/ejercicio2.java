package cap5.bloque7;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import utils.Utils;

public class ejercicio2 {

	/****
	 * Realiza un programa que trabaje con una Lista de elementos Integer. Debes
	 * mostrar un menú en pantalla y ofrecer al usuario las siguientes opciones a
	 * realizar sobre la lista: a) "Abandonar el programa". b) "Crear aleatoriamente
	 * la lista de valores". Pedirás al usuario los siguientes datos: longitud de la
	 * lista, valor mínimo y valor máximo. A continuación limpiarás la lista (por si
	 * contenía valores), y agregarás tantos elementos enteros como se haya
	 * indicado, con valores que deben oscilar entre el mínimo y el máximo señalado.
	 * c) "Calcular suma, media, mayor y menor". Mostrarás en pantalla esos cuatro
	 * valores. d) "Agregar una cantidad de nuevos valores". Pedirás al usuario los
	 * siguientes datos: cuántos datos nuevos quiere agregar, posición a partir de
	 * la que se deben introducir, valor mínimo y valor máximo. Incluirás tantos
	 * valores como indique el usuario, en la posición indicada, con valores entre
	 * mínimo y máximo. e) "Eliminar elementos cuyo valor esté en un intervalo".
	 * Pedirás dos valores al usuario (mínimo y máximo), que conforman un intervalo.
	 * Eliminarás los valores de la lista de elementos que se encuentren dentro de
	 * ese intervalo (incluyendo los límites) e informarás de cuantos elementos has
	 * eliminado de la lista. f) "Imprimir la lista". Mostrarás la lista en
	 * pantalla.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		// Declaro variables necesarias
		int opcion;
		List<Integer> fichero = new ArrayList<Integer>();

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
				int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce una Longitud: "));
				int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero menor: "));
				int num3 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero mayor: "));
				randomCreate(fichero, num1, num2, num3);
				break;
			case 2:
				calculo(fichero);
				break;
			case 3:
				int num4 = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de numeros: "));
				int num5 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero mayor: "));
				int num6 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero menor: "));
				int num7 = Integer.parseInt(JOptionPane.showInputDialog("Introduce una posicion: "));
				addToList(fichero, num4, num5, num6, num7);
				break;
			case 4:
				int num8 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero mayor: "));
				int num9 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero menor: "));
				eliminateRange(fichero, num8, num9);
				break;
			case 5:
				visualizaLista(fichero);
				break;
			default:
				System.out.println("Opción no válida");
			}

		} while (opcion != 0);

	}

	/**
	 * Muestra un menú en pantalla y pide una opción al usuario
	 * 
	 * @return
	 */
	public static int menu() {
		String strMenu = "\n\nMenú" + "\n0.- Salir" + "\n1.- Crear aleatoriamente la lista de valores"
				+ "\n2.- Calcular suma, media, mayor y menor" + "\n3.- Agregar una cantidad de nuevos valores" + "\n4.- Eliminar elementos cuyo valor esté en un intervalo"
				+ "\n5.- Imprimir la lista";
		// Muestro el menú y pido una opción al usuario
		int opcionUsuario = Integer.parseInt(JOptionPane.showInputDialog(strMenu));
		// Devuelvo la opción seleccionada
		return opcionUsuario;
	}
	
	/***
	 * 
	 * @param lista
	 * @param num longitud de la lista
	 * @param num1 numero menor posible
	 * @param num2 numero mayor posible
	 */
	
	public static void randomCreate(List<Integer> lista, int num,int num1, int num2) {
		lista.clear();
		
		for (int i = 0; i < num; i++) {
			lista.add(Utils.NumeroAleatorio(num1, num2));
		}
		
	}
	
	/****
	 * 
	 * @param lista
	 */
	
	public static void calculo(List<Integer> lista) {
		int suma = 0; int media= 0; int mayor = lista.get(0); int menor = lista.get(0);
		
		for (int i = 0; i < lista.size(); i++) {
			suma += lista.get(i);
			if (mayor< lista.get(i)) mayor = lista.get(i);
			if (menor>lista.get(i)) menor = lista.get(i);
		}
		media = (suma/lista.size());
		System.out.println("Suma Total : "+ suma +
				"\n Media : " + media +
				"\n Mayor : " + mayor +
				"\n Menor : " + menor);
	}
	
	/****
	 * 
	 * @param lista
	 * @param num numeros de numeros que quiere anadir
	 * @param num1 rango mayor
	 * @param num2 rango menor
	 * @param num3 posicion
	 */
	
	public static void addToList(List<Integer> lista, int num,int num1, int num2, int num3) {
		List<Integer> aux = new ArrayList<Integer>();
		
		for (int i = 0; i < lista.size(); i++) {
			if (i==num3) {
				for (int j = 0; j < num; j++) {
					aux.add(Utils.NumeroAleatorio(num1, num2));
				}
			}
			aux.add(lista.get(i));
		}
	}
	
	/****
	 * 
	 * @param lista
	 * @param num intervalo menor
	 * @param num1 intervalo mayor
	 */
	
	public static void eliminateRange(List<Integer> lista, int num , int num1) {
		for (int i = 0; i < lista.size(); i++) {
			if (i==num) {
				for (int j = num; j < num1+1; j++) {
					lista.remove(j);
				}
			}
		}
	}
	
	public static void visualizaLista (List<Integer> fichero) {
		System.out.println("\n\nContenido del fichero");
		for (int i = 0; i < fichero.size(); i++) {
			System.out.println("\t" + i + " - " + fichero.get(i));
		}
	}
	
	
}
