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
		System.out.print("请输入5个景点的选择，比如“1 1 0 0 1”依次表示景点“去 去 不去 不去 去”：");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		if(r.isValueLegal(arr)) {
			if(arr[0] == arr[1] && (arr[0] == 1 || arr[0] ==0)){  //去了A就必须去B
				if(arr[2] + arr[3] <=1) {  //C和D最多去一个
					if(arr[2] == arr[4]) {  //E和C要不去要不都不去 
						System.out.println("您输入的方案可行");
					} else {
						System.out.println("您输入的方案不可行");
					}
				} else {
					System.out.println("您输入的方案不可行");
				}
			}
		} else {
			System.out.println("您输入的方案不可行");
		}
		sc.close();
	}

}
