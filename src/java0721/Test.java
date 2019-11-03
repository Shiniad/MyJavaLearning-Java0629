package java0721;

public class Test {

	public boolean isPrime(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
		
	}
	public static void main(String[] args) {
		int sum = 0;
		for(int total=2;total<=100000;total++) {
			boolean isPrime = true;
			if(total%2==0 && total!=2) {
				isPrime = false;
			} else {
				int sqrt = (int) Math.sqrt(total);
					for(int i=2;i<=sqrt;i++) {
						if(total%i==0) {
							isPrime = false;
							break;
						}
					}
			}
			
			if(isPrime) {
				sum += 1;
			}
		}
		System.out.println(sum);
		
		
	}

}
