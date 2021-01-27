package cap6.Recursos;

import java.util.Scanner;

public class EcuacionSegundoGrado {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in); // se crea objeto tipo scanner
		System.out.println("Ingrese valores ax,bx,c separados por ',': ");
		String valores = leer.nextLine(); // obtiene los valores a,b,c separados por ','
		String[] numeros = valores.split(","); // separa los numeros
		int a = Integer.parseInt(numeros[0]); // variable a almacenada es trasformada a int
		int b = Integer.parseInt(numeros[1]); // variable b almacenada es trasformada a int
		int c = Integer.parseInt(numeros[2]); // variable v almacenada es trasformada a int
		// Obtien los valores x1,x2 de la ecuacion
		double x = (-b + Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
		double y = (-b - Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
		// imprime los valores
		System.out.println("La solucion de x1: " + x);
		System.out.println("La solucion de x2: " + y);
	}
}