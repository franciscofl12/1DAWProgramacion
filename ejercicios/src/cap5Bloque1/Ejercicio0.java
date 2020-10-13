package cap5Bloque1;

public class Ejercicio0{

	/**
	 * 
	 * @param args
	 */
	
	public static void main(String args[]) {
		arrays(); // Llamamos a nuestro método para hacer el array
	}

	public static void arrays() {
		int suma = 0; // Creamos una variable para la suma
		int media = 0;// Creamos una variable para la media
		int nummenor = 100; // Creamos una variable para el numero menor
		int nummayor= 0; // Creamos una variable para el numero mayor
		int array[] = new int[150];
		for (int i = 0 ; i < array.length; i++) {
			int c = (int)Math.round(Math.random()*100);
			
			System.out.println(array[i] = c);
			suma = suma + array[i];
			media = suma / 150;
			if (array[i] <	 nummenor) {
				nummenor=array[i];
			}
			else {
				if (array[i] > nummayor) {
					nummayor=array[i];
				}
			}
		}
		System.out.println("El numero mayor es = " + nummayor + ""
				+ "\n El numero menor es = " + nummenor + ""
						+ "\n La suma es = " + suma + ""
								+ "\n La media es = " + media);
		
	}
}

