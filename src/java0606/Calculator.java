package java0606;

import java.util.Scanner;

public class Calculator {

	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num1, num2;
		num1 = scn.nextInt();
		num2 = scn.nextInt();
		Calculator calc = new Calculator();
		System.out.println("½á¹ûÎª:" + calc.add(num1, num2));
		scn.close();
	}
}
