package cap5.bloque6;

import utils.Utils;

public class Ejercicio1y2 {

	public static void main(String[] args) {
		int[][] matriz = new int[5][5];
		rellenarMatriz(matriz, 5 , 10);
		imprimirMatriz(matriz);
	}

	/****
	 * 1º - Crea un método que rellena la matriz con valores creados al azar. El
	 * método recibirá la matriz y devolverá "void". 2º - Crea un método que imprima
	 * la matriz en consola. El método recibirá la matriz y devolverá "void".
	 */

	public static void imprimirMatriz(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
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
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = Utils.NumeroAleatorio(menor, mayor);
			}
		}
		return matriz;
	}
}
