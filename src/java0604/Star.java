package java0604;
/**
 * �����������
 * @author Administrator
 *
 */
public class Star {

	public static void main(String[] args) {
		// �𲽷ֽ�
		int size = 5;
//		int row = 2;//2��
//		int col = 3;//3��
		for (int i = 0; i < size; i++) {
			//���size-i-1���ո�(����Ǵ�0��ʼ������ʹ�ô���С�ں���jֵ��args.length���)
			for (int j = 0; j < size - i - 1; j++) {
				System.out.print(" ");
			}
			//���i+1��*(��0��ʼ������ʹ��<=||>=��jֵ��args.length+1���)
			for (int j = 0; j <= 2 * i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		for (int i = size - 2; i >= 0; i--) {
			//���size-i-1���ո�(����Ǵ�0��ʼ������ʹ�ô���С�ں���jֵ��args.length���)
			for (int j = 0; j < size - i - 1; j++) {
				System.out.print(" ");
			}
			//���i+1��*(��0��ʼ������ʹ��<=||>=��jֵ��args.length+1���)
			for (int j = 0; j <= 2 * i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
