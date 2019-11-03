package java0702.logger;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TextFileLogChain implements Chain {

	@Override
	public boolean doChain(Request req, Response resp) {
		if(req != null && resp != null) {
			String content = req.getRequest();
			if(content == null) {
				return false;
			}
			resp.setResponse(content);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
			String message = sdf.format(new Date()) + "£º" + resp.getResponse() + "\t\n";
			FileOutputStream fos = null;
			try {
				fos = new FileOutputStream("E:/1.log",true);
				fos.write(message.getBytes());
				fos.flush();
				fos.close();
				return true;
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
		return false;
	}

}
