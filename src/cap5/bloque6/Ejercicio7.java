package cap5.bloque6;

import javax.swing.JOptionPane;

import utils.Utils;

public class Ejercicio7 {

	public static void main(String[] args) {
		int var = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor"));
		int var2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor"));
		int[][] matriz = new int[var][var2];
		Ejercicio1y2.rellenarMatriz(matriz, 0, 1);
		Utils.imprimirMatriz(matriz);
		Utils.imprimirArray(matrices(matriz, var, var2));
	}

	/****
	 * 7º - Crea un método que construya un array unidimensional con todos los
	 * elementos de la matriz. El método recibirá una matriz y devolverá un array.
	 * 
	 * @param matriz
	 * @param var
	 * @param var2
	 * @return
	 */
	public static int[] matrices(int[][] matriz, int var, int var2) {
		int[] array = new int[var * var2];
		int contador = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				array[i + contador] = matriz[i][j];
				contador++;
			}
			contador--;
		}
		return array;
	}
}
