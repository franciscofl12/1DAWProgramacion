package cap6.math;

public class GraficasCortan {
	
	public static void main(String[] args) {
		double x = 0.0001;
		double y,y2;
		
		do {
			
			y = Math.sqrt(x);
			y2 = -Math.log(x);
			x += 0.0001;
			
		} while (Math.abs(y-y2) > 0.001);
		
		System.out.println(x + "\n" + y2);
	}
	
}

