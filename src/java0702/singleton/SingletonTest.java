package java0702.singleton;

/**
 * ����ģʽ
 * @author Administrator
 *
 */
public class SingletonTest {
	private static Singleton singleton;// ��̬����ֻ����һ��
	
	static {
		singleton = new Singleton();
		//...
	}
	
	public static Singleton getSingleton() {
		return singleton;
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Singleton s = SingletonTest.getSingleton();
		Singleton s2 = SingletonTest.getSingleton();
		Singleton s3 = SingletonTest.getSingleton();
	}
}
