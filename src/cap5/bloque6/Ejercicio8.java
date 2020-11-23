package cap5.bloque6;

import javax.swing.JOptionPane;

import utils.Utils;

public class Ejercicio8 {

	public static void main(String[] args) {
		int var = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor"));
		int var2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor"));
		int[][] matriz = new int[var][var2];
		Ejercicio1y2.rellenarMatriz(matriz, 0, 1);
		Utils.imprimirMatriz(matriz);
		System.out.println(matrices(matriz));
	}

	/****
	 * Crea un método que compruebe si la matriz es simétrica. (Los elementos de la
	 * matriz (i, j) y (j, i), si existen, son iguales). El método recibirá una
	 * matriz y devolverá un boolean.
	 */
	
	public static boolean matrices(int[][] matriz) {
		boolean igual = true;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] != matriz[j][i]) {
					igual = false;
					break;
				}
		}	
	}
	if (!igual) return false;
	else return true;
	}
}
