package java0613;

import java.io.IOException;

public class BasicTools {

	public static void main(String[] args) throws IOException {
		//��ȡϵͳ��ǰʱ��
		long time = System.currentTimeMillis();
		System.out.println(time + "Lms");
//		String str = "";
//		for (int i = 0; i < 10000; i++) {
//			str += Math.random();
//		}
		
		//StringBuffer��StringBuilder��Stringִ��Ч�ʸ���
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < 10000; i++) {
			sb.append(Math.random());
		}
		long time2 = System.currentTimeMillis();
		System.out.println("��δ���ִ�е�ʱ��Ϊ:" + (time2-time));

		//�����ⲿ����
		Runtime.getRuntime().exec("notepad.exe");
		//��ȡ��ǰ�������е��ڴ����
		System.out.println("��ǰ������������ڴ�:" + Runtime.getRuntime().totalMemory() + "�ֽ�/B");
		System.out.println("��ǰ�����ʣ���ڴ�:" + Runtime.getRuntime().freeMemory() + "�ֽ�/B");
	}
}
