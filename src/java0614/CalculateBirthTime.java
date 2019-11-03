package java0614;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalculateBirthTime {

	public static void main(String[] args) throws ParseException {
		Scanner scn = new Scanner(System.in);
		System.out.print("��������������(��ʽΪyyyy-MM-dd):");
		String target = scn.nextLine();

		
		//ʹ��SimpleDateFormat��ʽ����������,ʹ��parse()�������ַ�������ΪDate����
		SimpleDateFormat mysdf = new SimpleDateFormat("y-M-d");
		Date tarDate = mysdf.parse(target);// ����
		
		//ʹ��setTime()������Date���͵�ʱ�䴫��Calendarʵ����������
		Calendar cal = Calendar.getInstance();
		long time1 = cal.getTimeInMillis();
		cal.setTime(tarDate);
		long time2 = cal.getTimeInMillis();
		System.out.println("���Ѿ�����" + (time1-time2)/(3600 * 1000) + "Сʱ");
		
		scn.close();
	}
}
