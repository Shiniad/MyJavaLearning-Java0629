package java0613;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class �ҵ�������ʽ {

	public static void main(String[] args) {
		String phone = "15056973305";
		boolean matches = Pattern.matches("^1[0-9]\\d{9}$", phone);// matches���ж��Ƿ���ƥ��,��̬������б���ʾ
		System.out.println(matches);
		
		// ����ʹ��Pattern Matcher�������
		String str = "����������ס��12��,ÿ�궼Ҫ��һƿ82��Ŀ���";
		Pattern pattern1 = Pattern.compile("\\d+");
		Matcher matcher = pattern1.matcher(str);// ƥ��,marcher�ǻ��ƥ��Ľ��
		while(matcher.find()) {// һ��������
			System.out.println(matcher.group());// ���ҵĽ��
		}
	}

}
