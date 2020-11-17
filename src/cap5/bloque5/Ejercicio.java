package cap5.bloque5;

public class Ejercicio {

	public static void main(String[] args) {
		// int[] Array = new int[10];
		// for (int i = 0; i < Array.length; i++) {
		// Array[i] = i;
		// }
		// System.out.println(stringFromArray(Array));

		// int[] Array = new int[10];
		// for (int i = 0; i < Array.length; i++) {
		// Array[i] = i;
		// System.out.print(Array[i] + " ");
		// }
		// findAndReplace(Array,5,6);
		// System.out.println("\nCambiados:");
		// for (int i = 0; i < Array.length; i++) {
		// System.out.print(Array[i] + " ");
		// }

		// int[] Array = new int[10];
		// for (int i = 0; i < Array.length; i++) {
		// Array[i] = i;
		// }
		// int[] ArrayMostrar = addInteger(Array, 10);
		// for (int i = 0; i < ArrayMostrar.length; i++) {
		// System.out.println(ArrayMostrar[i]);
		// }

		// int[] Array = new int[10];
		// for (int i = 0; i < Array.length; i++) {
		// Array[i] = NumeroAleatorio(0,10);
		// System.out.println(Array[i]);
		// }
		// System.out.println("Veces encontrado el 6 : " + countOccurrences(Array,6));

		// int[] Array = new int[10];
		// for (int i = 0; i < Array.length; i++) {
		// Array[i] = NumeroAleatorio(0, 5);
		// System.out.println(Array[i]);
		// }
		// System.out.println("\nNumeros removido (3) : ");
		// int[] newArray = removeInteger(Array, 3);
		// for (int i = 0; i < newArray.length; i++) {
		// System.out.println(newArray[i]);
		// }
	}

	// Metodo que devuelve un Numero Aleatorio entre un valor inferior y superior
	public static int NumeroAleatorio(int n1, int n2) {
		int NumeroAleatorio = (int) Math.round(Math.random() * (n2 - n1) + n1);
		return NumeroAleatorio;
	}

	/****
	 * Un método llamado "stringFromArray", que reciba un array de números enteros y
	 * devuelva una cadena de caracteres. El método debe recorrer el array, de la
	 * misma forma en la que harías para mostrarlo en consola, pero en lugar de
	 * imprimir en consola debes construir un objeto String. Finalmente debes
	 * devolver el String e imprimirlo en el método "main".
	 */

	public static String stringFromArray(int[] Array) {
		String stringFromArray = "";

		for (int i = 0; i < Array.length; i++) {
			stringFromArray = (stringFromArray + Array[i]);
		}

		return stringFromArray;
	}

	/****
	 * Un método llamado "findAndReplace", que reciba: - Un array de números
	 * enteros. - Un valor entero que debe buscarse en el array. - Un valor entero
	 * que debe servir para reemplazar. El método buscará todas las ocasiones en las
	 * que el segundo parámetro aparezca dentro del array y reemplazará ese valor
	 * con el valor del tercer parámetro. El método main debe crear un array,
	 * imprimirlo en consola, llamar al método "findAndReplace" y volver a imprimir
	 * el array en consola.
	 */

	public static int[] findAndReplace(int[] Array, int buscar, int reemplazar) {
		for (int i = 0; i < Array.length; i++) {
			if (Array[i] == buscar) {
				Array[i] = reemplazar;
			}
		}
		return Array;
	}

	/****
	 * Realiza un método llamado "addInteger", que reciba: - Un array de números
	 * enteros. - Un valor entero. Dentro del método debes: - Crear un nuevo array,
	 * cuya longitud sea la del array recibido como primer parámetro + 1. - Copiar
	 * el array del primer parámetro en el array creado dentro del método, elemento
	 * tras elemento. - Agregar el nuevo elemento al final del nuevo array. -
	 * Asignar, al array recibido mediante el primer parámetro, el puntero al nuevo
	 * array creado en el interior del método. - El método debe devolver un array de
	 * tipo entero. Main debe recoger el array devuelto e imprimirlo en consola.
	 */

	public static int[] addInteger(int[] Array, int num) {
		int[] NewArray = new int[Array.length + 1];

		for (int i = 0; i < Array.length; i++) {
			NewArray[i] = Array[i];
		}
		NewArray[NewArray.length - 1] = num;

		return NewArray;
	}

	/****
	 * Realiza un método llamado "countOccurrences", que reciba: - Un array de
	 * números enteros. - Un valor entero. El método debe devolver un valor entero,
	 * que corresponda con el número de veces que el valor entero recibido como
	 * segundo parámetro exista dentro del array recibido como primer parámetro.
	 */

	public static int countOccurrences(int[] Array, int num) {
		int contador = 0;
		for (int i = 0; i < Array.length; i++) {
			if (Array[i] == num)
				contador = contador + 1;
		}
		return contador;
	}

	/****
	 * Realiza un método llamado "removeInteger", que reciba: - Un array de números
	 * enteros. - Un valor entero. Si el valor entero recibido como segundo
	 * parámetro existe dentro del array recibido como primer parámetro, debes
	 * conseguir que ese valor desaparezca del array. Puedes seguir la siguiente
	 * guía: - Utiliza el método del ejercicio 4 para saber cuántas veces aparece el
	 * valor entero (segundo parámetro) dentro del array (primer parámetro). - Crea
	 * un nuevo array, que tenga la dimensión del array recibido como primer
	 * parámetro menos la cantidad de veces que el valor entero del segundo
	 * parámetro aparezca en dicho array. - Copia todos los elementos del array
	 * recibido como primer parámetro, dentro del nuevo array creado por ti en el
	 * método. Lógicamente no debes copiar en el array los valores del primer array
	 * que coincidan con el valor introducido como segundo parámetro. - Devuelve el
	 * nuevo array. El método debe devolver "int[]". El método main debe recoger el
	 * nuevo array creado e imprimir en consola.
	 */

	public static int[] removeInteger(int[] Array, int num) {
		int aux = countOccurrences(Array, num);
		int[] newArray = new int[Array.length - aux];
		int aux2 = 0;

		for (int i = 0; i < Array.length; i++) {
			if (Array[i] == num)
				aux2 ++;
			if (Array[i] != num)
				newArray[i - aux2] = Array[i];
		}

		return newArray;
	}
}
