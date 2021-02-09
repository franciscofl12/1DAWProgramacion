package cap6.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

public class Ejercicio1 {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		String date = JOptionPane.showInputDialog("Introduce una fecha (dias/mes/anio)");
		Date fecha = null;
		try {
			fecha = new SimpleDateFormat("dd/MM/yyyy").parse(date);
		} catch (ParseException e) {
			System.out.println("Has proporcionado una fecha incorrecta");
		}
		Calendar calendario = Calendar.getInstance();
		calendario.setTime(fecha);
		System.out.println(fecha.toString());
		System.out.println("Anio " + fecha.getYear() + "\nMes " + fecha.getMonth() + "\nDia " + fecha.getDay() + "\nHora " + fecha.getHours() + "\nMinutos " + fecha.getMinutes() + "\nSegundos " + fecha.getSeconds());
		calendario.add(Calendar.DAY_OF_MONTH, 2);
		System.out.println("Calendario mas 2 dias " + calendario.getTime());
		calendario.setTime(fecha);
		calendario.add(Calendar.DAY_OF_MONTH, -14);
		System.out.println("Calendario menos 14 dias " + calendario.getTime());
		calendario.setTime(fecha);
		calendario.add(Calendar.DAY_OF_MONTH, 300);
		System.out.println("Calendario mas 300 dias " + calendario.getTime());
		calendario.setTime(fecha);
		calendario.add(Calendar.DAY_OF_MONTH, 365*4);
		System.out.println("Calendario mas 4 anios " + calendario.getTime());
	}

}
