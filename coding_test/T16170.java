package coding_test;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class T16170 {

	public static void main(String[] args) {
		ZonedDateTime zdt = ZonedDateTime.now(ZoneOffset.UTC);
		
		int year = zdt.getYear();
		int month = zdt.getMonthValue();
		int day = zdt.getDayOfMonth();

		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
	}

}
