package java0601Examination;

import java.util.Arrays;
import java.util.Scanner;
/**
 * 1.����ĳ�����͵��������
 * 2.��������
 * 3.�����ʼ��
 * 4.���������ȡֵ�Ͳ���
 * 1.�������飨����ĳ�����͵����������
2.����ռ䣨�������飩
3.��ֵ�������ʼ����
4.�������ݣ����������ȡֵ�Ͳ�����
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
		int[] a = new int[] {3,9,5,7,6};
		int[] b = new int[5];//b��a��ָ��new int[] {1,2};
		System.arraycopy(a, 0, b, 0, a.length);
		b[0] = 14;
		int index1 = Arrays.binarySearch(a,5);  //����Ķ��ֲ��ҷ���Ҫ�������������
		System.out.println(index1);
		
		//��������
		int[] arr1 = new int[] {6,3,15,19,11,34,};
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		
		//�����鵹�����
		int[] numbers3 = {2,3,5,9,7};
		for( int i=0; i<numbers3.length/2; i++ ) {
			int temp = numbers3[i];
			numbers3[i] = numbers3[numbers3.length-i-1];
			numbers3[numbers3.length-i-1] = temp;
		}
		System.out.println(Arrays.toString(numbers3));
		
		//���������
		String[] str = {"A","B","C","D","E"};
		for(int i=0;i<str.length;i++) {
			int index = (int)(Math.random() * str.length);
			String temp = str[0];
			str[0] = str[index];
			str[index] = temp;
		}
		System.out.println(Arrays.toString(str));
		
		//��������Ԫ��
		String toFind = "F";
		int index2 = -1;
		for(int i=0;i<str.length;i++) {
			if(toFind.equals(str[i])) {
				index2 = i;
				break;
			}
		}
		System.out.println(index2);
		
		//�滻����Ԫ��
		
		//����Ԫ�صĲ����ɾ��
		int[] buffer = new int[100];//���建����
		int mylength = 0;
		Scanner scn = new Scanner(System.in);
		for( int i=0; i<5; i++ ) {
			System.out.println("������һ����:");
			buffer[mylength++] = scn.nextInt();//����Ԫ�ص�׷��
		}
		//���
		for( int i=0; i<mylength; i++ ) {
			System.out.println(buffer[i]);
		}
		//ɾ��Ԫ��
		int index = -1;
		System.out.print("������Ҫɾ����Ԫ��:");
		index = scn.nextInt();
		for( int i=0; i<mylength; i++ ) {
			if(i==index) {
				mylength--;
				for( int j=i; j<mylength; j++ ) {
					buffer[j] = buffer[j+1];
				}
			}
		}
		scn.close();
	}

}





