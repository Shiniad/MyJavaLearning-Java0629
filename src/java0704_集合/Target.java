package java0704_集合;

public class Target {
	private String value;
	
	public Target(String value) {
		super();
		this.value = value;
	}

	public Target() {
		super();
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	
	@Override
	public String toString() {
		return this.value;
	}

	/**
	 * 重写equals方法，在value值相同时判断两个对象相同的方法
	 */
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Target) {
			return ((Target) obj).value.equals(this.value);
		} else {
			return false;
		}
	}
	
	/**
	 * 必须重写hashCode方法
	 */
	@Override
	public int hashCode() {
		return this.value.hashCode();
	}
}
