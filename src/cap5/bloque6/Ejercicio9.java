package cap5.bloque6;

import javax.swing.JOptionPane;

import utils.Utils;

public class Ejercicio9 {

	public static void main(String[] args) {
		int var = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor"));
		int var2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor"));
		int[][] matriz = new int[var][var2];
		Ejercicio1y2.rellenarMatriz(matriz, 0, 1);
		Utils.imprimirMatriz(matriz);
		System.out.println("Matriz Traspuesta\n");
		Utils.imprimirMatriz(matrices(matriz));
	}

	/****
	 * Crea un método que realice la matriz traspuesta de la que recibe. El método
	 * recibe una matriz y devuelve otra matriz, la traspuesta.
	 * 
	 * @param matriz
	 * @param var
	 * @param var2
	 * @return
	 */
	public static int[][] matrices(int[][] matriz) {
		int[][] newMatriz = new int[matriz.length][matriz[0].length];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				newMatriz[j][i] = matriz[i][j];
			}
		}
		return newMatriz;
	}
}
