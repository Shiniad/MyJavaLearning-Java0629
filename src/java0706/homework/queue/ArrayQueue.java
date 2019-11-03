package java0706.homework.queue;

import java.util.ArrayList;
import java.util.List;

public class ArrayQueue<T> implements Queue<T>{
	private List<T> list = new ArrayList<T>();

	@Override
	public void push(T t) {
		list.add(t);
	}

	@Override
	public T pop() {
		if(list.size()!=0) {
			return list.remove(0);
		} else {
			return null;
		}
		
	}

	@Override
	public String toString() {
		StringBuffer str = new StringBuffer("ArrayQueue [");
		for (T t : list) {
			str.append(t).append(", ");
		}
		str.replace(str.lastIndexOf(", "), str.lastIndexOf(", ") + 2, "");
		str.append("]");
		return new String(str);
	}
	
}
