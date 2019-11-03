package java0713.ioDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * 演示字符流Reader/Writer
 * @author Administrator
 *
 */
public class InputStreamReaderDemo {
	public static void main(String[] args) {
		try(InputStream fis = new FileInputStream("e:\\2.txt");) {
			InputStreamReader reader = new InputStreamReader(fis,"gbk");
			StringBuilder sb = new StringBuilder();
			
			while(reader.ready()) {
				// 字符流一次read()读取一个字符即两个字节
				sb.append((char)reader.read());
			}
			System.out.println(sb);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
