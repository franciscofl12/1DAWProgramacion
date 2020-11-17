package cap5.bloque4;

import Utils.Utils;

public class Ejercicio3 {
	public static void main(String[] args) {
		arrays();
	}

	/****
	 * Crea un array de 20 números decimales creados al azar entre 0 y 100. Para
	 * crear el número decimal debes generar al azar la parte entera y la parte
	 * decimal por separado para después unir las dos partes. A continuación debes
	 * examinar la cantidad de números cuya parte decimal está comprendida entre .00
	 * y .49
	 */
	
	public static void arrays() {
		int[] arrayEnteros = new int[20]; // Array para los enteros
		float[] arrayDecimal = new float[20]; // Array para los decimales
		float[] array = new float[20]; // Array donde sumaremos ambas partes
		int aux = 0; // Auxiliar para contar los comprendidos entre .00 y .49

		for (int i = 0; i < arrayEnteros.length; i++) {
			arrayEnteros[i] = Utils.NumeroAleatorio(0, 100);
			arrayDecimal[i] = ((float) Utils.NumeroAleatorio(0, 100) / 100); // Casteamos a float para hacer la suma
			if (arrayDecimal[i] > 0.00 && arrayDecimal[i] < 0.49)
				aux++;
			array[i] = arrayEnteros[i] + arrayDecimal[i];
		}
		System.out.println("Numeros comprendidos entre .00 y .49 : " + aux);
	}
}
