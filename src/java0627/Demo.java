package java0627;

import java0627.desk.LegImpl;
import java0627.desk.Legs;
/**
 * �ӿ���ʵ����Ŀ�е����ã�ϵͳ֮��ĸ��룬�����õķ����ͷ�����õķ���֮�䲻��Ҫ֪���Է���ϸ��
 * �ࣺ����ʵ������
 * �ӿڣ������淶����������
 * ����������Ժͷ���
 * �ӿ�ֻ�з����Ķ��弰����
 * 
 * ## ����ӿڱ��
 * ���ʱ���ǽӿ�
 * ʵ��ʱһ���ֿ���ʵ��
 * ��װʱ�����ö�̬��˼��ʵ�֣�ֻʹ�ýӿ���װ�����Ǿ���ϸ�ڣ�ֻҪ�ӿڵĹ淶��ɣ�����������ʵ��������д��������̫������
 * @author Administrator
 *
 */
public class Demo {
	private Legs[] leg  = new LegImpl[4];
	
	public void add(Legs[] leg) {
		if(leg!=null) {
			boolean stand = true;
			
			if(leg.length != leg.length) {
				stand = false;
			}

			if(stand && leg.length == this.leg.length) {
				System.out.println("������װ����");
			} else {
				System.out.println("��װʧ��");
			}
		}
	}
	
	public static void main(String[] args) {
//		DeskTop dt = new DeskTop();
//		Legs[] leg = new LegImpl[4];
//		dt.add(leg);
	}

}
