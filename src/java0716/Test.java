package java0716;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ## HTTPЭ�飺���ı�����Э�飨Hyper-Text Transfer Protocol������վ���ʵĻ���Э�飨www����
 * 		Э������ı������ǵķ���������ʵҲ������ı����Ƶķ�ʽ
 * HTTPЭ����ʹ��TCPЭ�鹦���ٰ�װ������
 * HTTPЭ���ǻ����ı���Э��
 * 
 * ����ģʽ
 * 		�������ˣ��ṩ����
 * 		�ͻ��ˣ��������ݣ��������
 * 
 *		���ĸ��
 *			���󣺿ͻ��˷�������-������|����ͷ|������
 *			��Ӧ���������˸�����Ӧ-״̬��|��Ӧͷ|ʵ������
 *		Telnet��һ��TCP�ͻ��ˣ������Ͽ���ģ���κ�Э��
 *		- ����
 *		�����У�����(get/post)&nbspURL(/��ʾ��Ŀ¼)&nbsp�汾CRLF(�س�����)\r\n
 *		�ײ��У��ײ��ֶ�����&nbspֵCRLF...�ײ��ֶ�����&nbspֵCRLF
 *		(���滹���������ݣ����Բ��ü���)
 *		- ��Ӧ��ʽ
 *		״̬�У��汾 ״̬�� ����CRLF
 *		�ײ��У��ײ��ֶ�����ֵCRLF ... �ײ��ֶ����� ֵCRLFCRLF		
GET / HTTP/1.1
Host: localhost
 *
 * ## HTTP״̬��
 * 200 ���� 4xx����Դ(��:403��401��Ȩ�޲�������û����Ӧ�Ĵ���Դ) 3xx��ʾ��Ҫ���²�����Դ�������ļ���ַ�ı��ˣ�302���������£�304��ʱ�����£�
 * 5xx�������쳣��500�������˴��������쳣��Ҫ������502���񲻿��� 501��
 * 
 * tomcat nginx web�������ṩ����������Է��ʱ����Ĺ��ܣ�������������󲢷���ָ����Դ
 * 
 * ## HTTP���������
 * ��������1 ����������TCP����
 * 2 ���������� - ���������У��õ������ַ��������Ϣ�Ľ�������ַ�Ĵ���
 * 3 �ļ����ʺ������
 * 4 ��Ӧ��ʵ�� - ��Ӧ���� �汾 ״̬�� ���� Date Server Content-Length Content-Type
 * 
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		// ���������ʵ��
		// ��ʼ����
		// ��ȡSocket����
		// ��ȡInputStream/OutputStream
		// ����Http�����ദ��
		Date d = new Date(0);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(d));
		
	}
}







