package cap5.bloque4;

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
		int[] array = new int[20];
		int auxp = 0; // Variable auxiliar para mayores de 5
		float contadorp = 0;
		int auxm = 0; // Variable auxiliar para menores de 5
		float total = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.NumeroAleatorio(0, 10);
			if (array[i] >= 5) {
				auxp = auxp + array[i]; 
				contadorp++; //Contamos si el numero es mayor que 5 para luego carcular
			}
			if (array[i] < 5) {
				auxm = auxm + array[i];
			}
			total++;
		}
		System.out.println("Porcentaje de aprobados : " + ((contadorp/total)*100) + "%");
		System.out.println("Porcentaje de suspensos : " + ((100)-(contadorp/total)*100) + "%");
		
	}
}
