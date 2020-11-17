package cap3.bloque1;

import javax.swing.JOptionPane;

public class Ejercicio3{

	/**
	 * 
	 * @param args
	 */
	
	public static void main(String args[]) {
		suma(); // Llamamos a nuestro método para hacer la suma 
	}

	public static void suma() {    	
    	int sumapos = 0; // Creamos una variable para cada tipo de suma
    	int sumaneg = 0;
    	String valor = JOptionPane.showInputDialog("Introduce el numero de VECES que "
    			+ "\n quieres sumar unos numeros."); //Pedimos al usuario que introduzca los datos que necesitamos para el programa
    	int valornum = Integer.parseInt(valor);
    	
    	for(int i=0;i<valornum;i++){ // Creamos un for que repita 4 veces ya que queremos solo 4 numeros
        	String var = JOptionPane.showInputDialog("Introduce un numero."); //Pedimos al usuario que introduzca los datos que necesitamos para el programa
        	int num = Integer.parseInt(var);
        	if (num>=0) {
        		sumapos = sumapos+num;
        	}
        	else {
        		sumaneg = sumaneg + num;
        	}
        	System.out.println("Numero introducido.");
    	}
    	System.out.println("La suma total de los numeros positivos " + sumapos 
    			+ " y el grupo de la suma negativa es " + sumaneg);
    }
}

