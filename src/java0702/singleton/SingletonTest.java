package java0702.singleton;

/**
 * 饿汉模式
 * @author Administrator
 *
 */
public class SingletonTest {
	private static Singleton singleton;// 静态变量只生成一次
	
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
