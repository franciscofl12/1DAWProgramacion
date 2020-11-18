package cap5.bloque6;

import Utils.Utils;

public class Ejercicio1y2 {

	public static void main(String[] args) {
		matrices();
	}

	/****
	 * 1º - Crea un método que rellena la matriz con valores creados al azar. El
	 * método recibirá la matriz y devolverá "void". 2º - Crea un método que imprima
	 * la matriz en consola. El método recibirá la matriz y devolverá "void".
	 */

	public static void matrices() {
		int[][] matriz = new int[5][5];
		rellenarMatriz(matriz, 5 , 10);
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + " \t");
			}
			System.out.println("\n");
		}
	}

	/****
	 * 
	 * @param matriz Matriz
	 * @param menor Numero menor aleatorio posible en la matriz
	 * @param mayor Numero mayor aleatorio posible en la matriz
	 * @return
	 */
	public static int[][] rellenarMatriz(int[][] matriz, int menor, int mayor) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = Utils.NumeroAleatorio(menor, mayor);
			}
		}
		return matriz;
	}
}
