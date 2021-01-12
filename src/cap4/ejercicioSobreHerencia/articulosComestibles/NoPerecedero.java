package cap4.ejercicioSobreHerencia.articulosComestibles;

public class NoPerecedero extends Producto{

	public NoPerecedero(int codigo, String nombre, float precio) {
		super(codigo, nombre, precio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "NoPerecederos [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	

}
