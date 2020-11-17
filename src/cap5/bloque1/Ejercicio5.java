package cap5.bloque1;

public class Ejercicio5{

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
		for (int i = 0 ; i < array.length; i++) {
			array[i] = (int)Math.round(Math.random()*(lims-limi)+limi);
			if (((i&y)==0)) { // Comprobamos si la posicion es par o impar
				System.out.println("El numero " + array[i] + " esta en la posicion " + i);
			}
		}
	}
}

