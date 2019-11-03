package java0716;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.Socket;

public class SocketHttpRequestDemo {
	public static void main(String[] args) throws UnsupportedEncodingException, IOException {
		String request = "GET / HTTP/1.1\r\n";
		request += "Host: www.baidu.com\r\n\r\n";
		Socket socket = new Socket("www.baidu.com",80);
		System.out.println("Socket客户端连接成功");
		socket.getOutputStream().write(request.getBytes("UTF-8"));
		socket.getOutputStream().flush();
		InputStream is = socket.getInputStream();
//		byte[] buffer = new byte[100000];
//		int len = is.read(buffer,0,buffer.length);
//		System.out.println(new String(buffer,0,len,"utf-8"));
		
		byte[] buffer = new byte[4096];
		int len = 0;
		StringBuilder myReceive = new StringBuilder();
		do {
			len = is.read(buffer,0,buffer.length);
			if(len > 0) {
				myReceive.append(new String(buffer,0,len));
			} else {
				break;
			}
		} while(true);
		System.out.println("返回\n" + myReceive);
		socket.close();
	}
}
