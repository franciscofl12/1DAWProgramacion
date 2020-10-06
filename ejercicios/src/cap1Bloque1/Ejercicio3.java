package cap1Bloque1;

import javax.swing.JOptionPane;

public class Ejercicio3{

	/**
	 * 
	 * @param args
	 */
	
	public static void main(String args[]) {
		lecturaNumeros(); // Llamamos a nuestro método de leer numeros		
	}

	public static void lecturaNumeros() {
		System.out.println("Vamos a realizar una suma de 3 numeros enteros.");
		String str = JOptionPane.showInputDialog("Introduzca un numero entero: "); // Obtenemos valor para la variable str
		int var = Integer.parseInt(str); // Convertimos la variable str en un numero entero
		System.out.println("El número que acabas de introducir es:  " + var + "."); // Mostramos el primer numero
		str = JOptionPane.showInputDialog("Introduzca un numero entero: ");
		int var1 = Integer.parseInt(str);
		System.out.println("El número que acabas de introducir es:  " + var1 + "."); // Mostramos el segundo numero
		str = JOptionPane.showInputDialog("Introduzca un numero entero: ");
		int var2 = Integer.parseInt(str);
		System.out.println("El número que acabas de introducir es:  " + var2 + "."); // Mostramos el tercer numero
		int suma = (var+var1+var2);
		System.out.println("Los números que has introducido son: " + var + ", " + var1 + ", " + var2 + "."
				+ "\nY la suma de todos los numeros es= " + suma ); // Suma de los 3 numeros
	}
	
	}