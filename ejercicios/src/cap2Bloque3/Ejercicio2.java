package cap2Bloque3;

import javax.swing.JOptionPane;

public class Ejercicio2{

	/**
	 * 
	 * @param args
	 */
	
	public static void main(String args[]) {
		notas(); // Llamamos a nuestro método para hacer el calculo del area de un circulo.
	}

	public static void notas() {
		String var = JOptionPane.showInputDialog("CALCULADORA AVANZADA"
				+ "1- Raices"
				+ "2- Potencias"
				+ "3- Modulos de division"
				+ "0- Salir "); // Obtenemos valor para los calculos necesarios
		int num = Integer.parseInt(var); // Convertimos en entero
        while (num != 0) {
        
        }
	}
}