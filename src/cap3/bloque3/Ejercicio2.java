package cap3.bloque3;

import javax.swing.JOptionPane;

public class Ejercicio2{

	/**
	 * 
	 * @param args
	 */
	
	public static void main(String args[]) {
		suma(); // Llamamos a nuestro método para hacer la suma 
	}

	public static void suma() {    	
    	int suma = 0; // Creamos una variable para sumar todos 
    	int media = 0; // Creamos una variable para la media 
    	
    	boolean salir = false;
    	
    	while (!salir) {
    		
        	String valor = JOptionPane.showInputDialog("Introduce numeros que se iran sumando."
        			+ "\n Introduce 0 para parar la suma."); //Pedimos al usuario que introduzca los datos que necesitamos para el programa
        	int valornum = Integer.parseInt(valor);
        	suma = suma + valornum;
        	media = media + 1;
        	if (valornum == 0) {
        		salir = true;
        	}
    	}
    	System.out.println("La suma total de los numeros: " + (suma/(media-1)));

    }
}

