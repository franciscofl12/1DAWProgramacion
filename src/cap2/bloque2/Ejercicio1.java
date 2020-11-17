package cap2.bloque2;

import javax.swing.JOptionPane;

public class Ejercicio1{

	/**
	 * 
	 * @param args
	 */
	
	public static void main(String args[]) {
		calculo(); // Llamamos a nuestro método para hacer el calculo 
	}

	public static void calculo() {
		System.out.println("Vamos a introducir unos numeros y vamos a sumarlos en unos grupos"); // Explicamos que realiza el programa
		String var = JOptionPane.showInputDialog("Introduzca un numero: "); // Obtenemos valor para los calculos necesarios
		int num = Integer.parseInt(var); // Convertimos en entero
		String var2 = JOptionPane.showInputDialog("Introduzca un numero: "); // Obtenemos valor para los calculos necesarios
		int num2 = Integer.parseInt(var2); // Convertimos en entero
		String var3 = JOptionPane.showInputDialog("Introduzca un numero: "); // Obtenemos valor para los calculos necesarios
		int num3 = Integer.parseInt(var3); // Convertimos en entero
		String var4 = JOptionPane.showInputDialog("Introduzca un numero: "); // Obtenemos valor para los calculos necesarios
		int num4 = Integer.parseInt(var4); // Convertimos en entero
		String var5 = JOptionPane.showInputDialog("Introduzca un numero: "); // Obtenemos valor para los calculos necesarios
		int num5 = Integer.parseInt(var5); // Convertimos en entero
		
		int sumaneg = 0 ;// Vamos a crear unas variable, en las cuales iremos sumando los numeros que sean de ese grupo
		int suma1 = 0;
		int suma2 = 0;
		int suma3 = 0;
		
		if (num<0) { // Vamos a sumar el numero a su grupo
			sumaneg = (sumaneg+num);
		}
		else {
			if ((num>=0) && (num<25)) {
				suma1 = (suma1+num);
			}
			else {
				if ((num>=25) && (num<250)) {
					suma2 = (suma2+num);
				}
				else {
					if (num>=250) {
						suma3 = (suma3+num);
					}
				}
			}
		}
	
		
		if (num5<0) { // Vamos a sumar el numero a su grupo
			sumaneg = (sumaneg+num5);
		}
		else {
			if ((num5>=0) && (num5<25)) {
				suma1 = (suma1+num5);
			}
			else {
				if ((num5>=25) && (num5<250)) {
					suma2 = (suma2+num5);
				}
				else {
					if (num5>=250) {
						suma3 = (suma3+num5);
					}
				}
			}
		}

		
		if (num2<0) { // Vamos a sumar el numero a su grupo
			sumaneg = (sumaneg+num2);
		}
		else {
			if ((num2>=0) && (num2<25)) {
				suma1 = (suma1+num2);
			}
			else {
				if ((num2>=25) && (num2<250)) {
					suma2 = (suma2+num2);
				}
				else {
					if (num2>=250) {
						suma3 = (suma3+num2);
					}
				}
			}
		}


		
		if (num3<0) { // Vamos a sumar el numero a su grupo
			sumaneg = (sumaneg+num3);
		}
		else {
			if ((num3>=0) && (num3<25)) {
				suma1 = (suma1+num3);
			}
			else {
				if ((num3>=25) && (num3<250)) {
					suma2 = (suma2+num3);
				}
				else {
					if (num3>=250) {
						suma3 = (suma3+num3);
					}
				}
			}
		}

		
		if (num4<0) { // Vamos a sumar el numero a su grupo
			sumaneg = (sumaneg+num4);
		}
		else {
			if ((num4>=0) && (num4<25)) {
				suma1 = (suma1+num4);
			}
			else {
				if ((num4>=25) && (num4<250)) {
					suma2 = (suma2+num4);
				}
				else {
					if (num4>=250) {
						suma3 = (suma3+num4);
					}	
				}
			}
		}
		System.out.println("La suma del grupo uno es= " + sumaneg);
		System.out.println("La suma del grupo dos es= " + suma1);
		System.out.println("La suma del grupo tres es= " + suma2);
		System.out.println("La suma del grupo cuatro es= " + suma3);
	}
}
	

