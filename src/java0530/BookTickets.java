package java0530;

import java.util.Scanner;

public class BookTickets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month,selection;
		double Ticket = 4000.0,discount = 1.0;
		//inputFlag用于控制，每执行一次正确的操作+1
		int inputFlag = -1;
		
		do {
			System.out.println("请输入您出行的月份:1~12");
			month = sc.nextInt();
			System.out.println("请问您选择头等舱还是经济舱？头等舱输入1，经济舱输入2");
			selection = sc.nextInt();
			if(month<=10 && month>=4) {
				//旺季
				inputFlag += 1;
				if(selection==1) {
					discount=0.9; inputFlag += 1;
				} else if(selection==2) {
					discount=0.8; inputFlag += 1;
				}
			} else if(month<=12 && month>10 && month<4 && month>=1) {
				//淡季
				inputFlag += 1;
				if(selection==1) {
					discount=0.5; inputFlag += 1;
				} else if(selection==2) {
					discount=0.4; inputFlag += 1;
				}
			} else {
				
			}
			//当inputFlag为1时执行输出语句并结束循环
			if(inputFlag==1) {
				Ticket = Ticket*discount;
				System.out.println("您的机票价格为：" + Ticket);
			} else {
				System.out.println("输入有误，重新输入");
				inputFlag = -1;
			}
		} while(inputFlag!=1);
		sc.close();
	}

}
