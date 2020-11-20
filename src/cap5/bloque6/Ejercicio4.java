package cap5.bloque6;

public class Ejercicio4 {
	
	public static void main(String[] args) {
		int[][] matriz = new int[3][3];
		Ejercicio1y2.rellenarMatriz(matriz, 0, 1);
		utils.Utils.imprimirMatriz(matriz);
		System.out.println(matrices(matriz));
	}
	
	public static boolean matrices(int[][] matriz) {

		int ceros = 0;
		int unos = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (matriz[i][j] != 0 && (i != j)) {
					ceros ++; 
				}
				if (matriz[i][j] == 1 && (i == j)) {
					unos ++;
				}
		}
	}
	if (ceros>0 | unos!=0) return false;
	else return true;
}
}
