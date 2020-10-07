package cap2Bloque3;

import javax.swing.JOptionPane;

public class Ejercicio4{

	/**
	 * 
	 * @param args
	 */
	
	public static void main(String args[]) {
		cambio(); // Llamamos a nuestro método para hacer el calculo del area de un circulo.
	}

	public static void cambio() {
    	String var = JOptionPane.showInputDialog("Introduce las monedas"); //Pedimos al usuario que introduzca las monedas que van a pagar
    	double importe = Float.parseFloat(var);
        double devolucion = (double) (importe); // Creamos una variable para hacer la funcion de devolver

     
        double [] monedas={100,50,25,5,1}; // Creamos las opciones que hay posibles de monedas
        double [] devolver={0,0,0,0,0,}; // Creamos un array que guarde las monedas que se utilizan (tienen que ser la mismas que hay en monedas)
 
       
        for(int i=0;i<monedas.length;i++) // Pasamos por todas las monedas
        {     
            if(importe>=monedas[i]) // Comprobamos que el importe sea mayor a cada moneda
            {    
                devolver[i]=Math.floor(importe/monedas[i]); // Guardaremos la cantidad de monedas que tenemos para seguir anadiendo a cada grupo
                importe=importe-(devolver[i]*monedas[i]); // Vamos actualizando el valor del importe que sigue quedando
            }
        }
        for(int i=0;i<monedas.length;i++) // Creamos un bucle para mostrar el resultado
        {
            if(devolver[i]>0) {
               if(monedas[i]>2) {
                    // Indicamos que es una moneda
                    System.out.println("Hay "+devolver[i]+" monedas de: "+monedas[i]);
                }
            }
        }
    }
}

