package java0601;

public class MultiplicationTable {
	//����ѭ����ӡ�žų˷���

	public static void main(String[] args) {
		for(
				int i=1;
				i<10;
				i++) {  //��������
			for(
					int j=1;
					j<=i;
					j++) {  //�����仯
//				System.out.format("%d*%d=%-2d ",i,j,i*j);
				System.out.print(i + "*" + j + "=" + i*j + "\t");
			}
			System.out.println();
		}
	}
}
