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
		int c = 0;
	    int aux = 0;
		System.out.println(" ");
		System.out.println("Ordenados");
		
	    int aux2 = 0;
	    int aux3 = 0;
	    
	    for (int i = aux + aux2; i < array.length; i+=aux) {
	        aux3 = array[i];
	        for (c = i; c >= aux && array[c - aux] > aux3; c-=aux) {
	            array[c] = array[c - aux];
	        }
	        array[c] = aux3;
	        
	    int array2[]= {6,4,3,2,1};
	    
	    for (int naux=0;naux<5;naux++) {
	        for (int i2=0;i<array[naux];i++)

		for (int i3 = 0; i < array.length; i3++) {
			System.out.print(array[i3] + ", ");
		}
	
	}
	    }
	}
}