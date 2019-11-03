package java0702.singleton;

/**
 * ����ģʽ
 * @author Administrator
 *
 */
public class SingletonTest2 {
	private static Singleton singleton;
	
	public synchronized static Singleton getSingleton() {
		if(singleton==null) {
			singleton = new Singleton();
		}
		return singleton;
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			new MyThread().start();
		}
	}
	
	public static class MyThread extends Thread{
		@Override
		public void run() {
			System.out.println("����ģʽ��" + SingletonTest2.getSingleton());
		}
	}
}
