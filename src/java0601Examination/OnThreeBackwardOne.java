package java0601Examination;

public class OnThreeBackwardOne {
	// ������һ����:��500��С��������Χ��һȦ����1��ʼ������3С���˳�Ȧ�⣬ֱ�����һλС���������һλС��������ǣ�

	public static void main(String[] args) {
		int[] buffer = new int[500];
		//���500��С��Ϊ1
		for(int i = 0; i < buffer.length; i++) {
			buffer[i] = 1;
		}
		//ÿ�������½�С�����Ϊ-1(������Ĭ��ֵΪ0����-1���ɿ�)
		for(int i = 0; i < buffer.length; i++) {
			if((i+1)%3 == 0) {
				buffer[i] = -1;
			}
		}
		
		//���Ϊ-1��С���˳�Ȧ
		int quitchild = 0;// ͳ���˳���С����Ŀ
		for(int i = 0; i < buffer.length; i++) {
			if(buffer[i] == -1) {
				for(int j = i; j < buffer.length - 1; j++) {
					buffer[j] = buffer[j+1];
				}
				quitchild++;
				buffer[buffer.length-quitchild] = 0;
			}
		}
		System.out.println("���һ��С���������:" + (buffer.length-quitchild-1));
	}

}
