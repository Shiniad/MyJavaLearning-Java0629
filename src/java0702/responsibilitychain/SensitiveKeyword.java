package java0702.responsibilitychain;

/**
 * ���дʹ���
 * @author Administrator
 *
 */
public class SensitiveKeyword implements Chain {

	@Override
	public boolean doChain(Request req, Response resp) {
		String content = req.getRequest();
		if(content==null || content.length()==0) {
			return false;// ����ֹ
		}
		content = content.replace("��ǽ", "**");
		resp.setResponse(content);
		return true;
	}
	
}
