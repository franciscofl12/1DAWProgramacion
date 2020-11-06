package src;

import javax.swing.JOptionPane;

public class Utils {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(media(3, 2, 2, (float) 3.5));
		System.out.println(obtenerNumeroDeUsuarioEntreMinimoYMaximo(25,100,105));
		

	}
	
	public static float media(int n1,int n2,int n3,float n4) {
		float resultado = ((n1+n2+n3+n4)/4);
		return resultado;
	}
	
	public static int obtenerNumeroDeUsuarioEntreMinimoYMaximo(int n1,int n2,int n3) {
		
		while (n3>n1 | n3<n1) {
			n3 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero entre el limite."));
			if ((n3>n1 | n3<n1)) {
				return n3;
			}
		return n3;
	}
		return n3;
}
}
