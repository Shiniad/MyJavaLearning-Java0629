package java0601Examination;

public class Test2 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i=1;i<=500;i++) {
			if(i%3==0) {
				sum++;
			}
		}
		System.out.print(sum);
	}

}
