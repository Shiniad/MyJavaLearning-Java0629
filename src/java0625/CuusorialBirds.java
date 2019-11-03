package java0625;

/**
 * protected：子类（通过子类的实例方法（非静态方法）访问，比如this.xxx），自己，同一个包中的其他类（通过new出来的对象访问）都可以访问
 * 默认不写（friendly）：只有同一个包中可以访问
 * 静态属性和静态代码块优先级最高（静态代码块与静态成员变量顺序按代码顺序来）
 
作用：
构造方法是类的一种特殊方法，用来初始化类的一个新的对象。
特点：
1、一个类如果没有显式的提供构造器，则系统默认提供一个无参构造器
2、如果类中显式的声明了构造器，则系统不再提供构造器
3、构造器可以重载(一个类中可以有多个构造器)
4、构造器对于一个对象来讲，只调用一次
语法：new 构造器名(参数列表);
5、构造器之间也可以互相调用

 
 * @author Administrator
 *
 */
public interface CuusorialBirds {
	public void show();
	public void eat();
	public void exercise();
}
