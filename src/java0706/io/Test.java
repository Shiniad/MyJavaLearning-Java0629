package java0706.io;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * windows系统下使用\，Linux系统下使用/
 * 
 * ## Java中的文件操作
 * 
 * ## 流的概念
 * 管道
 * 网路编程也是流
 * FileInputStream：文件输入流，从文件中读取数据到内存中
 * FileOutputStream：文件输出流，将静态区栈堆内存常量池中的数据写入磁盘
 */
public class Test {
	public static void main(String[] args) {
		File file = new File("E:\\1.log");
		// 判断是否存在
		System.out.println(file.exists());
		// 是文件夹返回true
		System.out.println(file.isDirectory());
		// 是文件返回true
		System.out.println(file.isFile());
		// 获取文件属性
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("最后修改时间：" + sdf.format(new Date(file.lastModified())));
		System.out.println("当前磁盘大小：" + file.length() + "B");
		System.out.println("剩余磁盘大小：" + ((double)Math.round((double)file.getFreeSpace()/1000/1000)/1000) + "G");
		
		// 操作文件
//		File file2 = new File("E:\\mydemo");
//		// 创建文件夹
//		boolean result = file2.mkdir();
//		System.out.println("创建文件成功：" + result);
//		// 删除文件夹	Java的操作文件功能是共用操作系统的，即在Linux下无法删除有内容的文件夹，相应的，在windows下也不可以
//		result = file2.delete();
//		System.out.println("删除文件成功：" + result);
		
		// 级联创建文件夹
		File file3 = new File("e:\\test1\\test2\\test3");
		boolean result = file3.mkdir();
		System.out.println("创建文件夹的结果：" + result);
		// 重命名
		System.out.println("重命名结果：" + file.renameTo(new File("e:\\1.log")));
		
	}
}






