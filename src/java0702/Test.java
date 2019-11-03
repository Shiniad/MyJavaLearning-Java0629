package java0702;

import java0702.abstractproduct.AbstractFactory;
import java0702.abstractproduct.Boss;
import java0702.abstractproduct.Enemy;

/**
 * ## ���ģʽ�ĵ�������
 * ���󴴽���
 * �ṹ��
 * ��Ϊ��
 * 
 * ## OOD��Ŀ��
 * ����չ��ά��
 * 
 * ���̻������ά���ļ�Ҫ���ô��븴��
 * 
 * SRP ��һְ��ԭ�� һ����ɸ���һ������
 * OCP ����ԭ�� ���޸ķ�գ�����չ����
 * LSP �����滻ԭ�� �����ͱ�����ʵ�ָ���Ĺ���
 * DIP ��������ԭ�� �����������󣬵ͼ���������߼����
 * ISP �ӿڸ���ԭ�� ��Ӧ��ǿ�ȿͻ��������ǲ��õķ���
 * �����ط���  �����ⲿ����
 * 
 * ## ���󹤳�ģʽ	
 * **����ṩ�ߺ�ʹ����**
 * ��ͼ����������**һ��**��ض����贴��ʱ��Ϊ�˽������ʹ���ߺͶ���Ľ����
 * 
 * ��Ϸ���ؿ�-��ͬ�ĵ��ˣ���ͬ��װ������ͬ�ı�������ͬ��boss
 * ��ʮkb
 * 
 * ## ������ģʽ
 * �ṹ��ģʽ
 * ������־���slf4j
 * 
 * ͨ��������ʵ���½ṹ������ԭ�ӿڵ�ʵ����ʵ���¹��ܣ�1.�̳У���ԭ�ӿڵ�ʵ����ĳ�Ա����Ϊprotectedʱ����ʹ�ü̳У�  2.��ϣ�����ѡ�����ϵ���ϣ�
 * 
 * ## ������ģʽ
 * ��Ϊ��ģʽ
 * ��ͼ������������ĳ�����ݵĴ�����һϵ�еĻ��ڣ�������Ҫ�������ݵ��˲���Ҫ���Ĵ���Ĺ��̣������Ե��ڴ�����͵Ĳ���
 * ��������¼��־
 * ���������ֵĴ�����Ҫ��ಽ�裬���дʹ���
 * 
 * ������Ҫ��������ĳ�����ݵ��ǲ����ľ��崦����
 * @author Administrator
 *
 */
public class Test {
	private AbstractFactory factory;
	private int level = 1;
	private Boss b1;
	private Enemy e1;
	
	public static void main(String[] args) {
		Test game = new Test();
		game.factory = AbstractFactory.getFactory(game.level);
		game.b1 = game.factory.getBoss();
		game.e1 = game.factory.getEnemy();
		System.out.println(game.b1);
		System.out.println(game.e1);
		// ��Ϸ����
		game.level++;
		game.factory = AbstractFactory.getFactory(game.level);
		Boss b2 = game.factory.getBoss();
		Enemy e2 = game.factory.getEnemy();
		System.out.println(b2);
		System.out.println(e2);

	}
}
