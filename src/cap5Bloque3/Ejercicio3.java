package cap5Bloque3;

public class Ejercicio3 {

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
		System.out.println("\nOrdenados");
		int aux = 0;
		int salto = array.length / 2;
		boolean shell = true;
		while (salto > 0) {
			shell = true;
			while (shell == true) {
				shell = false;
				for (int i = 0; i < (array.length / 2); i++) {
					if (array[i] > array[salto + i]) {
						aux = array[salto + i];
						array[salto + i] = array[i];
						array[i] = aux;
						shell = true;
					}
				}
	
			}
			salto = (salto / 2);
		}
			
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
	}
}