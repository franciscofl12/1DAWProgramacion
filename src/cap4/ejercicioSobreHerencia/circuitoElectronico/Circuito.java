package cap4.ejercicioSobreHerencia.circuitoElectronico;

public class Circuito {
	
	public static void main(String[] args) {
		Led led = new Led("Led","3293kWh",30);
		Pila pila = new Pila("Pila","33293kWh",30);
		Resistencia resistencia = new Resistencia("Resistencia","323kWh",30);
		Resistor resistor = new Resistor("Resistor","3kWh",30,resistencia,led);
		led.setComponenteAnterior(resistor);
		led.setComponenteSiguiente(pila);
		pila.setComponenteAnterior(led);
		pila.setComponenteSiguiente(resistencia);
		resistencia.setComponenteAnterior(pila);
		resistencia.setComponenteSiguiente(resistor);
		
		System.out.println(led.toString());
		System.out.println(pila.toString());
		System.out.println(resistencia.toString());
		System.out.println(resistor.toString());
	}

}
