package java0525;

public class Demo {
	public static void main(String args[]){
		/**
		 * 		-号左对齐，无符号 右对齐，数字，长度，很有用
		 */
		System.out.format("%-15s %-5s %10s\n", "item","qty","price");
		System.out.format("%-15s %5s %10s\n", "----","-----","-----");
		System.out.println("123456789123456789123456789123456789123456789");
		System.out.format("%-15.15s %5d %10.2f\n", "lalala",4,4.25);
	}
}
