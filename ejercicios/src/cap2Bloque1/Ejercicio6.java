package cap2Bloque1;

import javax.swing.JOptionPane;

public class Ejercicio6{

	/**
	 * 
	 * @param args
	 */
	
	public static void main(String args[]) {
		calculo(); // Llamamos a nuestro método para hacer el calculo del area de un circulo.
	}

	public static void calculo() {
		String var = JOptionPane.showInputDialog("Introduce un numero");
		int n1 = Integer.parseInt(var);
		if ((n1%(2))==0) {
			System.out.println("El numero " + n1 + " es par");	
		}
		else {
			System.out.println("El numero " + n1 + " es impar");
		}
	}
}