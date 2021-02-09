package cap6.date;

import java.util.Calendar;
import java.util.TimeZone;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		Calendar calendarioESP = Calendar.getInstance();
		Calendar calendarioIT = Calendar.getInstance(TimeZone.getTimeZone("Europe/Italy"));
		Calendar calendarioAUS = Calendar.getInstance(TimeZone.getTimeZone("Australia/Sydney"));
		System.out.println("ESP " + calendarioESP.get(Calendar.HOUR_OF_DAY));
		System.out.println("Roma " + calendarioIT.get(Calendar.HOUR_OF_DAY));
		System.out.println("Sidney " + calendarioAUS.get(Calendar.HOUR_OF_DAY));
		System.out.println("Diferencia Horaria: " + (calendarioAUS.get(Calendar.HOUR_OF_DAY)-calendarioIT.get(Calendar.HOUR_OF_DAY)));
	}

}
