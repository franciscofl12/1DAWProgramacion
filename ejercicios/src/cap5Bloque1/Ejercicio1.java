package cap5Bloque1;

import javax.swing.JOptionPane;

public class Ejercicio1{

	/**
	 * 
	 * @param args
	 */
	
	public static void main(String args[]) {
		arrays(); // Llamamos a nuestro método para hacer el array
	}

	public static void arrays() {
		
		String var = JOptionPane.showInputDialog("Introduce el limite inferior.");
		int limi = Integer.parseInt(var);
		String var2 = JOptionPane.showInputDialog("Introduce el limite superior.");
		int lims = Integer.parseInt(var2);
		
		int array[] = new int[150];
		for (int i = 0 ; i < array.length; i++) {
			array[i] = (int)Math.round(Math.random()*(lims-limi)+limi);
			System.out.println(array[i]);
		}	
	}
}

