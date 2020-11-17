package cap1.bloque1;

import javax.swing.JOptionPane;

public class Ejercicio1{

	/**
	 * 
	 * @param args
	 */
	
	public static void main(String args[]) {
		lecturaNumeros(); // Llamamos a nuestro método de leer numeros		
	}

	public static void lecturaNumeros() {
		String str = JOptionPane.showInputDialog("Introduzca un numero entero: "); // Obtenemos valor para la variable str
		int var = Integer.parseInt(str); // Convertimos la variable str en un numero entero
		// Repetimos esta acción dos veces cambiando el tipo de numero
		str = JOptionPane.showInputDialog("Introduzca un numero con un decimal: ");
		float var1 = Float.parseFloat(str); // Cambiamos a tipo de numero float
		str = JOptionPane.showInputDialog("Introduzca un numero con los decimales que quieras (mas de 1): ");
		double var2 = Double.parseDouble(str); // Cambiamos a tipo de numero double
		System.out.println("Los números que has introducido son: " + var + ", " + var1 + ", " + var2 + "."); // Mostramos en pantalla los 3 números que el usuario ha escrito
	}
	
	}
