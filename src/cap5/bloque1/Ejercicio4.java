package cap5.bloque1;

public class Ejercicio4{

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
		int suma = 0; // Creamos una variable para suma par
		int sumaimp = 0; // Creamos una variable para suma impar
		
		
		int array[] = new int[150];
		for (int i = 0 ; i < array.length; i++) {
			array[i] = (int)Math.round(Math.random()*(lims-limi)+limi);
			if ((array[i]&y)==0) {
				suma = suma + array[i]; 
			}
			else {
					sumaimp = sumaimp + array[i];
			}
		}
		System.out.println("Suma de pares = " + suma
				+ "\nSuma de impares = " + sumaimp);
	}
}

