package java0613;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 我的正则表达式 {

	public static void main(String[] args) {
		String phone = "15056973305";
		boolean matches = Pattern.matches("^1[0-9]\\d{9}$", phone);// matches是判断是否有匹配,静态方法用斜体表示
		System.out.println(matches);
		
		// 可以使用Pattern Matcher逐个查找
		String str = "我们在这里住了12年,每年都要喝一瓶82年的可乐";
		Pattern pattern1 = Pattern.compile("\\d+");
		Matcher matcher = pattern1.matcher(str);// 匹配,marcher是获得匹配的结果
		while(matcher.find()) {// 一个个查找
			System.out.println(matcher.group());// 查找的结果
		}
	}

}
