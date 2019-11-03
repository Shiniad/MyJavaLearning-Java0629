package java0702.responsibilitychain;

public class Response {
	private String content;
	
	public Response() {
		
	}

	public Response(String content) {
		this.content = content;
	}

	public String getResponse() {
		return this.content;
	}
	public void setResponse(String content) {
		this.content = content;
	}
}
