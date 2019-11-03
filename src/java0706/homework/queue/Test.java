package java0706.homework.queue;

import java.util.Date;

public class Test {
	public static void main(String[] args) {
		Queue<Integer> arrQ = new ArrayQueue<Integer>();
		
		long time1 = new Date().getTime();
		for (int i = 0; i < 200000; i++) {
			arrQ.push(i);
		}
		for (int i = 0; i < 200000; i++) {
			arrQ.pop();
		}
		long time2 = new Date().getTime();
		System.out.println("使用ArrayList实现队列操作200000个元素的时间为：" + (time2 - time1) + "毫秒");

		Queue<Integer> linkQ = new LinkedQueue<Integer>();
		
		long time3 = new Date().getTime();
		for (int i = 0; i < 200000; i++) {
			linkQ.push(i);
		}
		for (int i = 0; i < 200000; i++) {
			linkQ.pop();
		}
		long time4 = new Date().getTime();
		System.out.println("使用LinkedList实现队列操作200000个元素的时间为：" + (time4 - time3) + "毫秒");
		
	}
}
