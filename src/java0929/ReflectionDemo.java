package java0929;

import info.mysub_info.myr;

public class ReflectionDemo {
	public static void main(String[] args) throws ClassNotFoundException {
		// ͨ�����似������һ�����ģ��
		// ��ʽ1����֪����
		Class<Employee> empRe = Employee.class;
		// ��ʽ1�ı���
		Employee emp = new Employee();
		Class<? extends Employee> empRe1 = emp.getClass();
		// ��ʽ2����ȷ�������Ƿ����
		Class<?> empRe2 = Class.forName("java0929.Employee");// forName�������ȫ��
		
		myr r = new myr();
		Class<? extends myr> myR = r.getClass();
		System.out.println(myR);
		
		System.out.println(empRe==empRe1);
		System.out.println(empRe2==empRe1);
		
		// JVM��ȡclass�ļ�����������������ʱȷ����ÿ�����ǵ�����
		
	}
}
