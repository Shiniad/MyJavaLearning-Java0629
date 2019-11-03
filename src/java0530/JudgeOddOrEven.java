package java0530;

import java.util.Scanner;

public class JudgeOddOrEven {

	public static void main(String[] args) {
		int oddCount = 0,evenCount = 0;
		int[] arr = new int[3];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		for(int j=0;j<arr.length;j++) {
			if(arr[j]%2==0) {
				evenCount += 1;
			} else {
				oddCount += 1;
			}
		}
		if(evenCount==2 && oddCount==1) {
			System.out.println("您输入的数是两奇一偶");
		} else {
			System.out.println("您输入的数不是两奇一偶");
		}
		
		sc.close();
	}

}
