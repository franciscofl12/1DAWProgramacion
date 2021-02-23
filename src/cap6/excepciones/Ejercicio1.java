package cap6.excepciones;

import javax.swing.JOptionPane;

public class Ejercicio1 {
	
	/****
	 * Implementa un programa que contenga una clase llamada
	 * "PeticionNumeros", con un método "pideNumeroPar()". 
	 * Desde un método "main()" llama al método anterior. 
	 * Dentro del método "pideNumeroPar()" debes crear todo 
	 * lo necesario para disparar una Exception, creada por ti,
	 * cuando el número introducido no sea un número par.
	 */

	private static String pideNumeroPar(int numero) throws ExcepcionPropia{
		StringBuffer sb = new StringBuffer();
		// A partir de una persona, vamos a construir un StringBuffer que recorra sus dos piernas
		if (numero != (int)numero) throw new ExcepcionPropia("Lo introducido no es un numero");
		else {		
			if (numero%2 != 0) throw new ExcepcionPropia("El numero no es par");
			else {
				sb.append("El numero es par.");
			}
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		int numero = 0;
		try {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero par."));
			try {
				System.out.println(pideNumeroPar(numero));
			} catch (ExcepcionPropia e) {
				System.out.println("Problema con el numero par: " + e.getMessage());
			}
		} catch (Exception e) {
			System.out.println("Lo introducido no es un numero par.");
		}
		

	}
}
