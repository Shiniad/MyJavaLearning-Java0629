package java0702.product;

import java0702.abstractproduct.Enemy;

/**
 * ��һ�ص���
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
		return "��������ֵ��" + getLife() + "������������" + getCount() + "�����˹�������" + getPower();
	}

}
