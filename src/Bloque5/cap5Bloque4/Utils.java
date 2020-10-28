package cap5Bloque4;

public class Utils {
	
	public static void analizarArray() {
		int limi = 0;
		int lims = 100;
		int var = (int) (Math.round(Math.random() * (lims - limi) + limi));
		
		int array[] = new int[(int) Math.round(Math.random() * (lims - limi) + limi)];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * (lims - limi) + limi);
		}
		
	}
}
