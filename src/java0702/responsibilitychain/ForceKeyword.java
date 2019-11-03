package java0702.responsibilitychain;

public class ForceKeyword implements Chain {

	@Override
	public boolean doChain(Request req, Response resp) {
		String content = req.getRequest();
		if(content==null || content.length()==0) {
			return false;
		}
		content = content.replace("ø≥À¿", "**");
		resp.setResponse(content);
		return true;
	}

}
