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
 * 实现HTTP协议的基本操作
 * @author Administrator
 *
 */
public class HttpUtil {
	public static String rootPath = "e:/www";
	
	/**
	 * 解析请求：获取用户想要的资源的路径
	 * @param is	
	 * @return
	 */
	public static Request parseRequest(InputStream is) {
		if(is!=null) {
			int timeout = 1000;
			// 等待数据到达
			try {
				while(is.available() == 0 && timeout-- > 0) {
					Thread.sleep(1);
				}
			} catch (IOException | InterruptedException e1) {
				e1.printStackTrace();
			}
			try {
				// 为了防止阻塞，可先将is的内容读取到内存中避免阻塞，真实项目中应该使用Socket网络框架
				ByteArrayOutputStream bos = new ByteArrayOutputStream();
				while(is.available() > 0) {
					bos.write(is.read());
				}
				ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
				
				InputStreamReader reader = new InputStreamReader(bis);// reader的关闭不应在方法体内进行
				BufferedReader bfr = new BufferedReader(reader);
			
				String line = bfr.readLine();
				if(line==null) {
					return null;
				}
				String[] word = line.split(" ");
				String path = word[1];
				if(path.indexOf("?")>0) {
					path = path.substring(0,path.indexOf("?"));// 去掉?参数
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
	 * 根据请求创建对应的响应内容
	 * @return 文件存在则返回文件，否则返回错误信息
	 */
	public static Response processRequest(Request req) {
		if(req!=null) {
			// 获取请求中的文件路径
			String path = req.getPath();
			// 检查文件是否存在
			File file = new File(rootPath + path);
			if(file.exists()) {
				// 存在，根据文件名获得contentType和文件内容
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
					String message = path + "，文件未找到，请重试";
					ByteArrayInputStream is = new ByteArrayInputStream(message.getBytes());
					Response resp = new Response(304,is,contentType);
					return resp;
				}
			} else {
				// 不存在，返回一个表示错误的Response
				String message = path + ", File Not Found!";
				// 使用内存流作为中间介质
				ByteArrayInputStream is = new ByteArrayInputStream(message.getBytes());
				Response resp = new Response(404,is,null);
				return resp;
			}
		}
		return null;
	}
	
	/**
	 * 按HTTP协议的响应报文格式输出内容
	 * @param os
	 * @param resp
	 */
	public static void writeResponse(OutputStream os, Response resp) {
		StringBuffer sb = new StringBuffer();
		
		// 第一行是响应头
		if(resp.getCode() == 200) {
			sb.append("HTTP/1.1 200 OK\r\n");
		} else {
			sb.append("HTTp/1.1 404 NOTFOUND!\r\n");
		}
		// 第二行通常是日期
		Date current = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM ddHH:mm:ss 'GMT' yyyy",Locale.US);
		sb.append("Date: ");
		sb.append(sdf.format(current));
		sb.append("\r\n");
		// 第三行 服务器
		sb.append("Server: Octupus1905\r\n");
		// 第四行 返回类型，输出内容格式
		sb.append("ContentType: ").append(resp.getContentType());
		sb.append("\r\n");
		// 第五行 写内容长度
		try {
			int len = resp.getContent().available();
			sb.append("Content-Length: ").append(String.valueOf(len));
			sb.append("\r\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 追加\r\n表示结束
		sb.append("\r\n");
		// 写入流中数据
		try {
			os.write(sb.toString().getBytes());
//			os.flush();// 保证数据马上传出去 flush太多也会报错
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 写入文件本身的数据（错误信息用ByteArrayInputStream存放的一个字符串）
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
