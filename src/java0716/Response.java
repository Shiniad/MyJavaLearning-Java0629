package java0716;

import java.io.InputStream;

/**
 * ����һ����Ӧ
 * @author Administrator
 *
 */
public class Response {
	/**
	 * ���߿ͻ�������Ľ��������״̬��
	 * @param cdoe | 200-һ������ | 304-������ַ���Ƿ���ȷ | 404-�ļ�δ�ҵ� | 500�������쳣
	 */
	private int code;
	
	/**
	 * ����Ҫ��ȡ��������������п���һ�����֣�Ҳ�п�����һ���ļ�
	 */
	private InputStream content;
	
	/**
	 * ��������ʱ������������ص�������ʲô����ҳ��ͼƬ����css
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
