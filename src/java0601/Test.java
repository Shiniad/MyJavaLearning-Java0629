package java0601;

import java.util.Scanner;

public class Test {
	
	public boolean isPrime(int a) {
		if(a<2) {
			return false;
		}
		for(int i=2;i<a;i++) {
			if(a%i!=0) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int num = 0;
		
		//分解质因数
		String ans = "y";
		Scanner scn = null;
		
		while(ans.equals("y")) {
			scn = new Scanner(System.in);
			System.out.print("请输入一个数：");
			num = scn.nextInt();
			System.out.print("分解后的质因数为：");
			int i=2;
			while(num>=2) {
				if( num%i==0 ) {
					//现在i是num的质因数
					System.out.print(i + ",");
					num /= i;  //去除质因数
					i = 2;
				}else {
					i++;
				}
			}
			System.out.print("\n请选择是否继续(y/n):");
			ans = scn.next();
		}
		scn.close();
		
	}

}
