package java0713;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


/**
 * ��ʾʵ��tcpЭ������ͷ������˵Ļ������
 * ��������
 * @author Administrator
 *
 */
public class TcpServerDemo {
	public static void main(String[] args) {
		int port = 6666;
		// ��������
		try {
			ServerSocket socket = new ServerSocket(port);
			// ��ʼ���� �ȴ��ͻ��˵�����
			System.out.println("��������׼�����տͻ��˵Ľ���");
			Socket socketAccept = socket.accept();// ��һֱ����ֱ���ͻ������ӽ���
			// socketAccept ��Ч��һ���ͽ���ͻ������������Ĺܵ��ķ�������
			InputStream is = socketAccept.getInputStream();
			byte[] buffer = new byte[4096];
			int len = is.read(buffer, 0, buffer.length);

			System.out.println(new String(buffer,0,len));
			System.out.println("���������յ��ͻ��˵Ľ���");
			// �յ���Ϣ���һ��Ӧ��
			OutputStream os = socketAccept.getOutputStream();
			os.write("server response".getBytes());
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
		}
	}
}
