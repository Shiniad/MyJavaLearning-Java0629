package java0618;


import java.util.Arrays;
import java.util.Random;

public class GenerateArray {
	
	public static int[] genRandom(int size) {
		Random r = new Random();
		int [] arr = new int[size];
		int num = 0;
		// ��һ�������ɲ��ظ������˳������
		for (int i = 0; i < arr.length; i++) {
			num++;
			num += r.nextInt(size * 2);
			arr[i] = num;
		}
		// �ڶ�������������
		for (int i = 0; i < arr.length; i++) {
			int index = r.nextInt(arr.length);
			// ����i��index
			int temp = arr[index];
			arr[index] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}
	
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println(Arrays.toString(genRandom(2)));
		}
		
	}
}
