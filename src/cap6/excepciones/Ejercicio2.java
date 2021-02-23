package cap6.excepciones;

import javax.swing.JOptionPane;

public class Ejercicio2 {
	
	/****
	 * Realiza un programa Java parecido al anterior en el que
	 * pidas al usuario una frase que contenga la palabra "bombilla".
	 * Las excepciones, creadas por ti, deben realizarse en
	 * los siguientes casos:La frase introducida no tiene caracteres
	 * distintos al espacio en blanco. La cantidad de palabras de
	 * la frase introducida es inferior a 3.En la frase no aparece
	 * la palabra "bombilla".En la frase aparece una palabra ofensiva 
	 * de la siguiente relación: "tonto", "tonta", "idiota".
	 * Cada uno de los supuestos anteriores provocará un tipo 
	 * diferente de excepción. Tú debes controlar todos los tipos 
	 * y responder al usuario con un mensaje adecuado.
	 * @param string 
	 */
	
	
	private static String pideFraseConBombilla(String frase) throws ExcepcionPropia{
		StringBuffer sb = new StringBuffer();
		frase = frase.strip();
		String[] palabras = frase.split(" ");
		int auxiliar = 0;
		for (int i = 0; i < palabras.length; i++) {
			char[] caracteres = palabras[i].toCharArray();
			for (int j = 0; j < caracteres.length; j++) {
				if (Character.isLetterOrDigit(caracteres[j]) == false) {
					throw new ExcepcionPropia("La frase contiene caracteres distintos a espacios.");
				}
			}
		}
		for (int i = 0; i < palabras.length; i++) {
			if (palabras[i].equalsIgnoreCase("bombilla")) {
				sb.append("La frase contiene bombilla.");
				auxiliar++;
			}
			if (palabras[i].equalsIgnoreCase("tonto") | palabras[i].equalsIgnoreCase("tonta") | palabras[i].equalsIgnoreCase("idiota")) {
				throw new ExcepcionPropia("Por favor, no insultes y escribe bombilla.");
			}
		}
		
		if (auxiliar==0) throw new ExcepcionPropia("No has escrito bombilla.");
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		try {
			 System.out.println(pideFraseConBombilla(JOptionPane.showInputDialog("Introduce una frase con bombilla.")));
		} catch (ExcepcionPropia e) {
			System.out.println("Existen problemas: " + e.getMessage());
		}
		
	}
}
