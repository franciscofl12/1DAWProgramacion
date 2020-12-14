package cap4.bloque2.barajaCartas;

import java.util.Arrays;

public class Poker {
	
	private Jugador[] Jugadores = new Jugador[5];

	public Poker(Jugador[] jugadores) {
		super();
		Jugadores = jugadores;
	}

	public Jugador[] getJugadores() {
		return Jugadores;
	}

	public void setJugadores(Jugador[] jugadores) {
		Jugadores = jugadores;
	}

	@Override
	public String toString() {
		return "Poker [Jugadores=" + Arrays.toString(Jugadores) + "]";
	}
}
