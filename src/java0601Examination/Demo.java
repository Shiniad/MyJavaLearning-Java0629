package java0601Examination;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// ����Ԫ�صĲ����ɾ��
		int[] buffer = new int[100];// ���建����
		int mylength = 0;
		Scanner scn = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.print("������һ������:");
			buffer[mylength++] = scn.nextInt();// ����Ԫ�ص�׷��,mylength = N(5)
		}

		// ���
		for (int i = 0; i < mylength; i++) {
			System.out.print(buffer[i] + " ");
		}
		System.out.println();

		// ɾ��Ԫ��
		int numToDel = -1;
		System.out.print("������Ҫɾ����Ԫ��:");
		numToDel = scn.nextInt();
		for (int i = 0; i < mylength; i++) {
			if (numToDel == buffer[i]) {
				for (int j = i; j < mylength - 1; j++) {
					buffer[j] = buffer[j + 1];
				}
				mylength--;
			}
		}

		// ���
		for (int i = 0; i < mylength; i++) {
			System.out.print(buffer[i] + " ");
		}
		System.out.println();

		// ����Ԫ��
		System.out.print("������Ҫ�����Ԫ��:");
		int numToIns = scn.nextInt();
		System.out.print("������Ҫ���������:");
		int index = scn.nextInt();
		if (index <= 0) {
			index = 0;
		} 
		for (int i = mylength-1; i >= index; i--) {
			buffer[i+1] = buffer[i];
		}
		buffer[index] = numToIns; 
		mylength++;

		// ���
		for (int i = 0; i < mylength; i++) {
			System.out.print(buffer[i] + " ");
		}
		System.out.println();
		scn.close();
	}

}
