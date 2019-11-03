package java0706.io;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * windowsϵͳ��ʹ��\��Linuxϵͳ��ʹ��/
 * 
 * ## Java�е��ļ�����
 * 
 * ## ���ĸ���
 * �ܵ�
 * ��·���Ҳ����
 * FileInputStream���ļ������������ļ��ж�ȡ���ݵ��ڴ���
 * FileOutputStream���ļ������������̬��ջ���ڴ泣�����е�����д�����
 */
public class Test {
	public static void main(String[] args) {
		File file = new File("E:\\1.log");
		// �ж��Ƿ����
		System.out.println(file.exists());
		// ���ļ��з���true
		System.out.println(file.isDirectory());
		// ���ļ�����true
		System.out.println(file.isFile());
		// ��ȡ�ļ�����
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("����޸�ʱ�䣺" + sdf.format(new Date(file.lastModified())));
		System.out.println("��ǰ���̴�С��" + file.length() + "B");
		System.out.println("ʣ����̴�С��" + ((double)Math.round((double)file.getFreeSpace()/1000/1000)/1000) + "G");
		
		// �����ļ�
//		File file2 = new File("E:\\mydemo");
//		// �����ļ���
//		boolean result = file2.mkdir();
//		System.out.println("�����ļ��ɹ���" + result);
//		// ɾ���ļ���	Java�Ĳ����ļ������ǹ��ò���ϵͳ�ģ�����Linux���޷�ɾ�������ݵ��ļ��У���Ӧ�ģ���windows��Ҳ������
//		result = file2.delete();
//		System.out.println("ɾ���ļ��ɹ���" + result);
		
		// ���������ļ���
		File file3 = new File("e:\\test1\\test2\\test3");
		boolean result = file3.mkdir();
		System.out.println("�����ļ��еĽ����" + result);
		// ������
		System.out.println("�����������" + file.renameTo(new File("e:\\1.log")));
		
	}
}






