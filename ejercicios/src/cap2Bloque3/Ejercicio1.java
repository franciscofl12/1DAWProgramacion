package cap2Bloque3;

public class Ejercicio1{

	/**
	 * 
	 * @param args
	 */
	
	public static void main(String args[]) {
		notas(); // Llamamos a nuestro método para hacer el calculo del area de un circulo.
	}

	public static void notas() {
		int nota = 5;
        String notas;
        
        // Obtendremos los datos y crearemos una variable la cual la utilizaremos para las notas
        switch (nota) 
        {
            case 1:  notas = "Insuficiente";
                     break;
            case 2:  notas = "Suficiente";
                     break;
            case 3:  notas = "Bien";
                     break;
            case 4:  notas = "Notable";
                     break;
            case 5:  notas = "Sobresaliente";
                     break;
            default: notas = "Nota invalida";
                     break;
        }
        System.out.println(notas);
	}
}