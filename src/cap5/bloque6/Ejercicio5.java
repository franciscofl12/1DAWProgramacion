package cap5.bloque6;

public class Ejercicio5 {

	public static void main(String[] args) {
		int[][] matriz = new int[3][3];
		Ejercicio1y2.rellenarMatriz(matriz, 0, 1);
		utils.Utils.imprimirMatriz(matriz);
		System.out.println(matrices(matriz));
	}

	/****
	 * Crea un método que compruebe si la matriz es triangular superior. (Todos los
	 * elementos que están por debajo de la diagonal principal son nulos).
	 * 
	 * @param matriz
	 * @return
	 */

	public static boolean matrices(int[][] matriz) {
		int ceros = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (matriz[i][j] == 0 && (i > j)) {
					ceros++;
				}

			}
		}
		if (ceros == 3)
			return true;
		else
			return false;

	}
}
