package cap5.bloque6;

public class Ejercicio3 {

	public static void main(String[] args) {
		matrices();
	}

	/****
	 * 3º - Crea un método que compruebe si la matriz es positiva. (Todos sus
	 * elementos mayores o iguales a cero). El método recibirá una matriz y devolver
	 * un valor "boolean", indicando si la matriz es o no es positiva.
	 */

	public static void matrices() {
		int[][] matriz = new int[3][3];
		Ejercicio1y2.rellenarMatriz(matriz, -2, 10);
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + " \t");
			}
			System.out.println("\n");
		}
		if (Positiva(matriz) == true)
			System.out.println("Es positiva");
		if (Positiva(matriz) == false)
			System.out.println("Es negativa");
	}

	public static boolean Positiva(int matriz[][]) {
		boolean Positiva = true;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] < 0) {
					Positiva = false;
				}
			}
		}
		return Positiva;
	}
}
