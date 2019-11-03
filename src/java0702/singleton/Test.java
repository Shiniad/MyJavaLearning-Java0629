package java0702.singleton;
/**
public class Test {

}
//-------------------------------------------------------------------------------饿汉模式-------------------------------------------------------------------------------package com.octopus.java0821;

// 单例模式的恶汉实现 
public final class Singleton1 { 
	//最简单粗暴的实例化对象的方式，但是无法进行这个对象的详细配置 
	private static Singleton1 object = new Singleton1(); 
	private Singleton1() { } 
	static { 
		//对对象进一步进行操作，比如配置 
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
//------------------------------------------------------------------------------- 懒汉模式 ------------------------------------------------------------------------------- 
//package com.octopus.java0821; 
// 懒汉模式实现单例 
public final class Singleton2 { 
	private static Singleton2 object; 
	private Singleton2() { System.out.println("构建Singleton2"); }
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
