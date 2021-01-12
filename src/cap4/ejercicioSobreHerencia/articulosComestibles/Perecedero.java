package cap4.ejercicioSobreHerencia.articulosComestibles;

public class Perecedero extends Producto{
	
	private String fechaCaducidad;

	public Perecedero(int codigo, String nombre, float precio, String fechaCaducidad) {
		super(codigo, nombre, precio);
		this.fechaCaducidad = fechaCaducidad;
	}

	@Override
	public String toString() {
		return "Perecederos [fechaCaducidad=" + fechaCaducidad + ", codigo=" + codigo + ", nombre=" + nombre
				+ ", precio=" + precio + "]";
	}

	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	
	
	
	
	

}
