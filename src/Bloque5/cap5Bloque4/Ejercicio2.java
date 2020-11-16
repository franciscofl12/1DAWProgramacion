package cap5Bloque4;

import Utils.*;

public class Ejercicio2 {

	public static void main(String[] args) {
		arrays();
	}

	/****
	 * Crea un array de 20 números enteros generados al azar entre 0 y 10. Analiza
	 * el array y calcula el porcentaje (con decimales) de notas aprobadas ( >= 5 )
	 * y de notas suspensas.
	 */

	public static void arrays() {
		int[] Array = new int[20];
		int auxp = 0; // Variable auxiliar para mayores de 5
		int contadorp = 0;
		int auxm = 0; // Variable auxiliar para menores de 5
		int contadorm = 0;
		for (int i = 0; i < Array.length; i++) {
			Array[i] = Utils.NumeroAleatorio(0, 10);
			if (Array[i] >= 5) {
				auxp = auxp + Array[i]; 
				contadorp=contadorp+1;
			}
			if (Array[i] < 5) {
				auxm = auxm + Array[i]; 
				contadorm=contadorm+1;
			}
		}
		
	}
}
