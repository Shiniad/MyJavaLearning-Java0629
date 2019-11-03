package java0618;


public class QuickSort2 {
	
	public static void seq(int[] arr, int left, int right) {
		if(right<left) {
			return ;
		}
		int index = right, q = left;
		for (int i = left; i < right; i++) {
			if (arr[i] <= arr[index]) {
				//小值与常规值交换,q分大值小值区域分界点
				int temp = arr[i];
				arr[i] = arr[q];
				arr[q] = temp;
				q++;
			} 
		}
		int temp = arr[index];
		arr[index] = arr[q];
		arr[q] = temp;
		
		
		seq(arr,left,q-1);
		seq(arr,q+1,right);

	}

	public static void main(String[] args) {
//		int[] arr = {6,44,38,5,47,15,36,26,27,2,46,4,19,50,35};// A(p,r)
		int[] arr = GenerateArray.genRandom(50000);
		int left = 0, right = arr.length-1;
		
		long time = System.currentTimeMillis();
		QuickSort2.seq(arr,left,right);
		long time2 = System.currentTimeMillis();
		
		System.out.println(time2-time);
	}

}
