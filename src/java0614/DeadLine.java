package java0614;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DeadLine {

	public static void main(String[] args) throws ParseException {
		// �������
		Scanner scn = new Scanner(System.in);
		System.out.print("��������ʼ����(��ʽΪyyyy-MM-dd):");
		String startDate = scn.nextLine();
		System.out.print("�������������蹤����:");
		int workDay = scn.nextInt();
		SimpleDateFormat sdf = new SimpleDateFormat("y-M-d");
		Date dt = sdf.parse(startDate);
		Calendar cal = Calendar.getInstance();
		
		cal.setTime(dt);// ��ʼ������Ϊ��������
		if ( cal.get(Calendar.DAY_OF_WEEK) == 7) {
			cal.add(Calendar.DATE, 2 );
		} else if (cal.get(Calendar.DAY_OF_WEEK) == 1) {
			cal.add(Calendar.DATE, 1 );
		}
		
		//ͨ��ѭ����֤
		int initN = cal.get(Calendar.DAY_OF_WEEK);// ��ȡ��ǰ����Ϊ���ڼ���1��ʾ��������7��ʾ������	
		int day = 0, week = 0;
		while( day < workDay ) {
			initN++;
			if ( initN == 8) { initN = 1; }
			if(initN == 1 || initN == 7) {
				week++;// ˫��������һ��
			} else {
				day++;// ����������һ��
			}
		}
		cal.add(Calendar.DATE, day + week ); 
		System.out.println("�����������Ϊ:" + sdf.format(cal.getTime()));
		
		
		cal.setTime(dt);// ��ʼ������Ϊ��������
		if ( cal.get(Calendar.DAY_OF_WEEK) == 7) {
			cal.add(Calendar.DATE, 2 );
		} else if (cal.get(Calendar.DAY_OF_WEEK) == 1) {
			cal.add(Calendar.DATE, 1 );
		}
		
		//���������Ͷ����������֤
		cal.add(Calendar.DATE, workDay/5*7 + workDay%5);
		if ( cal.get(Calendar.DAY_OF_WEEK) == 7) {
			cal.add(Calendar.DATE, 2 );
		} else if (cal.get(Calendar.DAY_OF_WEEK) == 1) {
			cal.add(Calendar.DATE, 1 );
		}
		System.out.println("�����������Ϊ:" + sdf.format(cal.getTime()));
		scn.close();
	}
}
