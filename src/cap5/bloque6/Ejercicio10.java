package cap5.bloque6;

import javax.swing.JOptionPane;

import utils.Utils;

public class Ejercicio10 {

	public static void main(String[] args) {
		int var = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor"));
		int var2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor"));
		int[][] matriz = new int[var][var2];
		Ejercicio1y2.rellenarMatriz(matriz, -3, 3);
		Utils.imprimirMatriz(matriz);
		System.out.println("Matriz Opuesta\n");
		Utils.imprimirMatriz(opuesta(matriz));
	}

	/****
	 * Crea un método que realice la matriz opuesta de la que recibe. El método
	 * recibe una matriz y devuelve otra, la opuesta.
	 */
	
	public static int[][] opuesta(int[][] matriz) {
		int[][] newMatriz = new int[matriz.length][matriz[0].length];
		for (int i = 0; i < newMatriz.length; i++) {
			for (int j = 0; j < newMatriz[i].length; j++) {
				newMatriz[i][j] = (matriz[i][j]*-1);
			}
		}
		return newMatriz;
	}
}
