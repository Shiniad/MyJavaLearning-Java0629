package java0618;

/**
 * ��������
 * @author Administrator
 *
 */
public class InsertSort {
	
	public static void main(String[] args) {
		int[] arr = GenerateArray.genRandom(50000);// ��ȷ�Ĳ�����������Ҫһ�������ң��Ľ���ð����������Ҫ1700����
//		int[] arr = {3,5,8,6,1,0};
		long time = System.currentTimeMillis();
		for (int i = 1; i < arr.length; i++) {
			
			for (int index = i; index > 0; index--) {
				if (arr[index] < arr[index-1]) {// Ĭ��index-1�Ѿ��ź��򣬽�indexð�ݵ���ȷ��λ��
					int temp = arr[index];
					arr[index] = arr[index-1];
					arr[index-1] = temp;
				} else {
					break;
				}
			}
			//����������ȷ����
			//���Ҹ�Ԫ����ʲôλ��
			//�ƶ�Ԫ��
			//Ԫ�ط����Ӧλ��

		}
//		System.out.println(Arrays.toString(arr));
		long time2 = System.currentTimeMillis();
		System.out.println(time2 - time);
	}
}
