package java0629;
/**
 * ## 复杂系统的可靠性：扩展性 维护性
 * 任何一个类的设计：可靠，独立（高内聚 低耦合）
 * 复用代码也是好的，便于理解也是好的
 * ## 依赖 对象和对象之间的关系
 * 继承：强关联
 * 实现：弱关联
 * 
 * 依赖：一定要用到，测试类 | 关联：可能会用到，工具类
 * 依赖-组合
 * 依赖-使用
 * 
 * 聚合：机场和飞机之间，弱关联
 * 组合：车轮和车子，强关联
 * 
 * 解耦合：尽量降低耦合
 * 实现关系比继承关系耦合低
 * 
 * ## UML Uniform Modeling Language
 * 
 * ## 面向对象设计原则-设计模式规范
 * ### SRP 单一职责原则：
 * Single Responsibility Principle
 * 一个对象只应该有一种职能，一个类只应该有一个引起变化的原因
 * JavaBean即SRP，一个表对应一个数据Bean，一个数据操作Bean，多个业务Bean，控制器Bean
 * SRP基本不需要违反，能拆分则拆分
 * 
 * ### OCP 开闭原则：
 * 对扩展开放，对修改关闭
 * 实现OCP的关键：抽象
 * jdk1.8之后的接口默认方法是根据实际开发环境提供的语法糖，实际违反了OCP原则
 * 例如，有一个已经运行的系统用文件保存数据，现要修改为数据库保存
 * 正确的设计：抽象出数据保存的接口，先用文件的操作实现接口，然后使用数据库的操作实现该接口
 * 而也可以对各种能力进行抽象
 * 
 * ### LSP 里氏替换原则 Liskov Substitution Principle
 * 子类对象一定可以替代父类完成特定功能
 * 保障了在继承层次比较深的情况下代码依然稳定
 * Bird类，不应该设计fly()，应该设计一个flayable接口
 * 
 * ### DIP 依赖倒置原则 Dependency Inverse Principle
 * 
 * 高层模块不应依赖底层模块，两者都应该依赖抽象接口
 * 抽象不依赖实现细节，实现细节应依赖抽象
 * 树形结构是最理想的依赖关系
 * 
 * ## 设计模式
 * 
 * ### 单例模式
 * 饿汉模式：尽量早地初始化代码和对象，坏处是如果这个类可能是没有用到，则初始化的准备过程是浪费（实际这种情况不多，可以采用）
 * 懒汉模式：尽量晚创建这唯一的对象，坏处是必须考虑多线程的情况，好处是如果没人使用则无需创建对象
 * 
 * ### 简单工厂
 * 解决具体对象的产生
 * 解决方法：多态，重写，继承
 * 效果：用户不依赖对象的具体实现
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
//		TargetSingle target1 = Singleton2.getTarget();
//		TargetSingle target2 = Singleton2.getTarget();
//		System.out.println(target1 == target2);
		for (int i = 0; i < 10; i++) {
			new MyThread().start();// 判断@后面的哈希code一致即可认为是同一个对象
		}
	}
	
	public static class MyThread extends Thread {
		@Override
		public void run() {
			System.out.println("懒汉模式：" + Singleton2.getTarget());
		}
	}
}




















