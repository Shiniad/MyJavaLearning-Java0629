package java0716;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * ʵ��HTTPЭ��Ļ�������
 * @author Administrator
 *
 */
public class HttpUtil {
	public static String rootPath = "e:/www";
	
	/**
	 * �������󣺻�ȡ�û���Ҫ����Դ��·��
	 * @param is	
	 * @return
	 */
	public static Request parseRequest(InputStream is) {
		if(is!=null) {
			int timeout = 1000;
			// �ȴ����ݵ���
			try {
				while(is.available() == 0 && timeout-- > 0) {
					Thread.sleep(1);
				}
			} catch (IOException | InterruptedException e1) {
				e1.printStackTrace();
			}
			try {
				// Ϊ�˷�ֹ���������Ƚ�is�����ݶ�ȡ���ڴ��б�����������ʵ��Ŀ��Ӧ��ʹ��Socket������
				ByteArrayOutputStream bos = new ByteArrayOutputStream();
				while(is.available() > 0) {
					bos.write(is.read());
				}
				ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
				
				InputStreamReader reader = new InputStreamReader(bis);// reader�Ĺرղ�Ӧ�ڷ������ڽ���
				BufferedReader bfr = new BufferedReader(reader);
			
				String line = bfr.readLine();
				if(line==null) {
					return null;
				}
				String[] word = line.split(" ");
				String path = word[1];
				if(path.indexOf("?")>0) {
					path = path.substring(0,path.indexOf("?"));// ȥ��?����
				}
				Request req = new Request(path);
				return req;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	/**
	 * �������󴴽���Ӧ����Ӧ����
	 * @return �ļ������򷵻��ļ������򷵻ش�����Ϣ
	 */
	public static Response processRequest(Request req) {
		if(req!=null) {
			// ��ȡ�����е��ļ�·��
			String path = req.getPath();
			// ����ļ��Ƿ����
			File file = new File(rootPath + path);
			if(file.exists()) {
				// ���ڣ������ļ������contentType���ļ�����
				String contentType = "text/html";
				if(path.endsWith(".html")) {
					contentType = "text/html";
				} else if(path.endsWith(".jpg") || path.endsWith(".jpeg")) {
					contentType = "image/jpeg";
				} else if(path.endsWith(".png")) {
					contentType = "image/png";
				} else if(path.endsWith(".gif")) {
					contentType = "image/gif";
				} else if(path.endsWith(".css")) {
					contentType = "text/css";
				} 
				try {
					FileInputStream fis= new FileInputStream(file);
					Response resp = new Response(200,fis,contentType);
					return resp;
				} catch (FileNotFoundException e) {
					e.printStackTrace();
					String message = path + "���ļ�δ�ҵ���������";
					ByteArrayInputStream is = new ByteArrayInputStream(message.getBytes());
					Response resp = new Response(304,is,contentType);
					return resp;
				}
			} else {
				// �����ڣ�����һ����ʾ�����Response
				String message = path + ", File Not Found!";
				// ʹ���ڴ�����Ϊ�м����
				ByteArrayInputStream is = new ByteArrayInputStream(message.getBytes());
				Response resp = new Response(404,is,null);
				return resp;
			}
		}
		return null;
	}
	
	/**
	 * ��HTTPЭ�����Ӧ���ĸ�ʽ�������
	 * @param os
	 * @param resp
	 */
	public static void writeResponse(OutputStream os, Response resp) {
		StringBuffer sb = new StringBuffer();
		
		// ��һ������Ӧͷ
		if(resp.getCode() == 200) {
			sb.append("HTTP/1.1 200 OK\r\n");
		} else {
			sb.append("HTTp/1.1 404 NOTFOUND!\r\n");
		}
		// �ڶ���ͨ��������
		Date current = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM ddHH:mm:ss 'GMT' yyyy",Locale.US);
		sb.append("Date: ");
		sb.append(sdf.format(current));
		sb.append("\r\n");
		// ������ ������
		sb.append("Server: Octupus1905\r\n");
		// ������ �������ͣ�������ݸ�ʽ
		sb.append("ContentType: ").append(resp.getContentType());
		sb.append("\r\n");
		// ������ д���ݳ���
		try {
			int len = resp.getContent().available();
			sb.append("Content-Length: ").append(String.valueOf(len));
			sb.append("\r\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
		// ׷��\r\n��ʾ����
		sb.append("\r\n");
		// д����������
		try {
			os.write(sb.toString().getBytes());
//			os.flush();// ��֤�������ϴ���ȥ flush̫��Ҳ�ᱨ��
		} catch (IOException e) {
			e.printStackTrace();
		}
		// д���ļ���������ݣ�������Ϣ��ByteArrayInputStream��ŵ�һ���ַ�����
		byte[] buffer = new byte[4096];
		try {
			int len = resp.getContent().read(buffer);
			do {
				if(len > 0) {
					os.write(buffer,0,len);
				} else {
					break;
				}
			} while(true);
			os.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
