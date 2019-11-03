package java0702.product;

import java0702.abstractproduct.Boss;
/**
 * 第一关Boss
 * @author Administrator
 *
 */
public class Level1Boss implements Boss{

	@Override
	public int getLife() {
		return 100;
	}

	@Override
	public int getPower() {
		return 15;
	}

	@Override
	public double getMissPossible() {
		return 0.1;
	}
	
	@Override
	public String toString() {
		return "敌人生命值：" + getLife() + "，敌人功击力：" + getPower() +"，敌人闪避能力：" + getMissPossible(); 
	}

}
