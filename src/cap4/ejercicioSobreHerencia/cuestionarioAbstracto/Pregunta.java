package cap4.ejercicioSobreHerencia.cuestionarioAbstracto;

public class Pregunta {
	
	protected String enunciado;
	protected String tipo;
    protected Respuesta respuesta;
    
	@Override
	public String toString() {
		return "Pregunta [enunciado=" + enunciado + ", tipo=" + tipo + "]";
	}

	public Pregunta(String enunciado, String tipo, Respuesta respuesta) {
		super();
		this.enunciado = enunciado;
		this.tipo = tipo;
		this.respuesta = respuesta;
	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Respuesta getRespuestaCorrecta() {
		return respuesta;
	}

	public void setRespuestaCorrecta(Respuesta respuesta) {
		this.respuesta = respuesta;
	}

	public Pregunta() {
		super();
	}
	
	
	
    
}
