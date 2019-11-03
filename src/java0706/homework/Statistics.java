package java0706.homework;

import java.util.HashMap;
import java.util.Set;

public class Statistics {
	
	public static void main(String[] args) {
		String content = "The String class is immutable, so that once it is created a String object cannot be changed. The String class " +
				"has a number of methods, some of which will be discussed below, that appear to modify strings. Since strings are " + 
				"immutable, what these methods really do is create and return a new string that contains the result of the operation. ";
		HashMap<String, Integer> conMap = new HashMap<String, Integer>();
		
		String[] target = content.replace(",", "").replace(".", "").split(" ");
		for (int i = 0; i < target.length; i++) {
			if(conMap.containsKey(target[i])) {
				int value = conMap.get(target[i]);
				conMap.put(target[i], ++value);
			} else {
				conMap.put(target[i], 1);
			}
		}
		Set<String> key = conMap.keySet();
		for (String myKey : key) {
			System.out.print(myKey + "£º");
			System.out.println(conMap.get(myKey));
		}
	}
}
