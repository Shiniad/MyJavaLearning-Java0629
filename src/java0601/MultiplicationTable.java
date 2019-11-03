package java0601;

public class MultiplicationTable {
	//二重循环打印九九乘法表

	public static void main(String[] args) {
		for(
				int i=1;
				i<10;
				i++) {  //行数不变
			for(
					int j=1;
					j<=i;
					j++) {  //列数变化
//				System.out.format("%d*%d=%-2d ",i,j,i*j);
				System.out.print(i + "*" + j + "=" + i*j + "\t");
			}
			System.out.println();
		}
	}
}
