package cap5Bloque3;

public class Ejercicio1 {

	/**
	 * 
	 * @param args
	 */

	public static void main(String args[]) {
		arrays(); // Llamamos a nuestro método para hacer el array
	}

	public static void arrays() {

		int limi = 0;
		int lims = 1000;

		int array[] = new int[150];
		System.out.println("Primera Linea de numeros.");
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * (lims - limi) + limi);
			System.out.print(array[i] + ", ");
		}
		boolean permutacion = true;
		System.out.println(" ");
		System.out.println("Ordenados");
		while (permutacion == true) {
			permutacion = false;
			for (int i = 1; i < array.length; i++) {
				if (array[i-1] > array[i]) {
					int aux = array[i-1];
					array[i-1] = array[i];
					array[i] = aux;
					permutacion = true;
				}
			}
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
	
	}

}
