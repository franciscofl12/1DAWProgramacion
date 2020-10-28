package cap3Bloque2;

import javax.swing.JOptionPane;

public class Ejercicio3{

	/**
	 * 
	 * @param args
	 */
	
	public static void main(String args[]) {
		multiplos(); // Llamamos a nuestro método para hacer el programa
	}

	public static void multiplos() {    	
    	String var = JOptionPane.showInputDialog("Introduce un numero y apareceran todos los multiplos hasta 100."); 
		int num = Integer.parseInt(var);
	
    	for(int i=1;i<100;i++){ 
    		if ( (num%i)== 0 ) {
    			System.out.println("El numero " + i + " es multiplo de " + num);
    		}
    	}
    }
}

