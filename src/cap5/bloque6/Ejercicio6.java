package cap5.bloque6;

public class Ejercicio6 {

	public static void main(String[] args) {
		int[][] matriz = new int[4][3];
		Ejercicio1y2.rellenarMatriz(matriz, 0, 1);
		utils.Utils.imprimirMatriz(matriz);

		System.out.println(esMatrizDispersa(matriz));
	}

	/****
	 * Crea un método que compruebe si la matriz es dispersa. (Todos las filas y
	 * todas las columnas contienen al menos un elemento nulo).
	 * 
	 * @param matriz
	 * @return
	 */

	public static boolean esMatrizDispersa(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			boolean hayCero = false;
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == 0) {
					hayCero = true;
					break;
				}
			}
			if (hayCero == false) {
				return false;
			}
		}
		for (int j = 0; j < matriz[0].length; j++) {
			boolean hayCero = false;
			for (int k = 0; k < matriz.length; k++) {
				if (matriz[k][j] == 0) {
					hayCero = true;
					break;
				}
			}
		}
		return true;
	}
}
