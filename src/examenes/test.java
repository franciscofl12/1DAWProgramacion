package examenes;

public class test {
	
	public static void main(String[] args) {
		int numbers[] = new int[20];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) Math.round(Math.random() * (50 - 0) + 0);
			System.out.println("Number " + i + " - " + numbers[i]);
		}
	}
}
