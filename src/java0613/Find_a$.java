package java0613;

import java.util.Scanner;

public class Find_a$ {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String content = scn.nextLine();
//		String content = "this is a apple";
		
		int find = 0, find2 = 0;
		int index = -1;

		// �ڶ��ַ�����ʹ���ַ����������
		char[] ch = content.toCharArray();
		for (char c : ch) {
			if (c == 'a') {
				find2++;
			}
		}

		// ��һ�ַ�����ʹ���ַ�����������������indexδƥ�䵽'a'ʱ����-1
		while (true) {
			index = content.indexOf('a');
			if (index == -1) {
				break;
			}
			content = content.substring(index + 1);
			find++;
		}

		System.out.println("a���ֵĴ���Ϊ:" + find);
		System.out.println("a���ֵĴ���Ϊ:" + find2);

		scn.close();
	}
}
