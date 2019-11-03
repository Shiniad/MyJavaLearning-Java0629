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
 * ## 序列化和对象保存及读取：序列化数据和数据的结构 序列化：内存中的数据到磁盘，更通用的说法：将对象变成流 分布式发送数据就用到了序列化，来传输数据
 * 序列化可以序列化为流，也可以序列化为json，xml等格式
 * 
 * ## 内存流 ByteArrayInputStream/ByteArrayOutputStream 在内存中创建一个流，方便使用流的api实现数据的转换
 * 一个char类型占2个字节
 * Reader/Writer表示字符流
 * 用什么编码保存，就用什么编码读取
 * 
 * 换行：windows中换行是\r\n linux中换行是\n unix中使用\r
 * **FileReader/FileWriter**
 * **InputStreamReader/OutputStreamWriter**
 * **BufferedReader/BufferedWriter**
 * 
 * 当需要保存大量的基础数据类型时应该使用二进制流
 * 假如要保存实验测量的一百万数据，一种方式把数据写成文本然后写入到硬盘里，缺点是占用内存大(字符串要转码，要确定编码方式，存储和读取效率偏低)
 * 但是使用二进制流占用空间少，读写的效率也比较高
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// # ByteArrayStream 内存流的使用
		// 创建一个有4k大小的内存流
		ByteArrayOutputStream baos = new ByteArrayOutputStream(4096);
		byte[] arr = new byte[] { 1, 2, 3, 4, 5 };
		baos.write(arr, 0, arr.length);
		// 也可以直接将流对接到文件
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
		
		// # InputStreamReader Input如果要解决乱码问题，可以用InputStreamReader读取
		FileInputStream fis = new FileInputStream("e:\\2-1.txt");
		InputStreamReader reader1 = new InputStreamReader(fis,"gbk");
		char c2 = (char) reader1.read();
		System.out.println(c2);
		fis.close();
		reader1.close();
		
		// # BufferedReader 缓存reader（对于特别长的文本文件要使用BufferReader读取）
		FileReader reader2 = new FileReader("e:\\2.txt");
		BufferedReader bfr = new BufferedReader(reader2);
		while(bfr.ready()) {
			String line = bfr.readLine();
			System.out.println(line);
		}
		bfr.close();
		reader2.close();
		
		// 读取一个完整的文件并输出
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

		// 使用FileWriter写入字符文本
		FileWriter writer = new FileWriter("e:2-1.txt");
		writer.write("测试写入内容\r\n第二行");
		writer.close();
		
		// 演示二进制流BinaryStream 可以写基础数据类型
		FileOutputStream fos = new FileOutputStream("e:\\4.bin");
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeDouble(3.1415926);
		dos.writeChar('a');
		dos.close();
		fos.close();
	}
}


