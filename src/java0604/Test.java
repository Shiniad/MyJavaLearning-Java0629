package java0604;

public class Test {
	
	
	public Object $() {
		return 1;
	}

	public static void main(String[] args) {
//		char[] c = "dafaga".toCharArray();
//		for (int i = 0; i < c.length; i++) {
//			System.out.print(c[i]);
//		}
		int x = 2;
		int total = 0;
		switch(x) {
		case 4:
			total += 30;
		case 3:
			total += 31;
		case 2:
			total += 28;
		case 1:
			total += 31;
		}
		System.out.println(total);
	}
}
