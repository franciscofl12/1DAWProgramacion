package cap4.ejercicioSobreHerencia.cuestionarioAbstracto;

public class Respuesta {
	
	protected Pregunta pregunta;
	protected String respuesta;
	
	public Respuesta(Pregunta pregunta,String respuesta) {
		super();
		this.pregunta = pregunta;
		this.respuesta = respuesta;
	}

	public String getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

	public Respuesta() {
		super();
	}

	@Override
	public String toString() {
		return "Respuesta [respuesta=" + respuesta + "]";
	}

	
}
