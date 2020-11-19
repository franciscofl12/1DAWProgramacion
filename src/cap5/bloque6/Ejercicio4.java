package cap5.bloque6;

public class Ejercicio4 {
	
	public static void main(String[] args) {
		matrices();
	}
	
	@SuppressWarnings("unused")
	public static void matrices() {
		int[][] matriz = new int[][] { {1, 0, 0},
									   {0, 1, 0},
									   {0, 0, 1} };
		//Ejercicio1y2.rellenarMatriz(matriz, 0, 1);
		Utils.Utils.imprimirMatriz(matriz);
		boolean ceros = true;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (matriz[i][j] != 0 && (i != j)) {
					ceros = false;
					break;
				}
				else {
					ceros = true;
			}
		}
		break;
	}
	if (ceros==false) System.out.println("Matriz no diagonal");
	if (ceros==true) System.out.println("Matriz diagonal");
}
}
