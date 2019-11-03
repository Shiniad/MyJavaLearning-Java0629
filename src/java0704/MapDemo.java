package java0704;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map���ϵ�ʹ��
 * @author Administrator
 *
 */
public class MapDemo {
	public static void main(String[] args) {
		Student stu1 = new Student("����","2019010103C001");
		Student stu2 = new Student("��˹","2019010103C002");
		Student stu3 = new Student("Ī��","2019010103C003");
		// <k,v> �������ͷֱ��Ӧ����ֵ
		Map<String,Student> stuMap = new HashMap<>();
		stuMap.put(stu1.getStudentNo(), stu1);
		stuMap.put(stu2.getStudentNo(), stu2);
		stuMap.put(stu3.getStudentNo(), stu3);
		System.out.println(stuMap);
		System.out.println(stuMap.get("2019010103C001"));
		
		Map<String,Object> map = new HashMap<>();
		map.put("2357", "dgde");
		map.put("1157", "SHA1");
		map.put("12", "MD5");
		// Map�Ƴ�����
//		map.remove("12");
		System.out.println(map);
		// ����
		// ����key
		Set<String> key = map.keySet();
		for (String string : key) {
			System.out.print(string + " ");
		}
		System.out.println(key);
		// ����value
		Collection<Object> value = map.values();
		for (Object object : value) {
			System.out.print(object + " ");
		}
		System.out.println("\nMap��ȡ���ķ�����" + map.get("12"));
		System.out.println("Map�ж��Ƿ���ĳ����ֵ�ķ�����" + map.containsKey("12"));
	}
}
