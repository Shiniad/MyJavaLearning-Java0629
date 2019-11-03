package java0614;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyCal {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(new SimpleDateFormat("y-M-d").format(cal.getTime()));
		System.out.println(cal.getTime());
		
		cal.set( Calendar.DAY_OF_MONTH, cal.get(Calendar.DAY_OF_MONTH) + 17 );
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		
	}

}
