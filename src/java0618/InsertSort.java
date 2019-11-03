package java0618;

/**
 * 插入排序
 * @author Administrator
 *
 */
public class InsertSort {
	
	public static void main(String[] args) {
		int[] arr = GenerateArray.genRandom(50000);// 正确的插入排序大概需要一秒钟左右，改进版冒泡排序大概需要1700左右
//		int[] arr = {3,5,8,6,1,0};
		long time = System.currentTimeMillis();
		for (int i = 1; i < arr.length; i++) {
			
			for (int index = i; index > 0; index--) {
				if (arr[index] < arr[index-1]) {// 默认index-1已经排好序，将index冒泡到正确的位置
					int temp = arr[index];
					arr[index] = arr[index-1];
					arr[index-1] = temp;
				} else {
					break;
				}
			}
			//插入排序正确步骤
			//查找该元素在什么位置
			//移动元素
			//元素放入对应位置

		}
//		System.out.println(Arrays.toString(arr));
		long time2 = System.currentTimeMillis();
		System.out.println(time2 - time);
	}
}
