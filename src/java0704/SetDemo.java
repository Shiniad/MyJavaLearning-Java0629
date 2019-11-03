package java0704;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		/**
		 * 重写equals方法时必须重写hashCode(),否则会导致所有依赖hash机制的集合出现问题
		 * 所有的hash集合都依赖hash判断，如果hash也相同才使用equals，从而提高效率
		 */
		Target t1 = new Target("dg");
		Target t2 = new Target("dg");
		Target t3 = new Target("fg");
		HashSet<Object> set = new HashSet<>();
		set.add(t1);
		set.add(t2);
		set.add(t3);
		System.out.println(set);
		System.out.println(set.contains(t2));
		
		// set比较元素互相相同的标准是通过equals方法，而不是地址(==)
		// HashSet比较元素是否相同的标准是hashCode()且equals相同
		
		// 基于二叉树的Set集合，按照默认排序规则自动排序
		Set<Object> ts = new TreeSet<>();
		ts.add("SHA1");
		ts.add("MD5");
		ts.add("DES");
		ts.add("213");
		ts.add("BS64");
		System.out.println(ts);
		
		// LinkedHashSet保证元素以添加时的顺序存放
		Set<Object> link = new LinkedHashSet<>();
		link.add("SHA1");
		link.add("MD5");
		link.add("DES");
		link.add("213");
		link.add("BS64");
		System.out.println(link);
	}
}







