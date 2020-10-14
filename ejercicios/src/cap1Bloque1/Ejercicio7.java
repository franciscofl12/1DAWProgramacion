package cap1Bloque1;

import javax.swing.JOptionPane;

public class Ejercicio7{

	/**
	 * 
	 * @param args
	 */
	
	public static void main(String args[]) {
		calculo(); // Llamamos a nuestro método para hacer el calculo a dos de un numero que le pidamos al usuario.
	}

	public static void calculo() {
		System.out.println("Vamos a hacer el calculo a dos de un numero.");
		String var = JOptionPane.showInputDialog("Introduzca un numero: "); // Obtenemos un número que necesitamos para el programa.
		int num = Integer.parseInt(var);
		int num2 = ((~num) + 1);
		System.out.println("El numreo con calculo a dos es: " + num2);
	}
	}
