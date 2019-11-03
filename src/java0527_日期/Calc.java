package java0527_日期;

import java.util.Scanner;

public class Calc {
	//从控制台接收两个int的数据，并计算这两个数和、积、差、商。
	
	public int sum(int a, int b) {
		return a+b;
	}
	
	public int sub(int a, int b) {
		return a-b;
	}
	
	public int multi(int a, int b) {
		return a*b;
	}
	
	public double divd(int a, int b) {
		if(b==0) {
			throw new RuntimeException("被除数不得为0");
		}
		return a/(double)b;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int firstNum = sc.nextInt();
		int secondNum = sc.nextInt();
		Calc ca = new Calc();
		System.out.println("两数之和：" + ca.sum(firstNum, secondNum));
		System.out.println("两数之差：" +ca.sub(firstNum, secondNum));
		System.out.println("两数之积：" +ca.multi(firstNum, secondNum));
		System.out.println("两数之商：" +ca.divd(firstNum, secondNum));
		sc.close();
	}

}
