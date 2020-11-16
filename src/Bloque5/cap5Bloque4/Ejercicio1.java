package cap5Bloque4;

import Utils.Utils;

public class Ejercicio1 {

	public static void main(String args[]) {
		arrays(); // Llamamos a nuestro método para hacer el array
	}

	/****
	 * Crea un método que reciba un array de números enteros creados al azar entre 0
	 * y 100. El método debe examinar la longitud del array, comprobar que la
	 * longitud es un valor impar y devolver el valor que se encuentre en la
	 * posición media. En caso de que la longitud del array sea un número par no se
	 * debe devolver un valor -1.
	 */

	public static void arrays() {
		int[] Array = new int[(int) Math.round(Math.random() * (100 - 0) + 100)]; // Creamos un array con una longitud
																					// aleatoria
		System.out.println(Utils.analizarArray(Array));
	}
}