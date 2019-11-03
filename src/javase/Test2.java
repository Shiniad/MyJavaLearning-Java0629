package javase;

import java.util.HashSet;
import java.util.Set;

public class Test2 {
	public static void main(String[] item) {
		Set<Integer> str = new HashSet<Integer>();
		str.add(1);
		str.add(2);

		System.out.println(new Test2().getClass().getName());
	}
}
