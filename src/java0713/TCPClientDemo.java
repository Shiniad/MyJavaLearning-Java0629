package java0713;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClientDemo {
	public static void main(String[] args) {
		try(Socket socket = new Socket("127.0.0.1",6666);) {
			System.out.println("�ͻ������ӳɹ�");
			
			OutputStream os = socket.getOutputStream();// �ͻ��������������������˵�������
			os.write("hello server".getBytes());// ���ַ���תΪ�ֽ�����
			System.out.println("�ͻ��˷����������");
			
			InputStream is = socket.getInputStream();
			byte[] buffer = new byte[4096];
			int len = 0;
			len = is.read(buffer, 0, buffer.length);
			System.out.println(new String(buffer,0,len));
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
