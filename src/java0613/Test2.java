package java0613;

public class Test2 {

	public static void main(String[] args) {
//		String num1 = "3.14";
//		double num2 = Double.parseDouble(num1);
//		Double num3 = Double.valueOf(num1);
//		Float num4 = new Float(2.146);
//		float f = 2;
//		System.out.println(f);
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.MIN_VALUE);
//		System.out.println(Long.MAX_VALUE);
//		System.out.println(Long.MIN_VALUE);
//		Long num5 = 15056913305L;
//		System.out.println(num5 + 3);
//		System.out.println(Character.isWhitespace(' '));
//		System.out.println(Character.isJavaIdentifierPart('*'));
		String s = "peach";

		System.out.println(s.substring(0,s.indexOf("a")));
		s.contains("s");
		System.out.println(s);
		System.out.println((int)26.7);


	}
}
/*
equals方法比较的是两个对象的值，若字符串值相同则返回true，而比较运算符(==)比较的是两个引用是否指向同一个对象(即同一个内存地址)，分两种情况
如果是通过new()来创建字符串，则在堆内存空间开辟一个空间，new一次开辟一次，因为new出来的不是同一个对象，值相同字符串比较返回的是false
如果是直接对字符串使用赋值创建引用(String s = "123")时，实际是在字符串常量池创建引用(将s的引用指向已经存的"123")，字符串常量池不属于堆也不属于栈，再创建字符串引用时，新的引用继续指向原来的已经存的"123"而不会再创建，值相同字符串比较返回的是true

*/


