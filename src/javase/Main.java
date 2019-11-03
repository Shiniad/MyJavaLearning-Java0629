package javase;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = -1;
		boolean[] b;
		
		//����T
		while(true) {
			T = sc.nextInt();
			if(T<=10 && T>=1) {
				break;
			} else {
				System.out.println("������һ��С��10��������");
			}
		}
		b = new boolean[T];
		
		for(int i=0;i<T;i++) {
			try {
				long firnum = sc.nextLong();
				long secnum = sc.nextLong();
				long thinum = sc.nextLong();
			if(firnum + secnum > thinum) {
				b[i] = true;
			} else {
				b[i] = false;
			}
			} catch(ArithmeticException  e) {
				e.printStackTrace();
			}
		}
		sc.close();
		
		for(int i=0;i<T;i++) {
			System.out.print("Case #" + (i + 1) + ": ");
			System.out.println(b[i]);
		}
	}

}
