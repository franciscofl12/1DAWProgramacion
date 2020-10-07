package cap2Bloque3;

import javax.swing.JOptionPane;

public class Ejercicio1{

	/**
	 * 
	 * @param args
	 */
	
	public static void main(String args[]) {
		notas(); // Llamamos a nuestro método para hacer el calculo del area de un circulo.
	}

	public static void notas() {
		String var = JOptionPane.showInputDialog("Introduzca la nota de tu asignatura: "); // Obtenemos valor para los calculos necesarios
		int num = Integer.parseInt(var); // Convertimos en entero
		int nota = Math.round(num);
        String notas;
        
        // Obtendremos los datos y crearemos una variable la cual la utilizaremos para las notas
        switch (nota) 
        {
            case 0:  notas = "Insuficiente";
                     break;
            case 1:  notas = "Insuficiente";
            		break;
            case 2:  notas = "Insuficiente";
    				break;
            case 3:  notas = "Insuficiente";
    				break;
            case 4:  notas = "Insuficiente";
    				break;
            case 5:  notas = "Suficiente";
                     break;
            case 6:  notas = "Bien";
                     break;
            case 7:  notas = "Notable";
                     break;
            case 8:  notas = "Notable";
            		 break;
            case 9:  notas = "Sobresaliente";
                     break;
            case 10:  notas = "Sobresaliente";
            		 break;
            default: notas = "Nota invalida";
                     break;
        }
        System.out.println(notas);
	}
}