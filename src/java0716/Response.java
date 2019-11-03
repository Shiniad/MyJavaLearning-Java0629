package java0716;

import java.io.InputStream;

/**
 * 代表一个响应
 * @author Administrator
 *
 */
public class Response {
	/**
	 * 告诉客户端请求的结果，返回状态码
	 * @param cdoe | 200-一切正常 | 304-请检查网址输是否正确 | 404-文件未找到 | 500服务器异常
	 */
	private int code;
	
	/**
	 * 将来要获取的内容在哪里，即有可能一段文字，也有可能是一个文件
	 */
	private InputStream content;
	
	/**
	 * 返回内容时告诉浏览器返回的内容是什么，网页，图片或是css
	 */
	private String contentType;

	public Response() {
		super();
	}

	public Response(int code, InputStream content, String contentType) {
		super();
		this.code = code;
		this.content = content;
		this.contentType = contentType;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public InputStream getContent() {
		return content;
	}

	public void setContent(InputStream content) {
		this.content = content;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	
}
