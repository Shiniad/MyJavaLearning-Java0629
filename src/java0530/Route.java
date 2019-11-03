package java0530;

import java.util.Arrays;
import java.util.Scanner;

public class Route {
	
	public boolean isValueLegal(int[] arr) {
		int[] arr2 = arr.clone();
		Arrays.sort(arr2);
		if(arr2[0]>=0 && arr2[arr2.length-1]<=1) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		//arr[0]->A  arr[1]->B ...
		int[] arr = {0,0,0,0,-1};
		Route r = new Route();
		Scanner sc = new Scanner(System.in);
		System.out.print("������5�������ѡ�񣬱��硰1 1 0 0 1�����α�ʾ���㡰ȥ ȥ ��ȥ ��ȥ ȥ����");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		if(r.isValueLegal(arr)) {
			if(arr[0] == arr[1] && (arr[0] == 1 || arr[0] ==0)){  //ȥ��A�ͱ���ȥB
				if(arr[2] + arr[3] <=1) {  //C��D���ȥһ��
					if(arr[2] == arr[4]) {  //E��CҪ��ȥҪ������ȥ 
						System.out.println("������ķ�������");
					} else {
						System.out.println("������ķ���������");
					}
				} else {
					System.out.println("������ķ���������");
				}
			}
		} else {
			System.out.println("������ķ���������");
		}
		sc.close();
	}

}
