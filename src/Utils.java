import javax.swing.JOptionPane;

public class Utils {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(media(3, 2, 2, (float) 3.5));
		// System.out.println(obtenerNumeroDeUsuarioEntreMinimoYMaximo(25,100));
		// System.out.println(maximo(20,25));
		// System.out.println(numeroImparEntreLimites(100,150));
		// System.out.println(getStringFromEntero(Integer.parseInt(JOptionPane.showInputDialog("Introduce
		// un numero comprendido entre el 1 y 10"))));
		// System.out.println(imprimeMinimoAMaximo(4,6,31));
		
		//		int arrayDevuelto[] = fibonacci(10);
		//		for (int i = 0; i < arrayDevuelto.length ; i++) {
		//			System.out.println(arrayDevuelto[i]);
		//		}
		
		//		int arrayImprime[] = imprimeArray(10);
		//		for (int i = 0; i < arrayImprime.length ; i++) {
		//			System.out.println(arrayImprime[i]);
		//		}
		
		//				int array[] = new int[10];
		//				for (int i = 0 ; i < array.length ; i++) {
		//					array[i] = i;
		//				}
		//				int devuelto[] = recorte(array, 1, 3);
		//				for (int i = 0; i < devuelto.length ; i++) {
		//					System.out.println(devuelto[i]);
		//				}
		
