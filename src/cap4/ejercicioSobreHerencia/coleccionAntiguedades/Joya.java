package cap4.ejercicioSobreHerencia.coleccionAntiguedades;

public class Joya extends Antiguedad{
	
	private String material;

	public Joya(int anoFabricacion, String origen, float precio,String material) {
		super(anoFabricacion, origen, precio);
		this.material = material;
	}

	@Override
	public String toString() {
		return "Joya [material=" + material + ", anoFabricacion=" + anoFabricacion + ", origen=" + origen + ", precio="
				+ precio + "]";
	}
	
	
	
	

}
