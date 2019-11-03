package java0604;

import java.util.Scanner;
/*
 * switch后面跟整型或字符型，根据值选择case分支
 * case后面跟一个比较值和冒号，由比较值决定switch-case结构选哪条语句分支，从变量值与case比较值相同的语句开始，依次往下执行，直到遇到break语句
 * break表示跳出当前switch-case结构，可选
 * default后面跟一个冒号，在变量值没有可以匹配的case比较值时默认执行该语句
 */
public class Calendar {
	//使用Java程序实现万年历的月历打印

	public String week(int num) {
		switch (num) {
		case 0:
			return "星期天";
		case 1:
			return "星期一";
		case 2:
			return "星期二";
		case 3:
			return "星期三";
		case 4:
			return "星期四";
		case 5:
			return "星期五";
		case 6:
			return "星期六";
		default:
			return null;
		}
	}

	public static void main(String[] args) {

		// 输入当前年份和月份
		int inityear = 1900, year, month;// 初始年份和要计算的年份数
		int leapyearsum = 0, divideyear = 0;// 计算闰年数
		Scanner scn = new Scanner(System.in);
		System.out.print("请输入年份:");
		year = scn.nextInt();
		System.out.print("请输入月份:");
		month = scn.nextInt();
		
		//计算输入年份与1900年相差年数
		divideyear = year - inityear;
		for (inityear = 1900; inityear < year + 1; inityear++) {
			if ((inityear % 4 == 0 && inityear % 100 != 0) || inityear % 400 == 0) {
				leapyearsum++;
			}
		}
		// 计算重要参数num
		int[] daylimit = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };// 12月份各有多少天数31 28 31 30 31 30 31 31 30 31 30 31
		//2月判断闰年
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			daylimit[1] = 29;
		}
		int num = ((divideyear - leapyearsum) * 365 + leapyearsum * 366) ;// 相差天数%7， 0:星期一 1:星期二 2:星期三 3 ... 6
		for (int i = 0; i < month - 1; i++) {
			num = num + daylimit[i];
		}
		num = num%7;// num表示当前日期距1900年1月1日的天数
		
		// 日历模板:星期天	星期一	星期二	星期三	星期四	星期五	星期六	
		Calendar ca = new Calendar();
		for (int i = 0; i < 7; i++) {

			System.out.print(ca.week(i) + "\t");
		}
		System.out.println();

		// 输出每月一日前的(num+1)个空格(num取值:0->5，取6时不输出空格)
		if (num < 6) {
			for (int j = 0; j < num + 1; j++) {
				System.out.print("\t");
			}
		}
		// 输出每月一日及其之后的日期，每隔7(num+2)换行
		for (int i = 1; i <= daylimit[month-1]; i++) {
			System.out.print(i + "\t");
			if ((num + 2) % 7 == 0) {
				System.out.println();
			}
			num++;
		}
		
		scn.close();

	}

}
