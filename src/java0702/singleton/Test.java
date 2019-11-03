package java0702.singleton;
/**
public class Test {

}
//-------------------------------------------------------------------------------����ģʽ-------------------------------------------------------------------------------package com.octopus.java0821;

// ����ģʽ�Ķ�ʵ�� 
public final class Singleton1 { 
	//��򵥴ֱ���ʵ��������ķ�ʽ�������޷���������������ϸ���� 
	private static Singleton1 object = new Singleton1(); 
	private Singleton1() { } 
	static { 
		//�Զ����һ�����в������������� 
	} 
	public static Singleton1 getObject() { return object; }
	public static void main(String[] args) { 
		Thread th1 = new Thread(new Runnable() { 
			@Override public void run() { 
				System.out.println(Singleton1.getObject()); 
				} 
			}); 
		th1.start();
		System.out.println(Singleton1.getObject()); 
		} 
	}
//------------------------------------------------------------------------------- ����ģʽ ------------------------------------------------------------------------------- 
//package com.octopus.java0821; 
// ����ģʽʵ�ֵ��� 
public final class Singleton2 { 
	private static Singleton2 object; 
	private Singleton2() { System.out.println("����Singleton2"); }
	public synchronized static Singleton2 getObject() { if (object == null) { object = new Singleton2(); } 
	return object; } 
	public static void main(String[] args) { 
		for (int i = 0; i < 10; i++) { 
			Thread th1 = new Thread(new Runnable() { 
				@Override public void run() { 
					System.out.println(Singleton2.getObject()); 
					} 
				}); 
			th1.start();
			} 
		} 
	} 
	}
}

*/
