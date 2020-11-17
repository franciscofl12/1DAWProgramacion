package cap3.bloque2;

import javax.swing.JOptionPane;

public class Ejercicio1{

	/**
	 * 
	 * @param args
	 */
	
	public static void main(String args[]) {
		media(); // Llamamos a nuestro método para hacer la suma 
	}

	public static void media() {    	
    	int suma = 0; // Creamos una variable para sumar todos 
    	int cuenta = 0;
    	String valor = JOptionPane.showInputDialog("Introduce el numero de VECES que "
    			+ "\n quieres sumar unos numeros."); //Pedimos al usuario que introduzca los datos que necesitamos para el programa
    	int valornum = Integer.parseInt(valor);
    	
    	for(int i=0;i<valornum;i++){ // Creamos un for que repita 4 veces ya que queremos solo 4 numeros
        	String var = JOptionPane.showInputDialog("Introduce un numero."); //Pedimos al usuario que introduzca los datos que necesitamos para el programa
        	int num = Integer.parseInt(var);
        	suma = (suma+num); // Aqui sumaremos los numero para posteriormente hacer la media
        	cuenta = (cuenta + 1); //  Aqui sumaremos el numero de veces que el usuario introduce un numero
        	System.out.println("Numero introducido.");
    	}
    	double media = (suma/cuenta);
    	System.out.println("La suma total es " + suma + " y su media es " + media);
    }
}

