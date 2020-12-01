package examenes;

import javax.swing.JOptionPane;

import utils.Utils;

public class opcion_a_jugador2 {
	static int bolos[] = new int[10];
	static int probabilidad = 0;
	static int tirada = 0;
	static int puntos = 0;
	static int dificultad =0;

	public static void main(String[] args) {
	}
	
	/****
	 * Este programa solo se ejecutara desde otra clase, no sera utilizado para iniciarse, por eso utilizaremos este metodo.
	 */
	
	public static void iniciarPrograma() {
		for (int i = 0; i < bolos.length; i++) {
			bolos[i] = 1;
		}
		menu();
	}
	
	public static void menu() {
		System.out.println("Juego Bolos." + "\n A - Juego " + "\n B - Salir del Juego");
		String opcion = JOptionPane.showInputDialog("JUGADOR 2. Elige una opcion");
		while (opcion.equalsIgnoreCase("A") && opcion.equalsIgnoreCase("B")) {
			opcion = JOptionPane.showInputDialog("Elige una opcion");
		}
		if (opcion.equalsIgnoreCase("A"))
			juego();
		if (opcion.equalsIgnoreCase("B"))
			System.exit(0);
	}
	
	/****
	 * Metodo que llevara el apartado del juego, sera el que accione todos los otros metodos para que el juego funcione sin ningun problema.
	 */

	public static void juego() {
		imprimirBolos();
		int rondas = 0;
		probabilidad();
		while (numeroBolos() != 0) {
			System.out.println("Estas en la ronda : " + rondas);
			tirarBolos();
			imprimirBolos();
			numeroBolos();
			String opcion = JOptionPane.showInputDialog("Quieres continuar? \n Y: SI \n N: NO");
			if (opcion.equalsIgnoreCase("B"))
				System.exit(0);
			rondas++;
		}
		
		if (numeroBolos() == 0) {
			for (int i = 0; i < 30; i++) {
				System.out.println("\n");
			}
			System.out.println("\n \n Jugador 2 ha terminado! Ha obtenido " + puntos + " puntos ");
		}
	}
	
	public static int probabilidad() {
		probabilidad = Utils.NumeroAleatorio(30, 70);
		return probabilidad;
	}
	public static void imprimirBolos() {
		System.out.println("BOLOS");
		System.out.println("\n " + bolos[9] + " " + " " + bolos[8] + "  " + " " + bolos[7] + " " + " " + bolos[6] + "  "
				+ "\n  " + bolos[5] + "  " + " " + bolos[4] + "  " + " " + bolos[3] + " " + "\n    " + bolos[2] + "  "
				+ " " + bolos[1] + " " + "\n      " + bolos[0] + " ");
	}

	public static void tirarBolos() {
		for (int i = 0; i < bolos.length; i++) {
			if ((probabilidad-dificultad) < 30) probabilidad ++;
			if (Utils.NumeroAleatorio(0, 100) < probabilidad-dificultad) {
				dificultad += 5;
//				System.out.println("Has tirado un bolo con la probabilidad de : " + (probabilidad-dificultad));
				bolos[i] = 0;
				if (tirada == 0)
					puntos += 10;
				if (tirada == 1)
					puntos += 5;
				if (tirada == 2)
					puntos += 2;
				if (tirada == 3)
					puntos += 1;
				if (tirada <= 4)
					puntos += 0;
			}
			
		}
		System.out.println("Tienes : " + puntos + " puntos ");
		tirada++;
	}

	public static int numeroBolos() {
		int aux = 0;
		for (int i = 0; i < bolos.length; i++) {
			if (bolos[i] == 0)
				aux++;
		}
		return (bolos.length - aux);
	}
	
	public static int jugador2() {
		return puntos;
	}
	
	
}