		System.out.println(recursividad(0));
	}

	/****
	 * Método que reciba como parámetros de entrada tres valores enteros y uno
	 * flotante. El método se llamará "media" y debe devolver la media aritmética de
	 * los cuatro valores. El valor devuelto debe ser flotante. El método "main"
	 * debe llamar a este otro método, con valores inventados por ti, e imprimir el
	 * valor de la media en la consola de salida.
	 */

	public static float media(int n1, int n2, int n3, float n4) {
		float resultado = ((n1 + n2 + n3 + n4) / 4);
		return resultado;
	}

	/****
	 * Método llamado "obtenerNumeroDeUsuarioEntreMinimoYMaximo" que reciba dos
	 * valores enteros: un valor mínimo y un valor máximo. El método debe pedir un
	 * numero al usuario. El método examinará el número introducido por el usuario
	 * y, si dicho número no está entre el valor mínimo y el máximo que se ha
	 * indicado, seguirá pidiendo números al usuario hasta que se obtenga uno
	 * válido. Finalmente se debe devolver dicho valor del usuario al método main,
	 * que lo imprimirá en la consola.
	 */

	public static int obtenerNumeroDeUsuarioEntreMinimoYMaximo(int n1, int n2) {
		int n3;
		n3 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero entre el limite."));

		while (n3 > n1 | n3 < n1) {
			System.out.println("Numero no comprendido entre " + n1 + " y " + n2);
			n3 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero entre el limite."));
			if ((n3 > n1 | n3 < n1)) {
				return n3;
			}
			return n3;
		}
		return n3;
	}

	/****
	 * Método llamado "maximo" que devuelva el valor máximo de dos números enteros
	 * recibidos como argumentos de entrada. El método main pedirá dos números al
	 * usuario y los enviará a este nuevo método. Finalmente imprimirá en consola el
	 * valor devuelto por el método.
	 */

	public static int maximo(int n1, int n2) {
		if (n1 > n2) {
			return n1;
		} else {
			return n2;
		}
	}

	/****
	 * Método llamado "numeroImparEntreLimites" que devuelva un número entero
	 * aleatorio, impar y comprendido entre dos límites recibidos como parámetros de
	 * entrada. "main" debe llamar a este método e imprimir el valor devuelto.
	 */

	public static int numeroImparEntreLimites(int n1, int n2) {
		int random = (int) Math.round(Math.random() * (n2 - n1) + n1);
		while (((int) Math.round(Math.random() * (n2 - n1) + n1) & 1) != 0) {
			random = (int) Math.round(Math.random() * (n2 - n1) + n1);
		}
		return random;
	}

	/****
	 * Realiza un método que reciba un valor entero, del 1 al 10, como argumento de
	 * entrada y devuelva un String, con dicho número escrito en palabras. Llama a
	 * este método "getStringFromEntero".
	 */

	public static String getStringFromEntero(int n1) {

		String msg;
		switch (n1) {
		case 1:
			msg = "Uno";
			break;
		case 2:
			msg = "Dos";
			break;
		case 3:
			msg = "Tres";
			break;
		case 4:
			msg = "Cuatro";
			break;
		case 5:
			msg = "Cinco";
			break;
		case 6:
			msg = "Seis";
			break;
		case 7:
			msg = "Siete";
			break;
		case 8:
			msg = "Ocho";
			break;
		case 9:
			msg = "Nueve";
			break;
		case 10:
			msg = "Diez";
			break;
		default:
			msg = "Numero no comprendido entre 1 y 10";
			break;
		}
		return msg;
	}

	/****
	 * Método, llamado "imprimeMinimoAMaximo", que reciba tres valores enteros como
	 * argumentos de entrada. Debe imprimir dichos valores en orden de menor a
	 * mayor.
	 */

	public static String imprimeMinimoAMaximo(int n1, int n2, int n3) {
		String mayor = null;
		if ((n1 > n2) && (n1 > n3)) {
			if (n2 > n3) {
				mayor = ("Numeros ordenados: " + n1 + "," + n2 + "," + n3 + ",");
				return mayor;
			} else {
				mayor = ("Numeros ordenados: " + n1 + "," + n3 + "," + n2 + ",");
				return mayor;
			}
		} else {
			if (n2 > n3) {
				if (n1 > n3) {
					mayor = ("Numeros ordenados: " + n2 + "," + n1 + "," + n3 + ",");
					return mayor;
				} else {
					mayor = ("Numeros ordenados: " + n2 + "," + n3 + "," + n1 + ",");
					return mayor;
				}
			} else {
				if (n3 > n1) {
					if (n1 > n2) {
						mayor = ("Numeros ordenados: " + n3 + "," + n1 + "," + n2 + ",");
						return mayor;
					} else {
						mayor = ("Numeros ordenados: " + n3 + "," + n2 + "," + n1 + ",");
						return mayor;
					}
				}
			}
		}
		return mayor;
	}

	/****
	 * La serie de Fibonacci es una serie numérica que comienza en los números 1, 1
	 * y continua de forma infinita, calculando cada mienbro de la serie como la
	 * suma de los dos anteriores. De esta manera, la serie de Fibonacci comienza 1,
	 * 1, 2, 3, 5, 8, 13, 21, 34, 55.......... Debes realizar un método llamado
	 * "fibonacci". Recibirá un argumento de entrada, de tipo entero. El método debe
	 * devolver un array con la serie de Fibonacci. El parámetro de entrada del
	 * método determinará la longitud del array a devolver. El método main recibirá
	 * el array y lo imprimirá en la consola.
	 */

	public static int[] fibonacci(int n1) {
		int Array[] = new int[n1];

		Array[0] = 1;
		Array[1] = 1;

		for (int i = 2; i < n1; i++) {
			Array[i] = Array[i - 1] + Array[i - 2];
		}

		return Array;
	}

	/****
	 * Método que imprima en pantalla un array, recibirá un array como parámetro de
	 * entrada y lo mostrará en consola. Main debe enviar el array al método,
	 * llamado "imprimeArray".
	 */

	public static int[] imprimeArray(int n1) {

		int Array[] = new int[n1];

		for (int i = 0; i < Array.length; i++) {
			Array[i] = (int) Math.round(Math.random() * (1000 - 1) + 1);
		}

		return Array;

	}

	/****
	 * Método que "recorte" un array. El método recibirá un array, un "primerIndice"
	 * y un "ultimoIndice" y debe devolver un array, formado con los elementos del
	 * array recibido, cuyos índices estén dentro del intervalo cerrado formado por
	 * los dos índices recibidos
	 */

	public static int[] recorte(int array[], int n1, int n2) {
		int newArray[] = new int[n2-n1+1];

		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = array[i+n1];
		}

		return newArray;

	}

	/****
	 * Método que muestre en pantalla los números del 1 al 100. El único requisito
	 * para esto es que debe hacerse utilizando la recursividad.
	 */
	
	public static int recursividad(int recursividad) {
		if (recursividad==100) {
			return recursividad;
		}
		else {
			System.out.println(recursividad);
			return recursividad(recursividad + 1);
		}
		
		
	}

}
