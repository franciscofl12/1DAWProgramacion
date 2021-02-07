package cap6.hashMap;

public class Articulo {
	
	public int codigoBarras;
	public int numeroEstante;
	public String nombre;
	public int numeroStock;
	
	public Articulo(int codigoBarras, int numeroEstante, String nombre, int numeroStock) {
		super();
		this.codigoBarras = codigoBarras;
		this.numeroEstante = numeroEstante;
		this.nombre = nombre;
		this.numeroStock = numeroStock;
	}

	public Articulo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(int codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public int getNumeroEstante() {
		return numeroEstante;
	}

	public void setNumeroEstante(int numeroEstante) {
		this.numeroEstante = numeroEstante;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroStock() {
		return numeroStock;
	}

	public void setNumeroStock(int numeroStock) {
		this.numeroStock = numeroStock;
	}

	@Override
	public String toString() {
		return "Articulo [codigoBarras=" + codigoBarras + ", numeroEstante=" + numeroEstante + ", nombre=" + nombre
				+ ", numeroStock=" + numeroStock + "]";
	}
	
	
	
}
