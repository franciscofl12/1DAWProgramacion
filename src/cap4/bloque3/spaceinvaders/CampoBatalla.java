package cap4.bloque3.spaceinvaders;

import javax.swing.JOptionPane;

import utils.Utils;

public class CampoBatalla {
	
	static Humano Humanos[] = new Humano[20];
	static Malvado Malvados[] = new Malvado[20];
	static int masDificilMalvado = 0;
	static int masDificilHumano = 0;
	static Humano humanoMasDisparado;
	static Malvado malvadoMasDisparado;
	
	
	public CampoBatalla() {
		for (int i = 0; i < Humanos.length; i++) {
			Humanos[i] = new Humano("Humano" + Integer.toString(i));
		}
		
		Humanos[Humanos.length-1].setVida(Humanos[Humanos.length-1].getVida()*2);
		
		for (int i = 0; i < Malvados.length; i++) {
			Malvados[i] = new Malvado("Malvado" + Integer.toString(i));
		}
		
		Malvados[Malvados.length-1].setVida(Malvados[Malvados.length-1].getVida()*2);
	}
	
	public static void mezclarHumanos() {
		for (int i = 0; i < 200; i++) {
			int num = Utils.NumeroAleatorio(0, Humanos.length-1);
			int num2 = Utils.NumeroAleatorio(0, Humanos.length-1);
			Humano aux = Humanos[num];
			Humanos[num] = Humanos[num2];
			Humanos[num2] = aux ;
		}
	}
	
	public static void mezclarMalvado() {
		for (int i = 0; i < 200; i++) {
			int num = Utils.NumeroAleatorio(0, Malvados.length-1);
			int num2 = Utils.NumeroAleatorio(0, Malvados.length-1);
			Malvado aux = Malvados[num];
			Malvados[num] = Malvados[num2];
			Malvados[num2] = aux ;
		}
	}
	
	public static void dispararAMalvado() {
		for (int i = 0; i < Malvados.length; i++) {
			if (Malvados[i].isVivo() == true) {
				Malvado disparado = Malvados[i];
				disparado.setVida(disparado.getVida()-Utils.NumeroAleatorio(5, 25));
				disparado.vidaEsCero();
				disparado.setTirosRecibidos(disparado.getTirosRecibidos()+1);
				break;
			}
		}
	}
	
	public static void dispararAHumano() {
		for (int i = 0; i < Humanos.length; i++) {
			if (Humanos[i].isVivo() == true) {
				Humano disparado = Humanos[i];
				disparado.setVida(disparado.getVida()-Utils.NumeroAleatorio(5, 25));
				disparado.vidaEsCero();
				disparado.setTirosRecibidos(disparado.getTirosRecibidos()+1);
				break;
			}
		}
	}
	
	public static boolean todosMuertosHumanos() {
		int humanoAux = 0;
		for (int i = 0; i < Humanos.length; i++) {
			if (Humanos[i].isVivo() == false) {
				humanoAux++;
			}
		}
		if (humanoAux == 20) return true;
		else return false;
	}
	
	public static boolean todosMuertosMalvados() {
		int malvadoAux = 0;
		for (int i = 0; i < Malvados.length; i++) {
			if (Malvados[i].isVivo() == false) {
				malvadoAux++;
			}
		}
		if (malvadoAux == 20) return true;
		else return false;
	}
	
	public static void imprimirHumano() {
		for (int i = 0; i < Humanos.length; i++) {
			if (Humanos[i].isVivo() == true) {
				System.out.println(Humanos[i].toString() + "\n");
			}
		}
	}
	
	public static void imprimirMalvado() {
		for (int i = 0; i < Malvados.length; i++) {
			if (Malvados[i].isVivo() == true) {
				System.out.println(Malvados[i].toString() + "\n");
			}
		}
	}
	
	public static Humano masDisparadoHumano() {
		for (int i = 0; i < Humanos.length; i++) {
			if (Humanos[i].getTirosRecibidos() > masDificilHumano ) {
				masDificilHumano = Humanos[i].getTirosRecibidos();
				humanoMasDisparado = Humanos[i];
			}
		}
		return humanoMasDisparado;
	}
	
	public static Malvado masDisparadoMalvado() {
		for (int i = 0; i < Malvados.length; i++) {
			if (Malvados[i].getTirosRecibidos() > masDificilMalvado ) {
				masDificilMalvado = Malvados[i].getTirosRecibidos();
				malvadoMasDisparado = Malvados[i];
			}
		}
		return malvadoMasDisparado;
	}
	
	
	public static void main(String[] args) {
		int ronda = 0;
		CampoBatalla Batalla = new CampoBatalla();
		while (todosMuertosMalvados() == false && todosMuertosHumanos() == false) {
			dispararAHumano();
			dispararAMalvado();
			System.out.println("Batalla - Ronda " + ronda + "\n");
			imprimirHumano();
			imprimirMalvado();
			//JOptionPane.showInputDialog("Continua el juego. ");
			ronda++;
		}
		if (todosMuertosMalvados() == true) {
			System.out.println("\n\nHan ganado los humanos");
			System.out.println("El malvado mas disparado ha sido : " + masDisparadoMalvado() + " con " + masDificilMalvado + " tiros."); 
		}
		if (todosMuertosHumanos() == true) {
			System.out.println("\n\nHan ganado los malvados");
			System.out.println("El humano mas disparado ha sido : " + masDisparadoHumano() + " con " + masDificilHumano + " tiros."); 
		}
	}

}
