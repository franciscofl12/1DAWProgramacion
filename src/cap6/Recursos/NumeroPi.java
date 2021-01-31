package cap6.Recursos;

public class NumeroPi {
	
	public static void main(String[] args) {
		
		double x=3;
		int signoAuxiliar = -1;
		float piAuxiliar = 4;
		
		do {
			piAuxiliar += (signoAuxiliar * 4.0 /x);
			signoAuxiliar *= -1;
			x += 2;
			
		} while (Math.abs(Math.PI - piAuxiliar) > 0.00001);
		
		System.out.println(piAuxiliar);
	}

}
