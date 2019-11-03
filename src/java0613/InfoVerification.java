package java0613;

import java.util.Scanner;

public class InfoVerification {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("请输入身份证:");// ^[1-9]\d{16}((x|X)|[0-9])$
		String identifyCard = scn.nextLine();
		System.out.print("请输入电话号码:");// ^1[2-9]\d{9}$
		String phoneNumber = scn.nextLine();
		System.out.print("请输入QQ:");// ^\d{5,13}$
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
			System.out.println("您输入的信息满足要求");
		} else {
			if (ch1.length != 18 || identifyCard_ver) {
				System.out.println("身份证信息不合法");
			}
			if (ch2.length != 11 || phoneNumber_ver) {
				System.out.println("手机号格式不合法");
			}
			if (ch3.length < 5 || ch3.length > 13) {
				System.out.println("QQ号格式不合法");
			}
		}
		scn.close();
		
	}
}
