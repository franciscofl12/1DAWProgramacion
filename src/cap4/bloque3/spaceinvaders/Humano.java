package cap4.bloque3.spaceinvaders;

import utils.Utils;

public class Humano {
	
	private int vida;
	private String nombre;
	private boolean vivo;
	private int tirosRecibidos;
	
	public Humano(String nombre) {
		super();
		this.vida = Utils.NumeroAleatorio(50, 100);
		this.nombre = nombre;
		this.vivo = true;
		this.tirosRecibidos = 0;
	}
	
	public int getTirosRecibidos() {
		return tirosRecibidos;
	}

	public void setTirosRecibidos(int tirosRecibidos) {
		this.tirosRecibidos = tirosRecibidos;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isVivo() {
		return vivo;
	}

	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}

	public Humano() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Humano [vida=" + vida + ", nombre=" + nombre + ", vivo=" + vivo + "]";
	}
	
	public boolean vidaEsCero() {
		if (getVida() <= 0) {
			vivo = false;
			return vivo;
		}
		return vivo;
	}
	

}
