package cap5.bloque6;

import javax.swing.JOptionPane;

import utils.Utils;

public class Ejercicio11 {

	public static void main(String[] args) {
		int var = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor"));
		int var2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor"));
		int borrar = (Integer.parseInt(JOptionPane.showInputDialog("Introduce la fila que quieres borrar"))-1);
		int[][] matriz = new int[var][var2];
		Ejercicio1y2.rellenarMatriz(matriz, -3, 3);
		Utils.imprimirMatriz(matriz);
		if (borrar>var) System.out.println("No se puede borrar esa linea");
		else {
			System.out.println("Matriz linea borrada " + borrar);
			Utils.imprimirMatriz(matrizLineaBorrada(matriz,var,var2,borrar));
		}
	}

	/****
	 * Crea un método que pida al usuario un número de fila sobre una matriz. Debes
	 * crear una matriz igual a la original pero eliminando el número de fila que el
	 * usuario ha especificado. El método recibirá una matriz y un valor entero, que
	 * representa una fila de la matriz, y devuelve una nueva matriz.
	 */
	
	public static int[][] matrizLineaBorrada(int[][] matriz, int var,int var2,int borrar) {
		int[][] newMatriz = new int[var-1][var2];
		int aux = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if ((borrar)!=i) {
					newMatriz[i-aux][j] = matriz[i][j];
				}
			}
			aux ++;
		}
		return newMatriz;
	}
}
