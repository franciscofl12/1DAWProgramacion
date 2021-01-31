package cap6.Recursos;

public class CalcularHipotenusa {
	
	public static void main(String[] args) {
		
		float cateto1 = 4;
		float cateto2 = 5;
		
		double hipotenusa = Math.sqrt((cateto1*cateto1) + (cateto2*cateto2));
		
		System.out.println(hipotenusa);
	}

}
