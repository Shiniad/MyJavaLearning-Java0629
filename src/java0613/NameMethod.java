package java0613;

import java.util.Scanner;

public class NameMethod {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String content = scn.nextLine();

		// �շ�������:����Ԥ����������,����ͬPascal������
		String[] str1 = content.split(" ");
		StringBuffer sb1 = new StringBuffer();
		for (int i = 0; i < str1.length; i++) {
			if (i != 0) {
				char[] c = str1[i].toCharArray();
				c[0] = (char) (c[0] - 32);
				str1[i] = new String(c);
			}
			sb1.append(str1[i]);
		}
		System.out.println("�շ�������������Ϊ:" + sb1);

		// Pascal������:��ת���ַ������ٶ�������ĸ��дת��������ַ�����תΪ�ַ���
		String[] str2 = content.split(" ");
		StringBuffer sb = new StringBuffer();
		for (String string : str2) {
			char[] c = string.toCharArray();
			c[0] = (char) (c[0] - 32);
			string = new String(c);
			sb.append(string);
		}
		System.out.println("Pascal������������Ϊ:" + sb);
		
		//����������
		content = content.toUpperCase().replace(" ", "_");
		System.out.println("����������������Ϊ:" + content);
		scn.close();

	}
}
