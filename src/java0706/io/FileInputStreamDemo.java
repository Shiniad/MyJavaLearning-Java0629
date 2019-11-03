package java0706.io;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("e:\\2.txt");
		// 读取数据
		byte[] b = new byte[2];
		b[0] = (byte) fis.read();// 读取一个字节
		b[1] = (byte) fis.read();
		// 两个字节表示一个汉字
		System.out.println(new String(b));
		// 批量读取
//		byte[] buffer = new byte[10000];
//		int len = fis.read(buffer);// 尝试读取buffer长度个字节，返回实际读取到的字节数
//		System.out.println(len + "b");
//		System.out.println(new String(buffer, 0, len));
		// 完整读取文件数据
//		long totalLen = fis.available();// 数字不是固定的，要注意高并发
		byte[] buffer = new byte[4096];// 4k是扇区大小的默认值，有利于性能的提升
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
		System.out.println("\n一共读取到的字节数为：" + count);
		fis.close();
	}
}
