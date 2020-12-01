package examenes;

import javax.swing.JOptionPane;

public class opcion_a_menu {
	
	public static void main(String[] args) {
		jugador();
	}
	
	public static void jugador() {
		String opcion = JOptionPane.showInputDialog("Selecciona el jugador. \n - Jugador 1 (A) \n - Jugador 2 (B)");
		if (opcion.equalsIgnoreCase("A"))
			opcion_a_jugador1.iniciarPrograma();
			opcion_a_jugador2.iniciarPrograma();
		if (opcion.equalsIgnoreCase("B"));
			opcion_a_jugador2.iniciarPrograma();
			opcion_a_jugador1.iniciarPrograma();
			
		if (opcion_a_jugador1.puntos > opcion_a_jugador2.puntos) {
			System.out.println("Ha ganado el jugador 1.");
		}
		else {
			if (opcion_a_jugador1.puntos < opcion_a_jugador2.puntos) {
				System.out.println("Ha ganado el jugador 2.");
			}
			else {
				System.out.println("Empate Tecnico.");
			}
		}
	}

}
