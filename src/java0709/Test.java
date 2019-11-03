package java0709;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ## ���л��Ͷ��󱣴漰��ȡ�����л����ݺ����ݵĽṹ ���л����ڴ��е����ݵ����̣���ͨ�õ�˵�������������� �ֲ�ʽ�������ݾ��õ������л�������������
 * ���л��������л�Ϊ����Ҳ�������л�Ϊjson��xml�ȸ�ʽ
 * 
 * ## �ڴ��� ByteArrayInputStream/ByteArrayOutputStream ���ڴ��д���һ����������ʹ������apiʵ�����ݵ�ת��
 * һ��char����ռ2���ֽ�
 * Reader/Writer��ʾ�ַ���
 * ��ʲô���뱣�棬����ʲô�����ȡ
 * 
 * ���У�windows�л�����\r\n linux�л�����\n unix��ʹ��\r
 * **FileReader/FileWriter**
 * **InputStreamReader/OutputStreamWriter**
 * **BufferedReader/BufferedWriter**
 * 
 * ����Ҫ��������Ļ�����������ʱӦ��ʹ�ö�������
 * ����Ҫ����ʵ�������һ�������ݣ�һ�ַ�ʽ������д���ı�Ȼ��д�뵽Ӳ���ȱ����ռ���ڴ��(�ַ���Ҫת�룬Ҫȷ�����뷽ʽ���洢�Ͷ�ȡЧ��ƫ��)
 * ����ʹ�ö�������ռ�ÿռ��٣���д��Ч��Ҳ�Ƚϸ�
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// # ByteArrayStream �ڴ�����ʹ��
		// ����һ����4k��С���ڴ���
		ByteArrayOutputStream baos = new ByteArrayOutputStream(4096);
		byte[] arr = new byte[] { 1, 2, 3, 4, 5 };
		baos.write(arr, 0, arr.length);
		// Ҳ����ֱ�ӽ����Խӵ��ļ�
//		baos.writeTo(new FileOutputStream("e:\\3.bin"));
//		byte[] buffer = baos.toByteArray();
//		System.out.println(Arrays.toString(buffer));
		
		// # String FileReader
		FileReader reader = new FileReader("e:\\2-1.txt");
		char c = (char)reader.read();
		String str = String.valueOf(c);
		String str1 = new String(str.getBytes("utf-8"),"gbk");// BOM
		System.out.println(str1);
		reader.close();
		
		// # InputStreamReader Input���Ҫ����������⣬������InputStreamReader��ȡ
		FileInputStream fis = new FileInputStream("e:\\2-1.txt");
		InputStreamReader reader1 = new InputStreamReader(fis,"gbk");
		char c2 = (char) reader1.read();
		System.out.println(c2);
		fis.close();
		reader1.close();
		
		// # BufferedReader ����reader�������ر𳤵��ı��ļ�Ҫʹ��BufferReader��ȡ��
		FileReader reader2 = new FileReader("e:\\2.txt");
		BufferedReader bfr = new BufferedReader(reader2);
		while(bfr.ready()) {
			String line = bfr.readLine();
			System.out.println(line);
		}
		bfr.close();
		reader2.close();
		
		// ��ȡһ���������ļ������
		FileInputStream fis1 = new FileInputStream("e:\\1.log");
		InputStreamReader reader3 = new InputStreamReader(fis1);
		StringBuffer sb = new StringBuffer();
		char[] buffer = new char[1000];
		int len = 0;
		do {
			len = reader3.read(buffer, 0, buffer.length);
			if(len > 0) {
				sb.append(buffer,0,len);
			}
		} while(len > 0);
		System.out.println(sb);
		fis1.close();
		reader3.close();

		// ʹ��FileWriterд���ַ��ı�
		FileWriter writer = new FileWriter("e:2-1.txt");
		writer.write("����д������\r\n�ڶ���");
		writer.close();
		
		// ��ʾ��������BinaryStream ����д������������
		FileOutputStream fos = new FileOutputStream("e:\\4.bin");
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeDouble(3.1415926);
		dos.writeChar('a');
		dos.close();
		fos.close();
	}
}


