package java0702.product;

import java0702.abstractproduct.Enemy;

/**
 * �ڶ��ص���
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
		return "��������ֵ��" + getLife() + "������������" + getCount() + "�����˹�������" + getPower();
	}
}
