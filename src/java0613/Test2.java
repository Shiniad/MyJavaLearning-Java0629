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
equals�����Ƚϵ������������ֵ�����ַ���ֵ��ͬ�򷵻�true�����Ƚ������(==)�Ƚϵ������������Ƿ�ָ��ͬһ������(��ͬһ���ڴ��ַ)�����������
�����ͨ��new()�������ַ��������ڶ��ڴ�ռ俪��һ���ռ䣬newһ�ο���һ�Σ���Ϊnew�����Ĳ���ͬһ������ֵ��ͬ�ַ����ȽϷ��ص���false
�����ֱ�Ӷ��ַ���ʹ�ø�ֵ��������(String s = "123")ʱ��ʵ�������ַ��������ش�������(��s������ָ���Ѿ����"123")���ַ��������ز����ڶ�Ҳ������ջ���ٴ����ַ�������ʱ���µ����ü���ָ��ԭ�����Ѿ����"123"�������ٴ�����ֵ��ͬ�ַ����ȽϷ��ص���true

*/


