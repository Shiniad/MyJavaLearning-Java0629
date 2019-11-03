package java0525;

import java.util.Scanner;

public class PrintTriangle {
	
	//����׳�n!,n����ڵ���0
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
	
	//���������Cr/n
	public long outC(long r, long n) {
		long divd = n - r;
		if(divd<0) {
			throw new RuntimeException("��������");
		}
		return factorial(n)/(factorial(r)*factorial(divd));
	}

	public static void main(String[] args) {
		PrintTriangle pt = new PrintTriangle();
		Scanner sc = new Scanner(System.in);
		long num = sc.nextInt();
		//������ǵĹ���1 C1/n C2/n ... Cr/n ... C(n-1)/n 1

		for(long j=0;j<num;j++) {
			//���num��ѭ������j:0>1>...>num-1��
			//����ո�num-j-1���ո�,һ������ռ5�����ӣ�����һ���ո񣬹��������м�Ϊ����������
			if(j!=num-1) {
				System.out.format("%-" + (num-j-1)*3 +"s","");
			}
			for(long i=0;i<=j;i++) {
				//���i�������Ci/j,��i:0>1...>j��
				System.out.format("%5d",pt.outC(i,j));
				System.out.print(" ");
			}
			//��jΪ��׼��һ��ѭ������
			System.out.println();
		}
		sc.close();
	}

}
