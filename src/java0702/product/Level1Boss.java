package java0702.product;

import java0702.abstractproduct.Boss;
/**
 * ��һ��Boss
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
		return "��������ֵ��" + getLife() + "�����˹�������" + getPower() +"����������������" + getMissPossible(); 
	}

}
