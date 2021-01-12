package cap4.ejercicioSobreHerencia.coleccionAntiguedades;

public class ColeccionAntiguedades {
	
	
	public static void main(String[] args) {
		Joya joya = new Joya(1997,"Madagascar", (float) 18.93,"Diamantes");
		Libro libro = new Libro(1987,"Espana", (float) 18.93,"Antonio Machado","Campos de Castilla");
		Vasija vasija = new Vasija(2000,"Sudafrica", (float) 18.93,"Jarron","Barro");
		Procesador procesador = new Procesador(1993,"Francia", (float) 18.93,"Intel","Pentium");
		
		System.out.println(joya.toString());
		System.out.println(libro.toString());
		System.out.println(vasija.toString());
		System.out.println(procesador.toString());
	}
	
}
