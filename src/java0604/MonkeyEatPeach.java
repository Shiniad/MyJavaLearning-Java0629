package java0604;

/**
 * 猴子第一天摘下若干个桃子，单击吃掉一半，还不过瘾，又吃了一个。第二天早上又吃掉剩下的一半，然后多吃了一个。这样反复，直到第十天的时候发现只有一个桃了。请问原来有多少个桃子。
 * @author Administrator
 *
 */
public class MonkeyEatPeach {
	//递归调用解决
	
	public int eat(int day) {
		if (day >= 10) {
			return 1;// 第10天还剩一只桃子
		} else {
			return 2 * (eat(day+1) + 1);// f(x) = 2[f(x+1)+1]
		}
	}
	
	public static void main(String[] args) {
		System.out.println( (new MonkeyEatPeach()).eat(1) );
	}
}
