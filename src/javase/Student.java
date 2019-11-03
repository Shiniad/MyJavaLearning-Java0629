package javase;

public class Student {
	private long uid;
	private String uname;
	
	public Student() {
		
	}
	
	public Student(long uid,String uname) {
		this.uid = uid;
		this.uname = uname;
	}
	
	public long getUid() {
		return uid;
	}
	public void setUid(long uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	
	public int hashcode() {
		return 0;
	}
	
	public String toString() {
		return "[uid]=" + String.format("%03d", uid) + ", [uname]=" + uname;
	}
	
}
