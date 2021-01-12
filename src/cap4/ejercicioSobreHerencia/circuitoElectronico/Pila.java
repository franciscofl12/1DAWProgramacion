package cap4.ejercicioSobreHerencia.circuitoElectronico;

public class Pila extends Componente{
	
	private Componente componenteAnterior;
	private Componente componenteSiguiente;

	public Pila(String nombre, String bateria, int voltaje,Componente componenteAnterior,Componente componenteSiguiente) {
		super(nombre, bateria, voltaje);
		this.componenteAnterior = componenteAnterior;
		this.componenteSiguiente = componenteSiguiente;
	}
	
	public Pila(String nombre, String bateria, int voltaje) {
		super(nombre, bateria, voltaje);
	}


	public Componente getComponenteAnterior() {
		return componenteAnterior;
	}

	public void setComponenteAnterior(Componente componenteAnterior) {
		this.componenteAnterior = componenteAnterior;
	}

	public Componente getComponenteSiguiente() {
		return componenteSiguiente;
	}

	public void setComponenteSiguiente(Componente componenteSiguiente) {
		this.componenteSiguiente = componenteSiguiente;
	}

	@Override
	public String toString() {
		return "Pila [componenteAnterior=" + componenteAnterior.nombre + ", componenteSiguiente=" + componenteSiguiente.nombre
				+ ", nombre=" + nombre + ", bateria=" + bateria + ", voltaje=" + voltaje + "]";
	}

	
	
	
}
