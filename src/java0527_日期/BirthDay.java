package java0527_����;

import java.util.Scanner;

public class BirthDay {

	public static void main(String[] args) {
		int day = 0,month = 0;
		System.out.print("������������֣�����������·ݳ�4�ټ�9��Ȼ���25���ټ���������ڣ���");
		Scanner sc = new Scanner(System.in);
		int initialValue = sc.nextInt();
		for(month=1;month<=12;month++) {
			day = initialValue -(month*4 +9)*25;
			//System.out.println(day);
			if(day<=31 && day>=1) {
				if(day>=30 && month==2) {
					System.out.println("���޴���");
					break;
				}
				System.out.format("�������Ϊ%d��%2d��",month,day);
			}
		}
		sc.close();
	}

}
