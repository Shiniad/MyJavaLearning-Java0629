package java0613;

import java.io.IOException;

public class BasicTools {

	public static void main(String[] args) throws IOException {
		//获取系统当前时间
		long time = System.currentTimeMillis();
		System.out.println(time + "Lms");
//		String str = "";
//		for (int i = 0; i < 10000; i++) {
//			str += Math.random();
//		}
		
		//StringBuffer和StringBuilder比String执行效率更高
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < 10000; i++) {
			sb.append(Math.random());
		}
		long time2 = System.currentTimeMillis();
		System.out.println("这段代码执行的时间为:" + (time2-time));

		//启动外部程序
		Runtime.getRuntime().exec("notepad.exe");
		//获取当前程序运行的内存情况
		System.out.println("当前程序申请的总内存:" + Runtime.getRuntime().totalMemory() + "字节/B");
		System.out.println("当前程序的剩余内存:" + Runtime.getRuntime().freeMemory() + "字节/B");
	}
}
