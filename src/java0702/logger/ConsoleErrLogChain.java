package java0702.logger;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ConsoleErrLogChain implements Chain {

	@Override
	public boolean doChain(Request req, Response resp) {
		if(req != null && resp != null) {
			String str = req.getRequest();
			if(str == null) {
				return false;
			}
			resp.setResponse(str);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
			String message = sdf.format(new Date()) + "£º" + resp.getResponse() + "\t\n";
			System.out.println(message);
			return true;
		}
		return false;
	}

}
