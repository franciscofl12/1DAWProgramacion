package cap5Bloque2;


public class Ejercicio4 {

	/**
	 * 
	 * @param args
	 */

	public static void main(String args[]) {
		arrays(); // Llamamos a nuestro método para hacer el array
	}

	public static void arrays() {

		int limi = 0;
		int lims = 100;

		int array[] = new int[5];
		System.out.println("Primera Linea de numeros.");
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * (lims - limi) + limi);
			System.out.print(array[i] + ", ");
		}
		
		System.out.println("Segunda Linea de numeros.");
		for (int i = 0; i < array.length; i++) {
			if (array[i+1] < array.length) {
				array[i] = array[i+1];
			}	
		}
		int aux = array[array.length-1];
		array[0] = aux;
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
	}
}
