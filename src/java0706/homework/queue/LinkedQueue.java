package java0706.homework.queue;


import java.util.LinkedList;


public class LinkedQueue<T> implements Queue<T>{
	private LinkedList<T> list = new LinkedList<T>();

	@Override
	public void push(T t) {
		list.add(t);
	}

	@Override
	public T pop() {
		return list.removeFirst();
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
