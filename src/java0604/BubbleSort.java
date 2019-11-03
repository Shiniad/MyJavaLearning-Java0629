package java0604;

import java.util.Arrays;

public class BubbleSort {
	//冒泡排序

	public static void main(String[] args) {
		double[] arr = new double[] { 24, 11, 35, 9, 17, 6};
		
		//做i次冒泡(行使i次循环)
		for (int i = 0; i < arr.length - 1; i++) {
			//内循环，将最大值冒泡到(比较和交换)第i个位置
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j+1]) {
					double temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}	
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
