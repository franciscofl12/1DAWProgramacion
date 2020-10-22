package cap5Bloque2;

import javax.swing.JOptionPane;

public class Ejercicio6 {

	/**
	 * 
	 * @param args
	 */

	public static void main(String args[]) {
		arrays(); // Llamamos a nuestro método para hacer el array
	}

	public static void arrays() {

		int limi = 0;
		int lims = 100;

		int array[] = new int[5];
		System.out.println("Primera Linea de numeros.");
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * (lims - limi) + limi);
			System.out.print(array[i] + ", ");
		}
		
		String var = JOptionPane.showInputDialog("Introduce las veces que quieres que se muevan los indices");
		int num = Integer.parseInt(var);
		
		String var2 = JOptionPane.showInputDialog("Introduce a que lado quieres que se mueva ( 1= derecha , 2= izquierda");
		int num2 = Integer.parseInt(var2);
		
		if (num2==1) {
			for (int c = 0 ; c < num; c++) { // Funcion que repetira la funcion de mover numeros
				int aux = array[array.length - 1]; // Creamos una variable en la cual guardaremos la ultima variable
				
					for (int i = array.length - 1; i > 0; i--) { // Iremos bajando y cambiando el valor de cada puesto del array
						if (array.length > i) {
							if (i != 0) {
								array[i] = array[i - 1];
							}
						}
					}
				array[0] = aux; // Guardamos en el primner puesto el ultimo valor que guardamos anteriormente
			}
		}
		else {
			if (num2 == 2) {
				for (int c = 0 ; c < num; c++) { // Funcion que repetira la funcion de mover numeros
					int aux = array[0]; // Creamos una variable en la cual guardaremos la ultima variable
					
						for (int i = 0; i < array.length-1; i++) { // Iremos bajando y cambiando el valor de cada puesto del array
							if (array.length > i) {
								array[i] = array[i + 1];
							}
						}
					array[4] = aux; // Guardamos en el primner puesto el ultimo valor que guardamos anteriormente
				}
			}
		}
		
		System.out.println("Numeros cambiados.");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
}
	
}
