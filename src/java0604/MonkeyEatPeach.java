package java0604;

/**
 * ���ӵ�һ��ժ�����ɸ����ӣ������Ե�һ�룬������񫣬�ֳ���һ�����ڶ��������ֳԵ�ʣ�µ�һ�룬Ȼ������һ��������������ֱ����ʮ���ʱ����ֻ��һ�����ˡ�����ԭ���ж��ٸ����ӡ�
 * @author Administrator
 *
 */
public class MonkeyEatPeach {
	//�ݹ���ý��
	
	public int eat(int day) {
		if (day >= 10) {
			return 1;// ��10�컹ʣһֻ����
		} else {
			return 2 * (eat(day+1) + 1);// f(x) = 2[f(x+1)+1]
		}
	}
	
	public static void main(String[] args) {
		System.out.println( (new MonkeyEatPeach()).eat(1) );
	}
}
