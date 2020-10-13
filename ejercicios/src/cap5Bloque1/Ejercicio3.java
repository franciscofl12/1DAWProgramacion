package cap5Bloque1;

import javax.swing.JOptionPane;

public class Ejercicio3{

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
		String var = JOptionPane.showInputDialog("Numero que quieres buscar");
		int bus = Integer.parseInt(var);
		
		int array[] = new int[150];
		for (int i = 0 ; i < array.length; i++) {
			array[i] = (int)Math.round(Math.random()*(lims-limi)+limi);
			if (bus==array[i]) {
				System.out.println(array[i] + " encontrado en la posicion " + i);
			}		
		}	
	}
}

