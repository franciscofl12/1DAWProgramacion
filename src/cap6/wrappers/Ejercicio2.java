package cap6.wrappers;

import javax.swing.JOptionPane;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		
		boolean mayus = false,minus = false,digit = false,noalfa = false;
		
		while (mayus == false || minus == false || digit == false || noalfa == false){
			String contrasena = JOptionPane.showInputDialog("Introduce una contrasena segura: ");
			
			char[] caracteres = contrasena.toCharArray();
			
			for (int i = 0; i < caracteres.length; i++) {
				if (Character.isDigit(caracteres[i]) == true) digit = true;
				if (Character.isLowerCase(caracteres[i]) == true) minus = true;
				if (Character.isUpperCase(caracteres[i]) == true) mayus = true;
				if ((Character.isAlphabetic(caracteres[i]) == false) && Character.isDigit(caracteres[i]) == false) noalfa = true;
			}
			
			if (mayus == false || minus == false || digit == false || noalfa == false){
				System.out.println("Contrasena no valida, vuelve a introducir una contrasena segura.");
			}
		}
		
		System.out.println("Es una contrasena valida");
	}
	
}
