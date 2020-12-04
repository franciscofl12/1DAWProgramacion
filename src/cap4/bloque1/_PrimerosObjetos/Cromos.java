package cap4.bloque1._PrimerosObjetos;

import java.util.ArrayList;

import java.util.List;

public class Cromos {
	
	/****
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		CromoBaloncesto b1 = new CromoBaloncesto("Antonio", 200, 100, 40);
		CromoBaloncesto b2 = new CromoBaloncesto("Francisco", 183, 80, 10);
		CromoBaloncesto b3 = new CromoBaloncesto("Ruben", 160, 40, 15);
		CromoBaloncesto b4 = new CromoBaloncesto("Jesus", 210, 80, 20);
		CromoBaloncesto b5 = new CromoBaloncesto("Juan", 170, 65, 18);

		List<CromoBaloncesto> listaCromos = new ArrayList<CromoBaloncesto>();

		listaCromos.add(b1);
		listaCromos.add(b2);
		listaCromos.add(b3);
		listaCromos.add(b4);
		listaCromos.add(b5);

		for (int i = 0; i < listaCromos.size(); i++) {
			System.out.println(listaCromos.get(i).toString());
		}
		
		// Metodo de ordenación burbuja
		
		boolean permutacion = true;
		System.out.println(" ");
		System.out.println("Ordenado por puntos: ");
		while (permutacion == true) {
			permutacion = false;
			for (int i = 1; i < listaCromos.size(); i++) {
				if (listaCromos.get(i - 1).getPuntosMediosPorpartido() > listaCromos.get(i)
						.getPuntosMediosPorpartido()) {
					CromoBaloncesto aux = listaCromos.get(i);
					listaCromos.set(i, listaCromos.get(i - 1));
					listaCromos.set(i - 1, aux);
					permutacion = true;
				}
			}
			System.out.println(permutacion);
		}

		for (int i = 0; i < listaCromos.size(); i++) {
			System.out.println(listaCromos.get(i).toString());
		}

	}
}
