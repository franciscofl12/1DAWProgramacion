package cap6.Recursos;

public class MaximoLocales {

	public static void main(String[] args) {
		double x = 0.00001;
		double y,y1,y2,aux = 0;
		
		do {
			y = x*Math.sin(x);
			y1 = Math.sin(x - 0.00001) * (x-0.00001);
			y2 = Math.sin(x + 0.00001) * (x+0.00001);
			
			if (y > y1 && y > y2) {
				System.out.println("x: " + x + "\ty: " + y);
				aux++;
			}
			
			x += 0.00001;
			
		} while (aux <5);
	}
}
