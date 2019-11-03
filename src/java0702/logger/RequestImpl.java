package java0702.logger;

public class RequestImpl implements Request {
	private String content;
	
	public RequestImpl() {
		
	}

	public RequestImpl(String content) {
		this.content = content;
	}

	@Override
	public String getRequest() {
		return this.content;
	}

	@Override
	public void setRequest(String content) {
		this.content = content;
	}

}
