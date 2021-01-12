package cap4.ejercicioSobreHerencia.coleccionAntiguedades;

public class Antiguedad {
	
	protected int anoFabricacion;
	protected String origen;
	protected float precio;
	
	public Antiguedad(int anoFabricacion, String origen, float precio) {
		super();
		this.anoFabricacion = anoFabricacion;
		this.origen = origen;
		this.precio = precio;
	}

	public int getAnoFabricacion() {
		return anoFabricacion;
	}

	public void setAnoFabricacion(int anoFabricacion) {
		this.anoFabricacion = anoFabricacion;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Antiguedad [anoFabricacion=" + anoFabricacion + ", origen=" + origen + ", precio=" + precio + "]";
	}
	
	
	
	
}
