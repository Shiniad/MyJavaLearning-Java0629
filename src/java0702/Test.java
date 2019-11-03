package java0702;

import java0702.abstractproduct.AbstractFactory;
import java0702.abstractproduct.Boss;
import java0702.abstractproduct.Enemy;

/**
 * ## 设计模式的典型类型
 * 对象创建型
 * 结构型
 * 行为型
 * 
 * ## OOD的目标
 * 可扩展可维护
 * 
 * 工程化管理和维护文件要比敲代码复杂
 * 
 * SRP 单一职责原则 一个类可负责一个功能
 * OCP 开闭原则 对修改封闭，对扩展开放
 * LSP 里氏替换原则 子类型必须能实现父类的功能
 * DIP 依赖倒置原则 具体依赖抽象，低级组件依赖高级组件
 * ISP 接口隔离原则 不应该强迫客户依赖它们不用的方法
 * 迪米特法则  减少外部依赖
 * 
 * ## 抽象工厂模式	
 * **解耦：提供者和使用者**
 * 意图：当我们有**一组**相关对象需创建时，为了解决对象使用者和对象的解耦和
 * 
 * 游戏：关卡-不同的敌人，不同的装备，不同的背景，不同的boss
 * 几十kb
 * 
 * ## 适配器模式
 * 结构型模式
 * 比如日志框架slf4j
 * 
 * 通过适配器实现新结构并调用原接口的实现类实现新功能：1.继承（当原接口的实现类的成员属性为protected时必须使用继承）  2.组合（优先选择低耦合的组合）
 * 
 * ## 责任链模式
 * 行为型模式
 * 意图：责任链，对某个数据的处理构建一系列的环节，对于需要处理数据的人不需要关心处理的过程，还可以调节处理过和的步骤
 * 案例：记录日志
 * 案例：文字的处理，需要许多步骤，敏感词过滤
 * 
 * 解耦是要批量处理某种数据但是不关心具体处理环节
 * @author Administrator
 *
 */
public class Test {
	private AbstractFactory factory;
	private int level = 1;
	private Boss b1;
	private Enemy e1;
	
	public static void main(String[] args) {
		Test game = new Test();
		game.factory = AbstractFactory.getFactory(game.level);
		game.b1 = game.factory.getBoss();
		game.e1 = game.factory.getEnemy();
		System.out.println(game.b1);
		System.out.println(game.e1);
		// 游戏过程
		game.level++;
		game.factory = AbstractFactory.getFactory(game.level);
		Boss b2 = game.factory.getBoss();
		Enemy e2 = game.factory.getEnemy();
		System.out.println(b2);
		System.out.println(e2);

	}
}
