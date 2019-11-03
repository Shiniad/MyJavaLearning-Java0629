package java0709;

import java.io.Serializable;

public class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7472230142004925335L;
	private String name;
	private String studentNo;
	private ClassInfo info = new ClassInfo();
	
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

	public ClassInfo getInfo() {
		return info;
	}

	public void setInfo(ClassInfo info) {
		this.info = info;
	}
	
	
}
