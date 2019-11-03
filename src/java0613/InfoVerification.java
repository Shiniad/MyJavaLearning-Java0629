package java0613;

import java.util.Scanner;

public class InfoVerification {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("���������֤:");// ^[1-9]\d{16}((x|X)|[0-9])$
		String identifyCard = scn.nextLine();
		System.out.print("������绰����:");// ^1[2-9]\d{9}$
		String phoneNumber = scn.nextLine();
		System.out.print("������QQ:");// ^\d{5,13}$
		String qq = scn.nextLine();
		
		boolean identifyCard_ver = true;
		char[] ch1 = identifyCard.toCharArray();
		if(ch1[0] == '0') { identifyCard_ver = false;}
		
		boolean phoneNumber_ver = true;
		char[] ch2 = phoneNumber.toCharArray();
		if(ch2[0] != '1' || ch2[1] == '1') {
			phoneNumber_ver = false;
		}
		
		char[] ch3 = qq.toCharArray();
		
		if(ch1.length == 18 && identifyCard_ver && ch2.length == 11 && phoneNumber_ver && ch3.length >= 5 && ch3.length <= 13) {
			System.out.println("���������Ϣ����Ҫ��");
		} else {
			if (ch1.length != 18 || identifyCard_ver) {
				System.out.println("���֤��Ϣ���Ϸ�");
			}
			if (ch2.length != 11 || phoneNumber_ver) {
				System.out.println("�ֻ��Ÿ�ʽ���Ϸ�");
			}
			if (ch3.length < 5 || ch3.length > 13) {
				System.out.println("QQ�Ÿ�ʽ���Ϸ�");
			}
		}
		scn.close();
		
	}
}
