package java0929;

import java.io.Serializable;

//@Deprecated
@TestMyAnnotation(value = "value是注解默认值", id = 1)
public class Employee implements Serializable, Comparable<Employee> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6675452976000815657L;
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age<16) {
			System.err.println("[setAge]错误：年龄不能小于16！");
		} else {
			System.out.println("setAge方法调用：" + age);
		}
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("setName方法调用：" + name);
		this.name = name;
	}
	
	public void setData(Integer age, String name) {
		this.age = age;
		this.name = name;
		System.out.println("两个参数的方法被调用");
	}
	public String toString() {
		return "I am " + this.name + ", I'm " + age + " years old";
	}

	@Override
	public int compareTo(Employee arg0) {
		return 0;
	}
	
}
