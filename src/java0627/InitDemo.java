package java0627;

import java.rmi.registry.Registry;

/**
 * ��̬��Ա�����б����򷽷������ȳ�ʼ������̬�����ִ��һ��
 * �����ʼ������˳��
 * 1.���ظ���Ľṹ
 * 2.��ʼ������ľ�̬��Ա
 * 3.��ʼ������ʵ��������
 * 4.���ø���Ĺ��캯��
 * 5.ʵ�������������
 * 
 * ��̬�Ƕ��߼�ϸ�ڵķ�װ����̬�����ڼ̳�
 * �̳к;�̬������ά�ȵĶ���	
 * 
 * ## �ӿ�
 * �ӿڣ�ĳ��**�淶**�����ֵ���ĳ��**����**
 * 
 * ����������Ϊ���󷽷�ʱ���������ȫ��ʵ�ָ���ķ���
 * 
 * �ӿ�������������
 * �ӿ�ֻ�з����Ķ�û�з�����ʵ�֣�jdk1.8֮�������defaultĬ��ʵ�ַ����壩��������������ж���Ҳ�����ж���
 * һ�������ʵ�ֶ���ӿڣ���һ����ֻ�ܼ̳�һ��������
 * �ӿ�ǿ���ض����ܵ�ʵ�֣�������ǿ��������ϵ
 * �ӿڳ�Ա��Ĭ��Ϊpublic static final�����븳��ֵ�����ܱ��޸ģ����еķ�������public abstract����������ĳ�Ա����Ĭ��default�������������±����壬
 * Ҳ�����¸�ֵ����abstract���κ����ٱ�private,static,synchronized,native���Σ�
 * �ӿ����ڳ��ù��ܣ�����ά�������ɾ���������������ڳ䵱������
 * @author Administrator
 *
 */
@SuppressWarnings("unused")
class Parent {
	private static InitDemo i = new InitDemo("����ľ�̬��Ա����");
	private InitDemo i2 = new InitDemo("����ĳ�Ա����");
	
	static {/* ��̬������ڼ�����ʱһ��ִ�� */
		InitDemo i3 = new InitDemo("���ྲ̬��������ľֲ�����");// �ֲ�����ֻ��scope����Ч
	}
	
	{// ��Ա���������鰴����˳��
		InitDemo i3 = new InitDemo("�����������ľֲ�����");// �ֲ�����ֻ��scope����Ч
	}
	Parent() {
		int x = 5;
		System.out.println("���๹��");// ���췽��Ҳ�����ڴ����
	}

	public InitDemo test() {
		InitDemo i3 = new InitDemo("���෽���ľֲ�����");// �ֲ�����ֻ��scope����Ч
		return i3;
	}
}
@SuppressWarnings("unused")
class Child extends Parent {
	private static InitDemo i = new InitDemo("����ľ�̬��Ա����");
	private InitDemo i2 = new InitDemo("����ĳ�Ա����");
	
	static {
		InitDemo i3 = new InitDemo("���ྲ̬��������ľֲ�����");
	}
	
	{
		InitDemo i3 = new InitDemo("�����������ľֲ�����");
	}
	
	Child() {
		System.out.println("���๹��");
		
	}
}
@SuppressWarnings("unused")
public class InitDemo {
	InitDemo(String s) {
		System.out.println(s);
	}
	public static void main(String[] args) {
		Parent parent = new Child();
	}
	
}





