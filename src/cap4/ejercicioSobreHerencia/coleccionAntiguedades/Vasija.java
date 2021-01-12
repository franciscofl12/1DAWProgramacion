package cap4.ejercicioSobreHerencia.coleccionAntiguedades;

public class Vasija extends Antiguedad{
	
	private String tipo;
	private String material;
	
	public Vasija(int anoFabricacion, String origen, float precio, String tipo, String material) {
		super(anoFabricacion, origen, precio);
		this.tipo = tipo;
		this.material = material;
	}

	@Override
	public String toString() {
		return "Vasija [tipo=" + tipo + ", material=" + material + ", anoFabricacion=" + anoFabricacion + ", origen="
				+ origen + ", precio=" + precio + "]";
	}
	
	
}
