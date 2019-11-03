package java0713;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Crawler4j Java��רҵ������
 * OkHttp���
 * ����������������Ĺرն��ر�
 * @author Administrator
 *
 */
public class HttpDemo {
	public static void main(String[] args) {
		String address = "http://www.163.com/";
		// ��һ��������URL
		try {
			URL url = new URL(address);
			// �ڶ���������
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			// ��������ͨ�����ӻ�ȡ������
			InputStream is = conn.getInputStream();
			// ���Ĳ���
			// 1.����һ����ҳ�������ʹ���ı�����
			InputStreamReader reader = new InputStreamReader(is);
			StringBuilder sb = new StringBuilder();
			char[] buffer = new char[4096];
			int len = 0;
			do {
				len = reader.read(buffer);// ���ض�ȡ�����ַ����鷶Χ�ڵ�����ַ�����
				if(len > 0) {
					sb.append(buffer,0,len);
				} else {
					break;
				}
			} while(true);
			System.out.println(sb);
			// ʹ��������ʽ��ͼƬ
			HashSet<String> imgsUrls = new HashSet<String>();
			Pattern patterImg = Pattern.compile("<img\\s+.*?src=[\"']+([/\\w].+?)[\"']+[\\s/]");
			Matcher matcher = patterImg.matcher(sb);
			while(matcher.find()) {
				String url1 = matcher.group(1);
				int index = url1.indexOf("?");
				if(index>0) {
					url1 = url1.substring(0, index);
				}
				imgsUrls.add(url1);
			}
			for (String imgSrc : imgsUrls) {
				System.out.println(imgSrc);
			}
			// 2.����һ�������ļ�����ͼƬ�������ʹ�ö�����������
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			
		}
	
		
	}
}
