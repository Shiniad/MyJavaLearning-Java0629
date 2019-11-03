package java0525;

import java.util.Scanner;

public class Algorithm {

	public static void main(String[] args) {
		//行数：		    1,2,3,4,5,6
		//*语句执行次数：  1,3,5,7,9,11
		//空格执行次数：     5,4,3,2,1,0
		int ROW = 2;  //菱形总行数
		int NUMBER = 3;  //每行菱形数
		int SIZE=6;  //菱形大小
		Scanner sc = new Scanner(System.in);
		
		System.out.print("请输入菱形大小：");
		SIZE = sc.nextInt();
		System.out.print("请输入每行菱形数：");
		NUMBER = sc.nextInt();
		System.out.print("请输入总行数：");
		ROW = sc.nextInt();
		
		for(int r=1;r<=ROW;r++) {
			//从这里开始计数器循环,输出菱形上半部分
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
			//行数：		   1,2,3,4
			//*语句执行次数: 7,5,3,1
			//空格执行次数：   1,2,3,4
			//从这里开始使用递归输出菱形下半部分
			star(1,SIZE,r,ROW,NUMBER);
			//进栈star(1),star(2),star(3),star(4),star(5)
			//出栈star(5),star(4),star(3),star(2),star(1)
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

