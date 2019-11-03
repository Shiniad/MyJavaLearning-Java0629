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
 * Crawler4j Java的专业爬虫框架
 * OkHttp框架
 * 这里输入流随网络的关闭而关闭
 * @author Administrator
 *
 */
public class HttpDemo {
	public static void main(String[] args) {
		String address = "http://www.163.com/";
		// 第一步：创建URL
		try {
			URL url = new URL(address);
			// 第二步：连接
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			// 第三步：通过连接获取数据流
			InputStream is = conn.getInputStream();
			// 流的操作
			// 1.这是一个网页，则可以使用文本处理
			InputStreamReader reader = new InputStreamReader(is);
			StringBuilder sb = new StringBuilder();
			char[] buffer = new char[4096];
			int len = 0;
			do {
				len = reader.read(buffer);// 返回读取到的字符数组范围内的最大字符数量
				if(len > 0) {
					sb.append(buffer,0,len);
				} else {
					break;
				}
			} while(true);
			System.out.println(sb);
			// 使用正则表达式找图片
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
			// 2.这是一个其他文件比如图片，则可以使用二进制流处理
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			
		}
	
		
	}
}
