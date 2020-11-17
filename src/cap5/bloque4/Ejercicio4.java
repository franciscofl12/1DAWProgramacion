package cap5.bloque4;

import Utils.Utils;

public class Ejercicio4 {
	
	public static void main(String[] args) {
		matrices();
	}
	
	public static void matrices() {
		int[][][][][] matriz = new int[5][5][5][5][5];
		for (int i = 0; i < matriz.length; i++) {
			System.out.println(matriz[i]);
		}
	}
	
	public static int[] rellenarMatriz(int[] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			matriz[i] = Utils.NumeroAleatorio(0, 10);
		}
		return matriz;
	}
}
