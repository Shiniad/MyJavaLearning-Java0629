package java0601;

public class Exhaustion {
	//��ٷ����㻻��������Ӳ��ö��
	
	public static void main(String[] args) {
		for(int i=0;i<=50;i++) {
			for(int j=50-i;j<=50;j++) {
				int k = 50 - i - j;
				if( i + j*0.02 + k*0.05 == 1) {
					System.out.println("1�֣�2�֣�5�ֱַ���" + i + "," + j + "," + k + "ö");
				}
			}
		}
	}

}
