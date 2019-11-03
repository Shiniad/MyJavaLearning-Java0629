package java0702.abstractproduct;

import java0702.factory.Level1Factory;
import java0702.factory.Level2Factory;

public interface AbstractFactory {
	
	/**
	 * ��ȡ��Ӧ�ؿ��ĵ���
	 * @return ��Ӧ�ؿ��ĵ���
	 */
	public abstract Enemy getEnemy();
	
	/**
	 * ��ȡ��Ӧ�ؿ��ĵ���
	 * @return �ؿ���Boss��Ϣ
	 */
	public abstract Boss getBoss();
	
	//...�����ؿ���Դ�Ļ�ȡ
	
	public static AbstractFactory getFactory(int level) {// ��̬��������Ҫʵ��
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
