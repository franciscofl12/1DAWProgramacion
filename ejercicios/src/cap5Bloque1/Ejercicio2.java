package cap5Bloque1;

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

		int array[] = new int[150];

		for (int i = array.length - 1; i > 0; i--) { // Empezamos el array en el ultimo numero -1
														// ya que el array tiene x numeros pero
														// tiene un puesto menos en el array.
			array[i] = (int) Math.round(Math.random() * (lims - limi) + limi);
			System.out.println(array[i]);
		}
	}
}
