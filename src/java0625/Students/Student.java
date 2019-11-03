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
			System.err.println("[输入有误：年龄不得小于16岁]");
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
			System.err.println("年龄不得小于16岁");
		} else {
			this.age = age;
		}
		
	}
	
	public void showSelf() {
		System.out.println("大家好!我是" + this.name + "，今年" + this.age + "岁了！");
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
}
