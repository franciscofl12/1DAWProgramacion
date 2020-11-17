package cap1.bloque1;

import javax.swing.JOptionPane;

public class Ejercicio5{

	/**
	 * 
	 * @param args
	 */
	
	public static void main(String args[]) {
		pedirVariables(); // Llamamos a nuestro método de pedir variables	
	}

	public static void pedirVariables() {
		String var = JOptionPane.showInputDialog("Introduzca un nombre que no te guste: "); // Obtenemos valor para la variable str
		System.out.println("Has escrito el nombre: " + var);
		String var2 = var; // Introducimos la variable 1 para la variable 2
		var = JOptionPane.showInputDialog("Introduce un nombre que si te guste: "); // Obtenemos otro valor para la variable str y la cambiará por el antiguo str
		System.out.println("El antiguo nombre era: " + var2 + " y el nuevo nombre es: " + var);
		String aux = var; // En estos pasos vamos a cambiar las variables utilizando una variable auxiliar que nos ayude a intencambiar el valor de la variable 1 a la variable 2
		var = var2;
		var2 = aux;
		System.out.println("El nuevo primer nombre es: " + var + " el nuevo segundo nombre es: " + var2); 
		
	}
	
	}
