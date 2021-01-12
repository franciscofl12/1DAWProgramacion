package cap4.ejercicioSobreHerencia.circuitoElectronico;

public class Led extends Componente{
	
	private Componente componenteAnterior;
	private Componente componenteSiguiente;

	public Led(String nombre, String bateria, int voltaje,Componente componenteAnterior,Componente componenteSiguiente) {
		super(nombre, bateria, voltaje);
		this.componenteAnterior = componenteAnterior;
		this.componenteSiguiente = componenteSiguiente;
	}
	
	public Led(String nombre, String bateria, int voltaje) {
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
		return "Led [componenteAnterior=" + componenteAnterior.nombre + ", componenteSiguiente=" + componenteSiguiente.nombre
				+ ", nombre=" + nombre + ", bateria=" + bateria + ", voltaje=" + voltaje + "]";
	}

	
	
	
}
