package java0604;

import java.util.Arrays;

public class BubbleSort {
	//ð������

	public static void main(String[] args) {
		double[] arr = new double[] { 24, 11, 35, 9, 17, 6};
		
		//��i��ð��(��ʹi��ѭ��)
		for (int i = 0; i < arr.length - 1; i++) {
			//��ѭ���������ֵð�ݵ�(�ȽϺͽ���)��i��λ��
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
