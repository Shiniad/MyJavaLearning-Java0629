package java0704;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		/**
		 * ��дequals����ʱ������дhashCode(),����ᵼ����������hash���Ƶļ��ϳ�������
		 * ���е�hash���϶�����hash�жϣ����hashҲ��ͬ��ʹ��equals���Ӷ����Ч��
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
		
		// set�Ƚ�Ԫ�ػ�����ͬ�ı�׼��ͨ��equals�����������ǵ�ַ(==)
		// HashSet�Ƚ�Ԫ���Ƿ���ͬ�ı�׼��hashCode()��equals��ͬ
		
		// ���ڶ�������Set���ϣ�����Ĭ����������Զ�����
		Set<Object> ts = new TreeSet<>();
		ts.add("SHA1");
		ts.add("MD5");
		ts.add("DES");
		ts.add("213");
		ts.add("BS64");
		System.out.println(ts);
		
		// LinkedHashSet��֤Ԫ�������ʱ��˳����
		Set<Object> link = new LinkedHashSet<>();
		link.add("SHA1");
		link.add("MD5");
		link.add("DES");
		link.add("213");
		link.add("BS64");
		System.out.println(link);
	}
}







