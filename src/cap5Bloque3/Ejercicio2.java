package cap5Bloque3;

public class Ejercicio2 {

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
		int c = 0;
	    int aux = 0;
		System.out.println(" ");
		System.out.println("Ordenados");
	    for (int i = 1; i < array.length; i++) {
	        aux = array[i];
	        for (c= i; c > 0 && array[c - 1] > aux; c--) {
	            array[c] = array[c - 1];
	        }
	        array[c] = aux;
	    }

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
	
	}

}
