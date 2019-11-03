package java0614;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DeadLine {

	public static void main(String[] args) throws ParseException {
		// 输入参数
		Scanner scn = new Scanner(System.in);
		System.out.print("请输入起始日期(格式为yyyy-MM-dd):");
		String startDate = scn.nextLine();
		System.out.print("请输入任务所需工作日:");
		int workDay = scn.nextInt();
		SimpleDateFormat sdf = new SimpleDateFormat("y-M-d");
		Date dt = sdf.parse(startDate);
		Calendar cal = Calendar.getInstance();
		
		cal.setTime(dt);// 初始化日期为给定日期
		if ( cal.get(Calendar.DAY_OF_WEEK) == 7) {
			cal.add(Calendar.DATE, 2 );
		} else if (cal.get(Calendar.DAY_OF_WEEK) == 1) {
			cal.add(Calendar.DATE, 1 );
		}
		
		//通过循环验证
		int initN = cal.get(Calendar.DAY_OF_WEEK);// 获取当前日期为星期几，1表示星期六，7表示星期日	
		int day = 0, week = 0;
		while( day < workDay ) {
			initN++;
			if ( initN == 8) { initN = 1; }
			if(initN == 1 || initN == 7) {
				week++;// 双休日增加一天
			} else {
				day++;// 工作日增加一天
			}
		}
		cal.add(Calendar.DATE, day + week ); 
		System.out.println("任务结束日期为:" + sdf.format(cal.getTime()));
		
		
		cal.setTime(dt);// 初始化日期为给定日期
		if ( cal.get(Calendar.DAY_OF_WEEK) == 7) {
			cal.add(Calendar.DATE, 2 );
		} else if (cal.get(Calendar.DAY_OF_WEEK) == 1) {
			cal.add(Calendar.DATE, 1 );
		}
		
		//计算周数和额外的余数验证
		cal.add(Calendar.DATE, workDay/5*7 + workDay%5);
		if ( cal.get(Calendar.DAY_OF_WEEK) == 7) {
			cal.add(Calendar.DATE, 2 );
		} else if (cal.get(Calendar.DAY_OF_WEEK) == 1) {
			cal.add(Calendar.DATE, 1 );
		}
		System.out.println("任务结束日期为:" + sdf.format(cal.getTime()));
		scn.close();
	}
}
