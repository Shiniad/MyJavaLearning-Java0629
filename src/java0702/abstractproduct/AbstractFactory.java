package java0702.abstractproduct;

import java0702.factory.Level1Factory;
import java0702.factory.Level2Factory;

public interface AbstractFactory {
	
	/**
	 * 获取对应关卡的敌人
	 * @return 对应关卡的敌人
	 */
	public abstract Enemy getEnemy();
	
	/**
	 * 获取对应关卡的敌人
	 * @return 关卡的Boss信息
	 */
	public abstract Boss getBoss();
	
	//...其它关卡资源的获取
	
	public static AbstractFactory getFactory(int level) {// 静态方法不需要实现
		switch (level) {
		case 1:
			return new Level1Factory();
		case 2:
			return new Level2Factory();
		default:
			return null;
		}
	}
}
