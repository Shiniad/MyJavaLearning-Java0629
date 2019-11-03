package java0601;

public class Arithmetic {
	//使用穷举法，四层for循环求出数学表达式中A,B,C,D的值

	public static void main(String[] args) {	
		int A,B,C,D;
		for(A=1;A<10;A++) {
			for(B=0;B<10;B++) {
				for(C=0;C<10;C++) {
					for(D=1;D<10;D++) {
						if(A !=B && B !=C && C !=D && D != A) {
							if( (A*10000 + B*1000 + C*100 + A*10 +B) * A == (D*100000 + D*10000 + D*1000 + D*100 + D*10 + D) ) {
								System.out.println("A=" + A +", B=" + B + ", C=" + C + ", D=" + D);
							}
						}
					}
				}
			}
		}

	}
}







