package java0614;

import java.util.Arrays;


public class Test {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String str = sc.next();
//		System.out.println(str);
//		String str1 = sc.nextLine();
//		System.out.println(str1);
//		String str = "hello world.html.ini";
//		System.out.println(str.isEmpty());
//		System.out.println(str.endsWith(".html") && str.startsWith("h"));
//		int index = str.lastIndexOf('.');
//		System.out.println(index);
//		str = str.intern();//强制缓存化，不建议使用，这可能导致内存泄漏，内存占用越来越多
		int[] arr = new int[20];
		for (int i = 0; i < 20; i++) {
			arr[i] = (int)( (i+1) * Math.random() * 3);
		}	
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		StringBuffer sb = new StringBuffer("I eat a peach");
		sb.reverse();
		System.out.println(sb);
		
	}
}
