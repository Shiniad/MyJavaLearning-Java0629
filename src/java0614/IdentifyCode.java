package java0614;

public class IdentifyCode {

	public static void main(String[] args) {
		//65-90 97-122
		char[] randomLetter = new char[4];
		for (int i = 0; i < 5; i++) {
			//�����ɵ��ĸ����Ӣ�ĵ�������ַ�����
			for (int j = 0; j < 4; j++) {
				boolean isLorU = Math.random()>=0.5;// �������ɵ��Ǵ�д��ĸ����Сд��ĸ
				randomLetter[j] = (char)( (int)(Math.random() * 26) + (isLorU?65:97) );// ����һ�������Ӣ����ĸ
			}
			
			String str = String.valueOf(randomLetter);// �ַ�����ת��Ϊ�ַ���
			System.out.println("��" + (i+1) + "�β����������:" + str);
		}
	}
}
