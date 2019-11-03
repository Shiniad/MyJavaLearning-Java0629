package java0713.ioDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * ��ʾ�ֽ���
 * @author Administrator
 *
 */
public class FileInputStreamDemo {
	public static void main(String[] args) {
		File file = new File("e:\\2.txt");
		
		// �����ļ�Դ����������
		try(InputStream is = new FileInputStream(file);) {
			byte[] buffer = new byte[4096];
			int len = 0;
			StringBuilder sb = new StringBuilder();
//			// ����ʾ��������ʹ��available
//			int size = is.available();
//			for (int i = 0; i < size; i++) {
//				System.out.print((char)is.read());
//			}
			do {
				// InputStream�ֽ������з���read()
				// ��ȡbuffer����λ�ֽ����ݣ����ص������ɶ�ȡ��󳤶ȣ�������һ�ֽ����ݣ���β����-1����buffer���鸳ֵ
				len = is.read(buffer);
				if(len>0) {
					// Ϊ��ֹ��������ֽ�����ռ���δ��ֵ����ת���ַ���ʱ��ɿո�����Ҫ�������ĳ���Ϊ��Ч����len����lenΪ-1ʱ�ᱨ�쳣
					sb.append(new String(buffer,0,len));
				} else {
					break;
				}
			} while(true);
			
//			// ����ʾ�����룬����д����ᱨ��
//			do {
//				len = is.read(buffer);
//				sb.append(new String(buffer,0,len));
//			} while(len>0);
			
			System.out.println(sb);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
