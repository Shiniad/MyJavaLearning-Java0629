package java0713.socketDemo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MySocket {
	public static void main(String[] args) {
		try(ServerSocket socket = new ServerSocket(8866);) {
			
			System.out.println("�ȴ�����...");
			Socket socketAccept = socket.accept();
			InputStream is = socketAccept.getInputStream();
			
			byte[] buffer = new byte[4096];
			int len = 0;
			len = is.read(buffer,0,buffer.length);
			System.out.println(new String(buffer,0,len));
			System.out.println("�յ�����");
			OutputStream os = socketAccept.getOutputStream();
			os.write("��������Ҫ��".getBytes());

		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
