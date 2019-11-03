package java0702.responsibilitychain;

/**
 * Ãô¸Ğ´Ê¹ıÂË
 * @author Administrator
 *
 */
public class SensitiveKeyword implements Chain {

	@Override
	public boolean doChain(Request req, Response resp) {
		String content = req.getRequest();
		if(content==null || content.length()==0) {
			return false;// Á´ÖĞÖ¹
		}
		content = content.replace("·­Ç½", "**");
		resp.setResponse(content);
		return true;
	}
	
}
