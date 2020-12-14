package cap4.bloque2.barajaCartas;

import utils.Utils;

public class Baraja {
	
	static Carta cartas[] = new Carta[52];
	static int contador = cartas.length-1;
	
	/****
	 * Creo la baraja
	 */
	
	public Baraja() {
		
		for (int i = 0; i < cartas.length/4; i++) {
			cartas[i] = new Carta(i,"Corazones",i);
		}
		
		int aux = 13;
		
		for (int i = 0; i < cartas.length/4; i++) {
			cartas[i+aux] = new Carta(i,"Diamantes",i+aux);
		}
		
		int aux2 = 26;
		
		for (int i = 0; i < cartas.length/4; i++) {
			cartas[i+aux2] = new Carta(i,"Treboles",i+aux2);
		}
		
		int aux3 = 39;
		
		for (int i = 0; i < cartas.length/4; i++) {
			cartas[i+aux3] = new Carta(i,"Picas",i+aux3);
		}
	}
	
	/****
	 * Una carta de arriba hacia abajo
	 */
	
	public static void arribaAbajo() {
		for (int c = 0 ; c < 1; c++) { // Funcion que repetira la funcion de mover numeros
			Carta aux = cartas[cartas.length - 1]; // Creamos una variable en la cual guardaremos la ultima variable
				for (int i = cartas.length - 1; i > 0; i--) { // Iremos bajando y cambiando el valor de cada puesto del cartas
					if (cartas.length > i) {
						if (i != 0) {
							cartas[i] = cartas[i - 1];
						}
					}
				}
			cartas[0] = aux; // Guardamos en el primner puesto el ultimo valor que guardamos anteriormente
		}
	}
	
	/****
	 * Una carta de abajo hacia arriba
	 */
	
	public static void abajoArriba() {
		for (int c = 0 ; c < 1; c++) { // Funcion que repetira la funcion de mover numeros
			Carta aux = cartas[0]; // Creamos una variable en la cual guardaremos la ultima variable
				for (int i = 0; i < cartas.length-1; i++) { // Iremos bajando y cambiando el valor de cada puesto del cartas
					if (cartas.length > i) {
						cartas[i] = cartas[i + 1];
					}
				}
			cartas[cartas.length-1] = aux; // Guardamos en el primner puesto el ultimo valor que guardamos anteriormente
		}
	}
	
	/****
	 * Mezclar la baraja
	 */
	
	public static void mezclarBaraja() {
		for (int i = 0; i < 200; i++) {
			int num = Utils.NumeroAleatorio(0, cartas.length-1);
			int num2 = Utils.NumeroAleatorio(0, cartas.length-1);
			Carta aux = cartas[num];
			cartas[num] = cartas[num2];
			cartas[num2] = aux ;
		}
	}
	
	/****
	 * Ordenar la baraja
	 */
	
	public static void ordenaBaraja() {
		boolean permutacion = true;
		while (permutacion == true) {
			permutacion = false;
			for (int i = 1; i < cartas.length; i++) {
		
				if (cartas[i-1].getId() > cartas[i].getId()) {
					Carta aux = cartas[i-1];
					cartas[i-1] = cartas[i];
					cartas[i] = aux;
					permutacion = true;
				}
			}
		}
	}
	
	/****
	 * Imprimir la baraja
	 */
	
	public static void imprimeBaraja() {
		for (int i = 0; i < cartas.length; i++) {
			System.out.println(cartas[i]);
		}
	}
	
	/****
	 * 
	 * @return rellenar de cartas la mano
	 */
	
	public static Carta[] darMano() {
		Carta[] mano = new Carta[5];
		for (int i = 0; i < mano.length; i++) {
			mano[i] = cartas[contador];
			contador--;
		}
		return mano;
	}
	
	/***
	 * 
	 * @return jugadores
	 */
	
	public static Jugador[] crearJugadores() {
		Jugador[] jugadores = new Jugador[5];
		jugadores[0] = (new Jugador("Antonio", darMano()));
		jugadores[1] = (new Jugador("Ruben", darMano()));
		jugadores[2] = (new Jugador("Jesus", darMano()));
		jugadores[3] = (new Jugador("Pablo", darMano()));
		jugadores[4] = (new Jugador("Francisco", darMano()));
		
		return jugadores;
	}
	
//	public static void comprobarGanador(Poker poker) {
//		poker.getJugadores().getMano();
//	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Baraja baraja = new Baraja();
		mezclarBaraja();
//		ordenaBaraja();
//		imprimeBaraja();
		Poker poker = new Poker(crearJugadores());
		System.out.println(poker.toString());
	}

}
