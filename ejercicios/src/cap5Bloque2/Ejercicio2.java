package cap5Bloque2;

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
		int lims = 100;
		int y = 1; // Creamos una variable auxiliar para calcular si es par o impar

		int array[] = new int[150];
		int array2[] = new int[150];
		int array3[] = new int[150];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * (lims - limi) + limi);
			array2[i] = (int) Math.round(Math.random() * (lims - limi) + limi);
			if ((i&y)!=0) {
				array3[i] = array[i]; // Si entra en el if cambiara el valor del tercer array en ese indice
				System.out.println("En el puesto " + i + " en el array 3 vale " + array3[i] + " (array1)");
			}
			else {
				if ((i&y)==0) {
					array3[i] = array2[i]; // Si entra en el if cambiara el valor del tercer array en ese indice
					System.out.println("En el puesto " + i + " en el array 3 vale " + array3[i] + " (array2)");
				}
			}
		}
	}
}
