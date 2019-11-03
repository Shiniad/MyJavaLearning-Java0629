package java0706.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.List;

/**
 * ��Ҫ�ٶ���ϰ
 * 
 * ��ʾ��������л�
 * ## �������������
 * ObjectInputStream
 * ObjectOutputStream
 * 
 * @author Administrator
 *
 */
public class ObjectOutputStreamDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// д�����
		List<String> data = Arrays.asList("shiniad","bluej","SHA1");
		FileOutputStream fos = new FileOutputStream(new File("e:\\data.bin"));// �ļ�����������ڴ��е����ݴ洢�����̵������
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(data);
		oos.close();
		fos.close();
		
		// ��ȡ����
		FileInputStream fis = new FileInputStream(new File("e:\\data.bin"));// �ļ������������ļ�������ݶ�ȡ���ڴ���
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object readObject = ois.readObject();
		System.out.println(readObject);
		@SuppressWarnings("unchecked")
		List<String > list = (List<String>) readObject;
		System.out.println(list);
		ois.close();
		fis.close();
		
	}
}













