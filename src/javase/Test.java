package javase;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Test {
	static boolean paddy;
	public static void main(String[] item) {
		Random rnd = new Random();
		Map<Integer, Integer> countMap = new HashMap<>();
		System.out.println("HashMap的值为：" + countMap.get(0));
		for(int i=0;i<1000;i++) {
			int num = rnd.nextInt(4);
			Integer count = countMap.get(num);  //Integer的默认值是null
			if(count==null) {
				countMap.put(num, 1);
			} else {
				countMap.put(num, count+1);
			}
		}
		for(Map.Entry<Integer, Integer> kv : countMap.entrySet()) {
			System.out.println(kv.getKey() + "," + kv.getValue());
		}
	}

}
