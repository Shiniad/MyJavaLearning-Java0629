package java0702.responsibilitychain;

/**
 * 行为型模式
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		String content = "今天翻墙了，砍死";
		StringProcessor sp = new StringProcessor(new SensitiveKeyword(),new ForceKeyword());
		
		String result = sp.process(content);
		System.out.println(result);
	}
}
