package cap2.bloque3;

import javax.swing.JOptionPane;

public class Ejercicio2{

	/**
	 * 
	 * @param args
	 */
	
	public static void main(String args[]) {
		calculadora(); // Llamamos a nuestro método para utilizar la calculadora
	}

	public static void calculadora() {

		boolean salir = false;
		
		while (!salir) { // Creamos un buble el cual el usuario tendra que introducir 0 para poder salir de lo que utilizaremos como 'menu'
			
			String var = JOptionPane.showInputDialog("CALCULADORA AVANZADA"
					+ "\n 1- Raices"
					+ "\n 2- Potencias"
					+ "\n 3- Modulos de division"
					+ "\n 0- Salir "); 
			int opcion = Integer.parseInt(var); // Convertimos en entero
			
			switch(opcion){ // Creamos un switch el cual estara repitiendo todas las acciones en caso de que se ejecuten, en el caso que el usuario presione 0 saldra del while.
            case 1:
            	String rad = JOptionPane.showInputDialog("Introduce el radicando"); //Pedimos al usuario que introduzca el radicando que quiera
            	int radn = Integer.parseInt(rad);
            	String ind = JOptionPane.showInputDialog("Introduce el radicando"); //Pedimos al usuario que introduzca el indice
            	int indc = Integer.parseInt(ind);
            	double resultado = (double) Math.pow(radn, 1/indc);
            	System.out.println("La raíz " + indc + " de "+ radn + " es "+ resultado);
                break;
            case 2:
            	String bas = JOptionPane.showInputDialog("Introduce la base"); //Pedimos al usuario que introduzca la base que quiera
            	int basn = Integer.parseInt(bas);
            	String exp = JOptionPane.showInputDialog("Introduce el exponente"); //Pedimos al usuario que introduzca el exponente
            	int expn = Integer.parseInt(exp);
            	double resul = (double) Math.pow(basn, expn);
            	System.out.println(basn + " elevado a la " + expn + " es igual a " + resul);
                break;
             case 3:
            	 String dive = JOptionPane.showInputDialog("Introduce el dividendo"); //Pedimos al usuario que introduzca el dividendo que quiera
             	int diven = Integer.parseInt(dive);
             	String div = JOptionPane.showInputDialog("Introduce el divisor"); //Pedimos al usuario que introduzca el divisor
             	int divn = Integer.parseInt(div);
             	double result = (diven/divn);
             	double resto = (diven%divn);
             	System.out.println(diven + " dividido entre " + divn + " es igual a " + result + " por lo que su resto es " + resto);
                break;
             case 0:
                salir=true;
                break;
             default:
                System.out.println("Opcion no valida");
	}
		}
		System.out.println("Saliendo del programa...");
}
}