package java0625.Students;

public class Student {
	private String name;
	private int age;
	
	public Student() {
		this(null,0);
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		if(age < 16) {
			System.err.println("[�����������䲻��С��16��]");
		} else {
			this.age = age;
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age < 16) {
			System.err.println("���䲻��С��16��");
		} else {
			this.age = age;
		}
		
	}
	
	public void showSelf() {
		System.out.println("��Һ�!����" + this.name + "������" + this.age + "���ˣ�");
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
}
