package java0601;

public class Test2 {
	
	public static void dvide(int num) {
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
		System.out.println();
	}
	
	public static void main(String[] args) {
		int a = 66;
		dvide(a);
		System.out.println((int)Math.sqrt(a));
		System.out.println(4%5);
		System.out.println(3%5);
		System.out.println(3/5);
	}

}
