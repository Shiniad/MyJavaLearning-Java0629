package java0601;

public class Exhaustion {
	//穷举法计算换算后人民币硬币枚数
	
	public static void main(String[] args) {
		for(int i=0;i<=50;i++) {
			for(int j=50-i;j<=50;j++) {
				int k = 50 - i - j;
				if( i + j*0.02 + k*0.05 == 1) {
					System.out.println("1分，2分，5分分别有" + i + "," + j + "," + k + "枚");
				}
			}
		}
	}

}
