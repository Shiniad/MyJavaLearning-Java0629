package java0702.product;

import java0702.abstractproduct.Enemy;

/**
 * 第一关敌人
 * @author Administrator
 *
 */
public class Level1Enemy implements Enemy {

	@Override
	public int getLife() {
		return 5;
	}

	@Override
	public int getCount() {
		return 10;
	}

	@Override
	public int getPower() {
		return 2;
	}
	
	public String toString() {
		return "敌人生命值：" + getLife() + "，敌人数量：" + getCount() + "，敌人功击力：" + getPower();
	}

}
