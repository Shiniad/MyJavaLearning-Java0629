package java0613;

import java.util.Scanner;

public class NameMethod {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String content = scn.nextLine();

		// 驼峰命名法:加入预设条件跳过,其他同Pascal命名法
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
		System.out.println("驼峰命名法的名称为:" + sb1);

		// Pascal命名法:先转成字符数组再对其首字母大写转化，最后将字符数组转为字符串
		String[] str2 = content.split(" ");
		StringBuffer sb = new StringBuffer();
		for (String string : str2) {
			char[] c = string.toCharArray();
			c[0] = (char) (c[0] - 32);
			string = new String(c);
			sb.append(string);
		}
		System.out.println("Pascal命名法的名称为:" + sb);
		
		//常量命名法
		content = content.toUpperCase().replace(" ", "_");
		System.out.println("常量命名法的名称为:" + content);
		scn.close();

	}
}
