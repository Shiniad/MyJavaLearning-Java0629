package java0706.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ʹ��input/outputStreamʵ���ļ�����
 * @author Administrator
 *
 */
public class FileOutputStreamDemo {
	/**
	 * �ļ�����
	 * @param from ��Դ�ļ�
	 * @param to Ŀ���ļ�
	 * @throws IOException 
	 */
	public static void copyFile(String from, String to) throws IOException {
		FileInputStream fis = new FileInputStream(from);
		FileOutputStream fos = new FileOutputStream(to);
//		long totalLen = fis.available();// ��ʾ��ǰʣ��ɶ��ֽ�
		byte[] buffer = new byte[4096];
		do {
			int len = fis.read(buffer);
			// Ҫ������д�������ļ���Ҫ�����Ƿ��ͳ�ȥ��Ҫ������ת��Ϊ��������
			if(len > 0) {
				fos.write(buffer, 0, len);
			} else {
				break;
			}
		} while(true);
		fis.close();
		fos.close();
	}
	
	public static void main(String[] args) throws IOException {
		
	}
}






