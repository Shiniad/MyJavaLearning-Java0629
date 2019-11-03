package java0702.logger;

public class ResponseImpl implements Response {
	private String content;

	@Override
	public String getResponse() {
		return this.content;
	}

	@Override
	public void setResponse(String content) {
		this.content = content;
	}

}
