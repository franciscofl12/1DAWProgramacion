package cap1.bloque1;

import javax.swing.JOptionPane;

public class Ejercicio2{

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
		System.out.println("El numero que has introducido es: " + var); // El numero que acaba de escribir sale en pantalla
		str = JOptionPane.showInputDialog("Introduzca un numero con un decimal: ");
		float var1 = Float.parseFloat(str); // Cambiamos a tipo de numero float
		System.out.println("El numero que has introducido es: " + var1);
		str = JOptionPane.showInputDialog("Introduzca un numero con los decimales que quieras (mas de 1): ");
		double var2 = Double.parseDouble(str); // Cambiamos a tipo de numero double
		System.out.println("El numero que has introducido es: " + var2);
		System.out.println("Los números que has introducido son: " + var + ", " + var1 + ", " + var2 + "."); // Mostramos en pantalla los 3 números que el usuario ha escrito
	}
	
	}
