package cap3Bloque3;

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
			System.out.println(" 0 x " + num + " = " + 0*num
					+"\n 1 x " + num + " = " + 1*num
					+"\n 2 x " + num + " = " + 2*num
					+"\n 3 x " + num + " = " + 3*num
					+"\n 4 x " + num + " = " + 4*num
					+"\n 5 x " + num + " = " + 5*num
					+"\n 6 x " + num + " = " + 6*num
					+"\n 7 x " + num + " = " + 7*num
					+"\n 8 x " + num + " = " + 8*num
					+"\n 9 x " + num + " = " + 9*num
					+"\n 10 x " + num + " = " + 10*num);
    	}

    }
}

