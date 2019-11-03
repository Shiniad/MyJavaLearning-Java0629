package java0716;

/**
 * 代表一次请求
 * @author Administrator
 *
 */
public class Request {
	
	/**
	 * 请求的路径，对应的文件
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
