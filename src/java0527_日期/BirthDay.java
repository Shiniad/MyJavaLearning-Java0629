package java0527_日期;

import java.util.Scanner;

public class BirthDay {

	public static void main(String[] args) {
		int day = 0,month = 0;
		System.out.print("请输入这个数字（把你的生日月份乘4再加9，然后乘25，再加上你的日期）：");
		Scanner sc = new Scanner(System.in);
		int initialValue = sc.nextInt();
		for(month=1;month<=12;month++) {
			day = initialValue -(month*4 +9)*25;
			//System.out.println(day);
			if(day<=31 && day>=1) {
				if(day>=30 && month==2) {
					System.out.println("查无此日");
					break;
				}
				System.out.format("你的生日为%d月%2d日",month,day);
			}
		}
		sc.close();
	}

}
