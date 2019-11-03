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
	 * ͨ��ʵ��Comparable�ӿ����Ƚ϶���֮��Ĵ�С��ϵ����Ŀ�����󷵻���������Ŀ�����С���ظ��������򷵻�0
	 */
	@Override
	public int compareTo(Student o) {// T->Student ��д����Ҫ��ͬ��ͬ��ͬ����ֵ
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
		// ͨ�ַ������Ƚ϶���֮���С(���ַ����Ƚ�)
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
