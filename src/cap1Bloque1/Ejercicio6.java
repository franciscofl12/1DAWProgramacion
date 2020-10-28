package cap1Bloque1;

import javax.swing.JOptionPane;

public class Ejercicio6{

	/**
	 * 
	 * @param args
	 */
	
	public static void main(String args[]) {
		hipoteca(); // Llamamos a nuestro método para hacer el calculo de la hipoteca.
	}

	public static void hipoteca() {
		System.out.println("Vamos a calcular de manera simple como saber cuanto vas "
				+ "\na tener que pagar con tu hipoteca."
				+ "\nNecesitaremos unos datos para hacer el calculo."); //Explicamos que realiza el programa
		String var = JOptionPane.showInputDialog("Introduzca el valor del Euribor: "); // Obtenemos valor para los calculos necesarios
		float euribor = Float.parseFloat(var);
		String var2 = JOptionPane.showInputDialog("Introduzca el valor del diferencial: "); // Obtenemos valor para los calculos necesarios
		float diferencial = Float.parseFloat(var2);
		String var3 = JOptionPane.showInputDialog("Introduzca el capital: "); // Obtenemos valor para los calculos necesarios
		float capital = Float.parseFloat(var3);
		String var4 = JOptionPane.showInputDialog("Introduzca el número de plazos de la hipoteca: "); // Obtenemos valor para los calculos necesarios
		float plazos = Float.parseFloat(var4);
		double interesa = (euribor+diferencial); //Creamos una variable para el interes anual
		double interesm = ((interesa/12)/100); // Calculamos el interes mensual
		double num = interesm*(Math.pow(1+interesm, plazos)); // Numerador de nuestra formula
		double den = (Math.pow(1+interesm, plazos)-1); // Denomindor de nuestra formula
		double cuota = capital*num/den;
		System.out.println("Tu hipoteca será de: " + cuota);
	}
	}
