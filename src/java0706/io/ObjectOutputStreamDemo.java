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
 * 需要再多练习
 * 
 * 演示对象的序列化
 * ## 对象输入输出流
 * ObjectInputStream
 * ObjectOutputStream
 * 
 * @author Administrator
 *
 */
public class ObjectOutputStreamDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// 写入代码
		List<String> data = Arrays.asList("shiniad","bluej","SHA1");
		FileOutputStream fos = new FileOutputStream(new File("e:\\data.bin"));// 文件输出流，将内存中的内容存储到磁盘等外存上
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(data);
		oos.close();
		fos.close();
		
		// 读取代码
		FileInputStream fis = new FileInputStream(new File("e:\\data.bin"));// 文件输入流，将文件里的内容读取到内存里
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













