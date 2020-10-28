package cap3Bloque1;

import javax.swing.JOptionPane;

public class Ejercicio1{

	/**
	 * 
	 * @param args
	 */
	
	public static void main(String args[]) {
		suma(); // Llamamos a nuestro método para hacer la suma 
	}

	public static void suma() {    	
    	int suma = 0;
    	
    	for(int i=0;i<4;i++){ // Creamos un for que repita 4 veces ya que queremos solo 4 numeros
        	String var = JOptionPane.showInputDialog("Introduce un numero."); //Pedimos al usuario que introduzca los datos que necesitamos para el programa
        	int num = Integer.parseInt(var);
        	if (num>=10) {
        		suma = suma+num;
        	}
        	System.out.println("Numero introducido.");
    	}
    	System.out.println("La suma total de los numeros es " + suma);
    }
}

