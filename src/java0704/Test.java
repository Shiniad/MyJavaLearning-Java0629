package java0704;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ## 集合
 * 容量可以动态扩展的存放对象的**容器**
 * 
 * ## List的使用
 * ArrayList是最常用的实现List功能的类
 * LinkedList 插入删除元素效率更高
 * 
 * ## 哈希值 
 * 散列值：对象均匀分布的技术，在Java中所有对象的hashCode都是int，不同对象的hash可能相同，同一对象的hashCode()一定相同
 * 任何对象取出的hashCode的值一定是要随机平均分布到int的整个范围，Interger的hashCode就是它本身，String只要内容相同hashCode就相同
 * 可以类比指纹（对象的一部分特征）
 * 
 * 结论：如果两个对象的hashCode不同，可以确定他们不是同一个对象，反之不成立
 * 
 * ## Set集合
 * Set集合是一种线性集合
 * ### HashSet
 * 三种Set实现中最快的，但是不保证顺序
 * HashSet正是使用了hash的机制所以判断的效率才这么高（hashCode(int)比较的效率比equals高很多，所以效率提高
 * 
 * ### TreeSet
 * 自动排序，二叉树的实现（红黑树-平衡的排序树）
 * 效率最低
 * 
 * ### LinkedHashSet
 * 顺序按存储时的顺序为准
 * 效率居中
 * 
 * ## Map集合
 * Map使用键值对存储数据，一个名称一个对象
 * 地图<k,v> 注意key不能重复 如果key相同会覆盖元素
 * 例如，可以实现统计某一段文字中单词的个数：key作为单词
 * ### HashMap 不保证顺序
 * ### TreeMap 自动排序(key)
 * ### LinkedHashMap 按存储排序(key)
 * 
 * ### 一些其它的实现类
 * Vector：同步版本的ArrayList，性能有很大问题
 * HashTable：同步版本的HashMap，现在基本不需要用，建议使用ConcurrentHashMap(JDK1.8)
 * 
 * @author Administrator
 *
 */
public class Test {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(3);
		list.add(7);
		// 只允许使用迭代器删除集合中的元素
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
			if(o.toString().startsWith("5")) {
				it.remove();
			}
		}
		System.out.println(list);
		
		int index = list.lastIndexOf(3);
		System.out.println(index);
	}
}
