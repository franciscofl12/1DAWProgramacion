package cap4.ejercicioSobreHerencia.circuitoElectronico;

public class Componente {
	
	protected String nombre;
	protected String bateria;
	protected int voltaje;
	
	public Componente(String nombre, String bateria, int voltaje) {
		super();
		this.nombre = nombre;
		this.bateria = bateria;
		this.voltaje = voltaje;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getBateria() {
		return bateria;
	}

	public void setBateria(String bateria) {
		this.bateria = bateria;
	}

	public int getVoltaje() {
		return voltaje;
	}

	public void setVoltaje(int voltaje) {
		this.voltaje = voltaje;
	}

	@Override
	public String toString() {
		return "Componente [nombre=" + nombre + ", bateria=" + bateria + ", voltaje=" + voltaje + "]";
	}
	
	
}
