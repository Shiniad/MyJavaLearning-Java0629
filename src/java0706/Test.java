package java0706;

import java.text.Collator;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * �Զ�װ����䣺װ���Ƕ��󴴽��������Ƿ�������
 * ��Ҫʹ��ԭʼ����������Ҫע��Ч��ʱ������ʹ������
 * 
 * ## ���� 
 * PriorityQueueĬ��ʵ�֣����ȶ���
 * Deque<E> ˫�����
 * 
 * ### ���Ͽ��
 * ### ���Ͽ�ܵ����
 * 1.�ӿ�
 * 2.ʵ����
 * 3.�㷨
 * 
 * ����ӿڣ�
 * Comparable�ӿ�ʵ��
 * Ҳ�����ñȽ���ʵ��(����ISP SRPԭ��)
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

		List<String> list = Arrays.asList("����","�װٺ�","�˺�","����","��Ů");
		Collections.sort(list,Collator.getInstance(Locale.CHINA));
		System.out.println(list);
		// ʹ��shuffle()����˳��
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




