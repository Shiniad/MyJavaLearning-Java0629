package java0613;

import java.util.Scanner;

public class Find_a$ {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String content = scn.nextLine();
//		String content = "this is a apple";
		
		int find = 0, find2 = 0;
		int index = -1;

		// 第二种方法，使用字符串数组遍历
		char[] ch = content.toCharArray();
		for (char c : ch) {
			if (c == 'a') {
				find2++;
			}
		}

		// 第一种方法，使用字符串的索引方法，当index未匹配到'a'时返回-1
		while (true) {
			index = content.indexOf('a');
			if (index == -1) {
				break;
			}
			content = content.substring(index + 1);
			find++;
		}

		System.out.println("a出现的次数为:" + find);
		System.out.println("a出现的次数为:" + find2);

		scn.close();
	}
}
