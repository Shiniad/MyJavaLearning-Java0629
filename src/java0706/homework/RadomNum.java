package java0706.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class RadomNum {
	
	public static void listGen() {
		List<String> list = new ArrayList<>();
		int random;
		
		long time = new Date().getTime();
		for (int i = 0; i < 1000000; i++) {
			random = (int)(Math.random() * 2);
			list.add(new Integer(2*i + random).toString());
		}
		Collections.shuffle(list);

		long timeOver = new Date().getTime(); 
		System.out.println("����1000000���������������ʱ�䣺" + (timeOver - time) + "ms");
	}

	public static void arrayGen() {
		String[] arr = new String[1000000];
		int random;
		
		long time = new Date().getTime();
		for (int i = 0; i < arr.length; i++) {
			random = (int)(Math.random() * 2);
			arr[i] = new Integer(2*i + random).toString();
		}

		for (int i = 0; i < arr.length; i++) {
			int r =  (int)(Math.random() * arr.length);
			String temp = arr[r];
			arr[r] = arr[i];
			arr[i] = temp;
		}
		long timeOver = new Date().getTime(); 
		System.out.println("����1000000���������������ʱ�䣺" + (timeOver - time) + "ms");
	}
	
	public static void main(String[] args) {
		arrayGen();
		listGen();
	}
	
}
