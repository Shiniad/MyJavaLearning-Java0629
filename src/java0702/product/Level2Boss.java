package java0702.product;

import java0702.abstractproduct.Boss;
/**
 * 第二关Boss
 * @author Administrator
 *
 */
public class Level2Boss implements Boss{

	@Override
	public int getLife() {
		return 150;
	}

	@Override
	public int getPower() {
		return 30;
	}

	@Override
	public double getMissPossible() {
		return 0.2;
	}
	
	@Override
	public String toString() {
		return "敌人生命值：" + getLife() + "，敌人功击力：" + getPower() +"，敌人闪避能力：" + getMissPossible(); 
	}
}
