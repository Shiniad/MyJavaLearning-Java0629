package java0713.socketDemo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class MySocketClient {
	public static void main(String[] args) {
		try(Socket socket = new Socket("127.0.0.1",8866);) {
			
			System.out.println("连接成功");
			OutputStream os = socket.getOutputStream();
			os.write("hello socket".getBytes());
			System.out.println("发送请求");
			
			InputStream is = socket.getInputStream();
//			InputStreamReader reader = new InputStreamReader(is);
//			while(reader.ready()) {
//				System.out.print((char)reader.read());
//			}
			byte[] buffer = new byte[4096];
			int len = 0;
			len = is.read(buffer,0,buffer.length);
			System.out.println(new String(buffer,0,len));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
