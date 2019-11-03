package java0601Examination;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// 数组元素的插入和删除
		int[] buffer = new int[100];// 定义缓冲区
		int mylength = 0;
		Scanner scn = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.print("请输入一个数字:");
			buffer[mylength++] = scn.nextInt();// 数组元素的追加,mylength = N(5)
		}

		// 输出
		for (int i = 0; i < mylength; i++) {
			System.out.print(buffer[i] + " ");
		}
		System.out.println();

		// 删除元素
		int numToDel = -1;
		System.out.print("请输入要删除的元素:");
		numToDel = scn.nextInt();
		for (int i = 0; i < mylength; i++) {
			if (numToDel == buffer[i]) {
				for (int j = i; j < mylength - 1; j++) {
					buffer[j] = buffer[j + 1];
				}
				mylength--;
			}
		}

		// 输出
		for (int i = 0; i < mylength; i++) {
			System.out.print(buffer[i] + " ");
		}
		System.out.println();

		// 插入元素
		System.out.print("请输入要插入的元素:");
		int numToIns = scn.nextInt();
		System.out.print("请输入要插入的序列:");
		int index = scn.nextInt();
		if (index <= 0) {
			index = 0;
		} 
		for (int i = mylength-1; i >= index; i--) {
			buffer[i+1] = buffer[i];
		}
		buffer[index] = numToIns; 
		mylength++;

		// 输出
		for (int i = 0; i < mylength; i++) {
			System.out.print(buffer[i] + " ");
		}
		System.out.println();
		scn.close();
	}

}
