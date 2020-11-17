package cap2.bloque1;

import javax.swing.JOptionPane;

public class Ejercicio5{

	/**
	 * 
	 * @param args
	 */
	
	public static void main(String args[]) {
		calculo(); // Llamamos a nuestro método para hacer el calculo 
	}

	public static void calculo() {
		String var = JOptionPane.showInputDialog("Introduce un numero");
		int n1 = Integer.parseInt(var);
		String var2 = JOptionPane.showInputDialog("Introduce un numero");
		int n2 = Integer.parseInt(var2);
		String var3 = JOptionPane.showInputDialog("Introduce un numero");
		int n3 = Integer.parseInt(var3);
		String var4 = JOptionPane.showInputDialog("Introduce un numero");
		int n4 = Integer.parseInt(var4);
		String var5 = JOptionPane.showInputDialog("Introduce un numero");
		int n5 = Integer.parseInt(var5);
		
		
		if ((n1>n2) && (n1>n3) && (n1>n4) && (n1>n5) ) {
			System.out.println("El numero mayor es= "+ n1);
		}
		if ((n2>n2) && (n2>n3) && (n2>n4) && (n2>n5) ) {
			System.out.println("El numero mayor es= "+ n2);
		}
		if ((n3>n2) && (n3>n1) && (n3>n4) && (n3>n5) ) {
			System.out.println("El numero mayor es= "+ n3);
		}
		if ((n4>n2) && (n4>n3) && (n4>n1) && (n4>n5) ) {
			System.out.println("El numero mayor es= "+ n4);
		}
		if ((n5>n2) && (n5>n3) && (n5>n4) && (n5>n1) ) {
			System.out.println("El numero mayor es= "+ n5);
		}
		
		if ((n1<n2) && (n1<n3) && (n1<n4) && (n1<n5) ) {
			System.out.println("El numero menor es= "+ n1);
		}
		if ((n2<n2) && (n2<n3) && (n2<n4) && (n2<n5) ) {
			System.out.println("El numero menor es= "+ n2);
		}
		if ((n3<n2) && (n3<n1) && (n3<n4) && (n3<n5) ) {
			System.out.println("El numero menor es= "+ n3);
		}
		if ((n4<n2) && (n4<n3) && (n4<n1) && (n4<n5) ) {
			System.out.println("El numero menor es= "+ n4);
		}
		if ((n5<n2) && (n5<n3) && (n5<n4) && (n5<n1) ) {
			System.out.println("El numero menor es= "+ n5);
		}
		
		
	}
}