package cap3.bloque2;

import javax.swing.JOptionPane;

public class Ejercicio4{

	/**
	 * 
	 * @param args
	 */
	
	public static void main(String args[]) {
		multiplos(); // Llamamos a nuestro método para hacer el programa
	}

	public static void multiplos() {    	
    	String var = JOptionPane.showInputDialog("Introduce un numero y los multiplos que quieres que aparezcan."); 
		int num = Integer.parseInt(var);
		
		String var2 = JOptionPane.showInputDialog("Introduce un numero y los multiplos que quieres que aparezcan."); 
		int mul = Integer.parseInt(var2);
	
    	for(int i=1;i<mul;i++){ 
    		if ( (num%i)== 0 ) {
    			System.out.println("El numero " + i + " es multiplo de " + num);
    		}
    	}
    }
}

