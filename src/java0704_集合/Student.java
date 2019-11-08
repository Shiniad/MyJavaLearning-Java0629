package java0704_¼¯ºÏ;

public class Student {
	private String name;
	private String studentNo;
	
	
	public Student() {
		super();
	}
	public Student(String name, String studentNo) {
		super();
		this.name = name;
		this.studentNo = studentNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", studentNo=" + studentNo + "]";
	}
	

}
