package cap3Bloque2;

import javax.swing.JOptionPane;

public class Ejercicio2{

	/**
	 * 
	 * @param args
	 */
	
	public static void main(String args[]) {
		menormayor(); // Llamamos a nuestro método para hacer el programa
	}

	public static void menormayor() {    	
    	String valor = JOptionPane.showInputDialog("Introduce el numero de VECES que "
    			+ "\n quieres sumar unos numeros."); //Pedimos al usuario que introduzca los datos que necesitamos para el programa
    	int valornum = Integer.parseInt(valor);
    	System.out.println("Los numeros que sean introducidos se descartaran todos menos"
    			+ "\n el mayor y el menor que seran mostrados"); // Mostramos que realizara el programa
    	
    	int aux = 0; // Crearemos una variable auxiliar para guardar siempre el numero mayor
    	int auxm = 0; // Crearemos una variable auxiliar para guardar siempre el numero menor
    	
    	for(int i=0;i<valornum;i++){ // Creamos un for que repita 4 veces ya que queremos solo 4 numeros
        	String var = JOptionPane.showInputDialog("Introduce un numero."); //Pedimos al usuario que introduzca los datos que necesitamos para el programa
        	int num = Integer.parseInt(var);
        	System.out.println("Numero introducido.");
        	
        	if (num>aux) {
        		aux = num;        		
        	}
        	else {
        		if (num<auxm) {
        			auxm = num;
        		}
        	}
    	}
    	
    	System.out.println("El numero mayor de los que has escrito es " + aux 
    			+ "\n y el numero menor es " + auxm);
    }
}

