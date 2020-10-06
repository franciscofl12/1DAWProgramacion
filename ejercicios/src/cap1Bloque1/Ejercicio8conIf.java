package cap1Bloque1;

import javax.swing.JOptionPane;

public class Ejercicio8conIf{

	/**
	 * 
	 * @param args
	 */
	
	public static void main(String args[]) {
		calculo(); // Llamamos a nuestro método para hacer el calculo del area de un circulo.
	}

	public static void calculo() {
		System.out.println("Vamos a introducir 3 numeros y los vamos a ordenar de mayor a menor"); // Explicamos que realiza el programa
		String var = JOptionPane.showInputDialog("Introduzca un numero: "); // Obtenemos valor para los calculos necesarios
		int x = Integer.parseInt(var); // Convertimos en float
		String var2 = JOptionPane.showInputDialog("Introduzca otro numero: "); // Obtenemos valor para los calculos necesarios
		int y = Integer.parseInt(var2); // Convertimos en float
		String var3 = JOptionPane.showInputDialog("Introduzca el ultimo numero: "); // Obtenemos valor para los calculos necesarios
		int z = Integer.parseInt(var3); // Convertimos en float
		
		if ((x>y) && (x>z)) { // Con varios if vamos a encontrar que numero es el mas grande y el mas pequeño.
							// Comprobamos si el primer numero es el mas grande, si lo es , pasará al siguiente paso
			if (y>z) { // Si sabemos que el primer numero ya es el mas grande comprobamos cual es el mas pequeño.
				System.out.println("El numero mayor es "+ x +" y el numero menor es " + z);
			}
			else { // Si el segundo numero no es el mas grande aquí lo imprimirá
				System.out.println("El numero mayor es "+ x +" y el numero menor es " + y);
			}
		}
		else if ((y>x) && (y>z)) { // Cuando compruebe que el primer if no es válido pasa al siguiente, comprueba si el segundo es mas grande.
			if (x>z) { // Comprueba cual es mas pequeño
				System.out.println("El numero mayor es "+ y +" y el numero menor es " + z);
				}
		
			else { // Si no es la anterior función por descarte aquí imprimirá cual es el mas pequeño
				System.out.println("El numero mayor es "+ y +" y el numero menor es " + x);
			}
		}
		else if ((z>x) && (z>y)) { // Ultima opción para imprimir si el último número es el mas pequeño
			if (x>y) { // Comprueba cual es el mas pequeño
				System.out.println("El numero mayor es "+ z +" y el numero menor es " + y);
					}
		}
			else { // Si no es el anterior el mas pequeño, imprimirá este
				System.out.println("El numero mayor es "+ z +" y el numero menor es " + x);
			}
		}
	}

