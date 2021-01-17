package cap4.ejercicioSobreHerencia.cuestionarioAbstracto;

import javax.swing.JOptionPane;

public class Cuestionario {
	
	static int contador;
	
	public static void main(String[] args) {
		
		Pregunta pregunta1 = new Pregunta();
		pregunta1.setEnunciado("Capital de Espana");
		pregunta1.setTipo("Opcion Unica");
		Respuesta respuesta1 = new Respuesta(pregunta1,"Madrid");
		Respuesta respuesta2 = new Respuesta(pregunta1,"Barcelona");
		Respuesta respuesta3 = new Respuesta(pregunta1,"Sevilla");
		Respuesta respuesta4 = new Respuesta(pregunta1,"Badajoz");
		pregunta1.setRespuestaCorrecta(respuesta1);
		
		System.out.println(pregunta1.toString());
		System.out.println("1 - " + respuesta1.toString());
		System.out.println("2 - " + respuesta2.toString());
		System.out.println("3 - " + respuesta3.toString());
		System.out.println("4 - " + respuesta4.toString());
		
		int var = Integer.parseInt(JOptionPane.showInputDialog("Cual es la correcta?"));
		
		if (var == 1) contador++;
		
		Pregunta pregunta2 = new Pregunta();
		pregunta2.setEnunciado("Por donde pasa el rio guadalquivir");
		pregunta2.setTipo("Opcion Unica");
		Respuesta respuesta5 = new Respuesta(pregunta2,"Madrid");
		Respuesta respuesta6 = new Respuesta(pregunta2,"Barcelona");
		Respuesta respuesta7 = new Respuesta(pregunta2,"Cordoba");
		Respuesta respuesta8 = new Respuesta(pregunta2,"Badajoz");
		pregunta2.setRespuestaCorrecta(respuesta7);
		
		System.out.println(pregunta2.toString());
		System.out.println("1 - " + respuesta5.toString());
		System.out.println("2 - " + respuesta6.toString());
		System.out.println("3 - " + respuesta7.toString());
		System.out.println("4 - " + respuesta8.toString());
		
		int var2 = Integer.parseInt(JOptionPane.showInputDialog("Cual es la correcta?"));
		
		if (var2 == 3) contador++;
		
		Pregunta pregunta3 = new Pregunta();
		pregunta3.setEnunciado("Donde se encuentran las Ruinas romanas de Itálica");
		pregunta3.setTipo("Opcion Unica");
		Respuesta respuesta9 = new Respuesta(pregunta3,"Madrid");
		Respuesta respuesta10 = new Respuesta(pregunta3,"Barcelona");
		Respuesta respuesta11 = new Respuesta(pregunta3,"Sevilla");
		Respuesta respuesta12 = new Respuesta(pregunta3,"Badajoz");
		pregunta3.setRespuestaCorrecta(respuesta11);
		
		System.out.println(pregunta3.toString());
		System.out.println("1 - " + respuesta9.toString());
		System.out.println("2 - " + respuesta10.toString());
		System.out.println("3 - " + respuesta11.toString());
		System.out.println("4 - " + respuesta12.toString());
		
		int var3 = Integer.parseInt(JOptionPane.showInputDialog("Cual es la correcta?"));
		
		if (var3 == 3) contador++;
		
		Pregunta pregunta4 = new Pregunta();
		pregunta4.setEnunciado("Que equipo de futbol gano la liga el ano pasado?");
		pregunta4.setTipo("Opcion Unica");
		Respuesta respuesta13 = new Respuesta(pregunta4,"Madrid");
		Respuesta respuesta14 = new Respuesta(pregunta4,"Barcelona");
		Respuesta respuesta15 = new Respuesta(pregunta4,"Sevilla");
		Respuesta respuesta16 = new Respuesta(pregunta4,"Badajoz");
		pregunta4.setRespuestaCorrecta(respuesta13);
		
		System.out.println(pregunta4.toString());
		System.out.println("1 - " + respuesta13.toString());
		System.out.println("2 - " + respuesta14.toString());
		System.out.println("3 - " + respuesta15.toString());
		System.out.println("4 - " + respuesta16.toString());
		
		int var4 = Integer.parseInt(JOptionPane.showInputDialog("Cual es la correcta?"));
		
		if (var4 == 1) contador++;
		
		Pregunta pregunta5 = new Pregunta();
		pregunta5.setEnunciado("Que lenguaje estamos estudiando");
		pregunta5.setTipo("Opcion Unica");
		Respuesta respuesta17 = new Respuesta(pregunta5,"C");
		Respuesta respuesta18 = new Respuesta(pregunta5,"Python");
		Respuesta respuesta19 = new Respuesta(pregunta5,"Java");
		Respuesta respuesta20 = new Respuesta(pregunta5,"Javascript");
		pregunta5.setRespuestaCorrecta(respuesta19);
		
		System.out.println(pregunta5.toString());
		System.out.println("1 - " + respuesta17.toString());
		System.out.println("2 - " + respuesta18.toString());
		System.out.println("3 - " + respuesta19.toString());
		System.out.println("4 - " + respuesta20.toString());
		
		int var5 = Integer.parseInt(JOptionPane.showInputDialog("Cual es la correcta?"));
		
		if (var5 == 3) contador++;
		
		System.out.println("Has acertado " + contador + " preguntas.");
	}
}
