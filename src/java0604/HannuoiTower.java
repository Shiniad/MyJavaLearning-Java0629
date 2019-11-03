package java0604;

public class HannuoiTower {
	
	public void Hannuoi(int n, String A,String B, String C) {
		if(n == 1) {
			System.out.println("��Բ��" + n + "��" + A + "�ƶ���" + C);
		} else {
			//�Ƚ�n-1�����ƶ�����ʱ����
			Hannuoi(n-1,A,C,B);
			//����ֻ��ҪŲ��һ��(��Ӱ���ι���)
			System.out.println("��Բ��" + n + "��" + A + "�ƶ���" + C);
			//��n-1�����ƶ�����
			Hannuoi(n-1,B,A,C);
		}
	}
	public static void main(String[] args) {
		String A = "A";
		String B = "B";
		String C = "C";
		HannuoiTower ht = new HannuoiTower();
		ht.Hannuoi(4, A, B, C);
	}
}
