package java0706;

import java.text.Collator;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 自动装箱拆箱：装箱是对象创建，拆箱是方法调用
 * 当要使用原始数据类型且要注重效率时，必须使用数组
 * 
 * ## 队列 
 * PriorityQueue默认实现，优先队列
 * Deque<E> 双向队列
 * 
 * ### 集合框架
 * ### 集合框架的组成
 * 1.接口
 * 2.实现类
 * 3.算法
 * 
 * 排序接口：
 * Comparable接口实现
 * 也可以用比较器实现(体现ISP SRP原则)
 * 
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		Queue<Object> queue = new PriorityQueue<>();
		System.out.println(queue);
		
//		List<Integer> list = Arrays.asList(11,22,5,7,16,32);
//		List<String> list = Arrays.asList("23","120","6","45");

		List<String> list = Arrays.asList("安迪","白百合","晁衡","黛拉","二女");
		Collections.sort(list,Collator.getInstance(Locale.CHINA));
		System.out.println(list);
		// 使用shuffle()打乱顺序
		Collections.shuffle(list);
		System.out.println(list);
		
		String str1 = "s001";
		String str2 = "s002";
		System.out.println(Integer.parseInt(str1.substring(1)));
		System.out.println(str2.substring(1));
		
		Student s1 = new Student("s003","shiniad");
		Student s2 = new Student("s004","ada");
		Student s3 = new Student("s001","lisa");
		List<Student> mylist = Arrays.asList(s1,s2,s3);
		Collections.sort(mylist, new StudentComparator());
		System.out.println(mylist);
		
	}
}




