package cap2.bloque1;

import javax.swing.JOptionPane;

public class Ejercicio7{

	/**
	 * 
	 * @param args
	 */
	
	public static void main(String args[]) {
		calculo(); // Llamamos a nuestro método para hacer el calculo 
	}

	public static void calculo() {
		System.out.println("Vamos a introducir un numero e identificarlo como par o impar"); // Explicamos que realiza el programa
		String var = JOptionPane.showInputDialog("Introduzca un numero: "); // Obtenemos valor para los calculos necesarios
		int x = Integer.parseInt(var); // Convertimos en float
		int y = 1; // Creamos una variable que será la que utilicemos para hacer el cálculo
		double z = (x&y); // Hacemos un cálculo el cual si la solucion es 0 será par y si sale 1 será impar
		if (z==0) {
			System.out.println("El numero " + x + " es par");
		}			
		else {
				System.out.println("El numero " + x + " es impar");
		}
	}
}
	

