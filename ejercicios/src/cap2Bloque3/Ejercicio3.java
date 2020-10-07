package cap2Bloque3;

import javax.swing.JOptionPane;

public class Ejercicio3{

	/**
	 * 
	 * @param args
	 */
	
	public static void main(String args[]) {
		calculo(); // Llamamos a nuestro método para hacer el calculo del area de un circulo.
	}

	public static void calculo() {

		boolean salir = false;
		
		while (!salir) { // Creamos un buble el cual el usuario tendra que introducir 0 para poder salir de lo que utilizaremos como 'menu'
			
			String var = JOptionPane.showInputDialog("Elija una opcion"
					+ "\n 1- Calculo de la hipotenusa de un triangulo."
					+ "\n 2- Calculo de la superficie de una circunferencia."
					+ "\n 3- Calculo del perímetro de una circunferencia."
					+ "\n 4- Calculo del área de un rectángulo."
					+ "\n 5- Calculo del área de un triángulo."
					+ "\n 0- Salir ");
			int opcion = Integer.parseInt(var); // Convertimos en entero
			
			switch(opcion){ // Creamos un switch el cual estara repitiendo todas las acciones en caso de que se ejecuten, en el caso que el usuario presione 0 saldra del while.
            case 1:
            	String cat1 = JOptionPane.showInputDialog("Introduce el cateto 1"); //Pedimos al usuario que introduzca el valor del cateto
            	int cateto1 = Integer.parseInt(cat1);
            	String cat2 = JOptionPane.showInputDialog("Introduce el cateto 2"); //Pedimos al usuario que introduzca el valor del otro cateto
            	int cateto2 = Integer.parseInt(cat2);
            	double resultado = (double) Math.sqrt((cateto1*cateto1)+(cateto2*cateto2));
            	System.out.println("Valor de la hipotenusa " + resultado);
                break;
            case 2:
            	String rad = JOptionPane.showInputDialog("Introduce el radio"); //Pedimos al usuario que introduzca el radio
            	int radn = Integer.parseInt(rad);
            	double resul = (double) (Math.PI*(radn*radn));
            	System.out.println("El area es " + resul);
                break;
             case 3:
             	String rad2 = JOptionPane.showInputDialog("Introduce el radio"); //Pedimos al usuario que introduzca el radio
             	int radn2 = Integer.parseInt(rad2);
             	double resul2 = (double) (Math.PI*radn2*2);
             	System.out.println("El perimetro es " + resul2);
                break;
             case 4:            	
            	String lado = JOptionPane.showInputDialog("Introduce un lado"); //Pedimos al usuario que introduzca el valor de un lado
            	int ladon = Integer.parseInt(lado);
            	String lado2 = JOptionPane.showInputDialog("Introduce el otro lado"); //Pedimos al usuario que introduzca el valor del otro lado
            	int ladon2 = Integer.parseInt(lado2);
            	double resultado2 = (double) Math.sqrt(ladon*ladon2);
            	System.out.println("Area del rectangulo " + resultado2);
             	break;
             case 5:
             	String base = JOptionPane.showInputDialog("Introduce un lado"); //Pedimos al usuario que introduzca el valor de un lado
             	int basen = Integer.parseInt(base);
             	String altura = JOptionPane.showInputDialog("Introduce el otro lado"); //Pedimos al usuario que introduzca el valor del otro lado
             	int alturan = Integer.parseInt(altura);
             	double resultado3 = (double) Math.sqrt((basen*alturan)/2);
             	System.out.println("Area del rectangulo " + resultado3);
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