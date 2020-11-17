package cap3.bloque3;

import javax.swing.JOptionPane;

public class Ejercicio6{

	/**
	 * 
	 * @param args
	 */
	
	public static void main(String args[]) {
		multiplicar(); // Llamamos a nuestro método para hacer la suma 
	}

	public static void multiplicar() {   
    	boolean salir = false;
    	
    	while (!salir) {
  
			String var = JOptionPane.showInputDialog("Introduce un numero. Mostrara su tabla de multiplicar"); // Pedimos al usuario que introduzca los
																				// datos que necesitamos para el
																				// programa
			int num = Integer.parseInt(var);
			System.out.println("Numero introducido.");

			if (num == 0) {
				salir = true;
			}
			for (int i = 0; i < 10; i++) {
			System.out.println(i + " x " + num + " = " + i*num);
			}
    	}

    }
}

