package java0709;

import java.io.Serializable;

public class ClassInfo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6035919816566118231L;
	private String info;
	
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	
}
