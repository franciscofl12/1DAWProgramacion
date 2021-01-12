package cap4.ejercicioSobreHerencia.coleccionAntiguedades;

public class Procesador extends Antiguedad{
	
	private String marca;
	private String nombre;
	
	
	public Procesador(int anoFabricacion, String origen, float precio, String marca, String nombre) {
		super(anoFabricacion, origen, precio);
		this.marca = marca;
		this.nombre = nombre;
	}


	@Override
	public String toString() {
		return "Procesador [marca=" + marca + ", nombre=" + nombre + ", anoFabricacion=" + anoFabricacion + ", origen="
				+ origen + ", precio=" + precio + "]";
	}



	
	
}
