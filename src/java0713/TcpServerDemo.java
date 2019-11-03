package java0713;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


/**
 * 演示实现tcp协议监听和服务器端的基本编程
 * 服务器端
 * @author Administrator
 *
 */
public class TcpServerDemo {
	public static void main(String[] args) {
		int port = 6666;
		// 建立监听
		try {
			ServerSocket socket = new ServerSocket(port);
			// 开始监听 等待客户端的连接
			System.out.println("服务器端准备接收客户端的接入");
			Socket socketAccept = socket.accept();// 会一直阻塞直到客户端连接进来
			// socketAccept 等效于一个和接入客户端连接起来的管道的服务器端
			InputStream is = socketAccept.getInputStream();
			byte[] buffer = new byte[4096];
			int len = is.read(buffer, 0, buffer.length);

			System.out.println(new String(buffer,0,len));
			System.out.println("服务器端收到客户端的接入");
			// 收到消息后给一个应答
			OutputStream os = socketAccept.getOutputStream();
			os.write("server response".getBytes());
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
		}
	}
}
