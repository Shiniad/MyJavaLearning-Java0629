package java0716;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * HTTP服务器
 * @author Administrator
 *
 */
public class HttpServer {
	
	public static void main(String[] args) {
		startServer();
	}
	
	/**
	 * 启动服务器
	 */
	public static void startServer() {
		boolean shouldExists = false;// 是否继续连接数据库
		try(ServerSocket serverSocket = new ServerSocket(80);) {
			
			while(!shouldExists) {
				try(Socket socket = serverSocket.accept();
					InputStream is = socket.getInputStream();
					OutputStream os = socket.getOutputStream();) {
					// 解析客户需求
					// 从接收连接到发送包，中间极短的时间间隔，所以req极有为可能为null，导致浏览器认为本次连接失败了，正确的做法应该是用多线程处理
					Request req = HttpUtil.parseRequest(is);
					if(req!=null) {
						System.out.println("接收到请求，请求的文件为：" + req.getPath());
					} else {
						continue;
					} 
					Response resp = HttpUtil.processRequest(req);
					// 响应最终要返回的客户端
					HttpUtil.writeResponse(os, resp);
				} catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

	
}
