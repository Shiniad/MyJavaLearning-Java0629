package java0601Examination;

public class OnThreeBackwardOne {
	// 数三退一问题:有500个小孩手拉手围成一圈，从1开始数，数3小孩退出圈外，直到最后一位小孩，求最后一位小孩的序号是？

	public static void main(String[] args) {
		int[] buffer = new int[500];
		//标记500个小孩为1
		for(int i = 0; i < buffer.length; i++) {
			buffer[i] = 1;
		}
		//每数第三下将小孩标记为-1(因数组默认值为0，记-1更可靠)
		for(int i = 0; i < buffer.length; i++) {
			if((i+1)%3 == 0) {
				buffer[i] = -1;
			}
		}
		
		//标记为-1的小孩退出圈
		int quitchild = 0;// 统计退出的小孩数目
		for(int i = 0; i < buffer.length; i++) {
			if(buffer[i] == -1) {
				for(int j = i; j < buffer.length - 1; j++) {
					buffer[j] = buffer[j+1];
				}
				quitchild++;
				buffer[buffer.length-quitchild] = 0;
			}
		}
		System.out.println("最后一个小孩的序号是:" + (buffer.length-quitchild-1));
	}

}
