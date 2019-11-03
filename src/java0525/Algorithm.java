package java0525;

import java.util.Scanner;

public class Algorithm {

	public static void main(String[] args) {
		//������		    1,2,3,4,5,6
		//*���ִ�д�����  1,3,5,7,9,11
		//�ո�ִ�д�����     5,4,3,2,1,0
		int ROW = 2;  //����������
		int NUMBER = 3;  //ÿ��������
		int SIZE=6;  //���δ�С
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���������δ�С��");
		SIZE = sc.nextInt();
		System.out.print("������ÿ����������");
		NUMBER = sc.nextInt();
		System.out.print("��������������");
		ROW = sc.nextInt();
		
		for(int r=1;r<=ROW;r++) {
			//�����￪ʼ������ѭ��,��������ϰ벿��
			for(int i=1;i<=SIZE;i++) {
				for(int n=1;n<=NUMBER;n++) {
					for(int j=1;j<=SIZE-i;j++) {
						System.out.print(" ");
					}
					for(int star=1;star<=i*2-1;star++) {
						System.out.print("*");
					}
					for(int j=1;j<=SIZE-i;j++) {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			//������		   1,2,3,4
			//*���ִ�д���: 7,5,3,1
			//�ո�ִ�д�����   1,2,3,4
			//�����￪ʼʹ�õݹ���������°벿��
			star(1,SIZE,r,ROW,NUMBER);
			//��ջstar(1),star(2),star(3),star(4),star(5)
			//��ջstar(5),star(4),star(3),star(2),star(1)
		}	
		sc.close();
	}
	
	public static void star(int i,int SIZE,int r,int ROW,int NUMBER) {
		
		if(i==SIZE-1) {
			for(int n=1;n<=NUMBER;n++) {
				System.out.print(" ");
				for(int j=1;j<=i*2-1;j++) {
					System.out.print("*");
				}
				System.out.print(" ");
			}
		} else {
			star(i+1,SIZE,r,ROW,NUMBER);
			for(int n=1;n<=NUMBER;n++) {
				for(int j=SIZE-1;j>=i;j--) {
					System.out.print(" ");
				}
				for(int j=1;j<=i*2-1;j++) {
					System.out.print("*");
				}
				for(int j=SIZE-1;j>=i;j--) {
					System.out.print(" ");
				}
			}
			
		}
		
		System.out.println();
	}
	
	/*
	public static void forcircle(int i,int Max,String s) {
			for(;i<=Max;i++) {
				System.out.println(s);
			}			
	}
	*/
}

