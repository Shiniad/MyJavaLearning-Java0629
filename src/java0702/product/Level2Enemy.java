package java0702.product;

import java0702.abstractproduct.Enemy;

/**
 * 第二关敌人
 * @author Administrator
 *
 */
public class Level2Enemy implements Enemy {

	@Override
	public int getLife() {
		return 10;
	}

	@Override
	public int getCount() {
		return 15;
	}

	@Override
	public int getPower() {
		return 3;
	}
	
	public String toString() {
		return "敌人生命值：" + getLife() + "，敌人数量：" + getCount() + "，敌人功击力：" + getPower();
	}
}
