package java0702.product;

import java0702.abstractproduct.Boss;
/**
 * �ڶ���Boss
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
		return "��������ֵ��" + getLife() + "�����˹�������" + getPower() +"����������������" + getMissPossible(); 
	}
}
