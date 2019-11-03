package java0604;

import java.util.Scanner;
/*
 * switch��������ͻ��ַ��ͣ�����ֵѡ��case��֧
 * case�����һ���Ƚ�ֵ��ð�ţ��ɱȽ�ֵ����switch-case�ṹѡ��������֧���ӱ���ֵ��case�Ƚ�ֵ��ͬ����俪ʼ����������ִ�У�ֱ������break���
 * break��ʾ������ǰswitch-case�ṹ����ѡ
 * default�����һ��ð�ţ��ڱ���ֵû�п���ƥ���case�Ƚ�ֵʱĬ��ִ�и����
 */
public class Calendar {
	//ʹ��Java����ʵ����������������ӡ

	public String week(int num) {
		switch (num) {
		case 0:
			return "������";
		case 1:
			return "����һ";
		case 2:
			return "���ڶ�";
		case 3:
			return "������";
		case 4:
			return "������";
		case 5:
			return "������";
		case 6:
			return "������";
		default:
			return null;
		}
	}

	public static void main(String[] args) {

		// ���뵱ǰ��ݺ��·�
		int inityear = 1900, year, month;// ��ʼ��ݺ�Ҫ����������
		int leapyearsum = 0, divideyear = 0;// ����������
		Scanner scn = new Scanner(System.in);
		System.out.print("���������:");
		year = scn.nextInt();
		System.out.print("�������·�:");
		month = scn.nextInt();
		
		//�������������1900���������
		divideyear = year - inityear;
		for (inityear = 1900; inityear < year + 1; inityear++) {
			if ((inityear % 4 == 0 && inityear % 100 != 0) || inityear % 400 == 0) {
				leapyearsum++;
			}
		}
		// ������Ҫ����num
		int[] daylimit = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };// 12�·ݸ��ж�������31 28 31 30 31 30 31 31 30 31 30 31
		//2���ж�����
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			daylimit[1] = 29;
		}
		int num = ((divideyear - leapyearsum) * 365 + leapyearsum * 366) ;// �������%7�� 0:����һ 1:���ڶ� 2:������ 3 ... 6
		for (int i = 0; i < month - 1; i++) {
			num = num + daylimit[i];
		}
		num = num%7;// num��ʾ��ǰ���ھ�1900��1��1�յ�����
		
		// ����ģ��:������	����һ	���ڶ�	������	������	������	������	
		Calendar ca = new Calendar();
		for (int i = 0; i < 7; i++) {

			System.out.print(ca.week(i) + "\t");
		}
		System.out.println();

		// ���ÿ��һ��ǰ��(num+1)���ո�(numȡֵ:0->5��ȡ6ʱ������ո�)
		if (num < 6) {
			for (int j = 0; j < num + 1; j++) {
				System.out.print("\t");
			}
		}
		// ���ÿ��һ�ռ���֮������ڣ�ÿ��7(num+2)����
		for (int i = 1; i <= daylimit[month-1]; i++) {
			System.out.print(i + "\t");
			if ((num + 2) % 7 == 0) {
				System.out.println();
			}
			num++;
		}
		
		scn.close();

	}

}
