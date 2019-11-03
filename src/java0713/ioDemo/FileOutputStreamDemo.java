package java0713.ioDemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * 演示输出流
 * @author Administrator
 *
 */
public class FileOutputStreamDemo {
	public static void main(String[] args) {
		
		// 输出流连接目的地target
		try(OutputStream os = new FileOutputStream("e:\\3.txt");) {
			for (int i = 0; i < 255; i++) {
				os.write((char)i);
				os.write('\r');
				os.write('\n');
				// flush方法，刷新缓冲区，强制写入
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
