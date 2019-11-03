package java0721;

public class Prime {
	
	public boolean isPrime(int total) {
		if(total%2==0 && total!=2) {
			return false;
		} else {
			//质数的一些定理：假如n是合数，必然存在非1的两个约数p1和p2，其中p1<=sqrt(n)，p2>=sqrt(n)。
			int sqrt = (int) Math.sqrt(total);
			for(int i=2;i<=sqrt;i++) {
				if(total%i==0) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int sum = 0;
		Prime p = new Prime();
		for(int total=2;total<100000;total++) {
			if(p.isPrime(total)) {
				sum += 1;
			}
		}
		System.out.println(sum);
		System.out.println("main thread starts");
		FactorialThread thread = new FactorialThread(10);
		thread.start();
		System.out.println("main thread ends");
	}
}

class FactorialThread extends Thread {
	private int num;
	
	public FactorialThread(int num) {
		this.num = num;
	}
	
	@Override
	public void run() {
		int i = num;
		int result = 1;
		System.out.println("new thread started");
		while(i>0) {
			result = result*i;
			i = i-1;
		}
		System.out.println("The factorial of " + num + " is " + result);
		System.out.println("new thread ends");
	}
}







