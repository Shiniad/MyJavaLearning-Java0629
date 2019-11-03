package java0706.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用input/outputStream实现文件拷贝
 * @author Administrator
 *
 */
public class FileOutputStreamDemo {
	/**
	 * 文件复制
	 * @param from 来源文件
	 * @param to 目的文件
	 * @throws IOException 
	 */
	public static void copyFile(String from, String to) throws IOException {
		FileInputStream fis = new FileInputStream(from);
		FileOutputStream fos = new FileOutputStream(to);
//		long totalLen = fis.available();// 表示当前剩余可读字节
		byte[] buffer = new byte[4096];
		do {
			int len = fis.read(buffer);
			// 要不就是写入其他文件，要不就是发送出去，要不就是转化为其他内容
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






