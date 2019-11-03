package java0716;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ## HTTP协议：超文本传输协议（Hyper-Text Transfer Protocol），网站访问的基本协议（www服务）
 * 		协议基于文本：我们的服务器端其实也是输出文本类似的方式
 * HTTP协议是使用TCP协议功能再包装出来的
 * HTTP协议是基于文本的协议
 * 
 * 工作模式
 * 		服务器端：提供内容
 * 		客户端：访问内容（浏览器）
 * 
 *		核心概念：
 *			请求：客户端发出请求-请求行|请求头|请求体
 *			响应：服务器端给出响应-状态行|响应头|实体内容
 *		Telnet是一个TCP客户端，理论上可以模拟任何协议
 *		- 请求
 *		请求行：方法(get/post)&nbspURL(/表示根目录)&nbsp版本CRLF(回车换行)\r\n
 *		首部行：首部字段名：&nbsp值CRLF...首部字段名：&nbsp值CRLF
 *		(后面还有主体内容，可以不用加上)
 *		- 响应格式
 *		状态行：版本 状态码 短语CRLF
 *		首部行：首部字段名：值CRLF ... 首部字段名： 值CRLFCRLF		
GET / HTTP/1.1
Host: localhost
 *
 * ## HTTP状态码
 * 200 正常 4xx无资源(例:403和401是权限不足所以没有相应的次资源) 3xx表示需要重新查找资源（可能文件地址改变了，302永久重新下，304临时重新下）
 * 5xx服务器异常（500服务器端处理发生了异常，要不就是502服务不可用 501）
 * 
 * tomcat nginx web服务器提供别人网络可以访问本机的功能，接收浏览器请求并返回指定资源
 * 
 * ## HTTP服务器编程
 * 功能需求1 监听并接收TCP连接
 * 2 解析请求报文 - 解析请求行，得到请求地址，其它信息的解析，地址的处理
 * 3 文件访问和流输出
 * 4 响应的实现 - 响应报文 版本 状态码 短语 Date Server Content-Length Content-Type
 * 
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		// 网络监听的实现
		// 开始监听
		// 获取Socket连接
		// 获取InputStream/OutputStream
		// 交给Http工具类处理
		Date d = new Date(0);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(d));
		
	}
}







