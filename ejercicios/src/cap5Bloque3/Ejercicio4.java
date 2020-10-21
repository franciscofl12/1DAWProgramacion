package cap5Bloque3;

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
		int lims = 1000;

		int array[] = new int[150];
		int arrayx[] = new int[150];
		System.out.println("Primera Linea de numeros.");
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * (lims - limi) + limi);
			System.out.print(array[i] + ", ");
		}
		System.out.println("\nOrdenados");
		int aux,menor;

		for (int i = 0; i < arrayx.length; i++) {
	         menor = i;
	         for (int c = i; c < arrayx.length; c++)
	              if (array[c] < array[menor]) {
	                  menor = c;
				      aux = array[i];
				      array[i] = array[menor];
				      array[menor] = aux;
	              }
	     }
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
}
}