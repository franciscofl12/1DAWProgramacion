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
	
	/****
	 * 
	 * @return 
	 */

	public int getAlturaCm() {
		return alturaCm;
	}
	
	/****
	 * 
	 * @return
	 */

	public String getNombreJugador() {
		return nombreJugador;
	}
	
	/****
	 * 
	 * @return
	 */

	public int getPesoKg() {
		return pesoKg;
	}
	
	/****
	 * 
	 * @return
	 */

	public float getPuntosMediosPorpartido() {
		return puntosMediosPorpartido;
	}
	
	/****
	 * 
	 * @param nombreJugador
	 */
	public void setNombreJugador(String nombreJugador) {
		this.nombreJugador = nombreJugador;
	}
	
	/****
	 * 
	 * @param alturaCm
	 */
	
	public void setAlturaCm(int alturaCm) {
		this.alturaCm = alturaCm;
	}
	
	/****
	 * 
	 * @param pesoKg
	 */
	
	public void setPesoKg(int pesoKg) {
		this.pesoKg = pesoKg;
	}
	
	/****
	 * 
	 * @param puntosMediosPorpartido
	 */
	
	public void setPuntosMediosPorpartido(float puntosMediosPorpartido) {
		this.puntosMediosPorpartido = puntosMediosPorpartido;
	}
	
	/****
	 * 
	 */

	public String toString() {
		return "Jugador [Nombre()=" + getNombreJugador() + ", AlturaCm()=" + getAlturaCm() + ", pesoKg=" + getPesoKg()
				+ ", PuntosMediosPorpartido()=" + getPuntosMediosPorpartido() + "]";
	}


}
