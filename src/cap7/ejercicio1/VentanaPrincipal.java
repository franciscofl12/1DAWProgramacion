package cap7.ejercicio1;

import java.awt.BorderLayout;


import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class VentanaPrincipal extends JFrame {

	static {
		Apariencia.setAparienciasOrdenadas(Apariencia.aparienciasOrdenadas);
	}

	/**
	 * 
	 */
	public VentanaPrincipal() {
		super("Gestión Concesionario");
		this.setBounds(0, 0, 800, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;

		// Establezco el panel principal de la aplicaci�n y la barra de herramientas
		this.setLayout(new BorderLayout());
		this.add(getTabbedPane(), BorderLayout.CENTER);
	}

	/**
	 * 
	 * @return
	 */
	private JTabbedPane getTabbedPane() {
		JTabbedPane tabbedPane = new JTabbedPane();

		tabbedPane.add("Cliente", new VentanaCoche());
		tabbedPane.add("Cliente", new VentanaCoche());
		

		return tabbedPane;
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		VentanaPrincipal ventana = new VentanaPrincipal();
		ventana.setVisible(true);
	}

}
