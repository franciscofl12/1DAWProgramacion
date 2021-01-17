package cap4.ejercicioSobreHerencia.ventanaConCanvas;

import java.awt.BorderLayout;

public class VentanaMostrar {
	
	public static void main(String[] args) {
		Ventana ventana = new Ventana();
		Figura figuras = new Figura();
		
		ventana.setLayout(new BorderLayout()); //Creo un borderlayout
		ventana.getContentPane().add(figuras); // Anado las figuras
		ventana.setVisible(true); // Hago visible la ventana
		
	}
	
	
}
