package java0527_����;

import java.util.Scanner;

public class Calc {
	//�ӿ���̨��������int�����ݣ����������������͡�������̡�
	
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
			throw new RuntimeException("����������Ϊ0");
		}
		return a/(double)b;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int firstNum = sc.nextInt();
		int secondNum = sc.nextInt();
		Calc ca = new Calc();
		System.out.println("����֮�ͣ�" + ca.sum(firstNum, secondNum));
		System.out.println("����֮�" +ca.sub(firstNum, secondNum));
		System.out.println("����֮����" +ca.multi(firstNum, secondNum));
		System.out.println("����֮�̣�" +ca.divd(firstNum, secondNum));
		sc.close();
	}

}
