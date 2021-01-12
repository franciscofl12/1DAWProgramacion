package cap4.ejercicioSobreHerencia.coleccionAntiguedades;

public class Libro extends Antiguedad{
	
	private String autor;
	private String titulo;
	
	public Libro(int anoFabricacion, String origen, float precio, String autor, String titulo) {
		super(anoFabricacion, origen, precio);
		this.autor = autor;
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "Libro [autor=" + autor + ", titulo=" + titulo + ", anoFabricacion=" + anoFabricacion + ", origen="
				+ origen + ", precio=" + precio + "]";
	}
	
}
