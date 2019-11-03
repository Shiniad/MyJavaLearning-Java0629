package java0929;

import info.mysub_info.myr;

public class ReflectionDemo {
	public static void main(String[] args) throws ClassNotFoundException {
		// 通过反射技术加载一个类的模型
		// 方式1：已知类型
		Class<Employee> empRe = Employee.class;
		// 方式1的变种
		Employee emp = new Employee();
		Class<? extends Employee> empRe1 = emp.getClass();
		// 方式2：不确定该类是否存在
		Class<?> empRe2 = Class.forName("java0929.Employee");// forName里必须是全名
		
		myr r = new myr();
		Class<? extends myr> myR = r.getClass();
		System.out.println(myR);
		
		System.out.println(empRe==empRe1);
		System.out.println(empRe2==empRe1);
		
		// JVM读取class文件并解析所包含的类时确保了每个类是单例的
		
	}
}
