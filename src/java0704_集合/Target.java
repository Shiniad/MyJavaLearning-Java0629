package java0704_����;

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
	 * ��дequals��������valueֵ��ͬʱ�ж�����������ͬ�ķ���
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
	 * ������дhashCode����
	 */
	@Override
	public int hashCode() {
		return this.value.hashCode();
	}
}
