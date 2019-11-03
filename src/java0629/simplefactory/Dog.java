package java0629.simplefactory;

public class Dog extends Animal {// 可以使用instanceof运算符判断对象是否属于一个类，相当于is-a
	
	@Override
	public void showInfo() {
		System.out.println("I am dog");
	}
}
