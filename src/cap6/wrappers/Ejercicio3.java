package cap6.wrappers;

public class Ejercicio3 {
	
	public static void main(String[] args) {
		int[] numeros100 = new int[100];
		for (int i = 0; i < numeros100.length; i++) {
			String hex = Integer.toHexString(i);
			System.out.println("Valor hexadecimal de " + i + " : " + hex);
		}
	}
}
