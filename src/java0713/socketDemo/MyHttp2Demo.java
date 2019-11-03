package java0713.socketDemo;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class MyHttp2Demo {
	public static void main(String[] args) {
		String address = "https://www.jjwxc.net/";
		InputStreamReader reader = null;
		try {
			URL url = new URL(address);
			URLConnection conn = url.openConnection();
			InputStream is = conn.getInputStream();
			reader = new InputStreamReader(is,"utf-8");
//			char[] c = new char[200000];
//			int length = reader.read(c,0,c.length);
//			System.out.println(new String(c,0,length));
			byte[] buffer = new byte[100000];
			int len = is.read(buffer,0,buffer.length);
			System.out.println(new String(buffer,0,len,"gbk"));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally { // 再出现非捕获异常时也可以执行，保障了程序的稳定性
			try {
				if(reader!=null) {
					reader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
