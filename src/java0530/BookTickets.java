package java0530;

import java.util.Scanner;

public class BookTickets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month,selection;
		double Ticket = 4000.0,discount = 1.0;
		//inputFlag���ڿ��ƣ�ÿִ��һ����ȷ�Ĳ���+1
		int inputFlag = -1;
		
		do {
			System.out.println("�����������е��·�:1~12");
			month = sc.nextInt();
			System.out.println("������ѡ��ͷ�Ȳջ��Ǿ��òգ�ͷ�Ȳ�����1�����ò�����2");
			selection = sc.nextInt();
			if(month<=10 && month>=4) {
				//����
				inputFlag += 1;
				if(selection==1) {
					discount=0.9; inputFlag += 1;
				} else if(selection==2) {
					discount=0.8; inputFlag += 1;
				}
			} else if(month<=12 && month>10 && month<4 && month>=1) {
				//����
				inputFlag += 1;
				if(selection==1) {
					discount=0.5; inputFlag += 1;
				} else if(selection==2) {
					discount=0.4; inputFlag += 1;
				}
			} else {
				
			}
			//��inputFlagΪ1ʱִ�������䲢����ѭ��
			if(inputFlag==1) {
				Ticket = Ticket*discount;
				System.out.println("���Ļ�Ʊ�۸�Ϊ��" + Ticket);
			} else {
				System.out.println("����������������");
				inputFlag = -1;
			}
		} while(inputFlag!=1);
		sc.close();
	}

}
