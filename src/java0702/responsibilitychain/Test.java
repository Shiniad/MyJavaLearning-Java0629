package java0702.responsibilitychain;

/**
 * ��Ϊ��ģʽ
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		String content = "���췭ǽ�ˣ�����";
		StringProcessor sp = new StringProcessor(new SensitiveKeyword(),new ForceKeyword());
		
		String result = sp.process(content);
		System.out.println(result);
	}
}
