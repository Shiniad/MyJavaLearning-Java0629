package java0716;

/**
 * ����һ������
 * @author Administrator
 *
 */
public class Request {
	
	/**
	 * �����·������Ӧ���ļ�
	 */
	private String path;
	

	public Request() {
		super();
	}

	public Request(String path) {
		super();
		this.path = path;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
}
