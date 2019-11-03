package java0618;



/**
 * 快速排序
 * @author Administrator
 *
 */
public class QuickSort {
	
	public static void sequence(int[] arr, int left, int right) {
		if(right<left) { return ;  }
		
		int index = left, temp = left;// temp是标准值分界线，小于等于索引是小值区域(0-temp)，大于它是大值区域(temp+1 - arr.length-1)，
		for (int i = left + 1; i < right + 1; i++) {
			if( arr[i] <= arr[index]) {
				// 将最新的小值与小值临界值交换
				int buffer = arr[i];
				arr[i] = arr[temp+1];
				arr[temp+1] = buffer;
				
				temp++;// 初始状态下小值区域为0，每当有新的小值出现，边界增加一，并保证所有的小值在temp区域内
			} 
		}
		//将基准值移至中间
		int buffer = arr[temp];
		arr[temp] = arr[index];
		arr[index] = buffer;
		
		sequence(arr, left, temp-1); 
		sequence(arr, temp+1, right);
		
	}
	public static void main(String[] args) {
//		int[] arr = {6,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
		int[] arr = GenerateArray.genRandom(10000000);
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
		
		long time = System.currentTimeMillis();
		QuickSort.sequence(arr, 0, arr.length-1);
		long time2 = System.currentTimeMillis();
		
		System.out.println(time2-time);
	}
}
