package programmer.zaman.now.classes;

import java.util.Calendar;
import java.util.Date;

public class DateAndTime {
	public static void main(String[] args) {

		Date tanggal = new Date();

		System.out.println(tanggal);

		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, -10);
		calendar.set(Calendar.MONTH, Calendar.JANUARY);
		calendar.set(Calendar.HOUR_OF_DAY, 10);

		Date result = new Date();
		System.out.println(result);

	}
}
