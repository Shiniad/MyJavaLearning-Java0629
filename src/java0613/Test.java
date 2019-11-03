package java0613;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	public static void main(String[] args) throws ParseException {
		Date dt = new Date();
		System.out.println(dt);
		long time = dt.getTime();
		System.out.println(time + "ms");
		Date dt1 = new Date(0);
		System.out.println(dt1);
		System.out.println(dt1.compareTo(dt));//dt1<dt
		
		SimpleDateFormat sdf = new SimpleDateFormat("¹«Ôªyyyy/MM/dd HH:mm:ss.SS E");
		String dateStr1 = sdf.format(dt);
		System.out.println(dateStr1);
		
		sdf = new SimpleDateFormat("y-M-dd");
		String dateStr2 = "2019-8-14";
		Date dt2 = sdf.parse(dateStr2);// ½âÎö¡°2019-8-14¡±
		System.out.println(dt2);
	}
}
