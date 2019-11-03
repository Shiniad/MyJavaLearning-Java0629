package java0618;



/**
 * ��������
 * @author Administrator
 *
 */
public class QuickSort {
	
	public static void sequence(int[] arr, int left, int right) {
		if(right<left) { return ;  }
		
		int index = left, temp = left;// temp�Ǳ�׼ֵ�ֽ��ߣ�С�ڵ���������Сֵ����(0-temp)���������Ǵ�ֵ����(temp+1 - arr.length-1)��
		for (int i = left + 1; i < right + 1; i++) {
			if( arr[i] <= arr[index]) {
				// �����µ�Сֵ��Сֵ�ٽ�ֵ����
				int buffer = arr[i];
				arr[i] = arr[temp+1];
				arr[temp+1] = buffer;
				
				temp++;// ��ʼ״̬��Сֵ����Ϊ0��ÿ�����µ�Сֵ���֣��߽�����һ������֤���е�Сֵ��temp������
			} 
		}
		//����׼ֵ�����м�
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
