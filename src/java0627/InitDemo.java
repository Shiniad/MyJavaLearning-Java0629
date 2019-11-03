package java0627;

import java.rmi.registry.Registry;

/**
 * 静态成员在所有变量或方法中优先初始化，静态代码仅执行一次
 * 对象初始化的总顺序
 * 1.加载父类的结构
 * 2.初始化父类的静态成员
 * 3.初始化父类实例的属性
 * 4.调用父类的构造函数
 * 5.实例化子类的属性
 * 
 * 多态是对逻辑细节的封装，多态依赖于继承
 * 继承和静态是两个维度的东西	
 * 
 * ## 接口
 * 接口：某和**规范**，体现的是某种**能力**
 * 
 * 当父类声明为抽象方法时，子类必须全部实现父类的方法
 * 
 * 接口与抽象类的区别：
 * 接口只有方法的定没有方法的实现（jdk1.8之后可以有default默认实现方法体），而抽象类可以有定义也可以有定现
 * 一个类可以实现多个接口，但一个类只能继承一个抽象类
 * 接口强调特定功能的实现，抽象类强调所属关系
 * 接口成员变默认为public static final，必须赋初值，不能被修改，所有的方法都是public abstract；而抽象类的成员变量默认default，可在子类重新被定义，
 * 也可重新赋值（被abstract修饰后不能再被private,static,synchronized,native修饰）
 * 接口用于常用功能，便于维护和添加删除，抽象类倾向于充当公共类
 * @author Administrator
 *
 */
@SuppressWarnings("unused")
class Parent {
	private static InitDemo i = new InitDemo("父类的静态成员变量");
	private InitDemo i2 = new InitDemo("父类的成员变量");
	
	static {/* 静态代码块在加载类时一并执行 */
		InitDemo i3 = new InitDemo("父类静态代码块区的局部变量");// 局部变量只在scope内有效
	}
	
	{// 成员变量与代码块按代码顺序
		InitDemo i3 = new InitDemo("父类代码块区的局部变量");// 局部变量只在scope内有效
	}
	Parent() {
		int x = 5;
		System.out.println("父类构造");// 构造方法也是属于代码块
	}

	public InitDemo test() {
		InitDemo i3 = new InitDemo("父类方法的局部变量");// 局部变量只在scope内有效
		return i3;
	}
}
@SuppressWarnings("unused")
class Child extends Parent {
	private static InitDemo i = new InitDemo("子类的静态成员变量");
	private InitDemo i2 = new InitDemo("子类的成员变量");
	
	static {
		InitDemo i3 = new InitDemo("子类静态代码块区的局部变量");
	}
	
	{
		InitDemo i3 = new InitDemo("子类代码块区的局部变量");
	}
	
	Child() {
		System.out.println("子类构造");
		
	}
}
@SuppressWarnings("unused")
public class InitDemo {
	InitDemo(String s) {
		System.out.println(s);
	}
	public static void main(String[] args) {
		Parent parent = new Child();
	}
	
}





