package java0713.ioDemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * ��ʾ�����
 * @author Administrator
 *
 */
public class FileOutputStreamDemo {
	public static void main(String[] args) {
		
		// ���������Ŀ�ĵ�target
		try(OutputStream os = new FileOutputStream("e:\\3.txt");) {
			for (int i = 0; i < 255; i++) {
				os.write((char)i);
				os.write('\r');
				os.write('\n');
				// flush������ˢ�»�������ǿ��д��
				os.flush();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("FileOutputSteam writes file successfully!");
	}
}
