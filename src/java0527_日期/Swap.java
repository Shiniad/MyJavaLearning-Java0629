package java0527_日期;

public class Swap {
	
	public static void main(String[] args) {
		int num1=100,num2=99;
		System.out.println("交换前的变量：num1:" + num1 + ",num2:" + num2);
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("交换后的变量：num1:" + num1 + ",num2:" + num2);
	}

}
