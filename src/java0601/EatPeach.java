package java0601;

public class EatPeach {
	//�ݹ����������
	
	public int myPeach(int day) {
		if(day >= 10) {
			return 1;
		} 
		return ( myPeach(day+1) + 1 )*2;
	}
	
	public static void main(String[] args) {
		EatPeach e = new EatPeach();
		for(int i=1;i<=10;i++) {
			System.out.println("���ǵ�" + i + "��,����" +e.myPeach(i) + "ֻ����");
		}
		System.out.println("ԭ������" + e.myPeach(1) + "ֻ���ӡ�");
	}

}
