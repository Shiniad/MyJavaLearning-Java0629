package java0706.io;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("e:\\2.txt");
		// ��ȡ����
		byte[] b = new byte[2];
		b[0] = (byte) fis.read();// ��ȡһ���ֽ�
		b[1] = (byte) fis.read();
		// �����ֽڱ�ʾһ������
		System.out.println(new String(b));
		// ������ȡ
//		byte[] buffer = new byte[10000];
//		int len = fis.read(buffer);// ���Զ�ȡbuffer���ȸ��ֽڣ�����ʵ�ʶ�ȡ�����ֽ���
//		System.out.println(len + "b");
//		System.out.println(new String(buffer, 0, len));
		// ������ȡ�ļ�����
//		long totalLen = fis.available();// ���ֲ��ǹ̶��ģ�Ҫע��߲���
		byte[] buffer = new byte[4096];// 4k��������С��Ĭ��ֵ�����������ܵ�����
		int count = 0;
		do {
			int len = fis.read(buffer);
			if(len > 0) {
				System.out.print(new String(buffer,0,len));
				count += len;
			} else {
				break;
			}
		} while(true);
		System.out.println("\nһ����ȡ�����ֽ���Ϊ��" + count);
		fis.close();
	}
}
