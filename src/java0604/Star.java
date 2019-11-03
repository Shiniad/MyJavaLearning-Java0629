package java0604;
/**
 * 输出菱形星星
 * @author Administrator
 *
 */
public class Star {

	public static void main(String[] args) {
		// 逐步分解
		int size = 5;
//		int row = 2;//2行
//		int col = 3;//3列
		for (int i = 0; i < size; i++) {
			//输出size-i-1个空格(如果是从0开始计数且使用大于小于号则j值与args.length相等)
			for (int j = 0; j < size - i - 1; j++) {
				System.out.print(" ");
			}
			//输出i+1个*(从0开始计数且使用<=||>=则j值与args.length+1相等)
			for (int j = 0; j <= 2 * i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		for (int i = size - 2; i >= 0; i--) {
			//输出size-i-1个空格(如果是从0开始计数且使用大于小于号则j值与args.length相等)
			for (int j = 0; j < size - i - 1; j++) {
				System.out.print(" ");
			}
			//输出i+1个*(从0开始计数且使用<=||>=则j值与args.length+1相等)
			for (int j = 0; j <= 2 * i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
