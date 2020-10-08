package cap3Bloque3;

import javax.swing.JOptionPane;

public class Ejercicio7{

	/**
	 * 
	 * @param args
	 */
	
	public static void main(String args[]) {
		positivonegativo(); // Llamamos a nuestro método para hacer la suma 
	}

	public static void positivonegativo() {   
    	boolean salir = false;
    	
    	String numeropos = "";
    	String numeroneg = "";
    	
    	while (!salir) {
  
			String var = JOptionPane.showInputDialog("Introduce un numero. "
					+ "\n Los agrupara en 2 grupos, positivos o negativos."); // Pedimos al usuario que introduzca los
																				// datos que necesitamos para el
																				// programa
			int num = Integer.parseInt(var);
			System.out.println("Numero introducido.");

			if (num == 0) {
				salir = true;
			}
			else {
				if (num>=0) {
					numeropos = (numeropos + " ," + var);
				}
				else {
					if (num<0) {
						numeroneg = (numeroneg + " ," + var);
					}
				}
			}
    	}
    	System.out.println("Los numeros positivos : " + numeropos);
    	System.out.println("Los numeros negativos : " + numeroneg);

    }
}

