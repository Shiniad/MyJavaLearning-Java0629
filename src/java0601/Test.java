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
		
		//�ֽ�������
		String ans = "y";
		Scanner scn = null;
		
		while(ans.equals("y")) {
			scn = new Scanner(System.in);
			System.out.print("������һ������");
			num = scn.nextInt();
			System.out.print("�ֽ���������Ϊ��");
			int i=2;
			while(num>=2) {
				if( num%i==0 ) {
					//����i��num��������
					System.out.print(i + ",");
					num /= i;  //ȥ��������
					i = 2;
				}else {
					i++;
				}
			}
			System.out.print("\n��ѡ���Ƿ����(y/n):");
			ans = scn.next();
		}
		scn.close();
		
	}

}
