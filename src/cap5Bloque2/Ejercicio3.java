package cap5Bloque2;

import javax.swing.JOptionPane;

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
		int lims = 100;
		
    	String valor = JOptionPane.showInputDialog("Introduce el numero por el que quieres multiplicar la array"); //Pedimos al usuario que introduzca los datos que necesitamos para el programa
    	int valornum = Integer.parseInt(valor);

		int array[] = new int[150];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * (lims - limi) + limi);
			int multiplicacion = (array[i]*valornum);
			System.out.println(array[i] + " * " + valornum + " = " + multiplicacion);		
		}
	}
}
