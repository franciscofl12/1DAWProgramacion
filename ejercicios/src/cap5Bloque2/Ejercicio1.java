package cap5Bloque2;

public class Ejercicio1 {

	/**
	 * 
	 * @param args
	 */

	public static void main(String args[]) {
		arrays(); // Llamamos a nuestro método para hacer el array
	}

	public static void arrays() {

		int limi = -100;
		int lims = 100;

		int array[] = new int[150];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * (lims - limi) + limi);
			array[i] = ((~array[i]) + 1); // Cambiamos el numero de signo y lo guardamos
			System.out.println("El numero " + ((~array[i]) + 1) + " cambia a " + array[i]);
		}
	}
}
