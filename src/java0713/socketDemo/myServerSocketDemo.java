package java0713.socketDemo;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class myServerSocketDemo {
	public static void main(String[] args) {
		int port = 8848;
		try(ServerSocket socket = new ServerSocket(port);) {
			Socket socketAccept = socket.accept();
			InputStream is = socketAccept.getInputStream();
			System.out.println((char)is.read());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
