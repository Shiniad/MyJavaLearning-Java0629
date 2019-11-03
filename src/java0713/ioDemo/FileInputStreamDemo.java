package java0713.ioDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * 演示字节流
 * @author Administrator
 *
 */
public class FileInputStreamDemo {
	public static void main(String[] args) {
		File file = new File("e:\\2.txt");
		
		// 连接文件源建立输入流
		try(InputStream is = new FileInputStream(file);) {
			byte[] buffer = new byte[4096];
			int len = 0;
			StringBuilder sb = new StringBuilder();
//			// 错误示范，慎重使用available
//			int size = is.available();
//			for (int i = 0; i < size; i++) {
//				System.out.print((char)is.read());
//			}
			do {
				// InputStream字节流公有方法read()
				// 读取buffer个单位字节数据，返回单个流可读取最大长度，返回下一字节数据，结尾返回-1，对buffer数组赋值
				len = is.read(buffer);
				if(len>0) {
					// 为防止多出来的字节数组空间因未赋值而在转成字符串时变成空格，所以要限制它的长度为有效长度len，当len为-1时会报异常
					sb.append(new String(buffer,0,len));
				} else {
					break;
				}
			} while(true);
			
//			// 错误示范代码，条件写里面会报错
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
