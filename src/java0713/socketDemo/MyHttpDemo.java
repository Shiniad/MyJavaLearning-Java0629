package java0713.socketDemo;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class MyHttpDemo {
	public static void main(String[] args) throws IOException {
		// ����URL
		URL url = new URL("http://www.163.com");
		// ����URL����
		URLConnection conn = url.openConnection();
		// ����������
		InputStream is = conn.getInputStream();
		InputStreamReader reader = new InputStreamReader(is);
		char[] buffer = new char[4096];
		int len = 0;
		StringBuilder sb = new StringBuilder();
		do {
			len = reader.read(buffer,0,buffer.length);
			if(len > 0) {
				sb.append(buffer,0,len);
			} else {
				break;
			}
		} while(true);
		System.out.println(sb);
	}
}
