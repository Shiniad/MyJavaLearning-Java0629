package java0614;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalculateBirthTime {

	public static void main(String[] args) throws ParseException {
		Scanner scn = new Scanner(System.in);
		System.out.print("请输入您的生日(格式为yyyy-MM-dd):");
		String target = scn.nextLine();

		
		//使用SimpleDateFormat格式化输入日期,使用parse()方法将字符串解析为Date类型
		SimpleDateFormat mysdf = new SimpleDateFormat("y-M-d");
		Date tarDate = mysdf.parse(target);// 解析
		
		//使用setTime()方法将Date类型的时间传入Calendar实例化的类中
		Calendar cal = Calendar.getInstance();
		long time1 = cal.getTimeInMillis();
		cal.setTime(tarDate);
		long time2 = cal.getTimeInMillis();
		System.out.println("您已经出生" + (time1-time2)/(3600 * 1000) + "小时");
		
		scn.close();
	}
}
