package cap2.bloque3;

import javax.swing.JOptionPane;

public class Ejercicio1{

	/**
	 * 
	 * @param args
	 */
	
	public static void main(String args[]) {
		notas(); // Llamamos a nuestro método para hacer el calculo de las notas
	}

	public static void notas() {
		String var = JOptionPane.showInputDialog("Introduzca la nota de tu asignatura: "); // Obtenemos valor para los calculos necesarios
		int num = Integer.parseInt(var); // Convertimos en entero
		int nota = Math.round(num);
        String notas;
        
        // Obtendremos los datos y crearemos una variable la cual la utilizaremos para las notas
        switch (nota) 
        {
            case 0:
            case 1:
            case 2:
            case 3:  
            case 4:  notas = "Insuficiente";
    				break;
            case 5:  notas = "Suficiente";
                     break;
            case 6:  notas = "Bien";
                     break;
            case 7:
            case 8:  notas = "Notable";
            		 break;
            case 9:
            case 10:  notas = "Sobresaliente";
            		 break;
            default: notas = "Nota invalida";
                     break;
        }
        System.out.println(notas);
	}
}