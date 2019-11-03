package java0704;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ## ����
 * �������Զ�̬��չ�Ĵ�Ŷ����**����**
 * 
 * ## List��ʹ��
 * ArrayList����õ�ʵ��List���ܵ���
 * LinkedList ����ɾ��Ԫ��Ч�ʸ���
 * 
 * ## ��ϣֵ 
 * ɢ��ֵ��������ȷֲ��ļ�������Java�����ж����hashCode����int����ͬ�����hash������ͬ��ͬһ�����hashCode()һ����ͬ
 * �κζ���ȡ����hashCode��ֵһ����Ҫ���ƽ���ֲ���int��������Χ��Interger��hashCode����������StringֻҪ������ͬhashCode����ͬ
 * �������ָ�ƣ������һ����������
 * 
 * ���ۣ�������������hashCode��ͬ������ȷ�����ǲ���ͬһ�����󣬷�֮������
 * 
 * ## Set����
 * Set������һ�����Լ���
 * ### HashSet
 * ����Setʵ�������ģ����ǲ���֤˳��
 * HashSet����ʹ����hash�Ļ��������жϵ�Ч�ʲ���ô�ߣ�hashCode(int)�Ƚϵ�Ч�ʱ�equals�ߺܶ࣬����Ч�����
 * 
 * ### TreeSet
 * �Զ����򣬶�������ʵ�֣������-ƽ�����������
 * Ч�����
 * 
 * ### LinkedHashSet
 * ˳�򰴴洢ʱ��˳��Ϊ׼
 * Ч�ʾ���
 * 
 * ## Map����
 * Mapʹ�ü�ֵ�Դ洢���ݣ�һ������һ������
 * ��ͼ<k,v> ע��key�����ظ� ���key��ͬ�Ḳ��Ԫ��
 * ���磬����ʵ��ͳ��ĳһ�������е��ʵĸ�����key��Ϊ����
 * ### HashMap ����֤˳��
 * ### TreeMap �Զ�����(key)
 * ### LinkedHashMap ���洢����(key)
 * 
 * ### һЩ������ʵ����
 * Vector��ͬ���汾��ArrayList�������кܴ�����
 * HashTable��ͬ���汾��HashMap�����ڻ�������Ҫ�ã�����ʹ��ConcurrentHashMap(JDK1.8)
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
		// ֻ����ʹ�õ�����ɾ�������е�Ԫ��
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
