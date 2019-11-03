package java0613;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
	
	public static String formatCalendar(Calendar cal) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date dt = cal.getTime();
		return sdf.format(dt);
	}

	public static void main(String[] args) throws ParseException {
		Calendar cal = Calendar.getInstance();//工厂方法获得Calendar对象，也是表示当前日期
		System.out.println(cal);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date dt1 = sdf.parse("2016-8-14");
//		cal.setTime(dt1);
//		System.out.println(cal);
//		cal.set(1999,9,9);
//		System.out.println(cal);
//		cal.set(Calendar.MONTH, 50);
//		System.out.println(cal);
//		cal.set(Calendar.DATE, 5);
		cal.add(Calendar.DATE, -365 * 3);
		Date mdt2 = cal.getTime();
		String str = sdf.format(mdt2);
		System.out.println(str);
		if (dt1.compareTo(mdt2)<0) {
			System.out.println("超过三年");
		} else {
			System.out.println("没有超过三年");
		}
		
		Date targetDate = sdf.parse("2015-6-7");
		Calendar cal2 = Calendar.getInstance();
		cal2.add(Calendar.YEAR, -3);
		if(cal2.getTime().after(targetDate)){// 级联调用
			System.out.println("实际超过三年");
		}
		System.out.println(Calendar.YEAR + "-" + Calendar.MONTH +"-"+ Calendar.DATE);
	}
}





