package java0606;

public class PrintRhombus {
	
	public void printSomeThing(int length,boolean isStar) {
		//��ӡlength���ȵ�ĳ��������isStarΪ��ʱ��ӡ���ǣ�Ϊ��ʱ��ӡ�ո�
		if(isStar) {
			for (int i = 0; i < length; i++) {
				System.out.print("*");
			}
		} else {
			for (int i = 0; i < length; i++) {
				System.out.print(" ");
			}
		}
	}
	
	//��ӡ����
	public PrintRhombus(int size, int row) {
		//��ӡ�ϰ벿����״
		for (int i = 0; i < size; i++) {
			//�ڵ�ǰi���ڴ�ӡrow��something
			for (int k = 0; k < row; k++) {
				//�����ǰ��i�е�������
				//���size-i-1���ո�
				printSomeThing(size-i-1,false);
				//���2*i+1������
				printSomeThing(1+2*i,true);
				//���size-i-1���ո�
				printSomeThing(size-i-1,false);
			}
			System.out.println();
		}
	
			//��ӡ�°벿����״
			for (int i = 0; i < size - 1; i++) {
				//�ڵ�ǰi���ڴ�ӡrow��something
				for (int k = 0; k < row; k++) {
					//�����ǰ��i�е�������
					//���i+1���ո�
					printSomeThing(i+1,false);
					//���2*i+1������
					printSomeThing(2*size-1-2*(i+1),true);
					//���i+1���ո�
					printSomeThing(i+1,false);
				}
				System.out.println();
			}		
	}
	
	public static void main(String[] args) {
		int size = 4;
		int col = 2;
		int row = 3;
		
		for (int i = 0; i < col; i++) {
			new PrintRhombus(size,row);
		}
		
	}
}
