package cap3Bloque3;

import javax.swing.JOptionPane;

public class Ejercicio3y4y5{

	/**
	 * 
	 * @param args
	 */
	
	public static void main(String args[]) {
		mayormenor(); // Llamamos a nuestro método para hacer la suma 
	}

	public static void mayormenor() {    
	 
		int aux = 0; // Crearemos una variable auxiliar para guardar siempre el numero mayor
    	int auxm = 0; // Crearemos una variable auxiliar para guardar siempre el numero menor
    
    	boolean salir = false;
    	
    	while (!salir) {
  
			String var = JOptionPane.showInputDialog("Introduce un numero."); // Pedimos al usuario que introduzca los
																				// datos que necesitamos para el
																				// programa
			int num = Integer.parseInt(var);
			System.out.println("Numero introducido.");

			if (num == 0) {
				salir = true;
			}
			if (num > aux) { // Comprobamos si el numero es mayor que el mayor
				aux = num;
			} else {
				if (num < auxm) { // Comprobamos si el numero es mayor que es menor
					auxm = num;
				}
			}

    	}
    	System.out.println("El numero mayor de los introducidos es " + aux + " el numero menor es " + auxm);

    }
}

