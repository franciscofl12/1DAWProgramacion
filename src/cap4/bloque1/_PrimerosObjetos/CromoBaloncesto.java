package cap4.bloque1._PrimerosObjetos;

public class CromoBaloncesto {

	// Propiedades estáticas de esta clase
	public String nombreJugador;
	public int alturaCm;
	public int pesoKg;
	public float puntosMediosPorpartido;

	/**
	 * Constructor sin argumentos de entrada
	 */
	public CromoBaloncesto() {
		super();
	}
	
	/****
	 * 
	 * @param nombreJugador
	 * @param alturaCm
	 * @param pesoKg
	 * @param puntosMediosPorpartido
	 */

	public CromoBaloncesto(String nombreJugador, int alturaCm, int pesoKg, float puntosMediosPorpartido) {
		this.nombreJugador = nombreJugador;
		this.alturaCm = alturaCm;
		this.pesoKg = pesoKg;
		this.puntosMediosPorpartido = puntosMediosPorpartido;
	}

	public int getAlturaCm() {
		return alturaCm;
	}

	public String getNombreJugador() {
		return nombreJugador;
	}

	public int getPesoKg() {
		return pesoKg;
	}

	public float getPuntosMediosPorpartido() {
		return puntosMediosPorpartido;
	}

	public void setNombreJugador(String nombreJugador) {
		this.nombreJugador = nombreJugador;
	}
	
	public void setAlturaCm(int alturaCm) {
		this.alturaCm = alturaCm;
	}
	
	public void setPesoKg(int pesoKg) {
		this.pesoKg = pesoKg;
	}
	
	public void setPuntosMediosPorpartido(float puntosMediosPorpartido) {
		this.puntosMediosPorpartido = puntosMediosPorpartido;
	}

	public String toString() {
		return "Jugador [Nombre()=" + getNombreJugador() + ", AlturaCm()=" + getAlturaCm() + ", pesoKg=" + getPesoKg()
				+ ", PuntosMediosPorpartido()=" + getPuntosMediosPorpartido() + "]";
	}


}
