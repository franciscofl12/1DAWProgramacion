package cap5.bloque1;

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
		int aux = 0; // Creamos una variable auxiliar que nos ayude para saber si no se ha encontrado un numero
		String var = JOptionPane.showInputDialog("Numero que quieres buscar");
		int bus = Integer.parseInt(var);
		
		int array[] = new int[150];
		for (int i = 0 ; i < array.length; i++) {
			array[i] = (int)Math.round(Math.random()*(lims-limi)+limi);
			if (bus==array[i]) { // Buscamos si el numero que estan buscando se encuentra
				System.out.println(array[i] + " encontrado en la posicion " + i);
				 aux = aux + 1; // Si se encontrase el valor de la variable auxiliar no valdria 0
			}	
		}	
		if (aux == 0) { // Si la variable auxiliar vale 0 , sera que el numero no se ha encontrado.
			System.out.println("Numero " + bus + " no encontrado.");
		}
	}
}

