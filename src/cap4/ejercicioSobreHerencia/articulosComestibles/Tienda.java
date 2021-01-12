package cap4.ejercicioSobreHerencia.articulosComestibles;

public class Tienda {

	public static void main(String[] args) {
		Perecedero articulo = new Perecedero(33,"Leche",(float) 5.93,"3/10/23");
		Perecedero articulo2 = new Perecedero(33,"Huevos",(float) 5.93,"3/10/23");
		NoPerecedero articulo3 = new NoPerecedero(33,"Champu",(float) 5.93);
		NoPerecedero articulo4 = new NoPerecedero(33,"Colonia",(float) 5.93);
		
		System.out.println(articulo.toString());
		System.out.println(articulo2.toString());
		System.out.println(articulo3.toString());
		System.out.println(articulo4.toString());
	}
}
