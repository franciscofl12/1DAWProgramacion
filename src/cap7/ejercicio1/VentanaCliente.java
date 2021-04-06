package cap7.ejercicio1;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.SwingConstants;

public class VentanaCliente extends JPanel {

	public static int ANCHO = 400;
	public static int ALTO = 400;
	public static String TITULO_APLICACION = "APP Usuarios";
	
	Cliente actual = null;
	private JPanel frame;
	private JTextField jtfId;
	private JLabel lblNewLabel_1;
	private JTextField jtfNombre;
	private JLabel lblNewLabel_2;
	private JTextField jtfApellidos;
	private JLabel lblNewLabel_5;
	private JTextField jtfLocalidad;
	private JLabel lblNewLabel_3;
	private JTextField jtfDni;
	private JLabel lblNewLabel_4;
	private JTextField jtffechaNac;
	private JPanel panel;
	private JButton btnPrimero;
	private JButton btnAnterior;
	private JButton btnSiguiente;
	private JButton btnUltimo;
	private JButton btnGuardar;
	private JButton btnNuevo;
	private JButton btnBorrar;
	
	
	
	public VentanaCliente() {
		super();
		this.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.insets = new Insets(5, 5, 5, 5);
//		gridBagLayout.columnWidths = new int[]{0, 0};
//		gridBagLayout.rowHeights = new int[]{0, 0};
//		gridBagLayout.columnWeights = new double[]{0.0, Double.MIN_VALUE};
//		gridBagLayout.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		
		JLabel lblNewLabel1 = new JLabel("Id:");
		GridBagConstraints gbc_lblNewLabel1 = new GridBagConstraints();
		
		jtfId = new JTextField();
		jtfId.setEnabled(false);
		GridBagConstraints gbc_jtfId = new GridBagConstraints();
		gbc_jtfId.insets = new Insets(0, 0, 5, 0);
		gbc_jtfId.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfId.gridx = 1;
		gbc_jtfId.gridy = 0;
		jtfId.setColumns(5);
		
		lblNewLabel_1 = new JLabel("Nombre:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		//frame.getContentPane().add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		jtfNombre = new JTextField();
		GridBagConstraints gbc_jtfNombre = new GridBagConstraints();
		gbc_jtfNombre.insets = new Insets(0, 0, 5, 0);
		gbc_jtfNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfNombre.gridx = 1;
		gbc_jtfNombre.gridy = 1;
		//frame.getContentPane().add(jtfNombre, gbc_jtfNombre);
		jtfNombre.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Apellidos:");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.SOUTHEAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		//frame.getContentPane().add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		jtfApellidos = new JTextField();
		GridBagConstraints gbc_jtfApellidos = new GridBagConstraints();
		gbc_jtfApellidos.insets = new Insets(0, 0, 5, 0);
		gbc_jtfApellidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfApellidos.gridx = 1;
		gbc_jtfApellidos.gridy = 2;
		//frame.getContentPane().add(jtfApellidos, gbc_jtfApellidos);
		jtfApellidos.setColumns(10);
		
		lblNewLabel_5 = new JLabel("Localidad:");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.SOUTHEAST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 3;
		//frame.getContentPane().add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		jtfLocalidad = new JTextField();
		GridBagConstraints gbc_jtfLocalidad = new GridBagConstraints();
		gbc_jtfLocalidad.insets = new Insets(0, 0, 5, 0);
		gbc_jtfLocalidad.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfLocalidad.gridx = 1;
		gbc_jtfLocalidad.gridy = 3;
		//frame.getContentPane().add(jtfLocalidad, gbc_jtfLocalidad);
		jtfApellidos.setColumns(10);
		
		lblNewLabel_3 = new JLabel("DNI/NIE:");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.SOUTHEAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 4;
		//frame.getContentPane().add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		jtfDni = new JTextField();
		GridBagConstraints gbc_jtfDni = new GridBagConstraints();
		gbc_jtfDni.insets = new Insets(0, 0, 5, 0);
		gbc_jtfDni.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfDni.gridx = 1;
		gbc_jtfDni.gridy = 4;
		//frame.getContentPane().add(jtfDni, gbc_jtfDni);
		jtfDni.setColumns(10);
		
		lblNewLabel_4 = new JLabel("fechaNac:");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.SOUTHEAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 5;
		//frame.getContentPane().add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		jtffechaNac = new JTextField();
		GridBagConstraints gbc_jtffechaNac = new GridBagConstraints();
		gbc_jtffechaNac.insets = new Insets(0, 0, 5, 0);
		gbc_jtffechaNac.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtffechaNac.gridx = 1;
		gbc_jtffechaNac.gridy = 5;
		//frame.getContentPane().add(jtffechaNac, gbc_jtffechaNac);
		jtffechaNac.setColumns(10);
		
		panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 2;
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 6;
		//frame.getContentPane().add(panel, gbc_panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnPrimero = new JButton("<<");
		btnPrimero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actual = Controlador.getInstance().findPrimero();
				cargarActualEnPantalla();
			}
		});
		panel.add(btnPrimero);
		
		btnAnterior = new JButton("<");
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actual = Controlador.getInstance().findAnterior(actual.getId());
				cargarActualEnPantalla();
			}
		});
		panel.add(btnAnterior);
		
		btnSiguiente = new JButton(">");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actual = Controlador.getInstance().findSiguiente(actual.getId());
				cargarActualEnPantalla();
			}
		});
		panel.add(btnSiguiente);
		
		btnUltimo = new JButton(">>");
		btnUltimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actual = Controlador.getInstance().findUltimo();
				cargarActualEnPantalla();
			}
		});
		panel.add(btnUltimo);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardar();
			}
		});
		panel.add(btnGuardar);
		
		btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vaciarCampos();
			}
		});
		panel.add(btnNuevo);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borrar();
			}
		});
		panel.add(btnBorrar);
		
		//agregarGestionCierreAplicacion();
	}
	
	/**
	 * 
	 */
	private void cargarActualDesdePantalla() {
		this.actual.setId(Integer.parseInt(jtfId.getText()));
		this.actual.setNombre(jtfNombre.getText());
		this.actual.setApellidos(jtfApellidos.getText());
		this.actual.setLocalidad(jtfLocalidad.getText());
		this.actual.setDni(jtfDni.getText());
		this.actual.setfechaNac(jtffechaNac.getText());
	}
	
	/**
	 * 
	 */
	private void cargarActualEnPantalla() {
		if (this.actual != null) {
			this.jtfId.setText("" + this.actual.getId());
			this.jtfNombre.setText(this.actual.getNombre());
			this.jtfApellidos.setText(this.actual.getApellidos());
			this.jtfLocalidad.setText(this.actual.getLocalidad());
			this.jtfDni.setText(this.actual.getDni());
			this.jtffechaNac.setText(this.actual.getfechaNac());
			
		}
	}
	
	private void guardar () {
		cargarActualDesdePantalla();
		String frase;
		frase = jtffechaNac.getText().strip();
		String[] palabras = frase.split(" ");
		boolean arroba = false;
		boolean punto = false;
		for (int i = 0; i < palabras.length; i++) {
			char[] caracteres = palabras[i].toCharArray();
			for (int j = 0; j < caracteres.length; j++) {
				if (Character.isAlphabetic(24)) {
					arroba = true;
					if  (Character.isAlphabetic(24)) {
						punto = true;
						// Decido si se trata de guardar un registro existente o nuevo
						if (this.actual.getId() != 0) { // Modificación
							int regsAfec = Controlador.getInstance().modificar(this.actual);
							if (regsAfec > 0) {
								JOptionPane.showMessageDialog(null, "Registro modificado correctamente");
							}
						}
						else { // Alta -  nuevo
							int idNuevoReg = Controlador.getInstance().nuevo(this.actual);
							if (idNuevoReg > 0) {
								this.jtfId.setText("" + idNuevoReg);
								JOptionPane.showMessageDialog(null, "Registro insertado correctamente");
							}
						}
					}
				}
			}
		}
		if (arroba==false) JOptionPane.showMessageDialog(null, "Falta un @ en el fechaNac. Vuelve a introducir un efechaNac");
		if (punto==false) JOptionPane.showMessageDialog(null, "Falta un . en el fechaNac. Vuelve a introducir un efechaNac");
		}
	
	/**
	 * 
	 */
	private void vaciarCampos() {
		this.jtfId.setText("0");
		this.jtfNombre.setText("");
		this.jtfApellidos.setText("");
		this.jtfLocalidad.setText("");
		this.jtfDni.setText("");
		this.jtffechaNac.setText("");
	}
	
	/**
	 * 
	 */
	private void borrar() {
		String posiblesRespuestas[] = {"Sí","No"};
		// En esta opci�n se utiliza un showOptionDialog en el que personalizo el icono mostrado
		int opcionElegida = JOptionPane.showOptionDialog(null, "¿Desea eliminar?", "Gestión venta de coches", 
		        JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, posiblesRespuestas, posiblesRespuestas[1]);
	    if(opcionElegida == 0) {
	    	int regsAfectados = Controlador.getInstance().borrar(this.actual.getId());
	    	if (regsAfectados > 0) {
	    		vaciarCampos();
	    		JOptionPane.showMessageDialog(null, "Eliminado correctamente");
	    	}
	    }
	}
		
	/**
	 * 
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCliente window = new VentanaCliente();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
