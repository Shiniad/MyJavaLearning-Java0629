package myUtil;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;

public class Test implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8351156951351567214L;
	public String name;
	public Integer age;
	
	@Override
	public String toString() {
		return "Test [name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) throws UnsupportedEncodingException {
		Test t1 = new Test();
		t1.name = "lili";
		t1.age = 7;
		Test t2 = new Test();
		try {
			t2 = CloneUtils.clone(t1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(t2);
		
	}
}
