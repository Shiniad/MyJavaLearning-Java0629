package java0721;

import java.io.UnsupportedEncodingException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test2 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String input = "#\\u5173\\u95ed\\u7f13\\u5b58, \\u5373\\u65f6\\u5237\\u65b0\r\n" + 
				"#spring.freemarker.cache=false\r\n" + 
				"#spring.thymeleaf.cache=true\r\n" + 
				"\r\n" + 
				"#\\u70ed\\u90e8\\u7f72\\u751f\\u6548\r\n" + 
				"spring.devtools.restart.enabled=true\r\n" + 
				"#\\u8bbe\\u7f6e\\u91cd\\u542f\\u7684\\u76ee\\u5f55,\\u6dfb\\u52a0\\u90a3\\u4e2a\\u76ee\\u5f55\\u7684\\u6587\\u4ef6\\u9700\\u8981restart\r\n" + 
				"spring.devtools.restart.additional-paths=src/main/java\r\n" + 
				"# \\u4e3amybatis\\u8bbe\\u7f6e\\uff0c\\u751f\\u4ea7\\u73af\\u5883\\u53ef\\u5220\\u9664\r\n" + 
				"restart.include.mapper=/mapper-[\\\\w-\\\\.]+jar\r\n" + 
				"restart.include.pagehelper=/pagehelper-[\\\\w-\\\\.]+jar\r\n" + 
				"#\\u6392\\u9664\\u90a3\\u4e2a\\u76ee\\u5f55\\u7684\\u6587\\u4ef6\\u4e0d\\u9700\\u8981restart\r\n" + 
				"#spring.devtools.restart.exclude=static/**,public/**\r\n" + 
				"#classpath\\u76ee\\u5f55\\u4e0b\\u7684WEB-INF\\u6587\\u4ef6\\u5939\\u5185\\u5bb9\\u4fee\\u6539\\u4e0d\\u91cd\\u542f\r\n" + 
				"#spring.devtools.restart.exclude=WEB-INF/**\r\n" + 
				"\r\n" + 
				"############################################################\r\n" + 
				"#\r\n" + 
				"# REDIS \\u914d\\u7f6e\r\n" + 
				"#\r\n" + 
				"############################################################\r\n" + 
				"# Redis\\u6570\\u636e\\u5e93\\u7d22\\u5f15\\uff08\\u9ed8\\u8ba4\\u4e3a0\\uff09\r\n" + 
				"spring.redis.database=1\r\n" + 
				"# Redis\\u670d\\u52a1\\u5668\\u5730\\u5740\r\n" + 
				"spring.redis.host=192.168.1.191\r\n" + 
				"# Redis\\u670d\\u52a1\\u5668\\u8fde\\u63a5\\u7aef\\u53e3\r\n" + 
				"spring.redis.port=6379\r\n" + 
				"# Redis\\u670d\\u52a1\\u5668\\u8fde\\u63a5\\u5bc6\\u7801\\uff08\\u9ed8\\u8ba4\\u4e3a\\u7a7a\\uff09\r\n" + 
				"spring.redis.password=\r\n" + 
				"# \\u8fde\\u63a5\\u6c60\\u6700\\u5927\\u8fde\\u63a5\\u6570\\uff08\\u4f7f\\u7528\\u8d1f\\u503c\\u8868\\u793a\\u6ca1\\u6709\\u9650\\u5236\\uff09\r\n" + 
				"spring.redis.pool.max-active=1000\r\n" + 
				"# \\u8fde\\u63a5\\u6c60\\u6700\\u5927\\u963b\\u585e\\u7b49\\u5f85\\u65f6\\u95f4\\uff08\\u4f7f\\u7528\\u8d1f\\u503c\\u8868\\u793a\\u6ca1\\u6709\\u9650\\u5236\\uff09\r\n" + 
				"spring.redis.pool.max-wait=-1\r\n" + 
				"# \\u8fde\\u63a5\\u6c60\\u4e2d\\u7684\\u6700\\u5927\\u7a7a\\u95f2\\u8fde\\u63a5\r\n" + 
				"spring.redis.pool.max-idle=10\r\n" + 
				"# \\u8fde\\u63a5\\u6c60\\u4e2d\\u7684\\u6700\\u5c0f\\u7a7a\\u95f2\\u8fde\\u63a5\r\n" + 
				"spring.redis.pool.min-idle=2\r\n" + 
				"# \\u8fde\\u63a5\\u8d85\\u65f6\\u65f6\\u95f4\\uff08\\u6beb\\u79d2\\uff09\r\n" + 
				"spring.redis.timeout=0\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"############################################################\r\n" + 
				"#\r\n" + 
				"# \\u914d\\u7f6e\\u6570\\u636e\\u6e90\\u76f8\\u5173	\\u4f7f\\u7528\\u963f\\u91cc\\u5df4\\u5df4\\u7684 druid \\u6570\\u636e\\u6e90\r\n" + 
				"#\r\n" + 
				"############################################################\r\n" + 
				"spring.datasource.url=jdbc:mysql://localhost:3306/leecx\r\n" + 
				"spring.datasource.username=root\r\n" + 
				"spring.datasource.password=root\r\n" + 
				"spring.datasource.driver-class-name=com.mysql.jdbc.Driver\r\n" + 
				"spring.datasource.druid.initial-size=1\r\n" + 
				"spring.datasource.druid.min-idle=1\r\n" + 
				"spring.datasource.druid.max-active=20\r\n" + 
				"spring.datasource.druid.test-on-borrow=true\r\n" + 
				"spring.datasource.druid.stat-view-servlet.allow=true\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"############################################################\r\n" + 
				"#\r\n" + 
				"# mybatis \\u914d\\u7f6e\r\n" + 
				"#\r\n" + 
				"############################################################\r\n" + 
				"# mybatis \\u914d\\u7f6e\r\n" + 
				"mybatis.type-aliases-package=com.imooc.pojo\r\n" + 
				"mybatis.mapper-locations=classpath:mapper/*.xml\r\n" + 
				"# \\u901a\\u7528 Mapper \\u914d\\u7f6e\r\n" + 
				"mapper.mappers=com.imooc.utils.MyMapper\r\n" + 
				"mapper.not-empty=false\r\n" + 
				"mapper.identity=MYSQL\r\n" + 
				"# \\u5206\\u9875\\u63d2\\u4ef6\\u914d\\u7f6e\r\n" + 
				"pagehelper.helperDialect=mysql\r\n" + 
				"pagehelper.reasonable=true\r\n" + 
				"pagehelper.supportMethodsArguments=true\r\n" + 
				"pagehelper.params=count=countSql\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"############################################################\r\n" + 
				"#\r\n" + 
				"# \\u914d\\u7f6ei18n \\u8d44\\u6e90\\u6587\\u4ef6\\uff0c\\u4f9bthymeleaf \\u8bfb\\u53d6\r\n" + 
				"#\r\n" + 
				"############################################################\r\n" + 
				"spring.messages.basename=i18n/messages\r\n" + 
				"spring.messages.cache-seconds=3600\r\n" + 
				"spring.messages.encoding=UTF-8\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"#\\u8bbe\\u5b9a\\u9759\\u6001\\u6587\\u4ef6\\u8def\\u5f84\\uff0cjs,css\\u7b49\r\n" + 
				"spring.mvc.static-path-pattern=/static/**\r\n" + 
				"\r\n" + 
				"############################################################\r\n" + 
				"#\r\n" + 
				"# freemarker \\u9759\\u6001\\u8d44\\u6e90\\u914d\\u7f6e\r\n" + 
				"#\r\n" + 
				"############################################################\r\n" + 
				"#\\u8bbe\\u5b9aftl\\u6587\\u4ef6\\u8def\\u5f84\r\n" + 
				"spring.freemarker.template-loader-path=classpath:/templates\r\n" + 
				"# \\u5173\\u95ed\\u7f13\\u5b58, \\u5373\\u65f6\\u5237\\u65b0, \\u4e0a\\u7ebf\\u751f\\u4ea7\\u73af\\u5883\\u9700\\u8981\\u6539\\u4e3atrue\r\n" + 
				"spring.freemarker.cache=false\r\n" + 
				"spring.freemarker.charset=UTF-8\r\n" + 
				"spring.freemarker.check-template-location=true\r\n" + 
				"spring.freemarker.content-type=text/html\r\n" + 
				"spring.freemarker.expose-request-attributes=true\r\n" + 
				"spring.freemarker.expose-session-attributes=true\r\n" + 
				"spring.freemarker.request-context-attribute=request\r\n" + 
				"spring.freemarker.suffix=.ftl\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"############################################################\r\n" + 
				"#\r\n" + 
				"# thymeleaf \\u9759\\u6001\\u8d44\\u6e90\\u914d\\u7f6e\r\n" + 
				"#\r\n" + 
				"############################################################\r\n" + 
				"spring.thymeleaf.prefix=classpath:/templates/\r\n" + 
				"spring.thymeleaf.suffix=.html\r\n" + 
				"spring.thymeleaf.mode=HTML5\r\n" + 
				"spring.thymeleaf.encoding=UTF-8\r\n" + 
				"spring.thymeleaf.content-type=text/html\r\n" + 
				"# \\u5173\\u95ed\\u7f13\\u5b58, \\u5373\\u65f6\\u5237\\u65b0, \\u4e0a\\u7ebf\\u751f\\u4ea7\\u73af\\u5883\\u9700\\u8981\\u6539\\u4e3atrue\r\n" + 
				"spring.thymeleaf.cache=false\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"############################################################\r\n" + 
				"#\r\n" + 
				"# Server \\u670d\\u52a1\\u7aef\\u76f8\\u5173\\u914d\\u7f6e\r\n" + 
				"#\r\n" + 
				"############################################################\r\n" + 
				"# \\u914d\\u7f6eapi\\u7aef\\u53e3\\u53f7\r\n" + 
				"#server.port=8088\r\n" + 
				"# \\u914d\\u7f6econtext-path, \\u4e00\\u822c\\u6765\\u8bf4\\u8fd9\\u4e2a\\u914d\\u7f6e\\u5728\\u6b63\\u5f0f\\u53d1\\u5e03\\u7684\\u65f6\\u5019\\u4e0d\\u914d\\u7f6e\r\n" + 
				"#server.context-path=/IMooc\r\n" + 
				"# \\u9519\\u8bef\\u9875\\uff0c\\u6307\\u5b9a\\u53d1\\u751f\\u9519\\u8bef\\u65f6\\uff0c\\u8df3\\u8f6c\\u7684URL --> BasicErrorController\r\n" + 
				"#server.error.path=/error\r\n" + 
				"# session\\u6700\\u5927\\u8d85\\u65f6\\u65f6\\u95f4(\\u5206\\u949f)\\uff0c\\u9ed8\\u8ba4\\u4e3a30\\u5206\\u949f\r\n" + 
				"server.session-timeout=60\r\n" + 
				"# \\u8be5\\u670d\\u52a1\\u7ed1\\u5b9aIP\\u5730\\u5740\\uff0c\\u542f\\u52a8\\u670d\\u52a1\\u5668\\u65f6\\u5982\\u672c\\u673a\\u4e0d\\u662f\\u8be5IP\\u5730\\u5740\\u5219\\u629b\\u51fa\\u5f02\\u5e38\\u542f\\u52a8\\u5931\\u8d25, \r\n" + 
				"# \\u53ea\\u6709\\u7279\\u6b8a\\u9700\\u6c42\\u7684\\u60c5\\u51b5\\u4e0b\\u624d\\u914d\\u7f6e, \\u5177\\u4f53\\u6839\\u636e\\u5404\\u81ea\\u7684\\u4e1a\\u52a1\\u6765\\u8bbe\\u7f6e\r\n" + 
				"#server.address=192.168.1.2\r\n" + 
				"\r\n" + 
				"############################################################\r\n" + 
				"# Server - tomcat \\u76f8\\u5173\\u5e38\\u7528\\u914d\\u7f6e\r\n" + 
				"############################################################\r\n" + 
				"# tomcat\\u6700\\u5927\\u7ebf\\u7a0b\\u6570, \\u9ed8\\u8ba4\\u4e3a200\r\n" + 
				"#server.tomcat.max-threads=250\r\n" + 
				"# tomcat\\u7684URI\\u7f16\\u7801\r\n" + 
				"server.tomcat.uri-encoding=UTF-8\r\n" + 
				"# \\u5b58\\u653eTomcat\\u7684\\u65e5\\u5fd7\\u3001Dump\\u7b49\\u6587\\u4ef6\\u7684\\u4e34\\u65f6\\u6587\\u4ef6\\u5939\\uff0c\\u9ed8\\u8ba4\\u4e3a\\u7cfb\\u7edf\\u7684tmp\\u6587\\u4ef6\\u5939\r\n" + 
				"#\\uff08\\u5982\\uff1aC:\\Users\\Shanhy\\AppData\\Local\\Temp\\uff09\r\n" + 
				"#server.tomcat.basedir=H:/springboot-tomcat-tmp\r\n" + 
				"# \\u6253\\u5f00Tomcat\\u7684Access\\u65e5\\u5fd7\\uff0c\\u5e76\\u53ef\\u4ee5\\u8bbe\\u7f6e\\u65e5\\u5fd7\\u683c\\u5f0f\\u7684\\u65b9\\u6cd5\\uff1a\r\n" + 
				"#server.tomcat.access-log-enabled=true\r\n" + 
				"#server.tomcat.access-log-pattern=\r\n" + 
				"# accesslog\\u76ee\\u5f55\\uff0c\\u9ed8\\u8ba4\\u5728basedir/logs\r\n" + 
				"#server.tomcat.accesslog.directory=\r\n" + 
				"# \\u65e5\\u5fd7\\u6587\\u4ef6\\u76ee\\u5f55\r\n" + 
				"#logging.path=H:/springboot-tomcat-tmp\r\n" + 
				"# \\u65e5\\u5fd7\\u6587\\u4ef6\\u540d\\u79f0\\uff0c\\u9ed8\\u8ba4\\u4e3aspring.log\r\n" + 
				"#logging.file=myapp.log";
		
		String pattern = "\\\\u[0-9a-fA-F]{4}";
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(input);
		
		while(m.find()) {
			String target = m.toString().substring(m.toString().lastIndexOf("\\")+2, m.toString().lastIndexOf("]"));
			char c = (char)Integer.parseInt(target, 16);
			input = input.replaceFirst(pattern, String.valueOf(c));
		}
		System.out.println(input);
	}
}
