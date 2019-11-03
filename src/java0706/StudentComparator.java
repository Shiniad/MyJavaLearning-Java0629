package java0706;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1!=null && o2!=null) {
			return o1.getStudentNo().compareTo(o2.getStudentNo());
		} else {
			if(o1==null) {
				return -1;
			} else {
				return 1;
			}
		}
		
	}

}
