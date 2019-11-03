package java0706;

public class Student implements Comparable<Student>{
	private String studentNo;
	private String name;
	
	public Student() {
		super();
	}

	public Student(String studentNo, String name) {
		super();
		this.studentNo = studentNo;
		this.name = name;
	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 通过实现Comparable接口来比较对象之间的大小关系，比目标对象大返回正数，比目标对象小返回负数，否则返回0
	 */
	@Override
	public int compareTo(Student o) {// T->Student 重写必须要求同名同参同返回值
//		if(o!=null) {
//			if( Integer.parseInt(this.getStudentNo().substring(1)) > Integer.parseInt(o.getStudentNo().substring(1)) ) {
//				return 1;
//			} else if( Integer.parseInt(this.getStudentNo().substring(1)) < Integer.parseInt(o.getStudentNo().substring(1)) ){
//				return -1;
//			} else {
//				return 0;
//			}
//		} else {
//			return 1;
//		}
		// 通字符串来比较对象之间大小(逐字符串比较)
		if(o!=null) {
			return this.getStudentNo().compareTo(o.getStudentNo());
		} else {
			return 1;
		}
		
	}

	@Override
	public String toString() {
		return "Student [studentNo=" + studentNo + ", name=" + name + "]";
	}
	
	
}
