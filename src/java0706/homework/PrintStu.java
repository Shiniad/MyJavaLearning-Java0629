package java0706.homework;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class PrintStu {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.print("�������" + (i+1) + "��ѧ����ѧ�ź�����(�ÿո��Enter����)��");
			String key = in.next();
			map.put(key, "0");
			String value = in.next();
			map.put(key, value);
		}
		Set<String> key = map.keySet();
		
		System.out.println("\t------- ѧ���� ---------");
		System.out.println("\tѧ��\t\t����");
		for (String myKey : key) {
			System.out.println("\t" + myKey + "\t\t" + map.get(myKey));
		}
		in.close();
	}
}
