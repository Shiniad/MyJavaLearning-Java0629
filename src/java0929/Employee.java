package java0929;

import java.io.Serializable;

//@Deprecated
@TestMyAnnotation(value = "value��ע��Ĭ��ֵ", id = 1)
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
			System.err.println("[setAge]�������䲻��С��16��");
		} else {
			System.out.println("setAge�������ã�" + age);
		}
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("setName�������ã�" + name);
		this.name = name;
	}
	
	public void setData(Integer age, String name) {
		this.age = age;
		this.name = name;
		System.out.println("���������ķ���������");
	}
	public String toString() {
		return "I am " + this.name + ", I'm " + age + " years old";
	}

	@Override
	public int compareTo(Employee arg0) {
		return 0;
	}
	
}
