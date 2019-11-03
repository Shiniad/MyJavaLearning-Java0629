package java0525;

import java.util.Scanner;

public class PrintTriangle {
	
	//计算阶乘n!,n须大于等于0
	public long factorial(long n) {
		if(n>=1) {
			for(long i=n-1;i>=1;i--) {
				n = n*i;
			} 
		} else if(n==0) {
			n = 1;
		} 
		else {
			
		}
		return n;
	}
	
	//计算组合数Cr/n
	public long outC(long r, long n) {
		long divd = n - r;
		if(divd<0) {
			throw new RuntimeException("输入有误");
		}
		return factorial(n)/(factorial(r)*factorial(divd));
	}

	public static void main(String[] args) {
		PrintTriangle pt = new PrintTriangle();
		Scanner sc = new Scanner(System.in);
		long num = sc.nextInt();
		//杨辉三角的规律1 C1/n C2/n ... Cr/n ... C(n-1)/n 1

		for(long j=0;j<num;j++) {
			//输出num行循环，从j:0>1>...>num-1行
			//输出空格num-j-1个空格,一个数字占5个格子，加上一个空格，故两数字中间为第三个格子
			if(j!=num-1) {
				System.out.format("%-" + (num-j-1)*3 +"s","");
			}
			for(long i=0;i<=j;i++) {
				//输出i个组合数Ci/j,从i:0>1...>j列
				System.out.format("%5d",pt.outC(i,j));
				System.out.print(" ");
			}
			//以j为标准，一层循环结束
			System.out.println();
		}
		sc.close();
	}

}
