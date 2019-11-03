package java0706.homework;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class PrintStu {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.print("请输入第" + (i+1) + "名学生的学号和姓名(用空格或Enter区分)：");
			String key = in.next();
			map.put(key, "0");
			String value = in.next();
			map.put(key, value);
		}
		Set<String> key = map.keySet();
		
		System.out.println("\t------- 学生表 ---------");
		System.out.println("\t学号\t\t姓名");
		for (String myKey : key) {
			System.out.println("\t" + myKey + "\t\t" + map.get(myKey));
		}
		in.close();
	}
}
